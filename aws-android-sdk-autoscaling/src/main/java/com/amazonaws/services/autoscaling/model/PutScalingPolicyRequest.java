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

package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates or updates a scaling policy for an Auto Scaling group.
 * </p>
 * <p>
 * For more information about using scaling policies to scale your Auto Scaling
 * group, see <a href=
 * "https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-scaling-target-tracking.html"
 * >Target Tracking Scaling Policies</a> and <a href=
 * "https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-scaling-simple-step.html"
 * >Step and Simple Scaling Policies</a> in the <i>Amazon EC2 Auto Scaling User
 * Guide</i>.
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
     * One of the following policy types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TargetTrackingScaling</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>StepScaling</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SimpleScaling</code> (default)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String policyType;

    /**
     * <p>
     * Specifies how the scaling adjustment is interpreted (either an absolute
     * number or a percentage). The valid values are
     * <code>ChangeInCapacity</code>, <code>ExactCapacity</code>, and
     * <code>PercentChangeInCapacity</code>.
     * </p>
     * <p>
     * Required if the policy type is <code>StepScaling</code> or
     * <code>SimpleScaling</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-scaling-simple-step.html#as-scaling-adjustment"
     * >Scaling Adjustment Types</a> in the <i>Amazon EC2 Auto Scaling User
     * Guide</i>.
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
     * The minimum value to scale by when the adjustment type is
     * <code>PercentChangeInCapacity</code>. For example, suppose that you
     * create a step scaling policy to scale out an Auto Scaling group by 25
     * percent and you specify a <code>MinAdjustmentMagnitude</code> of 2. If
     * the group has 4 instances and the scaling policy is performed, 25 percent
     * of 4 is 1. However, because you specified a
     * <code>MinAdjustmentMagnitude</code> of 2, Amazon EC2 Auto Scaling scales
     * out the group by 2 instances.
     * </p>
     * <p>
     * Valid only if the policy type is <code>StepScaling</code> or
     * <code>SimpleScaling</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-scaling-simple-step.html#as-scaling-adjustment"
     * >Scaling Adjustment Types</a> in the <i>Amazon EC2 Auto Scaling User
     * Guide</i>.
     * </p>
     * <note>
     * <p>
     * Some Auto Scaling groups use instance weights. In this case, set the
     * <code>MinAdjustmentMagnitude</code> to a value that is at least as large
     * as your largest instance weight.
     * </p>
     * </note>
     */
    private Integer minAdjustmentMagnitude;

    /**
     * <p>
     * The amount by which to scale, based on the specified adjustment type. A
     * positive value adds to the current capacity while a negative number
     * removes from the current capacity. For exact capacity, you must specify a
     * positive value.
     * </p>
     * <p>
     * Required if the policy type is <code>SimpleScaling</code>. (Not used with
     * any other policy type.)
     * </p>
     */
    private Integer scalingAdjustment;

    /**
     * <p>
     * The duration of the policy's cooldown period, in seconds. When a cooldown
     * period is specified here, it overrides the default cooldown period
     * defined for the Auto Scaling group.
     * </p>
     * <p>
     * Valid only if the policy type is <code>SimpleScaling</code>. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/ec2/userguide/Cooldown.html"
     * >Scaling Cooldowns for Amazon EC2 Auto Scaling</a> in the <i>Amazon EC2
     * Auto Scaling User Guide</i>.
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
     * Valid only if the policy type is <code>StepScaling</code>.
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
     * Required if the policy type is <code>StepScaling</code>. (Not used with
     * any other policy type.)
     * </p>
     */
    private java.util.List<StepAdjustment> stepAdjustments = new java.util.ArrayList<StepAdjustment>();

    /**
     * <p>
     * The estimated time, in seconds, until a newly launched instance can
     * contribute to the CloudWatch metrics. If not provided, the default is to
     * use the value from the default cooldown period for the Auto Scaling
     * group.
     * </p>
     * <p>
     * Valid only if the policy type is <code>TargetTrackingScaling</code> or
     * <code>StepScaling</code>.
     * </p>
     */
    private Integer estimatedInstanceWarmup;

    /**
     * <p>
     * A target tracking scaling policy. Includes support for predefined or
     * customized metrics.
     * </p>
     * <p>
     * The following predefined metrics are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ASGAverageCPUUtilization</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ASGAverageNetworkIn</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ASGAverageNetworkOut</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALBRequestCountPerTarget</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you specify <code>ALBRequestCountPerTarget</code> for the metric, you
     * must specify the <code>ResourceLabel</code> parameter with the
     * <code>PredefinedMetricSpecification</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/ec2/APIReference/API_TargetTrackingConfiguration.html"
     * >TargetTrackingConfiguration</a> in the <i>Amazon EC2 Auto Scaling API
     * Reference</i>.
     * </p>
     * <p>
     * Required if the policy type is <code>TargetTrackingScaling</code>.
     * </p>
     */
    private TargetTrackingConfiguration targetTrackingConfiguration;

    /**
     * <p>
     * Indicates whether the scaling policy is enabled or disabled. The default
     * is enabled. For more information, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-enable-disable-scaling-policy.html"
     * >Disabling a Scaling Policy for an Auto Scaling Group</a> in the
     * <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     */
    private Boolean enabled;

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
     * One of the following policy types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TargetTrackingScaling</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>StepScaling</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SimpleScaling</code> (default)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         One of the following policy types:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>TargetTrackingScaling</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>StepScaling</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SimpleScaling</code> (default)
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getPolicyType() {
        return policyType;
    }

    /**
     * <p>
     * One of the following policy types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TargetTrackingScaling</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>StepScaling</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SimpleScaling</code> (default)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param policyType <p>
     *            One of the following policy types:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>TargetTrackingScaling</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>StepScaling</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SimpleScaling</code> (default)
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    /**
     * <p>
     * One of the following policy types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TargetTrackingScaling</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>StepScaling</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SimpleScaling</code> (default)
     * </p>
     * </li>
     * </ul>
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
     *            One of the following policy types:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>TargetTrackingScaling</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>StepScaling</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SimpleScaling</code> (default)
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutScalingPolicyRequest withPolicyType(String policyType) {
        this.policyType = policyType;
        return this;
    }

    /**
     * <p>
     * Specifies how the scaling adjustment is interpreted (either an absolute
     * number or a percentage). The valid values are
     * <code>ChangeInCapacity</code>, <code>ExactCapacity</code>, and
     * <code>PercentChangeInCapacity</code>.
     * </p>
     * <p>
     * Required if the policy type is <code>StepScaling</code> or
     * <code>SimpleScaling</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-scaling-simple-step.html#as-scaling-adjustment"
     * >Scaling Adjustment Types</a> in the <i>Amazon EC2 Auto Scaling User
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         Specifies how the scaling adjustment is interpreted (either an
     *         absolute number or a percentage). The valid values are
     *         <code>ChangeInCapacity</code>, <code>ExactCapacity</code>, and
     *         <code>PercentChangeInCapacity</code>.
     *         </p>
     *         <p>
     *         Required if the policy type is <code>StepScaling</code> or
     *         <code>SimpleScaling</code>. For more information, see <a href=
     *         "https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-scaling-simple-step.html#as-scaling-adjustment"
     *         >Scaling Adjustment Types</a> in the <i>Amazon EC2 Auto Scaling
     *         User Guide</i>.
     *         </p>
     */
    public String getAdjustmentType() {
        return adjustmentType;
    }

    /**
     * <p>
     * Specifies how the scaling adjustment is interpreted (either an absolute
     * number or a percentage). The valid values are
     * <code>ChangeInCapacity</code>, <code>ExactCapacity</code>, and
     * <code>PercentChangeInCapacity</code>.
     * </p>
     * <p>
     * Required if the policy type is <code>StepScaling</code> or
     * <code>SimpleScaling</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-scaling-simple-step.html#as-scaling-adjustment"
     * >Scaling Adjustment Types</a> in the <i>Amazon EC2 Auto Scaling User
     * Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param adjustmentType <p>
     *            Specifies how the scaling adjustment is interpreted (either an
     *            absolute number or a percentage). The valid values are
     *            <code>ChangeInCapacity</code>, <code>ExactCapacity</code>, and
     *            <code>PercentChangeInCapacity</code>.
     *            </p>
     *            <p>
     *            Required if the policy type is <code>StepScaling</code> or
     *            <code>SimpleScaling</code>. For more information, see <a href=
     *            "https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-scaling-simple-step.html#as-scaling-adjustment"
     *            >Scaling Adjustment Types</a> in the <i>Amazon EC2 Auto
     *            Scaling User Guide</i>.
     *            </p>
     */
    public void setAdjustmentType(String adjustmentType) {
        this.adjustmentType = adjustmentType;
    }

    /**
     * <p>
     * Specifies how the scaling adjustment is interpreted (either an absolute
     * number or a percentage). The valid values are
     * <code>ChangeInCapacity</code>, <code>ExactCapacity</code>, and
     * <code>PercentChangeInCapacity</code>.
     * </p>
     * <p>
     * Required if the policy type is <code>StepScaling</code> or
     * <code>SimpleScaling</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-scaling-simple-step.html#as-scaling-adjustment"
     * >Scaling Adjustment Types</a> in the <i>Amazon EC2 Auto Scaling User
     * Guide</i>.
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
     *            Specifies how the scaling adjustment is interpreted (either an
     *            absolute number or a percentage). The valid values are
     *            <code>ChangeInCapacity</code>, <code>ExactCapacity</code>, and
     *            <code>PercentChangeInCapacity</code>.
     *            </p>
     *            <p>
     *            Required if the policy type is <code>StepScaling</code> or
     *            <code>SimpleScaling</code>. For more information, see <a href=
     *            "https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-scaling-simple-step.html#as-scaling-adjustment"
     *            >Scaling Adjustment Types</a> in the <i>Amazon EC2 Auto
     *            Scaling User Guide</i>.
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
     * The minimum value to scale by when the adjustment type is
     * <code>PercentChangeInCapacity</code>. For example, suppose that you
     * create a step scaling policy to scale out an Auto Scaling group by 25
     * percent and you specify a <code>MinAdjustmentMagnitude</code> of 2. If
     * the group has 4 instances and the scaling policy is performed, 25 percent
     * of 4 is 1. However, because you specified a
     * <code>MinAdjustmentMagnitude</code> of 2, Amazon EC2 Auto Scaling scales
     * out the group by 2 instances.
     * </p>
     * <p>
     * Valid only if the policy type is <code>StepScaling</code> or
     * <code>SimpleScaling</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-scaling-simple-step.html#as-scaling-adjustment"
     * >Scaling Adjustment Types</a> in the <i>Amazon EC2 Auto Scaling User
     * Guide</i>.
     * </p>
     * <note>
     * <p>
     * Some Auto Scaling groups use instance weights. In this case, set the
     * <code>MinAdjustmentMagnitude</code> to a value that is at least as large
     * as your largest instance weight.
     * </p>
     * </note>
     *
     * @return <p>
     *         The minimum value to scale by when the adjustment type is
     *         <code>PercentChangeInCapacity</code>. For example, suppose that
     *         you create a step scaling policy to scale out an Auto Scaling
     *         group by 25 percent and you specify a
     *         <code>MinAdjustmentMagnitude</code> of 2. If the group has 4
     *         instances and the scaling policy is performed, 25 percent of 4 is
     *         1. However, because you specified a
     *         <code>MinAdjustmentMagnitude</code> of 2, Amazon EC2 Auto Scaling
     *         scales out the group by 2 instances.
     *         </p>
     *         <p>
     *         Valid only if the policy type is <code>StepScaling</code> or
     *         <code>SimpleScaling</code>. For more information, see <a href=
     *         "https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-scaling-simple-step.html#as-scaling-adjustment"
     *         >Scaling Adjustment Types</a> in the <i>Amazon EC2 Auto Scaling
     *         User Guide</i>.
     *         </p>
     *         <note>
     *         <p>
     *         Some Auto Scaling groups use instance weights. In this case, set
     *         the <code>MinAdjustmentMagnitude</code> to a value that is at
     *         least as large as your largest instance weight.
     *         </p>
     *         </note>
     */
    public Integer getMinAdjustmentMagnitude() {
        return minAdjustmentMagnitude;
    }

    /**
     * <p>
     * The minimum value to scale by when the adjustment type is
     * <code>PercentChangeInCapacity</code>. For example, suppose that you
     * create a step scaling policy to scale out an Auto Scaling group by 25
     * percent and you specify a <code>MinAdjustmentMagnitude</code> of 2. If
     * the group has 4 instances and the scaling policy is performed, 25 percent
     * of 4 is 1. However, because you specified a
     * <code>MinAdjustmentMagnitude</code> of 2, Amazon EC2 Auto Scaling scales
     * out the group by 2 instances.
     * </p>
     * <p>
     * Valid only if the policy type is <code>StepScaling</code> or
     * <code>SimpleScaling</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-scaling-simple-step.html#as-scaling-adjustment"
     * >Scaling Adjustment Types</a> in the <i>Amazon EC2 Auto Scaling User
     * Guide</i>.
     * </p>
     * <note>
     * <p>
     * Some Auto Scaling groups use instance weights. In this case, set the
     * <code>MinAdjustmentMagnitude</code> to a value that is at least as large
     * as your largest instance weight.
     * </p>
     * </note>
     *
     * @param minAdjustmentMagnitude <p>
     *            The minimum value to scale by when the adjustment type is
     *            <code>PercentChangeInCapacity</code>. For example, suppose
     *            that you create a step scaling policy to scale out an Auto
     *            Scaling group by 25 percent and you specify a
     *            <code>MinAdjustmentMagnitude</code> of 2. If the group has 4
     *            instances and the scaling policy is performed, 25 percent of 4
     *            is 1. However, because you specified a
     *            <code>MinAdjustmentMagnitude</code> of 2, Amazon EC2 Auto
     *            Scaling scales out the group by 2 instances.
     *            </p>
     *            <p>
     *            Valid only if the policy type is <code>StepScaling</code> or
     *            <code>SimpleScaling</code>. For more information, see <a href=
     *            "https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-scaling-simple-step.html#as-scaling-adjustment"
     *            >Scaling Adjustment Types</a> in the <i>Amazon EC2 Auto
     *            Scaling User Guide</i>.
     *            </p>
     *            <note>
     *            <p>
     *            Some Auto Scaling groups use instance weights. In this case,
     *            set the <code>MinAdjustmentMagnitude</code> to a value that is
     *            at least as large as your largest instance weight.
     *            </p>
     *            </note>
     */
    public void setMinAdjustmentMagnitude(Integer minAdjustmentMagnitude) {
        this.minAdjustmentMagnitude = minAdjustmentMagnitude;
    }

    /**
     * <p>
     * The minimum value to scale by when the adjustment type is
     * <code>PercentChangeInCapacity</code>. For example, suppose that you
     * create a step scaling policy to scale out an Auto Scaling group by 25
     * percent and you specify a <code>MinAdjustmentMagnitude</code> of 2. If
     * the group has 4 instances and the scaling policy is performed, 25 percent
     * of 4 is 1. However, because you specified a
     * <code>MinAdjustmentMagnitude</code> of 2, Amazon EC2 Auto Scaling scales
     * out the group by 2 instances.
     * </p>
     * <p>
     * Valid only if the policy type is <code>StepScaling</code> or
     * <code>SimpleScaling</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-scaling-simple-step.html#as-scaling-adjustment"
     * >Scaling Adjustment Types</a> in the <i>Amazon EC2 Auto Scaling User
     * Guide</i>.
     * </p>
     * <note>
     * <p>
     * Some Auto Scaling groups use instance weights. In this case, set the
     * <code>MinAdjustmentMagnitude</code> to a value that is at least as large
     * as your largest instance weight.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param minAdjustmentMagnitude <p>
     *            The minimum value to scale by when the adjustment type is
     *            <code>PercentChangeInCapacity</code>. For example, suppose
     *            that you create a step scaling policy to scale out an Auto
     *            Scaling group by 25 percent and you specify a
     *            <code>MinAdjustmentMagnitude</code> of 2. If the group has 4
     *            instances and the scaling policy is performed, 25 percent of 4
     *            is 1. However, because you specified a
     *            <code>MinAdjustmentMagnitude</code> of 2, Amazon EC2 Auto
     *            Scaling scales out the group by 2 instances.
     *            </p>
     *            <p>
     *            Valid only if the policy type is <code>StepScaling</code> or
     *            <code>SimpleScaling</code>. For more information, see <a href=
     *            "https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-scaling-simple-step.html#as-scaling-adjustment"
     *            >Scaling Adjustment Types</a> in the <i>Amazon EC2 Auto
     *            Scaling User Guide</i>.
     *            </p>
     *            <note>
     *            <p>
     *            Some Auto Scaling groups use instance weights. In this case,
     *            set the <code>MinAdjustmentMagnitude</code> to a value that is
     *            at least as large as your largest instance weight.
     *            </p>
     *            </note>
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
     * removes from the current capacity. For exact capacity, you must specify a
     * positive value.
     * </p>
     * <p>
     * Required if the policy type is <code>SimpleScaling</code>. (Not used with
     * any other policy type.)
     * </p>
     *
     * @return <p>
     *         The amount by which to scale, based on the specified adjustment
     *         type. A positive value adds to the current capacity while a
     *         negative number removes from the current capacity. For exact
     *         capacity, you must specify a positive value.
     *         </p>
     *         <p>
     *         Required if the policy type is <code>SimpleScaling</code>. (Not
     *         used with any other policy type.)
     *         </p>
     */
    public Integer getScalingAdjustment() {
        return scalingAdjustment;
    }

    /**
     * <p>
     * The amount by which to scale, based on the specified adjustment type. A
     * positive value adds to the current capacity while a negative number
     * removes from the current capacity. For exact capacity, you must specify a
     * positive value.
     * </p>
     * <p>
     * Required if the policy type is <code>SimpleScaling</code>. (Not used with
     * any other policy type.)
     * </p>
     *
     * @param scalingAdjustment <p>
     *            The amount by which to scale, based on the specified
     *            adjustment type. A positive value adds to the current capacity
     *            while a negative number removes from the current capacity. For
     *            exact capacity, you must specify a positive value.
     *            </p>
     *            <p>
     *            Required if the policy type is <code>SimpleScaling</code>.
     *            (Not used with any other policy type.)
     *            </p>
     */
    public void setScalingAdjustment(Integer scalingAdjustment) {
        this.scalingAdjustment = scalingAdjustment;
    }

    /**
     * <p>
     * The amount by which to scale, based on the specified adjustment type. A
     * positive value adds to the current capacity while a negative number
     * removes from the current capacity. For exact capacity, you must specify a
     * positive value.
     * </p>
     * <p>
     * Required if the policy type is <code>SimpleScaling</code>. (Not used with
     * any other policy type.)
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scalingAdjustment <p>
     *            The amount by which to scale, based on the specified
     *            adjustment type. A positive value adds to the current capacity
     *            while a negative number removes from the current capacity. For
     *            exact capacity, you must specify a positive value.
     *            </p>
     *            <p>
     *            Required if the policy type is <code>SimpleScaling</code>.
     *            (Not used with any other policy type.)
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
     * The duration of the policy's cooldown period, in seconds. When a cooldown
     * period is specified here, it overrides the default cooldown period
     * defined for the Auto Scaling group.
     * </p>
     * <p>
     * Valid only if the policy type is <code>SimpleScaling</code>. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/ec2/userguide/Cooldown.html"
     * >Scaling Cooldowns for Amazon EC2 Auto Scaling</a> in the <i>Amazon EC2
     * Auto Scaling User Guide</i>.
     * </p>
     *
     * @return <p>
     *         The duration of the policy's cooldown period, in seconds. When a
     *         cooldown period is specified here, it overrides the default
     *         cooldown period defined for the Auto Scaling group.
     *         </p>
     *         <p>
     *         Valid only if the policy type is <code>SimpleScaling</code>. For
     *         more information, see <a href=
     *         "https://docs.aws.amazon.com/autoscaling/ec2/userguide/Cooldown.html"
     *         >Scaling Cooldowns for Amazon EC2 Auto Scaling</a> in the
     *         <i>Amazon EC2 Auto Scaling User Guide</i>.
     *         </p>
     */
    public Integer getCooldown() {
        return cooldown;
    }

    /**
     * <p>
     * The duration of the policy's cooldown period, in seconds. When a cooldown
     * period is specified here, it overrides the default cooldown period
     * defined for the Auto Scaling group.
     * </p>
     * <p>
     * Valid only if the policy type is <code>SimpleScaling</code>. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/ec2/userguide/Cooldown.html"
     * >Scaling Cooldowns for Amazon EC2 Auto Scaling</a> in the <i>Amazon EC2
     * Auto Scaling User Guide</i>.
     * </p>
     *
     * @param cooldown <p>
     *            The duration of the policy's cooldown period, in seconds. When
     *            a cooldown period is specified here, it overrides the default
     *            cooldown period defined for the Auto Scaling group.
     *            </p>
     *            <p>
     *            Valid only if the policy type is <code>SimpleScaling</code>.
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/autoscaling/ec2/userguide/Cooldown.html"
     *            >Scaling Cooldowns for Amazon EC2 Auto Scaling</a> in the
     *            <i>Amazon EC2 Auto Scaling User Guide</i>.
     *            </p>
     */
    public void setCooldown(Integer cooldown) {
        this.cooldown = cooldown;
    }

    /**
     * <p>
     * The duration of the policy's cooldown period, in seconds. When a cooldown
     * period is specified here, it overrides the default cooldown period
     * defined for the Auto Scaling group.
     * </p>
     * <p>
     * Valid only if the policy type is <code>SimpleScaling</code>. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/ec2/userguide/Cooldown.html"
     * >Scaling Cooldowns for Amazon EC2 Auto Scaling</a> in the <i>Amazon EC2
     * Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cooldown <p>
     *            The duration of the policy's cooldown period, in seconds. When
     *            a cooldown period is specified here, it overrides the default
     *            cooldown period defined for the Auto Scaling group.
     *            </p>
     *            <p>
     *            Valid only if the policy type is <code>SimpleScaling</code>.
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/autoscaling/ec2/userguide/Cooldown.html"
     *            >Scaling Cooldowns for Amazon EC2 Auto Scaling</a> in the
     *            <i>Amazon EC2 Auto Scaling User Guide</i>.
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
     * Valid only if the policy type is <code>StepScaling</code>.
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
     *         Valid only if the policy type is <code>StepScaling</code>.
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
     * Valid only if the policy type is <code>StepScaling</code>.
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
     *            Valid only if the policy type is <code>StepScaling</code>.
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
     * Valid only if the policy type is <code>StepScaling</code>.
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
     *            Valid only if the policy type is <code>StepScaling</code>.
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
     * Required if the policy type is <code>StepScaling</code>. (Not used with
     * any other policy type.)
     * </p>
     *
     * @return <p>
     *         A set of adjustments that enable you to scale based on the size
     *         of the alarm breach.
     *         </p>
     *         <p>
     *         Required if the policy type is <code>StepScaling</code>. (Not
     *         used with any other policy type.)
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
     * Required if the policy type is <code>StepScaling</code>. (Not used with
     * any other policy type.)
     * </p>
     *
     * @param stepAdjustments <p>
     *            A set of adjustments that enable you to scale based on the
     *            size of the alarm breach.
     *            </p>
     *            <p>
     *            Required if the policy type is <code>StepScaling</code>. (Not
     *            used with any other policy type.)
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
     * Required if the policy type is <code>StepScaling</code>. (Not used with
     * any other policy type.)
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
     *            Required if the policy type is <code>StepScaling</code>. (Not
     *            used with any other policy type.)
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
     * Required if the policy type is <code>StepScaling</code>. (Not used with
     * any other policy type.)
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
     *            Required if the policy type is <code>StepScaling</code>. (Not
     *            used with any other policy type.)
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
     * contribute to the CloudWatch metrics. If not provided, the default is to
     * use the value from the default cooldown period for the Auto Scaling
     * group.
     * </p>
     * <p>
     * Valid only if the policy type is <code>TargetTrackingScaling</code> or
     * <code>StepScaling</code>.
     * </p>
     *
     * @return <p>
     *         The estimated time, in seconds, until a newly launched instance
     *         can contribute to the CloudWatch metrics. If not provided, the
     *         default is to use the value from the default cooldown period for
     *         the Auto Scaling group.
     *         </p>
     *         <p>
     *         Valid only if the policy type is
     *         <code>TargetTrackingScaling</code> or <code>StepScaling</code>.
     *         </p>
     */
    public Integer getEstimatedInstanceWarmup() {
        return estimatedInstanceWarmup;
    }

    /**
     * <p>
     * The estimated time, in seconds, until a newly launched instance can
     * contribute to the CloudWatch metrics. If not provided, the default is to
     * use the value from the default cooldown period for the Auto Scaling
     * group.
     * </p>
     * <p>
     * Valid only if the policy type is <code>TargetTrackingScaling</code> or
     * <code>StepScaling</code>.
     * </p>
     *
     * @param estimatedInstanceWarmup <p>
     *            The estimated time, in seconds, until a newly launched
     *            instance can contribute to the CloudWatch metrics. If not
     *            provided, the default is to use the value from the default
     *            cooldown period for the Auto Scaling group.
     *            </p>
     *            <p>
     *            Valid only if the policy type is
     *            <code>TargetTrackingScaling</code> or <code>StepScaling</code>
     *            .
     *            </p>
     */
    public void setEstimatedInstanceWarmup(Integer estimatedInstanceWarmup) {
        this.estimatedInstanceWarmup = estimatedInstanceWarmup;
    }

    /**
     * <p>
     * The estimated time, in seconds, until a newly launched instance can
     * contribute to the CloudWatch metrics. If not provided, the default is to
     * use the value from the default cooldown period for the Auto Scaling
     * group.
     * </p>
     * <p>
     * Valid only if the policy type is <code>TargetTrackingScaling</code> or
     * <code>StepScaling</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param estimatedInstanceWarmup <p>
     *            The estimated time, in seconds, until a newly launched
     *            instance can contribute to the CloudWatch metrics. If not
     *            provided, the default is to use the value from the default
     *            cooldown period for the Auto Scaling group.
     *            </p>
     *            <p>
     *            Valid only if the policy type is
     *            <code>TargetTrackingScaling</code> or <code>StepScaling</code>
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
     * A target tracking scaling policy. Includes support for predefined or
     * customized metrics.
     * </p>
     * <p>
     * The following predefined metrics are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ASGAverageCPUUtilization</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ASGAverageNetworkIn</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ASGAverageNetworkOut</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALBRequestCountPerTarget</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you specify <code>ALBRequestCountPerTarget</code> for the metric, you
     * must specify the <code>ResourceLabel</code> parameter with the
     * <code>PredefinedMetricSpecification</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/ec2/APIReference/API_TargetTrackingConfiguration.html"
     * >TargetTrackingConfiguration</a> in the <i>Amazon EC2 Auto Scaling API
     * Reference</i>.
     * </p>
     * <p>
     * Required if the policy type is <code>TargetTrackingScaling</code>.
     * </p>
     *
     * @return <p>
     *         A target tracking scaling policy. Includes support for predefined
     *         or customized metrics.
     *         </p>
     *         <p>
     *         The following predefined metrics are available:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ASGAverageCPUUtilization</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ASGAverageNetworkIn</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ASGAverageNetworkOut</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ALBRequestCountPerTarget</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If you specify <code>ALBRequestCountPerTarget</code> for the
     *         metric, you must specify the <code>ResourceLabel</code> parameter
     *         with the <code>PredefinedMetricSpecification</code>.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/autoscaling/ec2/APIReference/API_TargetTrackingConfiguration.html"
     *         >TargetTrackingConfiguration</a> in the <i>Amazon EC2 Auto
     *         Scaling API Reference</i>.
     *         </p>
     *         <p>
     *         Required if the policy type is <code>TargetTrackingScaling</code>
     *         .
     *         </p>
     */
    public TargetTrackingConfiguration getTargetTrackingConfiguration() {
        return targetTrackingConfiguration;
    }

    /**
     * <p>
     * A target tracking scaling policy. Includes support for predefined or
     * customized metrics.
     * </p>
     * <p>
     * The following predefined metrics are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ASGAverageCPUUtilization</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ASGAverageNetworkIn</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ASGAverageNetworkOut</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALBRequestCountPerTarget</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you specify <code>ALBRequestCountPerTarget</code> for the metric, you
     * must specify the <code>ResourceLabel</code> parameter with the
     * <code>PredefinedMetricSpecification</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/ec2/APIReference/API_TargetTrackingConfiguration.html"
     * >TargetTrackingConfiguration</a> in the <i>Amazon EC2 Auto Scaling API
     * Reference</i>.
     * </p>
     * <p>
     * Required if the policy type is <code>TargetTrackingScaling</code>.
     * </p>
     *
     * @param targetTrackingConfiguration <p>
     *            A target tracking scaling policy. Includes support for
     *            predefined or customized metrics.
     *            </p>
     *            <p>
     *            The following predefined metrics are available:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ASGAverageCPUUtilization</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ASGAverageNetworkIn</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ASGAverageNetworkOut</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ALBRequestCountPerTarget</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If you specify <code>ALBRequestCountPerTarget</code> for the
     *            metric, you must specify the <code>ResourceLabel</code>
     *            parameter with the <code>PredefinedMetricSpecification</code>.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/autoscaling/ec2/APIReference/API_TargetTrackingConfiguration.html"
     *            >TargetTrackingConfiguration</a> in the <i>Amazon EC2 Auto
     *            Scaling API Reference</i>.
     *            </p>
     *            <p>
     *            Required if the policy type is
     *            <code>TargetTrackingScaling</code>.
     *            </p>
     */
    public void setTargetTrackingConfiguration(
            TargetTrackingConfiguration targetTrackingConfiguration) {
        this.targetTrackingConfiguration = targetTrackingConfiguration;
    }

    /**
     * <p>
     * A target tracking scaling policy. Includes support for predefined or
     * customized metrics.
     * </p>
     * <p>
     * The following predefined metrics are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ASGAverageCPUUtilization</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ASGAverageNetworkIn</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ASGAverageNetworkOut</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALBRequestCountPerTarget</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you specify <code>ALBRequestCountPerTarget</code> for the metric, you
     * must specify the <code>ResourceLabel</code> parameter with the
     * <code>PredefinedMetricSpecification</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/ec2/APIReference/API_TargetTrackingConfiguration.html"
     * >TargetTrackingConfiguration</a> in the <i>Amazon EC2 Auto Scaling API
     * Reference</i>.
     * </p>
     * <p>
     * Required if the policy type is <code>TargetTrackingScaling</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetTrackingConfiguration <p>
     *            A target tracking scaling policy. Includes support for
     *            predefined or customized metrics.
     *            </p>
     *            <p>
     *            The following predefined metrics are available:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ASGAverageCPUUtilization</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ASGAverageNetworkIn</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ASGAverageNetworkOut</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ALBRequestCountPerTarget</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If you specify <code>ALBRequestCountPerTarget</code> for the
     *            metric, you must specify the <code>ResourceLabel</code>
     *            parameter with the <code>PredefinedMetricSpecification</code>.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/autoscaling/ec2/APIReference/API_TargetTrackingConfiguration.html"
     *            >TargetTrackingConfiguration</a> in the <i>Amazon EC2 Auto
     *            Scaling API Reference</i>.
     *            </p>
     *            <p>
     *            Required if the policy type is
     *            <code>TargetTrackingScaling</code>.
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
     * <p>
     * Indicates whether the scaling policy is enabled or disabled. The default
     * is enabled. For more information, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-enable-disable-scaling-policy.html"
     * >Disabling a Scaling Policy for an Auto Scaling Group</a> in the
     * <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     *
     * @return <p>
     *         Indicates whether the scaling policy is enabled or disabled. The
     *         default is enabled. For more information, see <a href=
     *         "https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-enable-disable-scaling-policy.html"
     *         >Disabling a Scaling Policy for an Auto Scaling Group</a> in the
     *         <i>Amazon EC2 Auto Scaling User Guide</i>.
     *         </p>
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * <p>
     * Indicates whether the scaling policy is enabled or disabled. The default
     * is enabled. For more information, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-enable-disable-scaling-policy.html"
     * >Disabling a Scaling Policy for an Auto Scaling Group</a> in the
     * <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     *
     * @return <p>
     *         Indicates whether the scaling policy is enabled or disabled. The
     *         default is enabled. For more information, see <a href=
     *         "https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-enable-disable-scaling-policy.html"
     *         >Disabling a Scaling Policy for an Auto Scaling Group</a> in the
     *         <i>Amazon EC2 Auto Scaling User Guide</i>.
     *         </p>
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * <p>
     * Indicates whether the scaling policy is enabled or disabled. The default
     * is enabled. For more information, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-enable-disable-scaling-policy.html"
     * >Disabling a Scaling Policy for an Auto Scaling Group</a> in the
     * <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     *
     * @param enabled <p>
     *            Indicates whether the scaling policy is enabled or disabled.
     *            The default is enabled. For more information, see <a href=
     *            "https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-enable-disable-scaling-policy.html"
     *            >Disabling a Scaling Policy for an Auto Scaling Group</a> in
     *            the <i>Amazon EC2 Auto Scaling User Guide</i>.
     *            </p>
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Indicates whether the scaling policy is enabled or disabled. The default
     * is enabled. For more information, see <a href=
     * "https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-enable-disable-scaling-policy.html"
     * >Disabling a Scaling Policy for an Auto Scaling Group</a> in the
     * <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enabled <p>
     *            Indicates whether the scaling policy is enabled or disabled.
     *            The default is enabled. For more information, see <a href=
     *            "https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-enable-disable-scaling-policy.html"
     *            >Disabling a Scaling Policy for an Auto Scaling Group</a> in
     *            the <i>Amazon EC2 Auto Scaling User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutScalingPolicyRequest withEnabled(Boolean enabled) {
        this.enabled = enabled;
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
            sb.append("TargetTrackingConfiguration: " + getTargetTrackingConfiguration() + ",");
        if (getEnabled() != null)
            sb.append("Enabled: " + getEnabled());
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
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
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
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        return true;
    }
}
