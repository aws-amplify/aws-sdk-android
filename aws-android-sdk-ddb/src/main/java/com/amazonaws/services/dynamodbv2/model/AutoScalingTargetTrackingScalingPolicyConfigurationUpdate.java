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

package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;

/**
 * <p>
 * Represents the settings of a target tracking scaling policy that will be
 * modified.
 * </p>
 */
public class AutoScalingTargetTrackingScalingPolicyConfigurationUpdate implements Serializable {
    /**
     * <p>
     * Indicates whether scale in by the target tracking policy is disabled. If
     * the value is true, scale in is disabled and the target tracking policy
     * won't remove capacity from the scalable resource. Otherwise, scale in is
     * enabled and the target tracking policy can remove capacity from the
     * scalable resource. The default value is false.
     * </p>
     */
    private Boolean disableScaleIn;

    /**
     * <p>
     * The amount of time, in seconds, after a scale in activity completes
     * before another scale in activity can start. The cooldown period is used
     * to block subsequent scale in requests until it has expired. You should
     * scale in conservatively to protect your application's availability.
     * However, if another alarm triggers a scale out policy during the cooldown
     * period after a scale-in, application autoscaling scales out your scalable
     * target immediately.
     * </p>
     */
    private Integer scaleInCooldown;

    /**
     * <p>
     * The amount of time, in seconds, after a scale out activity completes
     * before another scale out activity can start. While the cooldown period is
     * in effect, the capacity that has been added by the previous scale out
     * event that initiated the cooldown is calculated as part of the desired
     * capacity for the next scale out. You should continuously (but not
     * excessively) scale out.
     * </p>
     */
    private Integer scaleOutCooldown;

    /**
     * <p>
     * The target value for the metric. The range is 8.515920e-109 to
     * 1.174271e+108 (Base 10) or 2e-360 to 2e360 (Base 2).
     * </p>
     */
    private Double targetValue;

    /**
     * <p>
     * Indicates whether scale in by the target tracking policy is disabled. If
     * the value is true, scale in is disabled and the target tracking policy
     * won't remove capacity from the scalable resource. Otherwise, scale in is
     * enabled and the target tracking policy can remove capacity from the
     * scalable resource. The default value is false.
     * </p>
     *
     * @return <p>
     *         Indicates whether scale in by the target tracking policy is
     *         disabled. If the value is true, scale in is disabled and the
     *         target tracking policy won't remove capacity from the scalable
     *         resource. Otherwise, scale in is enabled and the target tracking
     *         policy can remove capacity from the scalable resource. The
     *         default value is false.
     *         </p>
     */
    public Boolean isDisableScaleIn() {
        return disableScaleIn;
    }

    /**
     * <p>
     * Indicates whether scale in by the target tracking policy is disabled. If
     * the value is true, scale in is disabled and the target tracking policy
     * won't remove capacity from the scalable resource. Otherwise, scale in is
     * enabled and the target tracking policy can remove capacity from the
     * scalable resource. The default value is false.
     * </p>
     *
     * @return <p>
     *         Indicates whether scale in by the target tracking policy is
     *         disabled. If the value is true, scale in is disabled and the
     *         target tracking policy won't remove capacity from the scalable
     *         resource. Otherwise, scale in is enabled and the target tracking
     *         policy can remove capacity from the scalable resource. The
     *         default value is false.
     *         </p>
     */
    public Boolean getDisableScaleIn() {
        return disableScaleIn;
    }

    /**
     * <p>
     * Indicates whether scale in by the target tracking policy is disabled. If
     * the value is true, scale in is disabled and the target tracking policy
     * won't remove capacity from the scalable resource. Otherwise, scale in is
     * enabled and the target tracking policy can remove capacity from the
     * scalable resource. The default value is false.
     * </p>
     *
     * @param disableScaleIn <p>
     *            Indicates whether scale in by the target tracking policy is
     *            disabled. If the value is true, scale in is disabled and the
     *            target tracking policy won't remove capacity from the scalable
     *            resource. Otherwise, scale in is enabled and the target
     *            tracking policy can remove capacity from the scalable
     *            resource. The default value is false.
     *            </p>
     */
    public void setDisableScaleIn(Boolean disableScaleIn) {
        this.disableScaleIn = disableScaleIn;
    }

    /**
     * <p>
     * Indicates whether scale in by the target tracking policy is disabled. If
     * the value is true, scale in is disabled and the target tracking policy
     * won't remove capacity from the scalable resource. Otherwise, scale in is
     * enabled and the target tracking policy can remove capacity from the
     * scalable resource. The default value is false.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param disableScaleIn <p>
     *            Indicates whether scale in by the target tracking policy is
     *            disabled. If the value is true, scale in is disabled and the
     *            target tracking policy won't remove capacity from the scalable
     *            resource. Otherwise, scale in is enabled and the target
     *            tracking policy can remove capacity from the scalable
     *            resource. The default value is false.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoScalingTargetTrackingScalingPolicyConfigurationUpdate withDisableScaleIn(
            Boolean disableScaleIn) {
        this.disableScaleIn = disableScaleIn;
        return this;
    }

    /**
     * <p>
     * The amount of time, in seconds, after a scale in activity completes
     * before another scale in activity can start. The cooldown period is used
     * to block subsequent scale in requests until it has expired. You should
     * scale in conservatively to protect your application's availability.
     * However, if another alarm triggers a scale out policy during the cooldown
     * period after a scale-in, application autoscaling scales out your scalable
     * target immediately.
     * </p>
     *
     * @return <p>
     *         The amount of time, in seconds, after a scale in activity
     *         completes before another scale in activity can start. The
     *         cooldown period is used to block subsequent scale in requests
     *         until it has expired. You should scale in conservatively to
     *         protect your application's availability. However, if another
     *         alarm triggers a scale out policy during the cooldown period
     *         after a scale-in, application autoscaling scales out your
     *         scalable target immediately.
     *         </p>
     */
    public Integer getScaleInCooldown() {
        return scaleInCooldown;
    }

    /**
     * <p>
     * The amount of time, in seconds, after a scale in activity completes
     * before another scale in activity can start. The cooldown period is used
     * to block subsequent scale in requests until it has expired. You should
     * scale in conservatively to protect your application's availability.
     * However, if another alarm triggers a scale out policy during the cooldown
     * period after a scale-in, application autoscaling scales out your scalable
     * target immediately.
     * </p>
     *
     * @param scaleInCooldown <p>
     *            The amount of time, in seconds, after a scale in activity
     *            completes before another scale in activity can start. The
     *            cooldown period is used to block subsequent scale in requests
     *            until it has expired. You should scale in conservatively to
     *            protect your application's availability. However, if another
     *            alarm triggers a scale out policy during the cooldown period
     *            after a scale-in, application autoscaling scales out your
     *            scalable target immediately.
     *            </p>
     */
    public void setScaleInCooldown(Integer scaleInCooldown) {
        this.scaleInCooldown = scaleInCooldown;
    }

    /**
     * <p>
     * The amount of time, in seconds, after a scale in activity completes
     * before another scale in activity can start. The cooldown period is used
     * to block subsequent scale in requests until it has expired. You should
     * scale in conservatively to protect your application's availability.
     * However, if another alarm triggers a scale out policy during the cooldown
     * period after a scale-in, application autoscaling scales out your scalable
     * target immediately.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scaleInCooldown <p>
     *            The amount of time, in seconds, after a scale in activity
     *            completes before another scale in activity can start. The
     *            cooldown period is used to block subsequent scale in requests
     *            until it has expired. You should scale in conservatively to
     *            protect your application's availability. However, if another
     *            alarm triggers a scale out policy during the cooldown period
     *            after a scale-in, application autoscaling scales out your
     *            scalable target immediately.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoScalingTargetTrackingScalingPolicyConfigurationUpdate withScaleInCooldown(
            Integer scaleInCooldown) {
        this.scaleInCooldown = scaleInCooldown;
        return this;
    }

    /**
     * <p>
     * The amount of time, in seconds, after a scale out activity completes
     * before another scale out activity can start. While the cooldown period is
     * in effect, the capacity that has been added by the previous scale out
     * event that initiated the cooldown is calculated as part of the desired
     * capacity for the next scale out. You should continuously (but not
     * excessively) scale out.
     * </p>
     *
     * @return <p>
     *         The amount of time, in seconds, after a scale out activity
     *         completes before another scale out activity can start. While the
     *         cooldown period is in effect, the capacity that has been added by
     *         the previous scale out event that initiated the cooldown is
     *         calculated as part of the desired capacity for the next scale
     *         out. You should continuously (but not excessively) scale out.
     *         </p>
     */
    public Integer getScaleOutCooldown() {
        return scaleOutCooldown;
    }

    /**
     * <p>
     * The amount of time, in seconds, after a scale out activity completes
     * before another scale out activity can start. While the cooldown period is
     * in effect, the capacity that has been added by the previous scale out
     * event that initiated the cooldown is calculated as part of the desired
     * capacity for the next scale out. You should continuously (but not
     * excessively) scale out.
     * </p>
     *
     * @param scaleOutCooldown <p>
     *            The amount of time, in seconds, after a scale out activity
     *            completes before another scale out activity can start. While
     *            the cooldown period is in effect, the capacity that has been
     *            added by the previous scale out event that initiated the
     *            cooldown is calculated as part of the desired capacity for the
     *            next scale out. You should continuously (but not excessively)
     *            scale out.
     *            </p>
     */
    public void setScaleOutCooldown(Integer scaleOutCooldown) {
        this.scaleOutCooldown = scaleOutCooldown;
    }

    /**
     * <p>
     * The amount of time, in seconds, after a scale out activity completes
     * before another scale out activity can start. While the cooldown period is
     * in effect, the capacity that has been added by the previous scale out
     * event that initiated the cooldown is calculated as part of the desired
     * capacity for the next scale out. You should continuously (but not
     * excessively) scale out.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scaleOutCooldown <p>
     *            The amount of time, in seconds, after a scale out activity
     *            completes before another scale out activity can start. While
     *            the cooldown period is in effect, the capacity that has been
     *            added by the previous scale out event that initiated the
     *            cooldown is calculated as part of the desired capacity for the
     *            next scale out. You should continuously (but not excessively)
     *            scale out.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoScalingTargetTrackingScalingPolicyConfigurationUpdate withScaleOutCooldown(
            Integer scaleOutCooldown) {
        this.scaleOutCooldown = scaleOutCooldown;
        return this;
    }

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
    public AutoScalingTargetTrackingScalingPolicyConfigurationUpdate withTargetValue(
            Double targetValue) {
        this.targetValue = targetValue;
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
        if (getDisableScaleIn() != null)
            sb.append("DisableScaleIn: " + getDisableScaleIn() + ",");
        if (getScaleInCooldown() != null)
            sb.append("ScaleInCooldown: " + getScaleInCooldown() + ",");
        if (getScaleOutCooldown() != null)
            sb.append("ScaleOutCooldown: " + getScaleOutCooldown() + ",");
        if (getTargetValue() != null)
            sb.append("TargetValue: " + getTargetValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDisableScaleIn() == null) ? 0 : getDisableScaleIn().hashCode());
        hashCode = prime * hashCode
                + ((getScaleInCooldown() == null) ? 0 : getScaleInCooldown().hashCode());
        hashCode = prime * hashCode
                + ((getScaleOutCooldown() == null) ? 0 : getScaleOutCooldown().hashCode());
        hashCode = prime * hashCode
                + ((getTargetValue() == null) ? 0 : getTargetValue().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutoScalingTargetTrackingScalingPolicyConfigurationUpdate == false)
            return false;
        AutoScalingTargetTrackingScalingPolicyConfigurationUpdate other = (AutoScalingTargetTrackingScalingPolicyConfigurationUpdate) obj;

        if (other.getDisableScaleIn() == null ^ this.getDisableScaleIn() == null)
            return false;
        if (other.getDisableScaleIn() != null
                && other.getDisableScaleIn().equals(this.getDisableScaleIn()) == false)
            return false;
        if (other.getScaleInCooldown() == null ^ this.getScaleInCooldown() == null)
            return false;
        if (other.getScaleInCooldown() != null
                && other.getScaleInCooldown().equals(this.getScaleInCooldown()) == false)
            return false;
        if (other.getScaleOutCooldown() == null ^ this.getScaleOutCooldown() == null)
            return false;
        if (other.getScaleOutCooldown() != null
                && other.getScaleOutCooldown().equals(this.getScaleOutCooldown()) == false)
            return false;
        if (other.getTargetValue() == null ^ this.getTargetValue() == null)
            return false;
        if (other.getTargetValue() != null
                && other.getTargetValue().equals(this.getTargetValue()) == false)
            return false;
        return true;
    }
}
