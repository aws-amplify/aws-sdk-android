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
 * <p>Represents a step scaling policy configuration to use with Application Auto Scaling.</p>
 */
public class StepScalingPolicyConfiguration implements Serializable {
    /**
     * <p>Specifies whether the <code>ScalingAdjustment</code> value in a <a href="https://docs.aws.amazon.com/autoscaling/application/APIReference/API_StepAdjustment.html">StepAdjustment</a> is an absolute number or a percentage of the current capacity. </p> <p> <code>AdjustmentType</code> is required if you are adding a new step scaling policy configuration.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ChangeInCapacity, PercentChangeInCapacity, ExactCapacity
     */
    private String adjustmentType;

    /**
     * <p>A set of adjustments that enable you to scale based on the size of the alarm breach.</p> <p>At least one step adjustment is required if you are adding a new step scaling policy configuration.</p>
     */
    private java.util.List<StepAdjustment> stepAdjustments;

    /**
     * <p>The minimum value to scale by when scaling by percentages. For example, suppose that you create a step scaling policy to scale out an Amazon ECS service by 25 percent and you specify a <code>MinAdjustmentMagnitude</code> of 2. If the service has 4 tasks and the scaling policy is performed, 25 percent of 4 is 1. However, because you specified a <code>MinAdjustmentMagnitude</code> of 2, Application Auto Scaling scales out the service by 2 tasks.</p> <p>Valid only if the adjustment type is <code>PercentChangeInCapacity</code>. </p>
     */
    private Integer minAdjustmentMagnitude;

    /**
     * <p>The amount of time, in seconds, to wait for a previous scaling activity to take effect.</p> <p>With scale-out policies, the intention is to continuously (but not excessively) scale out. After Application Auto Scaling successfully scales out using a step scaling policy, it starts to calculate the cooldown time. While the cooldown period is in effect, capacity added by the initiating scale-out activity is calculated as part of the desired capacity for the next scale-out activity. For example, when an alarm triggers a step scaling policy to increase the capacity by 2, the scaling activity completes successfully, and a cooldown period starts. If the alarm triggers again during the cooldown period but at a more aggressive step adjustment of 3, the previous increase of 2 is considered part of the current capacity. Therefore, only 1 is added to the capacity.</p> <p>With scale-in policies, the intention is to scale in conservatively to protect your application’s availability, so scale-in activities are blocked until the cooldown period has expired. However, if another alarm triggers a scale-out activity during the cooldown period after a scale-in activity, Application Auto Scaling scales out the target immediately. In this case, the cooldown period for the scale-in activity stops and doesn't complete.</p> <p>Application Auto Scaling provides a default value of 300 for the following scalable targets:</p> <ul> <li> <p>ECS services</p> </li> <li> <p>Spot Fleet requests</p> </li> <li> <p>EMR clusters</p> </li> <li> <p>AppStream 2.0 fleets</p> </li> <li> <p>Aurora DB clusters</p> </li> <li> <p>Amazon SageMaker endpoint variants</p> </li> <li> <p>Custom resources</p> </li> </ul> <p>For all other scalable targets, the default value is 0:</p> <ul> <li> <p>DynamoDB tables</p> </li> <li> <p>DynamoDB global secondary indexes</p> </li> <li> <p>Amazon Comprehend document classification endpoints</p> </li> <li> <p>Lambda provisioned concurrency</p> </li> <li> <p>Amazon Keyspaces tables</p> </li> </ul>
     */
    private Integer cooldown;

    /**
     * <p>The aggregation type for the CloudWatch metrics. Valid values are <code>Minimum</code>, <code>Maximum</code>, and <code>Average</code>. If the aggregation type is null, the value is treated as <code>Average</code>.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Average, Minimum, Maximum
     */
    private String metricAggregationType;

    /**
     * <p>Specifies whether the <code>ScalingAdjustment</code> value in a <a href="https://docs.aws.amazon.com/autoscaling/application/APIReference/API_StepAdjustment.html">StepAdjustment</a> is an absolute number or a percentage of the current capacity. </p> <p> <code>AdjustmentType</code> is required if you are adding a new step scaling policy configuration.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ChangeInCapacity, PercentChangeInCapacity, ExactCapacity
     *
     * @return <p>Specifies whether the <code>ScalingAdjustment</code> value in a <a href="https://docs.aws.amazon.com/autoscaling/application/APIReference/API_StepAdjustment.html">StepAdjustment</a> is an absolute number or a percentage of the current capacity. </p> <p> <code>AdjustmentType</code> is required if you are adding a new step scaling policy configuration.</p>
     *
     * @see AdjustmentType
     */
    public String getAdjustmentType() {
        return adjustmentType;
    }

    /**
     * <p>Specifies whether the <code>ScalingAdjustment</code> value in a <a href="https://docs.aws.amazon.com/autoscaling/application/APIReference/API_StepAdjustment.html">StepAdjustment</a> is an absolute number or a percentage of the current capacity. </p> <p> <code>AdjustmentType</code> is required if you are adding a new step scaling policy configuration.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ChangeInCapacity, PercentChangeInCapacity, ExactCapacity
     *
     * @param adjustmentType <p>Specifies whether the <code>ScalingAdjustment</code> value in a <a href="https://docs.aws.amazon.com/autoscaling/application/APIReference/API_StepAdjustment.html">StepAdjustment</a> is an absolute number or a percentage of the current capacity. </p> <p> <code>AdjustmentType</code> is required if you are adding a new step scaling policy configuration.</p>
     *
     * @see AdjustmentType
     */
    public void setAdjustmentType(String adjustmentType) {
        this.adjustmentType = adjustmentType;
    }

    /**
     * <p>Specifies whether the <code>ScalingAdjustment</code> value in a <a href="https://docs.aws.amazon.com/autoscaling/application/APIReference/API_StepAdjustment.html">StepAdjustment</a> is an absolute number or a percentage of the current capacity. </p> <p> <code>AdjustmentType</code> is required if you are adding a new step scaling policy configuration.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ChangeInCapacity, PercentChangeInCapacity, ExactCapacity
     *
     * @param adjustmentType <p>Specifies whether the <code>ScalingAdjustment</code> value in a <a href="https://docs.aws.amazon.com/autoscaling/application/APIReference/API_StepAdjustment.html">StepAdjustment</a> is an absolute number or a percentage of the current capacity. </p> <p> <code>AdjustmentType</code> is required if you are adding a new step scaling policy configuration.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see AdjustmentType
     */
    public StepScalingPolicyConfiguration withAdjustmentType(String adjustmentType) {
        this.adjustmentType = adjustmentType;
        return this;
    }

    /**
     * <p>Specifies whether the <code>ScalingAdjustment</code> value in a <a href="https://docs.aws.amazon.com/autoscaling/application/APIReference/API_StepAdjustment.html">StepAdjustment</a> is an absolute number or a percentage of the current capacity. </p> <p> <code>AdjustmentType</code> is required if you are adding a new step scaling policy configuration.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ChangeInCapacity, PercentChangeInCapacity, ExactCapacity
     *
     * @param adjustmentType <p>Specifies whether the <code>ScalingAdjustment</code> value in a <a href="https://docs.aws.amazon.com/autoscaling/application/APIReference/API_StepAdjustment.html">StepAdjustment</a> is an absolute number or a percentage of the current capacity. </p> <p> <code>AdjustmentType</code> is required if you are adding a new step scaling policy configuration.</p>
     *
     * @see AdjustmentType
     */
    public void setAdjustmentType(AdjustmentType adjustmentType) {
        this.adjustmentType = adjustmentType.toString();
    }

    /**
     * <p>Specifies whether the <code>ScalingAdjustment</code> value in a <a href="https://docs.aws.amazon.com/autoscaling/application/APIReference/API_StepAdjustment.html">StepAdjustment</a> is an absolute number or a percentage of the current capacity. </p> <p> <code>AdjustmentType</code> is required if you are adding a new step scaling policy configuration.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ChangeInCapacity, PercentChangeInCapacity, ExactCapacity
     *
     * @param adjustmentType <p>Specifies whether the <code>ScalingAdjustment</code> value in a <a href="https://docs.aws.amazon.com/autoscaling/application/APIReference/API_StepAdjustment.html">StepAdjustment</a> is an absolute number or a percentage of the current capacity. </p> <p> <code>AdjustmentType</code> is required if you are adding a new step scaling policy configuration.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see AdjustmentType
     */
    public StepScalingPolicyConfiguration withAdjustmentType(AdjustmentType adjustmentType) {
        this.adjustmentType = adjustmentType.toString();
        return this;
    }

    /**
     * <p>A set of adjustments that enable you to scale based on the size of the alarm breach.</p> <p>At least one step adjustment is required if you are adding a new step scaling policy configuration.</p>
     *
     * @return <p>A set of adjustments that enable you to scale based on the size of the alarm breach.</p> <p>At least one step adjustment is required if you are adding a new step scaling policy configuration.</p>
     */
    public java.util.List<StepAdjustment> getStepAdjustments() {
        return stepAdjustments;
    }

    /**
     * <p>A set of adjustments that enable you to scale based on the size of the alarm breach.</p> <p>At least one step adjustment is required if you are adding a new step scaling policy configuration.</p>
     *
     * @param stepAdjustments <p>A set of adjustments that enable you to scale based on the size of the alarm breach.</p> <p>At least one step adjustment is required if you are adding a new step scaling policy configuration.</p>
     */
    public void setStepAdjustments(java.util.Collection<StepAdjustment> stepAdjustments) {
        if (stepAdjustments == null) {
            this.stepAdjustments = null;
            return;
        }

        this.stepAdjustments = new java.util.ArrayList<StepAdjustment>(stepAdjustments);
    }

    /**
     * <p>A set of adjustments that enable you to scale based on the size of the alarm breach.</p> <p>At least one step adjustment is required if you are adding a new step scaling policy configuration.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stepAdjustments <p>A set of adjustments that enable you to scale based on the size of the alarm breach.</p> <p>At least one step adjustment is required if you are adding a new step scaling policy configuration.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public StepScalingPolicyConfiguration withStepAdjustments(StepAdjustment... stepAdjustments) {
        if (getStepAdjustments() == null) {
            this.stepAdjustments = new java.util.ArrayList<StepAdjustment>(stepAdjustments.length);
        }
        for (StepAdjustment value : stepAdjustments) {
            this.stepAdjustments.add(value);
        }
        return this;
    }

    /**
     * <p>A set of adjustments that enable you to scale based on the size of the alarm breach.</p> <p>At least one step adjustment is required if you are adding a new step scaling policy configuration.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stepAdjustments <p>A set of adjustments that enable you to scale based on the size of the alarm breach.</p> <p>At least one step adjustment is required if you are adding a new step scaling policy configuration.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public StepScalingPolicyConfiguration withStepAdjustments(java.util.Collection<StepAdjustment> stepAdjustments) {
        setStepAdjustments(stepAdjustments);
        return this;
    }

    /**
     * <p>The minimum value to scale by when scaling by percentages. For example, suppose that you create a step scaling policy to scale out an Amazon ECS service by 25 percent and you specify a <code>MinAdjustmentMagnitude</code> of 2. If the service has 4 tasks and the scaling policy is performed, 25 percent of 4 is 1. However, because you specified a <code>MinAdjustmentMagnitude</code> of 2, Application Auto Scaling scales out the service by 2 tasks.</p> <p>Valid only if the adjustment type is <code>PercentChangeInCapacity</code>. </p>
     *
     * @return <p>The minimum value to scale by when scaling by percentages. For example, suppose that you create a step scaling policy to scale out an Amazon ECS service by 25 percent and you specify a <code>MinAdjustmentMagnitude</code> of 2. If the service has 4 tasks and the scaling policy is performed, 25 percent of 4 is 1. However, because you specified a <code>MinAdjustmentMagnitude</code> of 2, Application Auto Scaling scales out the service by 2 tasks.</p> <p>Valid only if the adjustment type is <code>PercentChangeInCapacity</code>. </p>
     */
    public Integer getMinAdjustmentMagnitude() {
        return minAdjustmentMagnitude;
    }

    /**
     * <p>The minimum value to scale by when scaling by percentages. For example, suppose that you create a step scaling policy to scale out an Amazon ECS service by 25 percent and you specify a <code>MinAdjustmentMagnitude</code> of 2. If the service has 4 tasks and the scaling policy is performed, 25 percent of 4 is 1. However, because you specified a <code>MinAdjustmentMagnitude</code> of 2, Application Auto Scaling scales out the service by 2 tasks.</p> <p>Valid only if the adjustment type is <code>PercentChangeInCapacity</code>. </p>
     *
     * @param minAdjustmentMagnitude <p>The minimum value to scale by when scaling by percentages. For example, suppose that you create a step scaling policy to scale out an Amazon ECS service by 25 percent and you specify a <code>MinAdjustmentMagnitude</code> of 2. If the service has 4 tasks and the scaling policy is performed, 25 percent of 4 is 1. However, because you specified a <code>MinAdjustmentMagnitude</code> of 2, Application Auto Scaling scales out the service by 2 tasks.</p> <p>Valid only if the adjustment type is <code>PercentChangeInCapacity</code>. </p>
     */
    public void setMinAdjustmentMagnitude(Integer minAdjustmentMagnitude) {
        this.minAdjustmentMagnitude = minAdjustmentMagnitude;
    }

    /**
     * <p>The minimum value to scale by when scaling by percentages. For example, suppose that you create a step scaling policy to scale out an Amazon ECS service by 25 percent and you specify a <code>MinAdjustmentMagnitude</code> of 2. If the service has 4 tasks and the scaling policy is performed, 25 percent of 4 is 1. However, because you specified a <code>MinAdjustmentMagnitude</code> of 2, Application Auto Scaling scales out the service by 2 tasks.</p> <p>Valid only if the adjustment type is <code>PercentChangeInCapacity</code>. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param minAdjustmentMagnitude <p>The minimum value to scale by when scaling by percentages. For example, suppose that you create a step scaling policy to scale out an Amazon ECS service by 25 percent and you specify a <code>MinAdjustmentMagnitude</code> of 2. If the service has 4 tasks and the scaling policy is performed, 25 percent of 4 is 1. However, because you specified a <code>MinAdjustmentMagnitude</code> of 2, Application Auto Scaling scales out the service by 2 tasks.</p> <p>Valid only if the adjustment type is <code>PercentChangeInCapacity</code>. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public StepScalingPolicyConfiguration withMinAdjustmentMagnitude(Integer minAdjustmentMagnitude) {
        this.minAdjustmentMagnitude = minAdjustmentMagnitude;
        return this;
    }

    /**
     * <p>The amount of time, in seconds, to wait for a previous scaling activity to take effect.</p> <p>With scale-out policies, the intention is to continuously (but not excessively) scale out. After Application Auto Scaling successfully scales out using a step scaling policy, it starts to calculate the cooldown time. While the cooldown period is in effect, capacity added by the initiating scale-out activity is calculated as part of the desired capacity for the next scale-out activity. For example, when an alarm triggers a step scaling policy to increase the capacity by 2, the scaling activity completes successfully, and a cooldown period starts. If the alarm triggers again during the cooldown period but at a more aggressive step adjustment of 3, the previous increase of 2 is considered part of the current capacity. Therefore, only 1 is added to the capacity.</p> <p>With scale-in policies, the intention is to scale in conservatively to protect your application’s availability, so scale-in activities are blocked until the cooldown period has expired. However, if another alarm triggers a scale-out activity during the cooldown period after a scale-in activity, Application Auto Scaling scales out the target immediately. In this case, the cooldown period for the scale-in activity stops and doesn't complete.</p> <p>Application Auto Scaling provides a default value of 300 for the following scalable targets:</p> <ul> <li> <p>ECS services</p> </li> <li> <p>Spot Fleet requests</p> </li> <li> <p>EMR clusters</p> </li> <li> <p>AppStream 2.0 fleets</p> </li> <li> <p>Aurora DB clusters</p> </li> <li> <p>Amazon SageMaker endpoint variants</p> </li> <li> <p>Custom resources</p> </li> </ul> <p>For all other scalable targets, the default value is 0:</p> <ul> <li> <p>DynamoDB tables</p> </li> <li> <p>DynamoDB global secondary indexes</p> </li> <li> <p>Amazon Comprehend document classification endpoints</p> </li> <li> <p>Lambda provisioned concurrency</p> </li> <li> <p>Amazon Keyspaces tables</p> </li> </ul>
     *
     * @return <p>The amount of time, in seconds, to wait for a previous scaling activity to take effect.</p> <p>With scale-out policies, the intention is to continuously (but not excessively) scale out. After Application Auto Scaling successfully scales out using a step scaling policy, it starts to calculate the cooldown time. While the cooldown period is in effect, capacity added by the initiating scale-out activity is calculated as part of the desired capacity for the next scale-out activity. For example, when an alarm triggers a step scaling policy to increase the capacity by 2, the scaling activity completes successfully, and a cooldown period starts. If the alarm triggers again during the cooldown period but at a more aggressive step adjustment of 3, the previous increase of 2 is considered part of the current capacity. Therefore, only 1 is added to the capacity.</p> <p>With scale-in policies, the intention is to scale in conservatively to protect your application’s availability, so scale-in activities are blocked until the cooldown period has expired. However, if another alarm triggers a scale-out activity during the cooldown period after a scale-in activity, Application Auto Scaling scales out the target immediately. In this case, the cooldown period for the scale-in activity stops and doesn't complete.</p> <p>Application Auto Scaling provides a default value of 300 for the following scalable targets:</p> <ul> <li> <p>ECS services</p> </li> <li> <p>Spot Fleet requests</p> </li> <li> <p>EMR clusters</p> </li> <li> <p>AppStream 2.0 fleets</p> </li> <li> <p>Aurora DB clusters</p> </li> <li> <p>Amazon SageMaker endpoint variants</p> </li> <li> <p>Custom resources</p> </li> </ul> <p>For all other scalable targets, the default value is 0:</p> <ul> <li> <p>DynamoDB tables</p> </li> <li> <p>DynamoDB global secondary indexes</p> </li> <li> <p>Amazon Comprehend document classification endpoints</p> </li> <li> <p>Lambda provisioned concurrency</p> </li> <li> <p>Amazon Keyspaces tables</p> </li> </ul>
     */
    public Integer getCooldown() {
        return cooldown;
    }

    /**
     * <p>The amount of time, in seconds, to wait for a previous scaling activity to take effect.</p> <p>With scale-out policies, the intention is to continuously (but not excessively) scale out. After Application Auto Scaling successfully scales out using a step scaling policy, it starts to calculate the cooldown time. While the cooldown period is in effect, capacity added by the initiating scale-out activity is calculated as part of the desired capacity for the next scale-out activity. For example, when an alarm triggers a step scaling policy to increase the capacity by 2, the scaling activity completes successfully, and a cooldown period starts. If the alarm triggers again during the cooldown period but at a more aggressive step adjustment of 3, the previous increase of 2 is considered part of the current capacity. Therefore, only 1 is added to the capacity.</p> <p>With scale-in policies, the intention is to scale in conservatively to protect your application’s availability, so scale-in activities are blocked until the cooldown period has expired. However, if another alarm triggers a scale-out activity during the cooldown period after a scale-in activity, Application Auto Scaling scales out the target immediately. In this case, the cooldown period for the scale-in activity stops and doesn't complete.</p> <p>Application Auto Scaling provides a default value of 300 for the following scalable targets:</p> <ul> <li> <p>ECS services</p> </li> <li> <p>Spot Fleet requests</p> </li> <li> <p>EMR clusters</p> </li> <li> <p>AppStream 2.0 fleets</p> </li> <li> <p>Aurora DB clusters</p> </li> <li> <p>Amazon SageMaker endpoint variants</p> </li> <li> <p>Custom resources</p> </li> </ul> <p>For all other scalable targets, the default value is 0:</p> <ul> <li> <p>DynamoDB tables</p> </li> <li> <p>DynamoDB global secondary indexes</p> </li> <li> <p>Amazon Comprehend document classification endpoints</p> </li> <li> <p>Lambda provisioned concurrency</p> </li> <li> <p>Amazon Keyspaces tables</p> </li> </ul>
     *
     * @param cooldown <p>The amount of time, in seconds, to wait for a previous scaling activity to take effect.</p> <p>With scale-out policies, the intention is to continuously (but not excessively) scale out. After Application Auto Scaling successfully scales out using a step scaling policy, it starts to calculate the cooldown time. While the cooldown period is in effect, capacity added by the initiating scale-out activity is calculated as part of the desired capacity for the next scale-out activity. For example, when an alarm triggers a step scaling policy to increase the capacity by 2, the scaling activity completes successfully, and a cooldown period starts. If the alarm triggers again during the cooldown period but at a more aggressive step adjustment of 3, the previous increase of 2 is considered part of the current capacity. Therefore, only 1 is added to the capacity.</p> <p>With scale-in policies, the intention is to scale in conservatively to protect your application’s availability, so scale-in activities are blocked until the cooldown period has expired. However, if another alarm triggers a scale-out activity during the cooldown period after a scale-in activity, Application Auto Scaling scales out the target immediately. In this case, the cooldown period for the scale-in activity stops and doesn't complete.</p> <p>Application Auto Scaling provides a default value of 300 for the following scalable targets:</p> <ul> <li> <p>ECS services</p> </li> <li> <p>Spot Fleet requests</p> </li> <li> <p>EMR clusters</p> </li> <li> <p>AppStream 2.0 fleets</p> </li> <li> <p>Aurora DB clusters</p> </li> <li> <p>Amazon SageMaker endpoint variants</p> </li> <li> <p>Custom resources</p> </li> </ul> <p>For all other scalable targets, the default value is 0:</p> <ul> <li> <p>DynamoDB tables</p> </li> <li> <p>DynamoDB global secondary indexes</p> </li> <li> <p>Amazon Comprehend document classification endpoints</p> </li> <li> <p>Lambda provisioned concurrency</p> </li> <li> <p>Amazon Keyspaces tables</p> </li> </ul>
     */
    public void setCooldown(Integer cooldown) {
        this.cooldown = cooldown;
    }

    /**
     * <p>The amount of time, in seconds, to wait for a previous scaling activity to take effect.</p> <p>With scale-out policies, the intention is to continuously (but not excessively) scale out. After Application Auto Scaling successfully scales out using a step scaling policy, it starts to calculate the cooldown time. While the cooldown period is in effect, capacity added by the initiating scale-out activity is calculated as part of the desired capacity for the next scale-out activity. For example, when an alarm triggers a step scaling policy to increase the capacity by 2, the scaling activity completes successfully, and a cooldown period starts. If the alarm triggers again during the cooldown period but at a more aggressive step adjustment of 3, the previous increase of 2 is considered part of the current capacity. Therefore, only 1 is added to the capacity.</p> <p>With scale-in policies, the intention is to scale in conservatively to protect your application’s availability, so scale-in activities are blocked until the cooldown period has expired. However, if another alarm triggers a scale-out activity during the cooldown period after a scale-in activity, Application Auto Scaling scales out the target immediately. In this case, the cooldown period for the scale-in activity stops and doesn't complete.</p> <p>Application Auto Scaling provides a default value of 300 for the following scalable targets:</p> <ul> <li> <p>ECS services</p> </li> <li> <p>Spot Fleet requests</p> </li> <li> <p>EMR clusters</p> </li> <li> <p>AppStream 2.0 fleets</p> </li> <li> <p>Aurora DB clusters</p> </li> <li> <p>Amazon SageMaker endpoint variants</p> </li> <li> <p>Custom resources</p> </li> </ul> <p>For all other scalable targets, the default value is 0:</p> <ul> <li> <p>DynamoDB tables</p> </li> <li> <p>DynamoDB global secondary indexes</p> </li> <li> <p>Amazon Comprehend document classification endpoints</p> </li> <li> <p>Lambda provisioned concurrency</p> </li> <li> <p>Amazon Keyspaces tables</p> </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cooldown <p>The amount of time, in seconds, to wait for a previous scaling activity to take effect.</p> <p>With scale-out policies, the intention is to continuously (but not excessively) scale out. After Application Auto Scaling successfully scales out using a step scaling policy, it starts to calculate the cooldown time. While the cooldown period is in effect, capacity added by the initiating scale-out activity is calculated as part of the desired capacity for the next scale-out activity. For example, when an alarm triggers a step scaling policy to increase the capacity by 2, the scaling activity completes successfully, and a cooldown period starts. If the alarm triggers again during the cooldown period but at a more aggressive step adjustment of 3, the previous increase of 2 is considered part of the current capacity. Therefore, only 1 is added to the capacity.</p> <p>With scale-in policies, the intention is to scale in conservatively to protect your application’s availability, so scale-in activities are blocked until the cooldown period has expired. However, if another alarm triggers a scale-out activity during the cooldown period after a scale-in activity, Application Auto Scaling scales out the target immediately. In this case, the cooldown period for the scale-in activity stops and doesn't complete.</p> <p>Application Auto Scaling provides a default value of 300 for the following scalable targets:</p> <ul> <li> <p>ECS services</p> </li> <li> <p>Spot Fleet requests</p> </li> <li> <p>EMR clusters</p> </li> <li> <p>AppStream 2.0 fleets</p> </li> <li> <p>Aurora DB clusters</p> </li> <li> <p>Amazon SageMaker endpoint variants</p> </li> <li> <p>Custom resources</p> </li> </ul> <p>For all other scalable targets, the default value is 0:</p> <ul> <li> <p>DynamoDB tables</p> </li> <li> <p>DynamoDB global secondary indexes</p> </li> <li> <p>Amazon Comprehend document classification endpoints</p> </li> <li> <p>Lambda provisioned concurrency</p> </li> <li> <p>Amazon Keyspaces tables</p> </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public StepScalingPolicyConfiguration withCooldown(Integer cooldown) {
        this.cooldown = cooldown;
        return this;
    }

    /**
     * <p>The aggregation type for the CloudWatch metrics. Valid values are <code>Minimum</code>, <code>Maximum</code>, and <code>Average</code>. If the aggregation type is null, the value is treated as <code>Average</code>.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Average, Minimum, Maximum
     *
     * @return <p>The aggregation type for the CloudWatch metrics. Valid values are <code>Minimum</code>, <code>Maximum</code>, and <code>Average</code>. If the aggregation type is null, the value is treated as <code>Average</code>.</p>
     *
     * @see MetricAggregationType
     */
    public String getMetricAggregationType() {
        return metricAggregationType;
    }

    /**
     * <p>The aggregation type for the CloudWatch metrics. Valid values are <code>Minimum</code>, <code>Maximum</code>, and <code>Average</code>. If the aggregation type is null, the value is treated as <code>Average</code>.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Average, Minimum, Maximum
     *
     * @param metricAggregationType <p>The aggregation type for the CloudWatch metrics. Valid values are <code>Minimum</code>, <code>Maximum</code>, and <code>Average</code>. If the aggregation type is null, the value is treated as <code>Average</code>.</p>
     *
     * @see MetricAggregationType
     */
    public void setMetricAggregationType(String metricAggregationType) {
        this.metricAggregationType = metricAggregationType;
    }

    /**
     * <p>The aggregation type for the CloudWatch metrics. Valid values are <code>Minimum</code>, <code>Maximum</code>, and <code>Average</code>. If the aggregation type is null, the value is treated as <code>Average</code>.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Average, Minimum, Maximum
     *
     * @param metricAggregationType <p>The aggregation type for the CloudWatch metrics. Valid values are <code>Minimum</code>, <code>Maximum</code>, and <code>Average</code>. If the aggregation type is null, the value is treated as <code>Average</code>.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see MetricAggregationType
     */
    public StepScalingPolicyConfiguration withMetricAggregationType(String metricAggregationType) {
        this.metricAggregationType = metricAggregationType;
        return this;
    }

    /**
     * <p>The aggregation type for the CloudWatch metrics. Valid values are <code>Minimum</code>, <code>Maximum</code>, and <code>Average</code>. If the aggregation type is null, the value is treated as <code>Average</code>.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Average, Minimum, Maximum
     *
     * @param metricAggregationType <p>The aggregation type for the CloudWatch metrics. Valid values are <code>Minimum</code>, <code>Maximum</code>, and <code>Average</code>. If the aggregation type is null, the value is treated as <code>Average</code>.</p>
     *
     * @see MetricAggregationType
     */
    public void setMetricAggregationType(MetricAggregationType metricAggregationType) {
        this.metricAggregationType = metricAggregationType.toString();
    }

    /**
     * <p>The aggregation type for the CloudWatch metrics. Valid values are <code>Minimum</code>, <code>Maximum</code>, and <code>Average</code>. If the aggregation type is null, the value is treated as <code>Average</code>.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Average, Minimum, Maximum
     *
     * @param metricAggregationType <p>The aggregation type for the CloudWatch metrics. Valid values are <code>Minimum</code>, <code>Maximum</code>, and <code>Average</code>. If the aggregation type is null, the value is treated as <code>Average</code>.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see MetricAggregationType
     */
    public StepScalingPolicyConfiguration withMetricAggregationType(MetricAggregationType metricAggregationType) {
        this.metricAggregationType = metricAggregationType.toString();
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
        if (getAdjustmentType() != null) sb.append("AdjustmentType: " + getAdjustmentType() + ",");
        if (getStepAdjustments() != null) sb.append("StepAdjustments: " + getStepAdjustments() + ",");
        if (getMinAdjustmentMagnitude() != null) sb.append("MinAdjustmentMagnitude: " + getMinAdjustmentMagnitude() + ",");
        if (getCooldown() != null) sb.append("Cooldown: " + getCooldown() + ",");
        if (getMetricAggregationType() != null) sb.append("MetricAggregationType: " + getMetricAggregationType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdjustmentType() == null) ? 0 : getAdjustmentType().hashCode());
        hashCode = prime * hashCode + ((getStepAdjustments() == null) ? 0 : getStepAdjustments().hashCode());
        hashCode = prime * hashCode + ((getMinAdjustmentMagnitude() == null) ? 0 : getMinAdjustmentMagnitude().hashCode());
        hashCode = prime * hashCode + ((getCooldown() == null) ? 0 : getCooldown().hashCode());
        hashCode = prime * hashCode + ((getMetricAggregationType() == null) ? 0 : getMetricAggregationType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof StepScalingPolicyConfiguration == false) return false;
        StepScalingPolicyConfiguration other = (StepScalingPolicyConfiguration)obj;

        if (other.getAdjustmentType() == null ^ this.getAdjustmentType() == null) return false;
        if (other.getAdjustmentType() != null && other.getAdjustmentType().equals(this.getAdjustmentType()) == false) return false;
        if (other.getStepAdjustments() == null ^ this.getStepAdjustments() == null) return false;
        if (other.getStepAdjustments() != null && other.getStepAdjustments().equals(this.getStepAdjustments()) == false) return false;
        if (other.getMinAdjustmentMagnitude() == null ^ this.getMinAdjustmentMagnitude() == null) return false;
        if (other.getMinAdjustmentMagnitude() != null && other.getMinAdjustmentMagnitude().equals(this.getMinAdjustmentMagnitude()) == false) return false;
        if (other.getCooldown() == null ^ this.getCooldown() == null) return false;
        if (other.getCooldown() != null && other.getCooldown().equals(this.getCooldown()) == false) return false;
        if (other.getMetricAggregationType() == null ^ this.getMetricAggregationType() == null) return false;
        if (other.getMetricAggregationType() != null && other.getMetricAggregationType().equals(this.getMetricAggregationType()) == false) return false;
        return true;
    }
}
