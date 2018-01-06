/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Describes an adjustment based on the difference between the value of the
 * aggregated CloudWatch metric and the breach threshold that you've defined for
 * the alarm.
 * </p>
 * <p>
 * For the following examples, suppose that you have an alarm with a breach
 * threshold of 50:
 * </p>
 * <ul>
 * <li>
 * <p>
 * If you want the adjustment to be triggered when the metric is greater than or
 * equal to 50 and less than 60, specify a lower bound of 0 and an upper bound
 * of 10.
 * </p>
 * </li>
 * <li>
 * <p>
 * If you want the adjustment to be triggered when the metric is greater than 40
 * and less than or equal to 50, specify a lower bound of -10 and an upper bound
 * of 0.
 * </p>
 * </li>
 * </ul>
 * <p>
 * There are a few rules for the step adjustments for your step policy:
 * </p>
 * <ul>
 * <li>
 * <p>
 * The ranges of your step adjustments can't overlap or have a gap.
 * </p>
 * </li>
 * <li>
 * <p>
 * At most one step adjustment can have a null lower bound. If one step
 * adjustment has a negative lower bound, then there must be a step adjustment
 * with a null lower bound.
 * </p>
 * </li>
 * <li>
 * <p>
 * At most one step adjustment can have a null upper bound. If one step
 * adjustment has a positive upper bound, then there must be a step adjustment
 * with a null upper bound.
 * </p>
 * </li>
 * <li>
 * <p>
 * The upper and lower bound can't be null in the same step adjustment.
 * </p>
 * </li>
 * </ul>
 */
public class StepAdjustment implements Serializable {
    /**
     * <p>
     * The lower bound for the difference between the alarm threshold and the
     * CloudWatch metric. If the metric value is above the breach threshold, the
     * lower bound is inclusive (the metric must be greater than or equal to the
     * threshold plus the lower bound). Otherwise, it is exclusive (the metric
     * must be greater than the threshold plus the lower bound). A null value
     * indicates negative infinity.
     * </p>
     */
    private Double metricIntervalLowerBound;

    /**
     * <p>
     * The upper bound for the difference between the alarm threshold and the
     * CloudWatch metric. If the metric value is above the breach threshold, the
     * upper bound is exclusive (the metric must be less than the threshold plus
     * the upper bound). Otherwise, it is inclusive (the metric must be less
     * than or equal to the threshold plus the upper bound). A null value
     * indicates positive infinity.
     * </p>
     * <p>
     * The upper bound must be greater than the lower bound.
     * </p>
     */
    private Double metricIntervalUpperBound;

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
     * The lower bound for the difference between the alarm threshold and the
     * CloudWatch metric. If the metric value is above the breach threshold, the
     * lower bound is inclusive (the metric must be greater than or equal to the
     * threshold plus the lower bound). Otherwise, it is exclusive (the metric
     * must be greater than the threshold plus the lower bound). A null value
     * indicates negative infinity.
     * </p>
     *
     * @return <p>
     *         The lower bound for the difference between the alarm threshold
     *         and the CloudWatch metric. If the metric value is above the
     *         breach threshold, the lower bound is inclusive (the metric must
     *         be greater than or equal to the threshold plus the lower bound).
     *         Otherwise, it is exclusive (the metric must be greater than the
     *         threshold plus the lower bound). A null value indicates negative
     *         infinity.
     *         </p>
     */
    public Double getMetricIntervalLowerBound() {
        return metricIntervalLowerBound;
    }

    /**
     * <p>
     * The lower bound for the difference between the alarm threshold and the
     * CloudWatch metric. If the metric value is above the breach threshold, the
     * lower bound is inclusive (the metric must be greater than or equal to the
     * threshold plus the lower bound). Otherwise, it is exclusive (the metric
     * must be greater than the threshold plus the lower bound). A null value
     * indicates negative infinity.
     * </p>
     *
     * @param metricIntervalLowerBound <p>
     *            The lower bound for the difference between the alarm threshold
     *            and the CloudWatch metric. If the metric value is above the
     *            breach threshold, the lower bound is inclusive (the metric
     *            must be greater than or equal to the threshold plus the lower
     *            bound). Otherwise, it is exclusive (the metric must be greater
     *            than the threshold plus the lower bound). A null value
     *            indicates negative infinity.
     *            </p>
     */
    public void setMetricIntervalLowerBound(Double metricIntervalLowerBound) {
        this.metricIntervalLowerBound = metricIntervalLowerBound;
    }

    /**
     * <p>
     * The lower bound for the difference between the alarm threshold and the
     * CloudWatch metric. If the metric value is above the breach threshold, the
     * lower bound is inclusive (the metric must be greater than or equal to the
     * threshold plus the lower bound). Otherwise, it is exclusive (the metric
     * must be greater than the threshold plus the lower bound). A null value
     * indicates negative infinity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metricIntervalLowerBound <p>
     *            The lower bound for the difference between the alarm threshold
     *            and the CloudWatch metric. If the metric value is above the
     *            breach threshold, the lower bound is inclusive (the metric
     *            must be greater than or equal to the threshold plus the lower
     *            bound). Otherwise, it is exclusive (the metric must be greater
     *            than the threshold plus the lower bound). A null value
     *            indicates negative infinity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StepAdjustment withMetricIntervalLowerBound(Double metricIntervalLowerBound) {
        this.metricIntervalLowerBound = metricIntervalLowerBound;
        return this;
    }

    /**
     * <p>
     * The upper bound for the difference between the alarm threshold and the
     * CloudWatch metric. If the metric value is above the breach threshold, the
     * upper bound is exclusive (the metric must be less than the threshold plus
     * the upper bound). Otherwise, it is inclusive (the metric must be less
     * than or equal to the threshold plus the upper bound). A null value
     * indicates positive infinity.
     * </p>
     * <p>
     * The upper bound must be greater than the lower bound.
     * </p>
     *
     * @return <p>
     *         The upper bound for the difference between the alarm threshold
     *         and the CloudWatch metric. If the metric value is above the
     *         breach threshold, the upper bound is exclusive (the metric must
     *         be less than the threshold plus the upper bound). Otherwise, it
     *         is inclusive (the metric must be less than or equal to the
     *         threshold plus the upper bound). A null value indicates positive
     *         infinity.
     *         </p>
     *         <p>
     *         The upper bound must be greater than the lower bound.
     *         </p>
     */
    public Double getMetricIntervalUpperBound() {
        return metricIntervalUpperBound;
    }

    /**
     * <p>
     * The upper bound for the difference between the alarm threshold and the
     * CloudWatch metric. If the metric value is above the breach threshold, the
     * upper bound is exclusive (the metric must be less than the threshold plus
     * the upper bound). Otherwise, it is inclusive (the metric must be less
     * than or equal to the threshold plus the upper bound). A null value
     * indicates positive infinity.
     * </p>
     * <p>
     * The upper bound must be greater than the lower bound.
     * </p>
     *
     * @param metricIntervalUpperBound <p>
     *            The upper bound for the difference between the alarm threshold
     *            and the CloudWatch metric. If the metric value is above the
     *            breach threshold, the upper bound is exclusive (the metric
     *            must be less than the threshold plus the upper bound).
     *            Otherwise, it is inclusive (the metric must be less than or
     *            equal to the threshold plus the upper bound). A null value
     *            indicates positive infinity.
     *            </p>
     *            <p>
     *            The upper bound must be greater than the lower bound.
     *            </p>
     */
    public void setMetricIntervalUpperBound(Double metricIntervalUpperBound) {
        this.metricIntervalUpperBound = metricIntervalUpperBound;
    }

    /**
     * <p>
     * The upper bound for the difference between the alarm threshold and the
     * CloudWatch metric. If the metric value is above the breach threshold, the
     * upper bound is exclusive (the metric must be less than the threshold plus
     * the upper bound). Otherwise, it is inclusive (the metric must be less
     * than or equal to the threshold plus the upper bound). A null value
     * indicates positive infinity.
     * </p>
     * <p>
     * The upper bound must be greater than the lower bound.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metricIntervalUpperBound <p>
     *            The upper bound for the difference between the alarm threshold
     *            and the CloudWatch metric. If the metric value is above the
     *            breach threshold, the upper bound is exclusive (the metric
     *            must be less than the threshold plus the upper bound).
     *            Otherwise, it is inclusive (the metric must be less than or
     *            equal to the threshold plus the upper bound). A null value
     *            indicates positive infinity.
     *            </p>
     *            <p>
     *            The upper bound must be greater than the lower bound.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StepAdjustment withMetricIntervalUpperBound(Double metricIntervalUpperBound) {
        this.metricIntervalUpperBound = metricIntervalUpperBound;
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
    public StepAdjustment withScalingAdjustment(Integer scalingAdjustment) {
        this.scalingAdjustment = scalingAdjustment;
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
        if (getMetricIntervalLowerBound() != null)
            sb.append("MetricIntervalLowerBound: " + getMetricIntervalLowerBound() + ",");
        if (getMetricIntervalUpperBound() != null)
            sb.append("MetricIntervalUpperBound: " + getMetricIntervalUpperBound() + ",");
        if (getScalingAdjustment() != null)
            sb.append("ScalingAdjustment: " + getScalingAdjustment());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getMetricIntervalLowerBound() == null) ? 0 : getMetricIntervalLowerBound()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getMetricIntervalUpperBound() == null) ? 0 : getMetricIntervalUpperBound()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getScalingAdjustment() == null) ? 0 : getScalingAdjustment().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StepAdjustment == false)
            return false;
        StepAdjustment other = (StepAdjustment) obj;

        if (other.getMetricIntervalLowerBound() == null
                ^ this.getMetricIntervalLowerBound() == null)
            return false;
        if (other.getMetricIntervalLowerBound() != null
                && other.getMetricIntervalLowerBound().equals(this.getMetricIntervalLowerBound()) == false)
            return false;
        if (other.getMetricIntervalUpperBound() == null
                ^ this.getMetricIntervalUpperBound() == null)
            return false;
        if (other.getMetricIntervalUpperBound() != null
                && other.getMetricIntervalUpperBound().equals(this.getMetricIntervalUpperBound()) == false)
            return false;
        if (other.getScalingAdjustment() == null ^ this.getScalingAdjustment() == null)
            return false;
        if (other.getScalingAdjustment() != null
                && other.getScalingAdjustment().equals(this.getScalingAdjustment()) == false)
            return false;
        return true;
    }
}
