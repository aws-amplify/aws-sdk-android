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
 * Creates or updates a policy for an Auto Scaling group. To update an existing
 * policy, use the existing policy name and set the parameters to change. Any
 * existing parameter not changed in an update to an existing policy is not
 * changed in this update request.
 * </p>
 * <p>
 * If you exceed your maximum limit of step adjustments, which by default is 20
 * per region, the call fails. For information about updating this limit, see <a
 * href
 * ="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html">AWS
 * Service Limits</a> in the <i>Amazon Web Services General Reference</i>.
 * </p>
 */
public class PutScalingPolicyRequest extends AmazonWebServiceRequest implements Serializable {
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
     * The name of the policy.
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
     * The policy type. The valid values are <code>SimpleScaling</code>,
     * <code>StepScaling</code>, and <code>TargetTrackingScaling</code>. If the
     * policy type is null, the value is treated as <code>SimpleScaling</code>.
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
     * The adjustment type. The valid values are <code>ChangeInCapacity</code>,
     * <code>ExactCapacity</code>, and <code>PercentChangeInCapacity</code>.
     * </p>
     * <p>
     * This parameter is supported if the policy type is
     * <code>SimpleScaling</code> or <code>StepScaling</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/autoscaling/ec2/userguide/as-scale-based-on-demand.html"
     * >Dynamic Scaling</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
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
     * <p>
     * This parameter is supported if the policy type is
     * <code>SimpleScaling</code> or <code>StepScaling</code>.
     * </p>
     */
    private Integer minAdjustmentMagnitude;

    /**
     * <p>
     * The amount by which to scale, based on the specified adjustment type. A
     * positive value adds to the current capacity while a negative number
     * removes from the current capacity.
     * </p>
     * <p>
     * This parameter is required if the policy type is
     * <code>SimpleScaling</code> and not supported otherwise.
     * </p>
     */
    private Integer scalingAdjustment;

    /**
     * <p>
     * The amount of time, in seconds, after a scaling activity completes and
     * before the next scaling activity can start. If this parameter is not
     * specified, the default cooldown period for the group applies.
     * </p>
     * <p>
     * This parameter is supported if the policy type is
     * <code>SimpleScaling</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/autoscaling/ec2/userguide/Cooldown.html"
     * >Scaling Cooldowns</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     */
    private Integer cooldown;

    /**
     * <p>
     * The aggregation type for the CloudWatch metrics. The valid values are
     * <code>Minimum</code>, <code>Maximum</code>, and <code>Average</code>. If
     * the aggregation type is null, the value is treated as
     * <code>Average</code>.
     * </p>
     * <p>
     * This parameter is supported if the policy type is
     * <code>StepScaling</code>.
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
     * A set of adjustments that enable you to scale based on the size of the
     * alarm breach.
     * </p>
     * <p>
     * This parameter is required if the policy type is <code>StepScaling</code>
     * and not supported otherwise.
     * </p>
     */
    private java.util.List<StepAdjustment> stepAdjustments = new java.util.ArrayList<StepAdjustment>();

    /**
     * <p>
     * The estimated time, in seconds, until a newly launched instance can
     * contribute to the CloudWatch metrics. The default is to use the value
     * specified for the default cooldown period for the group.
     * </p>
     * <p>
     * This parameter is supported if the policy type is
     * <code>StepScaling</code> or <code>TargetTrackingScaling</code>.
     * </p>
     */
    private Integer estimatedInstanceWarmup;

    /**
     * <p>
     * A target tracking policy.
     * </p>
     * <p>
     * This parameter is required if the policy type is
     * <code>TargetTrackingScaling</code> and not supported otherwise.
     * </p>
     */
    private TargetTrackingConfiguration targetTrackingConfiguration;

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
    public PutScalingPolicyRequest withAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
        return this;
    }

    /**
     * <p>
     * The name of the policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The name of the policy.
     *         </p>
     */
    public String getPolicyName() {
        return policyName;
    }

    /**
     * <p>
     * The name of the policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param policyName <p>
     *            The name of the policy.
     *            </p>
     */
    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    /**
     * <p>
     * The name of the policy.
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
     *            The name of the policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutScalingPolicyRequest withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * <p>
     * The policy type. The valid values are <code>SimpleScaling</code>,
     * <code>StepScaling</code>, and <code>TargetTrackingScaling</code>. If the
     * policy type is null, the value is treated as <code>SimpleScaling</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The policy type. The valid values are <code>SimpleScaling</code>,
     *         <code>StepScaling</code>, and <code>TargetTrackingScaling</code>.
     *         If the policy type is null, the value is treated as
     *         <code>SimpleScaling</code>.
     *         </p>
     */
    public String getPolicyType() {
        return policyType;
    }

    /**
     * <p>
     * The policy type. The valid values are <code>SimpleScaling</code>,
     * <code>StepScaling</code>, and <code>TargetTrackingScaling</code>. If the
     * policy type is null, the value is treated as <code>SimpleScaling</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param policyType <p>
     *            The policy type. The valid values are
     *            <code>SimpleScaling</code>, <code>StepScaling</code>, and
     *            <code>TargetTrackingScaling</code>. If the policy type is
     *            null, the value is treated as <code>SimpleScaling</code>.
     *            </p>
     */
    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    /**
     * <p>
     * The policy type. The valid values are <code>SimpleScaling</code>,
     * <code>StepScaling</code>, and <code>TargetTrackingScaling</code>. If the
     * policy type is null, the value is treated as <code>SimpleScaling</code>.
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
     *            The policy type. The valid values are
     *            <code>SimpleScaling</code>, <code>StepScaling</code>, and
     *            <code>TargetTrackingScaling</code>. If the policy type is
     *            null, the value is treated as <code>SimpleScaling</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutScalingPolicyRequest withPolicyType(String policyType) {
        this.policyType = policyType;
        return this;
    }

    /**
     * <p>
     * The adjustment type. The valid values are <code>ChangeInCapacity</code>,
     * <code>ExactCapacity</code>, and <code>PercentChangeInCapacity</code>.
     * </p>
     * <p>
     * This parameter is supported if the policy type is
     * <code>SimpleScaling</code> or <code>StepScaling</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/autoscaling/ec2/userguide/as-scale-based-on-demand.html"
     * >Dynamic Scaling</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The adjustment type. The valid values are
     *         <code>ChangeInCapacity</code>, <code>ExactCapacity</code>, and
     *         <code>PercentChangeInCapacity</code>.
     *         </p>
     *         <p>
     *         This parameter is supported if the policy type is
     *         <code>SimpleScaling</code> or <code>StepScaling</code>.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "http://docs.aws.amazon.com/autoscaling/ec2/userguide/as-scale-based-on-demand.html"
     *         >Dynamic Scaling</a> in the <i>Amazon EC2 Auto Scaling User
     *         Guide</i>.
     *         </p>
     */
    public String getAdjustmentType() {
        return adjustmentType;
    }

    /**
     * <p>
     * The adjustment type. The valid values are <code>ChangeInCapacity</code>,
     * <code>ExactCapacity</code>, and <code>PercentChangeInCapacity</code>.
     * </p>
     * <p>
     * This parameter is supported if the policy type is
     * <code>SimpleScaling</code> or <code>StepScaling</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/autoscaling/ec2/userguide/as-scale-based-on-demand.html"
     * >Dynamic Scaling</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param adjustmentType <p>
     *            The adjustment type. The valid values are
     *            <code>ChangeInCapacity</code>, <code>ExactCapacity</code>, and
     *            <code>PercentChangeInCapacity</code>.
     *            </p>
     *            <p>
     *            This parameter is supported if the policy type is
     *            <code>SimpleScaling</code> or <code>StepScaling</code>.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/autoscaling/ec2/userguide/as-scale-based-on-demand.html"
     *            >Dynamic Scaling</a> in the <i>Amazon EC2 Auto Scaling User
     *            Guide</i>.
     *            </p>
     */
    public void setAdjustmentType(String adjustmentType) {
        this.adjustmentType = adjustmentType;
    }

    /**
     * <p>
     * The adjustment type. The valid values are <code>ChangeInCapacity</code>,
     * <code>ExactCapacity</code>, and <code>PercentChangeInCapacity</code>.
     * </p>
     * <p>
     * This parameter is supported if the policy type is
     * <code>SimpleScaling</code> or <code>StepScaling</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/autoscaling/ec2/userguide/as-scale-based-on-demand.html"
     * >Dynamic Scaling</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
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
     *            The adjustment type. The valid values are
     *            <code>ChangeInCapacity</code>, <code>ExactCapacity</code>, and
     *            <code>PercentChangeInCapacity</code>.
     *            </p>
     *            <p>
     *            This parameter is supported if the policy type is
     *            <code>SimpleScaling</code> or <code>StepScaling</code>.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/autoscaling/ec2/userguide/as-scale-based-on-demand.html"
     *            >Dynamic Scaling</a> in the <i>Amazon EC2 Auto Scaling User
     *            Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutScalingPolicyRequest withAdjustmentType(String adjustmentType) {
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
    public PutScalingPolicyRequest withMinAdjustmentStep(Integer minAdjustmentStep) {
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
     * <p>
     * This parameter is supported if the policy type is
     * <code>SimpleScaling</code> or <code>StepScaling</code>.
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
     *         <p>
     *         This parameter is supported if the policy type is
     *         <code>SimpleScaling</code> or <code>StepScaling</code>.
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
     * <p>
     * This parameter is supported if the policy type is
     * <code>SimpleScaling</code> or <code>StepScaling</code>.
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
     *            <p>
     *            This parameter is supported if the policy type is
     *            <code>SimpleScaling</code> or <code>StepScaling</code>.
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
     * This parameter is supported if the policy type is
     * <code>SimpleScaling</code> or <code>StepScaling</code>.
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
     *            <p>
     *            This parameter is supported if the policy type is
     *            <code>SimpleScaling</code> or <code>StepScaling</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutScalingPolicyRequest withMinAdjustmentMagnitude(Integer minAdjustmentMagnitude) {
        this.minAdjustmentMagnitude = minAdjustmentMagnitude;
        return this;
    }

    /**
     * <p>
     * The amount by which to scale, based on the specified adjustment type. A
     * positive value adds to the current capacity while a negative number
     * removes from the current capacity.
     * </p>
     * <p>
     * This parameter is required if the policy type is
     * <code>SimpleScaling</code> and not supported otherwise.
     * </p>
     *
     * @return <p>
     *         The amount by which to scale, based on the specified adjustment
     *         type. A positive value adds to the current capacity while a
     *         negative number removes from the current capacity.
     *         </p>
     *         <p>
     *         This parameter is required if the policy type is
     *         <code>SimpleScaling</code> and not supported otherwise.
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
     * <p>
     * This parameter is required if the policy type is
     * <code>SimpleScaling</code> and not supported otherwise.
     * </p>
     *
     * @param scalingAdjustment <p>
     *            The amount by which to scale, based on the specified
     *            adjustment type. A positive value adds to the current capacity
     *            while a negative number removes from the current capacity.
     *            </p>
     *            <p>
     *            This parameter is required if the policy type is
     *            <code>SimpleScaling</code> and not supported otherwise.
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
     * This parameter is required if the policy type is
     * <code>SimpleScaling</code> and not supported otherwise.
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
     *            <p>
     *            This parameter is required if the policy type is
     *            <code>SimpleScaling</code> and not supported otherwise.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutScalingPolicyRequest withScalingAdjustment(Integer scalingAdjustment) {
        this.scalingAdjustment = scalingAdjustment;
        return this;
    }

    /**
     * <p>
     * The amount of time, in seconds, after a scaling activity completes and
     * before the next scaling activity can start. If this parameter is not
     * specified, the default cooldown period for the group applies.
     * </p>
     * <p>
     * This parameter is supported if the policy type is
     * <code>SimpleScaling</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/autoscaling/ec2/userguide/Cooldown.html"
     * >Scaling Cooldowns</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     *
     * @return <p>
     *         The amount of time, in seconds, after a scaling activity
     *         completes and before the next scaling activity can start. If this
     *         parameter is not specified, the default cooldown period for the
     *         group applies.
     *         </p>
     *         <p>
     *         This parameter is supported if the policy type is
     *         <code>SimpleScaling</code>.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "http://docs.aws.amazon.com/autoscaling/ec2/userguide/Cooldown.html"
     *         >Scaling Cooldowns</a> in the <i>Amazon EC2 Auto Scaling User
     *         Guide</i>.
     *         </p>
     */
    public Integer getCooldown() {
        return cooldown;
    }

    /**
     * <p>
     * The amount of time, in seconds, after a scaling activity completes and
     * before the next scaling activity can start. If this parameter is not
     * specified, the default cooldown period for the group applies.
     * </p>
     * <p>
     * This parameter is supported if the policy type is
     * <code>SimpleScaling</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/autoscaling/ec2/userguide/Cooldown.html"
     * >Scaling Cooldowns</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     *
     * @param cooldown <p>
     *            The amount of time, in seconds, after a scaling activity
     *            completes and before the next scaling activity can start. If
     *            this parameter is not specified, the default cooldown period
     *            for the group applies.
     *            </p>
     *            <p>
     *            This parameter is supported if the policy type is
     *            <code>SimpleScaling</code>.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/autoscaling/ec2/userguide/Cooldown.html"
     *            >Scaling Cooldowns</a> in the <i>Amazon EC2 Auto Scaling User
     *            Guide</i>.
     *            </p>
     */
    public void setCooldown(Integer cooldown) {
        this.cooldown = cooldown;
    }

    /**
     * <p>
     * The amount of time, in seconds, after a scaling activity completes and
     * before the next scaling activity can start. If this parameter is not
     * specified, the default cooldown period for the group applies.
     * </p>
     * <p>
     * This parameter is supported if the policy type is
     * <code>SimpleScaling</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/autoscaling/ec2/userguide/Cooldown.html"
     * >Scaling Cooldowns</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cooldown <p>
     *            The amount of time, in seconds, after a scaling activity
     *            completes and before the next scaling activity can start. If
     *            this parameter is not specified, the default cooldown period
     *            for the group applies.
     *            </p>
     *            <p>
     *            This parameter is supported if the policy type is
     *            <code>SimpleScaling</code>.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/autoscaling/ec2/userguide/Cooldown.html"
     *            >Scaling Cooldowns</a> in the <i>Amazon EC2 Auto Scaling User
     *            Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutScalingPolicyRequest withCooldown(Integer cooldown) {
        this.cooldown = cooldown;
        return this;
    }

    /**
     * <p>
     * The aggregation type for the CloudWatch metrics. The valid values are
     * <code>Minimum</code>, <code>Maximum</code>, and <code>Average</code>. If
     * the aggregation type is null, the value is treated as
     * <code>Average</code>.
     * </p>
     * <p>
     * This parameter is supported if the policy type is
     * <code>StepScaling</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The aggregation type for the CloudWatch metrics. The valid values
     *         are <code>Minimum</code>, <code>Maximum</code>, and
     *         <code>Average</code>. If the aggregation type is null, the value
     *         is treated as <code>Average</code>.
     *         </p>
     *         <p>
     *         This parameter is supported if the policy type is
     *         <code>StepScaling</code>.
     *         </p>
     */
    public String getMetricAggregationType() {
        return metricAggregationType;
    }

    /**
     * <p>
     * The aggregation type for the CloudWatch metrics. The valid values are
     * <code>Minimum</code>, <code>Maximum</code>, and <code>Average</code>. If
     * the aggregation type is null, the value is treated as
     * <code>Average</code>.
     * </p>
     * <p>
     * This parameter is supported if the policy type is
     * <code>StepScaling</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param metricAggregationType <p>
     *            The aggregation type for the CloudWatch metrics. The valid
     *            values are <code>Minimum</code>, <code>Maximum</code>, and
     *            <code>Average</code>. If the aggregation type is null, the
     *            value is treated as <code>Average</code>.
     *            </p>
     *            <p>
     *            This parameter is supported if the policy type is
     *            <code>StepScaling</code>.
     *            </p>
     */
    public void setMetricAggregationType(String metricAggregationType) {
        this.metricAggregationType = metricAggregationType;
    }

    /**
     * <p>
     * The aggregation type for the CloudWatch metrics. The valid values are
     * <code>Minimum</code>, <code>Maximum</code>, and <code>Average</code>. If
     * the aggregation type is null, the value is treated as
     * <code>Average</code>.
     * </p>
     * <p>
     * This parameter is supported if the policy type is
     * <code>StepScaling</code>.
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
     *            The aggregation type for the CloudWatch metrics. The valid
     *            values are <code>Minimum</code>, <code>Maximum</code>, and
     *            <code>Average</code>. If the aggregation type is null, the
     *            value is treated as <code>Average</code>.
     *            </p>
     *            <p>
     *            This parameter is supported if the policy type is
     *            <code>StepScaling</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutScalingPolicyRequest withMetricAggregationType(String metricAggregationType) {
        this.metricAggregationType = metricAggregationType;
        return this;
    }

    /**
     * <p>
     * A set of adjustments that enable you to scale based on the size of the
     * alarm breach.
     * </p>
     * <p>
     * This parameter is required if the policy type is <code>StepScaling</code>
     * and not supported otherwise.
     * </p>
     *
     * @return <p>
     *         A set of adjustments that enable you to scale based on the size
     *         of the alarm breach.
     *         </p>
     *         <p>
     *         This parameter is required if the policy type is
     *         <code>StepScaling</code> and not supported otherwise.
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
     * <p>
     * This parameter is required if the policy type is <code>StepScaling</code>
     * and not supported otherwise.
     * </p>
     *
     * @param stepAdjustments <p>
     *            A set of adjustments that enable you to scale based on the
     *            size of the alarm breach.
     *            </p>
     *            <p>
     *            This parameter is required if the policy type is
     *            <code>StepScaling</code> and not supported otherwise.
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
     * This parameter is required if the policy type is <code>StepScaling</code>
     * and not supported otherwise.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stepAdjustments <p>
     *            A set of adjustments that enable you to scale based on the
     *            size of the alarm breach.
     *            </p>
     *            <p>
     *            This parameter is required if the policy type is
     *            <code>StepScaling</code> and not supported otherwise.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutScalingPolicyRequest withStepAdjustments(StepAdjustment... stepAdjustments) {
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
     * This parameter is required if the policy type is <code>StepScaling</code>
     * and not supported otherwise.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stepAdjustments <p>
     *            A set of adjustments that enable you to scale based on the
     *            size of the alarm breach.
     *            </p>
     *            <p>
     *            This parameter is required if the policy type is
     *            <code>StepScaling</code> and not supported otherwise.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutScalingPolicyRequest withStepAdjustments(
            java.util.Collection<StepAdjustment> stepAdjustments) {
        setStepAdjustments(stepAdjustments);
        return this;
    }

    /**
     * <p>
     * The estimated time, in seconds, until a newly launched instance can
     * contribute to the CloudWatch metrics. The default is to use the value
     * specified for the default cooldown period for the group.
     * </p>
     * <p>
     * This parameter is supported if the policy type is
     * <code>StepScaling</code> or <code>TargetTrackingScaling</code>.
     * </p>
     *
     * @return <p>
     *         The estimated time, in seconds, until a newly launched instance
     *         can contribute to the CloudWatch metrics. The default is to use
     *         the value specified for the default cooldown period for the
     *         group.
     *         </p>
     *         <p>
     *         This parameter is supported if the policy type is
     *         <code>StepScaling</code> or <code>TargetTrackingScaling</code>.
     *         </p>
     */
    public Integer getEstimatedInstanceWarmup() {
        return estimatedInstanceWarmup;
    }

    /**
     * <p>
     * The estimated time, in seconds, until a newly launched instance can
     * contribute to the CloudWatch metrics. The default is to use the value
     * specified for the default cooldown period for the group.
     * </p>
     * <p>
     * This parameter is supported if the policy type is
     * <code>StepScaling</code> or <code>TargetTrackingScaling</code>.
     * </p>
     *
     * @param estimatedInstanceWarmup <p>
     *            The estimated time, in seconds, until a newly launched
     *            instance can contribute to the CloudWatch metrics. The default
     *            is to use the value specified for the default cooldown period
     *            for the group.
     *            </p>
     *            <p>
     *            This parameter is supported if the policy type is
     *            <code>StepScaling</code> or <code>TargetTrackingScaling</code>
     *            .
     *            </p>
     */
    public void setEstimatedInstanceWarmup(Integer estimatedInstanceWarmup) {
        this.estimatedInstanceWarmup = estimatedInstanceWarmup;
    }

    /**
     * <p>
     * The estimated time, in seconds, until a newly launched instance can
     * contribute to the CloudWatch metrics. The default is to use the value
     * specified for the default cooldown period for the group.
     * </p>
     * <p>
     * This parameter is supported if the policy type is
     * <code>StepScaling</code> or <code>TargetTrackingScaling</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param estimatedInstanceWarmup <p>
     *            The estimated time, in seconds, until a newly launched
     *            instance can contribute to the CloudWatch metrics. The default
     *            is to use the value specified for the default cooldown period
     *            for the group.
     *            </p>
     *            <p>
     *            This parameter is supported if the policy type is
     *            <code>StepScaling</code> or <code>TargetTrackingScaling</code>
     *            .
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutScalingPolicyRequest withEstimatedInstanceWarmup(Integer estimatedInstanceWarmup) {
        this.estimatedInstanceWarmup = estimatedInstanceWarmup;
        return this;
    }

    /**
     * <p>
     * A target tracking policy.
     * </p>
     * <p>
     * This parameter is required if the policy type is
     * <code>TargetTrackingScaling</code> and not supported otherwise.
     * </p>
     *
     * @return <p>
     *         A target tracking policy.
     *         </p>
     *         <p>
     *         This parameter is required if the policy type is
     *         <code>TargetTrackingScaling</code> and not supported otherwise.
     *         </p>
     */
    public TargetTrackingConfiguration getTargetTrackingConfiguration() {
        return targetTrackingConfiguration;
    }

    /**
     * <p>
     * A target tracking policy.
     * </p>
     * <p>
     * This parameter is required if the policy type is
     * <code>TargetTrackingScaling</code> and not supported otherwise.
     * </p>
     *
     * @param targetTrackingConfiguration <p>
     *            A target tracking policy.
     *            </p>
     *            <p>
     *            This parameter is required if the policy type is
     *            <code>TargetTrackingScaling</code> and not supported
     *            otherwise.
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
     * This parameter is required if the policy type is
     * <code>TargetTrackingScaling</code> and not supported otherwise.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetTrackingConfiguration <p>
     *            A target tracking policy.
     *            </p>
     *            <p>
     *            This parameter is required if the policy type is
     *            <code>TargetTrackingScaling</code> and not supported
     *            otherwise.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutScalingPolicyRequest withTargetTrackingConfiguration(
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
        if (getMetricAggregationType() != null)
            sb.append("MetricAggregationType: " + getMetricAggregationType() + ",");
        if (getStepAdjustments() != null)
            sb.append("StepAdjustments: " + getStepAdjustments() + ",");
        if (getEstimatedInstanceWarmup() != null)
            sb.append("EstimatedInstanceWarmup: " + getEstimatedInstanceWarmup() + ",");
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
        hashCode = prime
                * hashCode
                + ((getMetricAggregationType() == null) ? 0 : getMetricAggregationType().hashCode());
        hashCode = prime * hashCode
                + ((getStepAdjustments() == null) ? 0 : getStepAdjustments().hashCode());
        hashCode = prime
                * hashCode
                + ((getEstimatedInstanceWarmup() == null) ? 0 : getEstimatedInstanceWarmup()
                        .hashCode());
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

        if (obj instanceof PutScalingPolicyRequest == false)
            return false;
        PutScalingPolicyRequest other = (PutScalingPolicyRequest) obj;

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
        if (other.getMetricAggregationType() == null ^ this.getMetricAggregationType() == null)
            return false;
        if (other.getMetricAggregationType() != null
                && other.getMetricAggregationType().equals(this.getMetricAggregationType()) == false)
            return false;
        if (other.getStepAdjustments() == null ^ this.getStepAdjustments() == null)
            return false;
        if (other.getStepAdjustments() != null
                && other.getStepAdjustments().equals(this.getStepAdjustments()) == false)
            return false;
        if (other.getEstimatedInstanceWarmup() == null ^ this.getEstimatedInstanceWarmup() == null)
            return false;
        if (other.getEstimatedInstanceWarmup() != null
                && other.getEstimatedInstanceWarmup().equals(this.getEstimatedInstanceWarmup()) == false)
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
