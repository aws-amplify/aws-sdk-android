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

package com.amazonaws.services.applicationautoscaling.model;

import java.io.Serializable;

/**
 * <p>
 * Represents a target tracking scaling policy configuration to use with
 * Application Auto Scaling.
 * </p>
 */
public class TargetTrackingScalingPolicyConfiguration implements Serializable {
    /**
     * <p>
     * The target value for the metric. The range is 8.515920e-109 to
     * 1.174271e+108 (Base 10) or 2e-360 to 2e360 (Base 2).
     * </p>
     */
    private Double targetValue;

    /**
     * <p>
     * A predefined metric. You can specify either a predefined metric or a
     * customized metric.
     * </p>
     */
    private PredefinedMetricSpecification predefinedMetricSpecification;

    /**
     * <p>
     * A customized metric. You can specify either a predefined metric or a
     * customized metric.
     * </p>
     */
    private CustomizedMetricSpecification customizedMetricSpecification;

    /**
     * <p>
     * The amount of time, in seconds, after a scale-out activity completes
     * before another scale-out activity can start.
     * </p>
     * <p>
     * While the cooldown period is in effect, the capacity that has been added
     * by the previous scale-out action that initiated the cooldown is
     * calculated as part of the desired capacity for the next scale out. The
     * intention is to continuously (but not excessively) scale out.
     * </p>
     * <p>
     * Application Auto Scaling provides a default value of 300 for the
     * following scalable targets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ECS services
     * </p>
     * </li>
     * <li>
     * <p>
     * Spot Fleet requests
     * </p>
     * </li>
     * <li>
     * <p>
     * EMR clusters
     * </p>
     * </li>
     * <li>
     * <p>
     * AppStream 2.0 fleets
     * </p>
     * </li>
     * <li>
     * <p>
     * Aurora DB clusters
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon SageMaker endpoint variants
     * </p>
     * </li>
     * <li>
     * <p>
     * Custom resources
     * </p>
     * </li>
     * </ul>
     * <p>
     * For all other scalable targets, the default value is 0:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DynamoDB tables
     * </p>
     * </li>
     * <li>
     * <p>
     * DynamoDB global secondary indexes
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Comprehend document classification endpoints
     * </p>
     * </li>
     * <li>
     * <p>
     * Lambda provisioned concurrency
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Keyspaces tables
     * </p>
     * </li>
     * </ul>
     */
    private Integer scaleOutCooldown;

    /**
     * <p>
     * The amount of time, in seconds, after a scale-in activity completes
     * before another scale in activity can start.
     * </p>
     * <p>
     * The cooldown period is used to block subsequent scale-in requests until
     * it has expired. The intention is to scale in conservatively to protect
     * your application's availability. However, if another alarm triggers a
     * scale-out policy during the cooldown period after a scale-in, Application
     * Auto Scaling scales out your scalable target immediately.
     * </p>
     * <p>
     * Application Auto Scaling provides a default value of 300 for the
     * following scalable targets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ECS services
     * </p>
     * </li>
     * <li>
     * <p>
     * Spot Fleet requests
     * </p>
     * </li>
     * <li>
     * <p>
     * EMR clusters
     * </p>
     * </li>
     * <li>
     * <p>
     * AppStream 2.0 fleets
     * </p>
     * </li>
     * <li>
     * <p>
     * Aurora DB clusters
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon SageMaker endpoint variants
     * </p>
     * </li>
     * <li>
     * <p>
     * Custom resources
     * </p>
     * </li>
     * </ul>
     * <p>
     * For all other scalable targets, the default value is 0:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DynamoDB tables
     * </p>
     * </li>
     * <li>
     * <p>
     * DynamoDB global secondary indexes
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Comprehend document classification endpoints
     * </p>
     * </li>
     * <li>
     * <p>
     * Lambda provisioned concurrency
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Keyspaces tables
     * </p>
     * </li>
     * </ul>
     */
    private Integer scaleInCooldown;

    /**
     * <p>
     * Indicates whether scale in by the target tracking scaling policy is
     * disabled. If the value is <code>true</code>, scale in is disabled and the
     * target tracking scaling policy won't remove capacity from the scalable
     * target. Otherwise, scale in is enabled and the target tracking scaling
     * policy can remove capacity from the scalable target. The default value is
     * <code>false</code>.
     * </p>
     */
    private Boolean disableScaleIn;

    /**
     * <p>
     * The target value for the metric. The range is 8.515920e-109 to
     * 1.174271e+108 (Base 10) or 2e-360 to 2e360 (Base 2).
     * </p>
     *
     * @return <p>
     *         The target value for the metric. The range is 8.515920e-109 to
     *         1.174271e+108 (Base 10) or 2e-360 to 2e360 (Base 2).
     *         </p>
     */
    public Double getTargetValue() {
        return targetValue;
    }

    /**
     * <p>
     * The target value for the metric. The range is 8.515920e-109 to
     * 1.174271e+108 (Base 10) or 2e-360 to 2e360 (Base 2).
     * </p>
     *
     * @param targetValue <p>
     *            The target value for the metric. The range is 8.515920e-109 to
     *            1.174271e+108 (Base 10) or 2e-360 to 2e360 (Base 2).
     *            </p>
     */
    public void setTargetValue(Double targetValue) {
        this.targetValue = targetValue;
    }

    /**
     * <p>
     * The target value for the metric. The range is 8.515920e-109 to
     * 1.174271e+108 (Base 10) or 2e-360 to 2e360 (Base 2).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetValue <p>
     *            The target value for the metric. The range is 8.515920e-109 to
     *            1.174271e+108 (Base 10) or 2e-360 to 2e360 (Base 2).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TargetTrackingScalingPolicyConfiguration withTargetValue(Double targetValue) {
        this.targetValue = targetValue;
        return this;
    }

    /**
     * <p>
     * A predefined metric. You can specify either a predefined metric or a
     * customized metric.
     * </p>
     *
     * @return <p>
     *         A predefined metric. You can specify either a predefined metric
     *         or a customized metric.
     *         </p>
     */
    public PredefinedMetricSpecification getPredefinedMetricSpecification() {
        return predefinedMetricSpecification;
    }

    /**
     * <p>
     * A predefined metric. You can specify either a predefined metric or a
     * customized metric.
     * </p>
     *
     * @param predefinedMetricSpecification <p>
     *            A predefined metric. You can specify either a predefined
     *            metric or a customized metric.
     *            </p>
     */
    public void setPredefinedMetricSpecification(
            PredefinedMetricSpecification predefinedMetricSpecification) {
        this.predefinedMetricSpecification = predefinedMetricSpecification;
    }

    /**
     * <p>
     * A predefined metric. You can specify either a predefined metric or a
     * customized metric.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param predefinedMetricSpecification <p>
     *            A predefined metric. You can specify either a predefined
     *            metric or a customized metric.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TargetTrackingScalingPolicyConfiguration withPredefinedMetricSpecification(
            PredefinedMetricSpecification predefinedMetricSpecification) {
        this.predefinedMetricSpecification = predefinedMetricSpecification;
        return this;
    }

    /**
     * <p>
     * A customized metric. You can specify either a predefined metric or a
     * customized metric.
     * </p>
     *
     * @return <p>
     *         A customized metric. You can specify either a predefined metric
     *         or a customized metric.
     *         </p>
     */
    public CustomizedMetricSpecification getCustomizedMetricSpecification() {
        return customizedMetricSpecification;
    }

    /**
     * <p>
     * A customized metric. You can specify either a predefined metric or a
     * customized metric.
     * </p>
     *
     * @param customizedMetricSpecification <p>
     *            A customized metric. You can specify either a predefined
     *            metric or a customized metric.
     *            </p>
     */
    public void setCustomizedMetricSpecification(
            CustomizedMetricSpecification customizedMetricSpecification) {
        this.customizedMetricSpecification = customizedMetricSpecification;
    }

    /**
     * <p>
     * A customized metric. You can specify either a predefined metric or a
     * customized metric.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param customizedMetricSpecification <p>
     *            A customized metric. You can specify either a predefined
     *            metric or a customized metric.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TargetTrackingScalingPolicyConfiguration withCustomizedMetricSpecification(
            CustomizedMetricSpecification customizedMetricSpecification) {
        this.customizedMetricSpecification = customizedMetricSpecification;
        return this;
    }

    /**
     * <p>
     * The amount of time, in seconds, after a scale-out activity completes
     * before another scale-out activity can start.
     * </p>
     * <p>
     * While the cooldown period is in effect, the capacity that has been added
     * by the previous scale-out action that initiated the cooldown is
     * calculated as part of the desired capacity for the next scale out. The
     * intention is to continuously (but not excessively) scale out.
     * </p>
     * <p>
     * Application Auto Scaling provides a default value of 300 for the
     * following scalable targets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ECS services
     * </p>
     * </li>
     * <li>
     * <p>
     * Spot Fleet requests
     * </p>
     * </li>
     * <li>
     * <p>
     * EMR clusters
     * </p>
     * </li>
     * <li>
     * <p>
     * AppStream 2.0 fleets
     * </p>
     * </li>
     * <li>
     * <p>
     * Aurora DB clusters
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon SageMaker endpoint variants
     * </p>
     * </li>
     * <li>
     * <p>
     * Custom resources
     * </p>
     * </li>
     * </ul>
     * <p>
     * For all other scalable targets, the default value is 0:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DynamoDB tables
     * </p>
     * </li>
     * <li>
     * <p>
     * DynamoDB global secondary indexes
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Comprehend document classification endpoints
     * </p>
     * </li>
     * <li>
     * <p>
     * Lambda provisioned concurrency
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Keyspaces tables
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The amount of time, in seconds, after a scale-out activity
     *         completes before another scale-out activity can start.
     *         </p>
     *         <p>
     *         While the cooldown period is in effect, the capacity that has
     *         been added by the previous scale-out action that initiated the
     *         cooldown is calculated as part of the desired capacity for the
     *         next scale out. The intention is to continuously (but not
     *         excessively) scale out.
     *         </p>
     *         <p>
     *         Application Auto Scaling provides a default value of 300 for the
     *         following scalable targets:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         ECS services
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Spot Fleet requests
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         EMR clusters
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         AppStream 2.0 fleets
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Aurora DB clusters
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Amazon SageMaker endpoint variants
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Custom resources
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For all other scalable targets, the default value is 0:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         DynamoDB tables
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DynamoDB global secondary indexes
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Amazon Comprehend document classification endpoints
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Lambda provisioned concurrency
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Amazon Keyspaces tables
     *         </p>
     *         </li>
     *         </ul>
     */
    public Integer getScaleOutCooldown() {
        return scaleOutCooldown;
    }

    /**
     * <p>
     * The amount of time, in seconds, after a scale-out activity completes
     * before another scale-out activity can start.
     * </p>
     * <p>
     * While the cooldown period is in effect, the capacity that has been added
     * by the previous scale-out action that initiated the cooldown is
     * calculated as part of the desired capacity for the next scale out. The
     * intention is to continuously (but not excessively) scale out.
     * </p>
     * <p>
     * Application Auto Scaling provides a default value of 300 for the
     * following scalable targets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ECS services
     * </p>
     * </li>
     * <li>
     * <p>
     * Spot Fleet requests
     * </p>
     * </li>
     * <li>
     * <p>
     * EMR clusters
     * </p>
     * </li>
     * <li>
     * <p>
     * AppStream 2.0 fleets
     * </p>
     * </li>
     * <li>
     * <p>
     * Aurora DB clusters
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon SageMaker endpoint variants
     * </p>
     * </li>
     * <li>
     * <p>
     * Custom resources
     * </p>
     * </li>
     * </ul>
     * <p>
     * For all other scalable targets, the default value is 0:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DynamoDB tables
     * </p>
     * </li>
     * <li>
     * <p>
     * DynamoDB global secondary indexes
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Comprehend document classification endpoints
     * </p>
     * </li>
     * <li>
     * <p>
     * Lambda provisioned concurrency
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Keyspaces tables
     * </p>
     * </li>
     * </ul>
     *
     * @param scaleOutCooldown <p>
     *            The amount of time, in seconds, after a scale-out activity
     *            completes before another scale-out activity can start.
     *            </p>
     *            <p>
     *            While the cooldown period is in effect, the capacity that has
     *            been added by the previous scale-out action that initiated the
     *            cooldown is calculated as part of the desired capacity for the
     *            next scale out. The intention is to continuously (but not
     *            excessively) scale out.
     *            </p>
     *            <p>
     *            Application Auto Scaling provides a default value of 300 for
     *            the following scalable targets:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            ECS services
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Spot Fleet requests
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            EMR clusters
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            AppStream 2.0 fleets
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Aurora DB clusters
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Amazon SageMaker endpoint variants
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Custom resources
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For all other scalable targets, the default value is 0:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            DynamoDB tables
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            DynamoDB global secondary indexes
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Amazon Comprehend document classification endpoints
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Lambda provisioned concurrency
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Amazon Keyspaces tables
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setScaleOutCooldown(Integer scaleOutCooldown) {
        this.scaleOutCooldown = scaleOutCooldown;
    }

    /**
     * <p>
     * The amount of time, in seconds, after a scale-out activity completes
     * before another scale-out activity can start.
     * </p>
     * <p>
     * While the cooldown period is in effect, the capacity that has been added
     * by the previous scale-out action that initiated the cooldown is
     * calculated as part of the desired capacity for the next scale out. The
     * intention is to continuously (but not excessively) scale out.
     * </p>
     * <p>
     * Application Auto Scaling provides a default value of 300 for the
     * following scalable targets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ECS services
     * </p>
     * </li>
     * <li>
     * <p>
     * Spot Fleet requests
     * </p>
     * </li>
     * <li>
     * <p>
     * EMR clusters
     * </p>
     * </li>
     * <li>
     * <p>
     * AppStream 2.0 fleets
     * </p>
     * </li>
     * <li>
     * <p>
     * Aurora DB clusters
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon SageMaker endpoint variants
     * </p>
     * </li>
     * <li>
     * <p>
     * Custom resources
     * </p>
     * </li>
     * </ul>
     * <p>
     * For all other scalable targets, the default value is 0:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DynamoDB tables
     * </p>
     * </li>
     * <li>
     * <p>
     * DynamoDB global secondary indexes
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Comprehend document classification endpoints
     * </p>
     * </li>
     * <li>
     * <p>
     * Lambda provisioned concurrency
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Keyspaces tables
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scaleOutCooldown <p>
     *            The amount of time, in seconds, after a scale-out activity
     *            completes before another scale-out activity can start.
     *            </p>
     *            <p>
     *            While the cooldown period is in effect, the capacity that has
     *            been added by the previous scale-out action that initiated the
     *            cooldown is calculated as part of the desired capacity for the
     *            next scale out. The intention is to continuously (but not
     *            excessively) scale out.
     *            </p>
     *            <p>
     *            Application Auto Scaling provides a default value of 300 for
     *            the following scalable targets:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            ECS services
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Spot Fleet requests
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            EMR clusters
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            AppStream 2.0 fleets
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Aurora DB clusters
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Amazon SageMaker endpoint variants
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Custom resources
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For all other scalable targets, the default value is 0:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            DynamoDB tables
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            DynamoDB global secondary indexes
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Amazon Comprehend document classification endpoints
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Lambda provisioned concurrency
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Amazon Keyspaces tables
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TargetTrackingScalingPolicyConfiguration withScaleOutCooldown(Integer scaleOutCooldown) {
        this.scaleOutCooldown = scaleOutCooldown;
        return this;
    }

    /**
     * <p>
     * The amount of time, in seconds, after a scale-in activity completes
     * before another scale in activity can start.
     * </p>
     * <p>
     * The cooldown period is used to block subsequent scale-in requests until
     * it has expired. The intention is to scale in conservatively to protect
     * your application's availability. However, if another alarm triggers a
     * scale-out policy during the cooldown period after a scale-in, Application
     * Auto Scaling scales out your scalable target immediately.
     * </p>
     * <p>
     * Application Auto Scaling provides a default value of 300 for the
     * following scalable targets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ECS services
     * </p>
     * </li>
     * <li>
     * <p>
     * Spot Fleet requests
     * </p>
     * </li>
     * <li>
     * <p>
     * EMR clusters
     * </p>
     * </li>
     * <li>
     * <p>
     * AppStream 2.0 fleets
     * </p>
     * </li>
     * <li>
     * <p>
     * Aurora DB clusters
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon SageMaker endpoint variants
     * </p>
     * </li>
     * <li>
     * <p>
     * Custom resources
     * </p>
     * </li>
     * </ul>
     * <p>
     * For all other scalable targets, the default value is 0:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DynamoDB tables
     * </p>
     * </li>
     * <li>
     * <p>
     * DynamoDB global secondary indexes
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Comprehend document classification endpoints
     * </p>
     * </li>
     * <li>
     * <p>
     * Lambda provisioned concurrency
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Keyspaces tables
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The amount of time, in seconds, after a scale-in activity
     *         completes before another scale in activity can start.
     *         </p>
     *         <p>
     *         The cooldown period is used to block subsequent scale-in requests
     *         until it has expired. The intention is to scale in conservatively
     *         to protect your application's availability. However, if another
     *         alarm triggers a scale-out policy during the cooldown period
     *         after a scale-in, Application Auto Scaling scales out your
     *         scalable target immediately.
     *         </p>
     *         <p>
     *         Application Auto Scaling provides a default value of 300 for the
     *         following scalable targets:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         ECS services
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Spot Fleet requests
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         EMR clusters
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         AppStream 2.0 fleets
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Aurora DB clusters
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Amazon SageMaker endpoint variants
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Custom resources
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For all other scalable targets, the default value is 0:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         DynamoDB tables
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DynamoDB global secondary indexes
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Amazon Comprehend document classification endpoints
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Lambda provisioned concurrency
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Amazon Keyspaces tables
     *         </p>
     *         </li>
     *         </ul>
     */
    public Integer getScaleInCooldown() {
        return scaleInCooldown;
    }

    /**
     * <p>
     * The amount of time, in seconds, after a scale-in activity completes
     * before another scale in activity can start.
     * </p>
     * <p>
     * The cooldown period is used to block subsequent scale-in requests until
     * it has expired. The intention is to scale in conservatively to protect
     * your application's availability. However, if another alarm triggers a
     * scale-out policy during the cooldown period after a scale-in, Application
     * Auto Scaling scales out your scalable target immediately.
     * </p>
     * <p>
     * Application Auto Scaling provides a default value of 300 for the
     * following scalable targets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ECS services
     * </p>
     * </li>
     * <li>
     * <p>
     * Spot Fleet requests
     * </p>
     * </li>
     * <li>
     * <p>
     * EMR clusters
     * </p>
     * </li>
     * <li>
     * <p>
     * AppStream 2.0 fleets
     * </p>
     * </li>
     * <li>
     * <p>
     * Aurora DB clusters
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon SageMaker endpoint variants
     * </p>
     * </li>
     * <li>
     * <p>
     * Custom resources
     * </p>
     * </li>
     * </ul>
     * <p>
     * For all other scalable targets, the default value is 0:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DynamoDB tables
     * </p>
     * </li>
     * <li>
     * <p>
     * DynamoDB global secondary indexes
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Comprehend document classification endpoints
     * </p>
     * </li>
     * <li>
     * <p>
     * Lambda provisioned concurrency
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Keyspaces tables
     * </p>
     * </li>
     * </ul>
     *
     * @param scaleInCooldown <p>
     *            The amount of time, in seconds, after a scale-in activity
     *            completes before another scale in activity can start.
     *            </p>
     *            <p>
     *            The cooldown period is used to block subsequent scale-in
     *            requests until it has expired. The intention is to scale in
     *            conservatively to protect your application's availability.
     *            However, if another alarm triggers a scale-out policy during
     *            the cooldown period after a scale-in, Application Auto Scaling
     *            scales out your scalable target immediately.
     *            </p>
     *            <p>
     *            Application Auto Scaling provides a default value of 300 for
     *            the following scalable targets:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            ECS services
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Spot Fleet requests
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            EMR clusters
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            AppStream 2.0 fleets
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Aurora DB clusters
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Amazon SageMaker endpoint variants
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Custom resources
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For all other scalable targets, the default value is 0:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            DynamoDB tables
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            DynamoDB global secondary indexes
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Amazon Comprehend document classification endpoints
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Lambda provisioned concurrency
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Amazon Keyspaces tables
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setScaleInCooldown(Integer scaleInCooldown) {
        this.scaleInCooldown = scaleInCooldown;
    }

    /**
     * <p>
     * The amount of time, in seconds, after a scale-in activity completes
     * before another scale in activity can start.
     * </p>
     * <p>
     * The cooldown period is used to block subsequent scale-in requests until
     * it has expired. The intention is to scale in conservatively to protect
     * your application's availability. However, if another alarm triggers a
     * scale-out policy during the cooldown period after a scale-in, Application
     * Auto Scaling scales out your scalable target immediately.
     * </p>
     * <p>
     * Application Auto Scaling provides a default value of 300 for the
     * following scalable targets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * ECS services
     * </p>
     * </li>
     * <li>
     * <p>
     * Spot Fleet requests
     * </p>
     * </li>
     * <li>
     * <p>
     * EMR clusters
     * </p>
     * </li>
     * <li>
     * <p>
     * AppStream 2.0 fleets
     * </p>
     * </li>
     * <li>
     * <p>
     * Aurora DB clusters
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon SageMaker endpoint variants
     * </p>
     * </li>
     * <li>
     * <p>
     * Custom resources
     * </p>
     * </li>
     * </ul>
     * <p>
     * For all other scalable targets, the default value is 0:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DynamoDB tables
     * </p>
     * </li>
     * <li>
     * <p>
     * DynamoDB global secondary indexes
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Comprehend document classification endpoints
     * </p>
     * </li>
     * <li>
     * <p>
     * Lambda provisioned concurrency
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Keyspaces tables
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scaleInCooldown <p>
     *            The amount of time, in seconds, after a scale-in activity
     *            completes before another scale in activity can start.
     *            </p>
     *            <p>
     *            The cooldown period is used to block subsequent scale-in
     *            requests until it has expired. The intention is to scale in
     *            conservatively to protect your application's availability.
     *            However, if another alarm triggers a scale-out policy during
     *            the cooldown period after a scale-in, Application Auto Scaling
     *            scales out your scalable target immediately.
     *            </p>
     *            <p>
     *            Application Auto Scaling provides a default value of 300 for
     *            the following scalable targets:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            ECS services
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Spot Fleet requests
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            EMR clusters
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            AppStream 2.0 fleets
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Aurora DB clusters
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Amazon SageMaker endpoint variants
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Custom resources
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For all other scalable targets, the default value is 0:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            DynamoDB tables
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            DynamoDB global secondary indexes
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Amazon Comprehend document classification endpoints
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Lambda provisioned concurrency
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Amazon Keyspaces tables
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TargetTrackingScalingPolicyConfiguration withScaleInCooldown(Integer scaleInCooldown) {
        this.scaleInCooldown = scaleInCooldown;
        return this;
    }

    /**
     * <p>
     * Indicates whether scale in by the target tracking scaling policy is
     * disabled. If the value is <code>true</code>, scale in is disabled and the
     * target tracking scaling policy won't remove capacity from the scalable
     * target. Otherwise, scale in is enabled and the target tracking scaling
     * policy can remove capacity from the scalable target. The default value is
     * <code>false</code>.
     * </p>
     *
     * @return <p>
     *         Indicates whether scale in by the target tracking scaling policy
     *         is disabled. If the value is <code>true</code>, scale in is
     *         disabled and the target tracking scaling policy won't remove
     *         capacity from the scalable target. Otherwise, scale in is enabled
     *         and the target tracking scaling policy can remove capacity from
     *         the scalable target. The default value is <code>false</code>.
     *         </p>
     */
    public Boolean isDisableScaleIn() {
        return disableScaleIn;
    }

    /**
     * <p>
     * Indicates whether scale in by the target tracking scaling policy is
     * disabled. If the value is <code>true</code>, scale in is disabled and the
     * target tracking scaling policy won't remove capacity from the scalable
     * target. Otherwise, scale in is enabled and the target tracking scaling
     * policy can remove capacity from the scalable target. The default value is
     * <code>false</code>.
     * </p>
     *
     * @return <p>
     *         Indicates whether scale in by the target tracking scaling policy
     *         is disabled. If the value is <code>true</code>, scale in is
     *         disabled and the target tracking scaling policy won't remove
     *         capacity from the scalable target. Otherwise, scale in is enabled
     *         and the target tracking scaling policy can remove capacity from
     *         the scalable target. The default value is <code>false</code>.
     *         </p>
     */
    public Boolean getDisableScaleIn() {
        return disableScaleIn;
    }

    /**
     * <p>
     * Indicates whether scale in by the target tracking scaling policy is
     * disabled. If the value is <code>true</code>, scale in is disabled and the
     * target tracking scaling policy won't remove capacity from the scalable
     * target. Otherwise, scale in is enabled and the target tracking scaling
     * policy can remove capacity from the scalable target. The default value is
     * <code>false</code>.
     * </p>
     *
     * @param disableScaleIn <p>
     *            Indicates whether scale in by the target tracking scaling
     *            policy is disabled. If the value is <code>true</code>, scale
     *            in is disabled and the target tracking scaling policy won't
     *            remove capacity from the scalable target. Otherwise, scale in
     *            is enabled and the target tracking scaling policy can remove
     *            capacity from the scalable target. The default value is
     *            <code>false</code>.
     *            </p>
     */
    public void setDisableScaleIn(Boolean disableScaleIn) {
        this.disableScaleIn = disableScaleIn;
    }

    /**
     * <p>
     * Indicates whether scale in by the target tracking scaling policy is
     * disabled. If the value is <code>true</code>, scale in is disabled and the
     * target tracking scaling policy won't remove capacity from the scalable
     * target. Otherwise, scale in is enabled and the target tracking scaling
     * policy can remove capacity from the scalable target. The default value is
     * <code>false</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param disableScaleIn <p>
     *            Indicates whether scale in by the target tracking scaling
     *            policy is disabled. If the value is <code>true</code>, scale
     *            in is disabled and the target tracking scaling policy won't
     *            remove capacity from the scalable target. Otherwise, scale in
     *            is enabled and the target tracking scaling policy can remove
     *            capacity from the scalable target. The default value is
     *            <code>false</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TargetTrackingScalingPolicyConfiguration withDisableScaleIn(Boolean disableScaleIn) {
        this.disableScaleIn = disableScaleIn;
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
        if (getTargetValue() != null)
            sb.append("TargetValue: " + getTargetValue() + ",");
        if (getPredefinedMetricSpecification() != null)
            sb.append("PredefinedMetricSpecification: " + getPredefinedMetricSpecification() + ",");
        if (getCustomizedMetricSpecification() != null)
            sb.append("CustomizedMetricSpecification: " + getCustomizedMetricSpecification() + ",");
        if (getScaleOutCooldown() != null)
            sb.append("ScaleOutCooldown: " + getScaleOutCooldown() + ",");
        if (getScaleInCooldown() != null)
            sb.append("ScaleInCooldown: " + getScaleInCooldown() + ",");
        if (getDisableScaleIn() != null)
            sb.append("DisableScaleIn: " + getDisableScaleIn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTargetValue() == null) ? 0 : getTargetValue().hashCode());
        hashCode = prime
                * hashCode
                + ((getPredefinedMetricSpecification() == null) ? 0
                        : getPredefinedMetricSpecification().hashCode());
        hashCode = prime
                * hashCode
                + ((getCustomizedMetricSpecification() == null) ? 0
                        : getCustomizedMetricSpecification().hashCode());
        hashCode = prime * hashCode
                + ((getScaleOutCooldown() == null) ? 0 : getScaleOutCooldown().hashCode());
        hashCode = prime * hashCode
                + ((getScaleInCooldown() == null) ? 0 : getScaleInCooldown().hashCode());
        hashCode = prime * hashCode
                + ((getDisableScaleIn() == null) ? 0 : getDisableScaleIn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TargetTrackingScalingPolicyConfiguration == false)
            return false;
        TargetTrackingScalingPolicyConfiguration other = (TargetTrackingScalingPolicyConfiguration) obj;

        if (other.getTargetValue() == null ^ this.getTargetValue() == null)
            return false;
        if (other.getTargetValue() != null
                && other.getTargetValue().equals(this.getTargetValue()) == false)
            return false;
        if (other.getPredefinedMetricSpecification() == null
                ^ this.getPredefinedMetricSpecification() == null)
            return false;
        if (other.getPredefinedMetricSpecification() != null
                && other.getPredefinedMetricSpecification().equals(
                        this.getPredefinedMetricSpecification()) == false)
            return false;
        if (other.getCustomizedMetricSpecification() == null
                ^ this.getCustomizedMetricSpecification() == null)
            return false;
        if (other.getCustomizedMetricSpecification() != null
                && other.getCustomizedMetricSpecification().equals(
                        this.getCustomizedMetricSpecification()) == false)
            return false;
        if (other.getScaleOutCooldown() == null ^ this.getScaleOutCooldown() == null)
            return false;
        if (other.getScaleOutCooldown() != null
                && other.getScaleOutCooldown().equals(this.getScaleOutCooldown()) == false)
            return false;
        if (other.getScaleInCooldown() == null ^ this.getScaleInCooldown() == null)
            return false;
        if (other.getScaleInCooldown() != null
                && other.getScaleInCooldown().equals(this.getScaleInCooldown()) == false)
            return false;
        if (other.getDisableScaleIn() == null ^ this.getDisableScaleIn() == null)
            return false;
        if (other.getDisableScaleIn() != null
                && other.getDisableScaleIn().equals(this.getDisableScaleIn()) == false)
            return false;
        return true;
    }
}
