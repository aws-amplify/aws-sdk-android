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
 * Describes a scaling policy.
 * </p>
 */
public class ScalingPolicy implements Serializable {
    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String autoScalingGroupName;

    /**
     * <p>
     * The name of the scaling policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String policyName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String policyARN;

    /**
     * <p>
     * The policy type. Valid values are <code>SimpleScaling</code> and
     * <code>StepScaling</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String policyType;

    /**
     * <p>
     * The adjustment type, which specifies how <code>ScalingAdjustment</code>
     * is interpreted. Valid values are <code>ChangeInCapacity</code>,
     * <code>ExactCapacity</code>, and <code>PercentChangeInCapacity</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String adjustmentType;

    /**
     * <p>
     * Available for backward compatibility. Use
     * <code>MinAdjustmentMagnitude</code> instead.
     * </p>
     */
    private Integer minAdjustmentStep;

    /**
     * <p>
     * The minimum number of instances to scale. If the value of
     * <code>AdjustmentType</code> is <code>PercentChangeInCapacity</code>, the
     * scaling policy changes the <code>DesiredCapacity</code> of the Auto
     * Scaling group by at least this many instances. Otherwise, the error is
     * <code>ValidationError</code>.
     * </p>
     */
    private Integer minAdjustmentMagnitude;

    /**
     * <p>
     * The amount by which to scale, based on the specified adjustment type. A
     * positive value adds to the current capacity while a negative number
     * removes from the current capacity.
     * </p>
     */
    private Integer scalingAdjustment;

    /**
     * <p>
     * The amount of time, in seconds, after a scaling activity completes before
     * any further dynamic scaling activities can start.
     * </p>
     */
    private Integer cooldown;

    /**
     * <p>
     * A set of adjustments that enable you to scale based on the size of the
     * alarm breach.
     * </p>
     */
    private java.util.List<StepAdjustment> stepAdjustments = new java.util.ArrayList<StepAdjustment>();

    /**
     * <p>
     * The aggregation type for the CloudWatch metrics. Valid values are
     * <code>Minimum</code>, <code>Maximum</code>, and <code>Average</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String metricAggregationType;

    /**
     * <p>
     * The estimated time, in seconds, until a newly launched instance can
     * contribute to the CloudWatch metrics.
     * </p>
     */
    private Integer estimatedInstanceWarmup;

    /**
     * <p>
     * The CloudWatch alarms related to the policy.
     * </p>
     */
    private java.util.List<Alarm> alarms = new java.util.ArrayList<Alarm>();

    /**
     * <p>
     * A target tracking policy.
     * </p>
     */
    private TargetTrackingConfiguration targetTrackingConfiguration;

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
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
     * <b>Length: </b>1 - 255<br/>
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
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param autoScalingGroupName <p>
     *            The name of the Auto Scaling group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScalingPolicy withAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
        return this;
    }

    /**
     * <p>
     * The name of the scaling policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The name of the scaling policy.
     *         </p>
     */
    public String getPolicyName() {
        return policyName;
    }

    /**
     * <p>
     * The name of the scaling policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param policyName <p>
     *            The name of the scaling policy.
     *            </p>
     */
    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    /**
     * <p>
     * The name of the scaling policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param policyName <p>
     *            The name of the scaling policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScalingPolicy withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the policy.
     *         </p>
     */
    public String getPolicyARN() {
        return policyARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param policyARN <p>
     *            The Amazon Resource Name (ARN) of the policy.
     *            </p>
     */
    public void setPolicyARN(String policyARN) {
        this.policyARN = policyARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the policy.
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
     * @param policyARN <p>
     *            The Amazon Resource Name (ARN) of the policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScalingPolicy withPolicyARN(String policyARN) {
        this.policyARN = policyARN;
        return this;
    }

    /**
     * <p>
     * The policy type. Valid values are <code>SimpleScaling</code> and
     * <code>StepScaling</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The policy type. Valid values are <code>SimpleScaling</code> and
     *         <code>StepScaling</code>.
     *         </p>
     */
    public String getPolicyType() {
        return policyType;
    }

    /**
     * <p>
     * The policy type. Valid values are <code>SimpleScaling</code> and
     * <code>StepScaling</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param policyType <p>
     *            The policy type. Valid values are <code>SimpleScaling</code>
     *            and <code>StepScaling</code>.
     *            </p>
     */
    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    /**
     * <p>
     * The policy type. Valid values are <code>SimpleScaling</code> and
     * <code>StepScaling</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param policyType <p>
     *            The policy type. Valid values are <code>SimpleScaling</code>
     *            and <code>StepScaling</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScalingPolicy withPolicyType(String policyType) {
        this.policyType = policyType;
        return this;
    }

    /**
     * <p>
     * The adjustment type, which specifies how <code>ScalingAdjustment</code>
     * is interpreted. Valid values are <code>ChangeInCapacity</code>,
     * <code>ExactCapacity</code>, and <code>PercentChangeInCapacity</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The adjustment type, which specifies how
     *         <code>ScalingAdjustment</code> is interpreted. Valid values are
     *         <code>ChangeInCapacity</code>, <code>ExactCapacity</code>, and
     *         <code>PercentChangeInCapacity</code>.
     *         </p>
     */
    public String getAdjustmentType() {
        return adjustmentType;
    }

    /**
     * <p>
     * The adjustment type, which specifies how <code>ScalingAdjustment</code>
     * is interpreted. Valid values are <code>ChangeInCapacity</code>,
     * <code>ExactCapacity</code>, and <code>PercentChangeInCapacity</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param adjustmentType <p>
     *            The adjustment type, which specifies how
     *            <code>ScalingAdjustment</code> is interpreted. Valid values
     *            are <code>ChangeInCapacity</code>, <code>ExactCapacity</code>,
     *            and <code>PercentChangeInCapacity</code>.
     *            </p>
     */
    public void setAdjustmentType(String adjustmentType) {
        this.adjustmentType = adjustmentType;
    }

    /**
     * <p>
     * The adjustment type, which specifies how <code>ScalingAdjustment</code>
     * is interpreted. Valid values are <code>ChangeInCapacity</code>,
     * <code>ExactCapacity</code>, and <code>PercentChangeInCapacity</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param adjustmentType <p>
     *            The adjustment type, which specifies how
     *            <code>ScalingAdjustment</code> is interpreted. Valid values
     *            are <code>ChangeInCapacity</code>, <code>ExactCapacity</code>,
     *            and <code>PercentChangeInCapacity</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScalingPolicy withAdjustmentType(String adjustmentType) {
        this.adjustmentType = adjustmentType;
        return this;
    }

    /**
     * <p>
     * Available for backward compatibility. Use
     * <code>MinAdjustmentMagnitude</code> instead.
     * </p>
     *
     * @return <p>
     *         Available for backward compatibility. Use
     *         <code>MinAdjustmentMagnitude</code> instead.
     *         </p>
     */
    public Integer getMinAdjustmentStep() {
        return minAdjustmentStep;
    }

    /**
     * <p>
     * Available for backward compatibility. Use
     * <code>MinAdjustmentMagnitude</code> instead.
     * </p>
     *
     * @param minAdjustmentStep <p>
     *            Available for backward compatibility. Use
     *            <code>MinAdjustmentMagnitude</code> instead.
     *            </p>
     */
    public void setMinAdjustmentStep(Integer minAdjustmentStep) {
        this.minAdjustmentStep = minAdjustmentStep;
    }

    /**
     * <p>
     * Available for backward compatibility. Use
     * <code>MinAdjustmentMagnitude</code> instead.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param minAdjustmentStep <p>
     *            Available for backward compatibility. Use
     *            <code>MinAdjustmentMagnitude</code> instead.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScalingPolicy withMinAdjustmentStep(Integer minAdjustmentStep) {
        this.minAdjustmentStep = minAdjustmentStep;
        return this;
    }

    /**
     * <p>
     * The minimum number of instances to scale. If the value of
     * <code>AdjustmentType</code> is <code>PercentChangeInCapacity</code>, the
     * scaling policy changes the <code>DesiredCapacity</code> of the Auto
     * Scaling group by at least this many instances. Otherwise, the error is
     * <code>ValidationError</code>.
     * </p>
     *
     * @return <p>
     *         The minimum number of instances to scale. If the value of
     *         <code>AdjustmentType</code> is
     *         <code>PercentChangeInCapacity</code>, the scaling policy changes
     *         the <code>DesiredCapacity</code> of the Auto Scaling group by at
     *         least this many instances. Otherwise, the error is
     *         <code>ValidationError</code>.
     *         </p>
     */
    public Integer getMinAdjustmentMagnitude() {
        return minAdjustmentMagnitude;
    }

    /**
     * <p>
     * The minimum number of instances to scale. If the value of
     * <code>AdjustmentType</code> is <code>PercentChangeInCapacity</code>, the
     * scaling policy changes the <code>DesiredCapacity</code> of the Auto
     * Scaling group by at least this many instances. Otherwise, the error is
     * <code>ValidationError</code>.
     * </p>
     *
     * @param minAdjustmentMagnitude <p>
     *            The minimum number of instances to scale. If the value of
     *            <code>AdjustmentType</code> is
     *            <code>PercentChangeInCapacity</code>, the scaling policy
     *            changes the <code>DesiredCapacity</code> of the Auto Scaling
     *            group by at least this many instances. Otherwise, the error is
     *            <code>ValidationError</code>.
     *            </p>
     */
    public void setMinAdjustmentMagnitude(Integer minAdjustmentMagnitude) {
        this.minAdjustmentMagnitude = minAdjustmentMagnitude;
    }

    /**
     * <p>
     * The minimum number of instances to scale. If the value of
     * <code>AdjustmentType</code> is <code>PercentChangeInCapacity</code>, the
     * scaling policy changes the <code>DesiredCapacity</code> of the Auto
     * Scaling group by at least this many instances. Otherwise, the error is
     * <code>ValidationError</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param minAdjustmentMagnitude <p>
     *            The minimum number of instances to scale. If the value of
     *            <code>AdjustmentType</code> is
     *            <code>PercentChangeInCapacity</code>, the scaling policy
     *            changes the <code>DesiredCapacity</code> of the Auto Scaling
     *            group by at least this many instances. Otherwise, the error is
     *            <code>ValidationError</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScalingPolicy withMinAdjustmentMagnitude(Integer minAdjustmentMagnitude) {
        this.minAdjustmentMagnitude = minAdjustmentMagnitude;
        return this;
    }

    /**
     * <p>
     * The amount by which to scale, based on the specified adjustment type. A
     * positive value adds to the current capacity while a negative number
     * removes from the current capacity.
     * </p>
     *
     * @return <p>
     *         The amount by which to scale, based on the specified adjustment
     *         type. A positive value adds to the current capacity while a
     *         negative number removes from the current capacity.
     *         </p>
     */
    public Integer getScalingAdjustment() {
        return scalingAdjustment;
    }

    /**
     * <p>
     * The amount by which to scale, based on the specified adjustment type. A
     * positive value adds to the current capacity while a negative number
     * removes from the current capacity.
     * </p>
     *
     * @param scalingAdjustment <p>
     *            The amount by which to scale, based on the specified
     *            adjustment type. A positive value adds to the current capacity
     *            while a negative number removes from the current capacity.
     *            </p>
     */
    public void setScalingAdjustment(Integer scalingAdjustment) {
        this.scalingAdjustment = scalingAdjustment;
    }

    /**
     * <p>
     * The amount by which to scale, based on the specified adjustment type. A
     * positive value adds to the current capacity while a negative number
     * removes from the current capacity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scalingAdjustment <p>
     *            The amount by which to scale, based on the specified
     *            adjustment type. A positive value adds to the current capacity
     *            while a negative number removes from the current capacity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScalingPolicy withScalingAdjustment(Integer scalingAdjustment) {
        this.scalingAdjustment = scalingAdjustment;
        return this;
    }

    /**
     * <p>
     * The amount of time, in seconds, after a scaling activity completes before
     * any further dynamic scaling activities can start.
     * </p>
     *
     * @return <p>
     *         The amount of time, in seconds, after a scaling activity
     *         completes before any further dynamic scaling activities can
     *         start.
     *         </p>
     */
    public Integer getCooldown() {
        return cooldown;
    }

    /**
     * <p>
     * The amount of time, in seconds, after a scaling activity completes before
     * any further dynamic scaling activities can start.
     * </p>
     *
     * @param cooldown <p>
     *            The amount of time, in seconds, after a scaling activity
     *            completes before any further dynamic scaling activities can
     *            start.
     *            </p>
     */
    public void setCooldown(Integer cooldown) {
        this.cooldown = cooldown;
    }

    /**
     * <p>
     * The amount of time, in seconds, after a scaling activity completes before
     * any further dynamic scaling activities can start.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cooldown <p>
     *            The amount of time, in seconds, after a scaling activity
     *            completes before any further dynamic scaling activities can
     *            start.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScalingPolicy withCooldown(Integer cooldown) {
        this.cooldown = cooldown;
        return this;
    }

    /**
     * <p>
     * A set of adjustments that enable you to scale based on the size of the
     * alarm breach.
     * </p>
     *
     * @return <p>
     *         A set of adjustments that enable you to scale based on the size
     *         of the alarm breach.
     *         </p>
     */
    public java.util.List<StepAdjustment> getStepAdjustments() {
        return stepAdjustments;
    }

    /**
     * <p>
     * A set of adjustments that enable you to scale based on the size of the
     * alarm breach.
     * </p>
     *
     * @param stepAdjustments <p>
     *            A set of adjustments that enable you to scale based on the
     *            size of the alarm breach.
     *            </p>
     */
    public void setStepAdjustments(java.util.Collection<StepAdjustment> stepAdjustments) {
        if (stepAdjustments == null) {
            this.stepAdjustments = null;
            return;
        }

        this.stepAdjustments = new java.util.ArrayList<StepAdjustment>(stepAdjustments);
    }

    /**
     * <p>
     * A set of adjustments that enable you to scale based on the size of the
     * alarm breach.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stepAdjustments <p>
     *            A set of adjustments that enable you to scale based on the
     *            size of the alarm breach.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScalingPolicy withStepAdjustments(StepAdjustment... stepAdjustments) {
        if (getStepAdjustments() == null) {
            this.stepAdjustments = new java.util.ArrayList<StepAdjustment>(stepAdjustments.length);
        }
        for (StepAdjustment value : stepAdjustments) {
            this.stepAdjustments.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A set of adjustments that enable you to scale based on the size of the
     * alarm breach.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stepAdjustments <p>
     *            A set of adjustments that enable you to scale based on the
     *            size of the alarm breach.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScalingPolicy withStepAdjustments(java.util.Collection<StepAdjustment> stepAdjustments) {
        setStepAdjustments(stepAdjustments);
        return this;
    }

    /**
     * <p>
     * The aggregation type for the CloudWatch metrics. Valid values are
     * <code>Minimum</code>, <code>Maximum</code>, and <code>Average</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The aggregation type for the CloudWatch metrics. Valid values are
     *         <code>Minimum</code>, <code>Maximum</code>, and
     *         <code>Average</code>.
     *         </p>
     */
    public String getMetricAggregationType() {
        return metricAggregationType;
    }

    /**
     * <p>
     * The aggregation type for the CloudWatch metrics. Valid values are
     * <code>Minimum</code>, <code>Maximum</code>, and <code>Average</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param metricAggregationType <p>
     *            The aggregation type for the CloudWatch metrics. Valid values
     *            are <code>Minimum</code>, <code>Maximum</code>, and
     *            <code>Average</code>.
     *            </p>
     */
    public void setMetricAggregationType(String metricAggregationType) {
        this.metricAggregationType = metricAggregationType;
    }

    /**
     * <p>
     * The aggregation type for the CloudWatch metrics. Valid values are
     * <code>Minimum</code>, <code>Maximum</code>, and <code>Average</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param metricAggregationType <p>
     *            The aggregation type for the CloudWatch metrics. Valid values
     *            are <code>Minimum</code>, <code>Maximum</code>, and
     *            <code>Average</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScalingPolicy withMetricAggregationType(String metricAggregationType) {
        this.metricAggregationType = metricAggregationType;
        return this;
    }

    /**
     * <p>
     * The estimated time, in seconds, until a newly launched instance can
     * contribute to the CloudWatch metrics.
     * </p>
     *
     * @return <p>
     *         The estimated time, in seconds, until a newly launched instance
     *         can contribute to the CloudWatch metrics.
     *         </p>
     */
    public Integer getEstimatedInstanceWarmup() {
        return estimatedInstanceWarmup;
    }

    /**
     * <p>
     * The estimated time, in seconds, until a newly launched instance can
     * contribute to the CloudWatch metrics.
     * </p>
     *
     * @param estimatedInstanceWarmup <p>
     *            The estimated time, in seconds, until a newly launched
     *            instance can contribute to the CloudWatch metrics.
     *            </p>
     */
    public void setEstimatedInstanceWarmup(Integer estimatedInstanceWarmup) {
        this.estimatedInstanceWarmup = estimatedInstanceWarmup;
    }

    /**
     * <p>
     * The estimated time, in seconds, until a newly launched instance can
     * contribute to the CloudWatch metrics.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param estimatedInstanceWarmup <p>
     *            The estimated time, in seconds, until a newly launched
     *            instance can contribute to the CloudWatch metrics.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScalingPolicy withEstimatedInstanceWarmup(Integer estimatedInstanceWarmup) {
        this.estimatedInstanceWarmup = estimatedInstanceWarmup;
        return this;
    }

    /**
     * <p>
     * The CloudWatch alarms related to the policy.
     * </p>
     *
     * @return <p>
     *         The CloudWatch alarms related to the policy.
     *         </p>
     */
    public java.util.List<Alarm> getAlarms() {
        return alarms;
    }

    /**
     * <p>
     * The CloudWatch alarms related to the policy.
     * </p>
     *
     * @param alarms <p>
     *            The CloudWatch alarms related to the policy.
     *            </p>
     */
    public void setAlarms(java.util.Collection<Alarm> alarms) {
        if (alarms == null) {
            this.alarms = null;
            return;
        }

        this.alarms = new java.util.ArrayList<Alarm>(alarms);
    }

    /**
     * <p>
     * The CloudWatch alarms related to the policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param alarms <p>
     *            The CloudWatch alarms related to the policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScalingPolicy withAlarms(Alarm... alarms) {
        if (getAlarms() == null) {
            this.alarms = new java.util.ArrayList<Alarm>(alarms.length);
        }
        for (Alarm value : alarms) {
            this.alarms.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The CloudWatch alarms related to the policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param alarms <p>
     *            The CloudWatch alarms related to the policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScalingPolicy withAlarms(java.util.Collection<Alarm> alarms) {
        setAlarms(alarms);
        return this;
    }

    /**
     * <p>
     * A target tracking policy.
     * </p>
     *
     * @return <p>
     *         A target tracking policy.
     *         </p>
     */
    public TargetTrackingConfiguration getTargetTrackingConfiguration() {
        return targetTrackingConfiguration;
    }

    /**
     * <p>
     * A target tracking policy.
     * </p>
     *
     * @param targetTrackingConfiguration <p>
     *            A target tracking policy.
     *            </p>
     */
    public void setTargetTrackingConfiguration(
            TargetTrackingConfiguration targetTrackingConfiguration) {
        this.targetTrackingConfiguration = targetTrackingConfiguration;
    }

    /**
     * <p>
     * A target tracking policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetTrackingConfiguration <p>
     *            A target tracking policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScalingPolicy withTargetTrackingConfiguration(
            TargetTrackingConfiguration targetTrackingConfiguration) {
        this.targetTrackingConfiguration = targetTrackingConfiguration;
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
        if (getPolicyName() != null)
            sb.append("PolicyName: " + getPolicyName() + ",");
        if (getPolicyARN() != null)
            sb.append("PolicyARN: " + getPolicyARN() + ",");
        if (getPolicyType() != null)
            sb.append("PolicyType: " + getPolicyType() + ",");
        if (getAdjustmentType() != null)
            sb.append("AdjustmentType: " + getAdjustmentType() + ",");
        if (getMinAdjustmentStep() != null)
            sb.append("MinAdjustmentStep: " + getMinAdjustmentStep() + ",");
        if (getMinAdjustmentMagnitude() != null)
            sb.append("MinAdjustmentMagnitude: " + getMinAdjustmentMagnitude() + ",");
        if (getScalingAdjustment() != null)
            sb.append("ScalingAdjustment: " + getScalingAdjustment() + ",");
        if (getCooldown() != null)
            sb.append("Cooldown: " + getCooldown() + ",");
        if (getStepAdjustments() != null)
            sb.append("StepAdjustments: " + getStepAdjustments() + ",");
        if (getMetricAggregationType() != null)
            sb.append("MetricAggregationType: " + getMetricAggregationType() + ",");
        if (getEstimatedInstanceWarmup() != null)
            sb.append("EstimatedInstanceWarmup: " + getEstimatedInstanceWarmup() + ",");
        if (getAlarms() != null)
            sb.append("Alarms: " + getAlarms() + ",");
        if (getTargetTrackingConfiguration() != null)
            sb.append("TargetTrackingConfiguration: " + getTargetTrackingConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAutoScalingGroupName() == null) ? 0 : getAutoScalingGroupName().hashCode());
        hashCode = prime * hashCode + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode());
        hashCode = prime * hashCode + ((getPolicyARN() == null) ? 0 : getPolicyARN().hashCode());
        hashCode = prime * hashCode + ((getPolicyType() == null) ? 0 : getPolicyType().hashCode());
        hashCode = prime * hashCode
                + ((getAdjustmentType() == null) ? 0 : getAdjustmentType().hashCode());
        hashCode = prime * hashCode
                + ((getMinAdjustmentStep() == null) ? 0 : getMinAdjustmentStep().hashCode());
        hashCode = prime
                * hashCode
                + ((getMinAdjustmentMagnitude() == null) ? 0 : getMinAdjustmentMagnitude()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getScalingAdjustment() == null) ? 0 : getScalingAdjustment().hashCode());
        hashCode = prime * hashCode + ((getCooldown() == null) ? 0 : getCooldown().hashCode());
        hashCode = prime * hashCode
                + ((getStepAdjustments() == null) ? 0 : getStepAdjustments().hashCode());
        hashCode = prime
                * hashCode
                + ((getMetricAggregationType() == null) ? 0 : getMetricAggregationType().hashCode());
        hashCode = prime
                * hashCode
                + ((getEstimatedInstanceWarmup() == null) ? 0 : getEstimatedInstanceWarmup()
                        .hashCode());
        hashCode = prime * hashCode + ((getAlarms() == null) ? 0 : getAlarms().hashCode());
        hashCode = prime
                * hashCode
                + ((getTargetTrackingConfiguration() == null) ? 0
                        : getTargetTrackingConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScalingPolicy == false)
            return false;
        ScalingPolicy other = (ScalingPolicy) obj;

        if (other.getAutoScalingGroupName() == null ^ this.getAutoScalingGroupName() == null)
            return false;
        if (other.getAutoScalingGroupName() != null
                && other.getAutoScalingGroupName().equals(this.getAutoScalingGroupName()) == false)
            return false;
        if (other.getPolicyName() == null ^ this.getPolicyName() == null)
            return false;
        if (other.getPolicyName() != null
                && other.getPolicyName().equals(this.getPolicyName()) == false)
            return false;
        if (other.getPolicyARN() == null ^ this.getPolicyARN() == null)
            return false;
        if (other.getPolicyARN() != null
                && other.getPolicyARN().equals(this.getPolicyARN()) == false)
            return false;
        if (other.getPolicyType() == null ^ this.getPolicyType() == null)
            return false;
        if (other.getPolicyType() != null
                && other.getPolicyType().equals(this.getPolicyType()) == false)
            return false;
        if (other.getAdjustmentType() == null ^ this.getAdjustmentType() == null)
            return false;
        if (other.getAdjustmentType() != null
                && other.getAdjustmentType().equals(this.getAdjustmentType()) == false)
            return false;
        if (other.getMinAdjustmentStep() == null ^ this.getMinAdjustmentStep() == null)
            return false;
        if (other.getMinAdjustmentStep() != null
                && other.getMinAdjustmentStep().equals(this.getMinAdjustmentStep()) == false)
            return false;
        if (other.getMinAdjustmentMagnitude() == null ^ this.getMinAdjustmentMagnitude() == null)
            return false;
        if (other.getMinAdjustmentMagnitude() != null
                && other.getMinAdjustmentMagnitude().equals(this.getMinAdjustmentMagnitude()) == false)
            return false;
        if (other.getScalingAdjustment() == null ^ this.getScalingAdjustment() == null)
            return false;
        if (other.getScalingAdjustment() != null
                && other.getScalingAdjustment().equals(this.getScalingAdjustment()) == false)
            return false;
        if (other.getCooldown() == null ^ this.getCooldown() == null)
            return false;
        if (other.getCooldown() != null && other.getCooldown().equals(this.getCooldown()) == false)
            return false;
        if (other.getStepAdjustments() == null ^ this.getStepAdjustments() == null)
            return false;
        if (other.getStepAdjustments() != null
                && other.getStepAdjustments().equals(this.getStepAdjustments()) == false)
            return false;
        if (other.getMetricAggregationType() == null ^ this.getMetricAggregationType() == null)
            return false;
        if (other.getMetricAggregationType() != null
                && other.getMetricAggregationType().equals(this.getMetricAggregationType()) == false)
            return false;
        if (other.getEstimatedInstanceWarmup() == null ^ this.getEstimatedInstanceWarmup() == null)
            return false;
        if (other.getEstimatedInstanceWarmup() != null
                && other.getEstimatedInstanceWarmup().equals(this.getEstimatedInstanceWarmup()) == false)
            return false;
        if (other.getAlarms() == null ^ this.getAlarms() == null)
            return false;
        if (other.getAlarms() != null && other.getAlarms().equals(this.getAlarms()) == false)
            return false;
        if (other.getTargetTrackingConfiguration() == null
                ^ this.getTargetTrackingConfiguration() == null)
            return false;
        if (other.getTargetTrackingConfiguration() != null
                && other.getTargetTrackingConfiguration().equals(
                        this.getTargetTrackingConfiguration()) == false)
            return false;
        return true;
    }
}
