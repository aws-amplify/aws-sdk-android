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
 * Executes the specified policy.
 * </p>
 */
public class ExecutePolicyRequest extends AmazonWebServiceRequest implements Serializable {
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
     * The name or ARN of the policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String policyName;

    /**
     * <p>
     * Indicates whether Amazon EC2 Auto Scaling waits for the cooldown period
     * to complete before executing the policy.
     * </p>
     * <p>
     * This parameter is not supported if the policy type is
     * <code>StepScaling</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/autoscaling/ec2/userguide/Cooldown.html"
     * >Scaling Cooldowns</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     */
    private Boolean honorCooldown;

    /**
     * <p>
     * The metric value to compare to <code>BreachThreshold</code>. This enables
     * you to execute a policy of type <code>StepScaling</code> and determine
     * which step adjustment to use. For example, if the breach threshold is 50
     * and you want to use a step adjustment with a lower bound of 0 and an
     * upper bound of 10, you can set the metric value to 59.
     * </p>
     * <p>
     * If you specify a metric value that doesn't correspond to a step
     * adjustment for the policy, the call returns an error.
     * </p>
     * <p>
     * This parameter is required if the policy type is <code>StepScaling</code>
     * and not supported otherwise.
     * </p>
     */
    private Double metricValue;

    /**
     * <p>
     * The breach threshold for the alarm.
     * </p>
     * <p>
     * This parameter is required if the policy type is <code>StepScaling</code>
     * and not supported otherwise.
     * </p>
     */
    private Double breachThreshold;

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
    public ExecutePolicyRequest withAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
        return this;
    }

    /**
     * <p>
     * The name or ARN of the policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The name or ARN of the policy.
     *         </p>
     */
    public String getPolicyName() {
        return policyName;
    }

    /**
     * <p>
     * The name or ARN of the policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param policyName <p>
     *            The name or ARN of the policy.
     *            </p>
     */
    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    /**
     * <p>
     * The name or ARN of the policy.
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
     * @param policyName <p>
     *            The name or ARN of the policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExecutePolicyRequest withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * <p>
     * Indicates whether Amazon EC2 Auto Scaling waits for the cooldown period
     * to complete before executing the policy.
     * </p>
     * <p>
     * This parameter is not supported if the policy type is
     * <code>StepScaling</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/autoscaling/ec2/userguide/Cooldown.html"
     * >Scaling Cooldowns</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     *
     * @return <p>
     *         Indicates whether Amazon EC2 Auto Scaling waits for the cooldown
     *         period to complete before executing the policy.
     *         </p>
     *         <p>
     *         This parameter is not supported if the policy type is
     *         <code>StepScaling</code>.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "http://docs.aws.amazon.com/autoscaling/ec2/userguide/Cooldown.html"
     *         >Scaling Cooldowns</a> in the <i>Amazon EC2 Auto Scaling User
     *         Guide</i>.
     *         </p>
     */
    public Boolean isHonorCooldown() {
        return honorCooldown;
    }

    /**
     * <p>
     * Indicates whether Amazon EC2 Auto Scaling waits for the cooldown period
     * to complete before executing the policy.
     * </p>
     * <p>
     * This parameter is not supported if the policy type is
     * <code>StepScaling</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/autoscaling/ec2/userguide/Cooldown.html"
     * >Scaling Cooldowns</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     *
     * @return <p>
     *         Indicates whether Amazon EC2 Auto Scaling waits for the cooldown
     *         period to complete before executing the policy.
     *         </p>
     *         <p>
     *         This parameter is not supported if the policy type is
     *         <code>StepScaling</code>.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "http://docs.aws.amazon.com/autoscaling/ec2/userguide/Cooldown.html"
     *         >Scaling Cooldowns</a> in the <i>Amazon EC2 Auto Scaling User
     *         Guide</i>.
     *         </p>
     */
    public Boolean getHonorCooldown() {
        return honorCooldown;
    }

    /**
     * <p>
     * Indicates whether Amazon EC2 Auto Scaling waits for the cooldown period
     * to complete before executing the policy.
     * </p>
     * <p>
     * This parameter is not supported if the policy type is
     * <code>StepScaling</code>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/autoscaling/ec2/userguide/Cooldown.html"
     * >Scaling Cooldowns</a> in the <i>Amazon EC2 Auto Scaling User Guide</i>.
     * </p>
     *
     * @param honorCooldown <p>
     *            Indicates whether Amazon EC2 Auto Scaling waits for the
     *            cooldown period to complete before executing the policy.
     *            </p>
     *            <p>
     *            This parameter is not supported if the policy type is
     *            <code>StepScaling</code>.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "http://docs.aws.amazon.com/autoscaling/ec2/userguide/Cooldown.html"
     *            >Scaling Cooldowns</a> in the <i>Amazon EC2 Auto Scaling User
     *            Guide</i>.
     *            </p>
     */
    public void setHonorCooldown(Boolean honorCooldown) {
        this.honorCooldown = honorCooldown;
    }

    /**
     * <p>
     * Indicates whether Amazon EC2 Auto Scaling waits for the cooldown period
     * to complete before executing the policy.
     * </p>
     * <p>
     * This parameter is not supported if the policy type is
     * <code>StepScaling</code>.
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
     * @param honorCooldown <p>
     *            Indicates whether Amazon EC2 Auto Scaling waits for the
     *            cooldown period to complete before executing the policy.
     *            </p>
     *            <p>
     *            This parameter is not supported if the policy type is
     *            <code>StepScaling</code>.
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
    public ExecutePolicyRequest withHonorCooldown(Boolean honorCooldown) {
        this.honorCooldown = honorCooldown;
        return this;
    }

    /**
     * <p>
     * The metric value to compare to <code>BreachThreshold</code>. This enables
     * you to execute a policy of type <code>StepScaling</code> and determine
     * which step adjustment to use. For example, if the breach threshold is 50
     * and you want to use a step adjustment with a lower bound of 0 and an
     * upper bound of 10, you can set the metric value to 59.
     * </p>
     * <p>
     * If you specify a metric value that doesn't correspond to a step
     * adjustment for the policy, the call returns an error.
     * </p>
     * <p>
     * This parameter is required if the policy type is <code>StepScaling</code>
     * and not supported otherwise.
     * </p>
     *
     * @return <p>
     *         The metric value to compare to <code>BreachThreshold</code>. This
     *         enables you to execute a policy of type <code>StepScaling</code>
     *         and determine which step adjustment to use. For example, if the
     *         breach threshold is 50 and you want to use a step adjustment with
     *         a lower bound of 0 and an upper bound of 10, you can set the
     *         metric value to 59.
     *         </p>
     *         <p>
     *         If you specify a metric value that doesn't correspond to a step
     *         adjustment for the policy, the call returns an error.
     *         </p>
     *         <p>
     *         This parameter is required if the policy type is
     *         <code>StepScaling</code> and not supported otherwise.
     *         </p>
     */
    public Double getMetricValue() {
        return metricValue;
    }

    /**
     * <p>
     * The metric value to compare to <code>BreachThreshold</code>. This enables
     * you to execute a policy of type <code>StepScaling</code> and determine
     * which step adjustment to use. For example, if the breach threshold is 50
     * and you want to use a step adjustment with a lower bound of 0 and an
     * upper bound of 10, you can set the metric value to 59.
     * </p>
     * <p>
     * If you specify a metric value that doesn't correspond to a step
     * adjustment for the policy, the call returns an error.
     * </p>
     * <p>
     * This parameter is required if the policy type is <code>StepScaling</code>
     * and not supported otherwise.
     * </p>
     *
     * @param metricValue <p>
     *            The metric value to compare to <code>BreachThreshold</code>.
     *            This enables you to execute a policy of type
     *            <code>StepScaling</code> and determine which step adjustment
     *            to use. For example, if the breach threshold is 50 and you
     *            want to use a step adjustment with a lower bound of 0 and an
     *            upper bound of 10, you can set the metric value to 59.
     *            </p>
     *            <p>
     *            If you specify a metric value that doesn't correspond to a
     *            step adjustment for the policy, the call returns an error.
     *            </p>
     *            <p>
     *            This parameter is required if the policy type is
     *            <code>StepScaling</code> and not supported otherwise.
     *            </p>
     */
    public void setMetricValue(Double metricValue) {
        this.metricValue = metricValue;
    }

    /**
     * <p>
     * The metric value to compare to <code>BreachThreshold</code>. This enables
     * you to execute a policy of type <code>StepScaling</code> and determine
     * which step adjustment to use. For example, if the breach threshold is 50
     * and you want to use a step adjustment with a lower bound of 0 and an
     * upper bound of 10, you can set the metric value to 59.
     * </p>
     * <p>
     * If you specify a metric value that doesn't correspond to a step
     * adjustment for the policy, the call returns an error.
     * </p>
     * <p>
     * This parameter is required if the policy type is <code>StepScaling</code>
     * and not supported otherwise.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metricValue <p>
     *            The metric value to compare to <code>BreachThreshold</code>.
     *            This enables you to execute a policy of type
     *            <code>StepScaling</code> and determine which step adjustment
     *            to use. For example, if the breach threshold is 50 and you
     *            want to use a step adjustment with a lower bound of 0 and an
     *            upper bound of 10, you can set the metric value to 59.
     *            </p>
     *            <p>
     *            If you specify a metric value that doesn't correspond to a
     *            step adjustment for the policy, the call returns an error.
     *            </p>
     *            <p>
     *            This parameter is required if the policy type is
     *            <code>StepScaling</code> and not supported otherwise.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExecutePolicyRequest withMetricValue(Double metricValue) {
        this.metricValue = metricValue;
        return this;
    }

    /**
     * <p>
     * The breach threshold for the alarm.
     * </p>
     * <p>
     * This parameter is required if the policy type is <code>StepScaling</code>
     * and not supported otherwise.
     * </p>
     *
     * @return <p>
     *         The breach threshold for the alarm.
     *         </p>
     *         <p>
     *         This parameter is required if the policy type is
     *         <code>StepScaling</code> and not supported otherwise.
     *         </p>
     */
    public Double getBreachThreshold() {
        return breachThreshold;
    }

    /**
     * <p>
     * The breach threshold for the alarm.
     * </p>
     * <p>
     * This parameter is required if the policy type is <code>StepScaling</code>
     * and not supported otherwise.
     * </p>
     *
     * @param breachThreshold <p>
     *            The breach threshold for the alarm.
     *            </p>
     *            <p>
     *            This parameter is required if the policy type is
     *            <code>StepScaling</code> and not supported otherwise.
     *            </p>
     */
    public void setBreachThreshold(Double breachThreshold) {
        this.breachThreshold = breachThreshold;
    }

    /**
     * <p>
     * The breach threshold for the alarm.
     * </p>
     * <p>
     * This parameter is required if the policy type is <code>StepScaling</code>
     * and not supported otherwise.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param breachThreshold <p>
     *            The breach threshold for the alarm.
     *            </p>
     *            <p>
     *            This parameter is required if the policy type is
     *            <code>StepScaling</code> and not supported otherwise.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExecutePolicyRequest withBreachThreshold(Double breachThreshold) {
        this.breachThreshold = breachThreshold;
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
        if (getHonorCooldown() != null)
            sb.append("HonorCooldown: " + getHonorCooldown() + ",");
        if (getMetricValue() != null)
            sb.append("MetricValue: " + getMetricValue() + ",");
        if (getBreachThreshold() != null)
            sb.append("BreachThreshold: " + getBreachThreshold());
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
        hashCode = prime * hashCode
                + ((getHonorCooldown() == null) ? 0 : getHonorCooldown().hashCode());
        hashCode = prime * hashCode
                + ((getMetricValue() == null) ? 0 : getMetricValue().hashCode());
        hashCode = prime * hashCode
                + ((getBreachThreshold() == null) ? 0 : getBreachThreshold().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExecutePolicyRequest == false)
            return false;
        ExecutePolicyRequest other = (ExecutePolicyRequest) obj;

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
        if (other.getHonorCooldown() == null ^ this.getHonorCooldown() == null)
            return false;
        if (other.getHonorCooldown() != null
                && other.getHonorCooldown().equals(this.getHonorCooldown()) == false)
            return false;
        if (other.getMetricValue() == null ^ this.getMetricValue() == null)
            return false;
        if (other.getMetricValue() != null
                && other.getMetricValue().equals(this.getMetricValue()) == false)
            return false;
        if (other.getBreachThreshold() == null ^ this.getBreachThreshold() == null)
            return false;
        if (other.getBreachThreshold() != null
                && other.getBreachThreshold().equals(this.getBreachThreshold()) == false)
            return false;
        return true;
    }
}
