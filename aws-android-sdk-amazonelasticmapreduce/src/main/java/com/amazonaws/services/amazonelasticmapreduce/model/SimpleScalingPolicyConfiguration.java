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

package com.amazonaws.services.amazonelasticmapreduce.model;

import java.io.Serializable;

/**
 * <p>
 * An automatic scaling configuration, which describes how the policy adds or
 * removes instances, the cooldown period, and the number of EC2 instances that
 * will be added each time the CloudWatch metric alarm condition is satisfied.
 * </p>
 */
public class SimpleScalingPolicyConfiguration implements Serializable {
    /**
     * <p>
     * The way in which EC2 instances are added (if
     * <code>ScalingAdjustment</code> is a positive number) or terminated (if
     * <code>ScalingAdjustment</code> is a negative number) each time the
     * scaling activity is triggered. <code>CHANGE_IN_CAPACITY</code> is the
     * default. <code>CHANGE_IN_CAPACITY</code> indicates that the EC2 instance
     * count increments or decrements by <code>ScalingAdjustment</code>, which
     * should be expressed as an integer.
     * <code>PERCENT_CHANGE_IN_CAPACITY</code> indicates the instance count
     * increments or decrements by the percentage specified by
     * <code>ScalingAdjustment</code>, which should be expressed as an integer.
     * For example, 20 indicates an increase in 20% increments of cluster
     * capacity. <code>EXACT_CAPACITY</code> indicates the scaling activity
     * results in an instance group with the number of EC2 instances specified
     * by <code>ScalingAdjustment</code>, which should be expressed as a
     * positive integer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CHANGE_IN_CAPACITY, PERCENT_CHANGE_IN_CAPACITY,
     * EXACT_CAPACITY
     */
    private String adjustmentType;

    /**
     * <p>
     * The amount by which to scale in or scale out, based on the specified
     * <code>AdjustmentType</code>. A positive value adds to the instance
     * group's EC2 instance count while a negative number removes instances. If
     * <code>AdjustmentType</code> is set to <code>EXACT_CAPACITY</code>, the
     * number should only be a positive integer. If <code>AdjustmentType</code>
     * is set to <code>PERCENT_CHANGE_IN_CAPACITY</code>, the value should
     * express the percentage as an integer. For example, -20 indicates a
     * decrease in 20% increments of cluster capacity.
     * </p>
     */
    private Integer scalingAdjustment;

    /**
     * <p>
     * The amount of time, in seconds, after a scaling activity completes before
     * any further trigger-related scaling activities can start. The default
     * value is 0.
     * </p>
     */
    private Integer coolDown;

    /**
     * <p>
     * The way in which EC2 instances are added (if
     * <code>ScalingAdjustment</code> is a positive number) or terminated (if
     * <code>ScalingAdjustment</code> is a negative number) each time the
     * scaling activity is triggered. <code>CHANGE_IN_CAPACITY</code> is the
     * default. <code>CHANGE_IN_CAPACITY</code> indicates that the EC2 instance
     * count increments or decrements by <code>ScalingAdjustment</code>, which
     * should be expressed as an integer.
     * <code>PERCENT_CHANGE_IN_CAPACITY</code> indicates the instance count
     * increments or decrements by the percentage specified by
     * <code>ScalingAdjustment</code>, which should be expressed as an integer.
     * For example, 20 indicates an increase in 20% increments of cluster
     * capacity. <code>EXACT_CAPACITY</code> indicates the scaling activity
     * results in an instance group with the number of EC2 instances specified
     * by <code>ScalingAdjustment</code>, which should be expressed as a
     * positive integer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CHANGE_IN_CAPACITY, PERCENT_CHANGE_IN_CAPACITY,
     * EXACT_CAPACITY
     *
     * @return <p>
     *         The way in which EC2 instances are added (if
     *         <code>ScalingAdjustment</code> is a positive number) or
     *         terminated (if <code>ScalingAdjustment</code> is a negative
     *         number) each time the scaling activity is triggered.
     *         <code>CHANGE_IN_CAPACITY</code> is the default.
     *         <code>CHANGE_IN_CAPACITY</code> indicates that the EC2 instance
     *         count increments or decrements by <code>ScalingAdjustment</code>,
     *         which should be expressed as an integer.
     *         <code>PERCENT_CHANGE_IN_CAPACITY</code> indicates the instance
     *         count increments or decrements by the percentage specified by
     *         <code>ScalingAdjustment</code>, which should be expressed as an
     *         integer. For example, 20 indicates an increase in 20% increments
     *         of cluster capacity. <code>EXACT_CAPACITY</code> indicates the
     *         scaling activity results in an instance group with the number of
     *         EC2 instances specified by <code>ScalingAdjustment</code>, which
     *         should be expressed as a positive integer.
     *         </p>
     * @see AdjustmentType
     */
    public String getAdjustmentType() {
        return adjustmentType;
    }

    /**
     * <p>
     * The way in which EC2 instances are added (if
     * <code>ScalingAdjustment</code> is a positive number) or terminated (if
     * <code>ScalingAdjustment</code> is a negative number) each time the
     * scaling activity is triggered. <code>CHANGE_IN_CAPACITY</code> is the
     * default. <code>CHANGE_IN_CAPACITY</code> indicates that the EC2 instance
     * count increments or decrements by <code>ScalingAdjustment</code>, which
     * should be expressed as an integer.
     * <code>PERCENT_CHANGE_IN_CAPACITY</code> indicates the instance count
     * increments or decrements by the percentage specified by
     * <code>ScalingAdjustment</code>, which should be expressed as an integer.
     * For example, 20 indicates an increase in 20% increments of cluster
     * capacity. <code>EXACT_CAPACITY</code> indicates the scaling activity
     * results in an instance group with the number of EC2 instances specified
     * by <code>ScalingAdjustment</code>, which should be expressed as a
     * positive integer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CHANGE_IN_CAPACITY, PERCENT_CHANGE_IN_CAPACITY,
     * EXACT_CAPACITY
     *
     * @param adjustmentType <p>
     *            The way in which EC2 instances are added (if
     *            <code>ScalingAdjustment</code> is a positive number) or
     *            terminated (if <code>ScalingAdjustment</code> is a negative
     *            number) each time the scaling activity is triggered.
     *            <code>CHANGE_IN_CAPACITY</code> is the default.
     *            <code>CHANGE_IN_CAPACITY</code> indicates that the EC2
     *            instance count increments or decrements by
     *            <code>ScalingAdjustment</code>, which should be expressed as
     *            an integer. <code>PERCENT_CHANGE_IN_CAPACITY</code> indicates
     *            the instance count increments or decrements by the percentage
     *            specified by <code>ScalingAdjustment</code>, which should be
     *            expressed as an integer. For example, 20 indicates an increase
     *            in 20% increments of cluster capacity.
     *            <code>EXACT_CAPACITY</code> indicates the scaling activity
     *            results in an instance group with the number of EC2 instances
     *            specified by <code>ScalingAdjustment</code>, which should be
     *            expressed as a positive integer.
     *            </p>
     * @see AdjustmentType
     */
    public void setAdjustmentType(String adjustmentType) {
        this.adjustmentType = adjustmentType;
    }

    /**
     * <p>
     * The way in which EC2 instances are added (if
     * <code>ScalingAdjustment</code> is a positive number) or terminated (if
     * <code>ScalingAdjustment</code> is a negative number) each time the
     * scaling activity is triggered. <code>CHANGE_IN_CAPACITY</code> is the
     * default. <code>CHANGE_IN_CAPACITY</code> indicates that the EC2 instance
     * count increments or decrements by <code>ScalingAdjustment</code>, which
     * should be expressed as an integer.
     * <code>PERCENT_CHANGE_IN_CAPACITY</code> indicates the instance count
     * increments or decrements by the percentage specified by
     * <code>ScalingAdjustment</code>, which should be expressed as an integer.
     * For example, 20 indicates an increase in 20% increments of cluster
     * capacity. <code>EXACT_CAPACITY</code> indicates the scaling activity
     * results in an instance group with the number of EC2 instances specified
     * by <code>ScalingAdjustment</code>, which should be expressed as a
     * positive integer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CHANGE_IN_CAPACITY, PERCENT_CHANGE_IN_CAPACITY,
     * EXACT_CAPACITY
     *
     * @param adjustmentType <p>
     *            The way in which EC2 instances are added (if
     *            <code>ScalingAdjustment</code> is a positive number) or
     *            terminated (if <code>ScalingAdjustment</code> is a negative
     *            number) each time the scaling activity is triggered.
     *            <code>CHANGE_IN_CAPACITY</code> is the default.
     *            <code>CHANGE_IN_CAPACITY</code> indicates that the EC2
     *            instance count increments or decrements by
     *            <code>ScalingAdjustment</code>, which should be expressed as
     *            an integer. <code>PERCENT_CHANGE_IN_CAPACITY</code> indicates
     *            the instance count increments or decrements by the percentage
     *            specified by <code>ScalingAdjustment</code>, which should be
     *            expressed as an integer. For example, 20 indicates an increase
     *            in 20% increments of cluster capacity.
     *            <code>EXACT_CAPACITY</code> indicates the scaling activity
     *            results in an instance group with the number of EC2 instances
     *            specified by <code>ScalingAdjustment</code>, which should be
     *            expressed as a positive integer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AdjustmentType
     */
    public SimpleScalingPolicyConfiguration withAdjustmentType(String adjustmentType) {
        this.adjustmentType = adjustmentType;
        return this;
    }

    /**
     * <p>
     * The way in which EC2 instances are added (if
     * <code>ScalingAdjustment</code> is a positive number) or terminated (if
     * <code>ScalingAdjustment</code> is a negative number) each time the
     * scaling activity is triggered. <code>CHANGE_IN_CAPACITY</code> is the
     * default. <code>CHANGE_IN_CAPACITY</code> indicates that the EC2 instance
     * count increments or decrements by <code>ScalingAdjustment</code>, which
     * should be expressed as an integer.
     * <code>PERCENT_CHANGE_IN_CAPACITY</code> indicates the instance count
     * increments or decrements by the percentage specified by
     * <code>ScalingAdjustment</code>, which should be expressed as an integer.
     * For example, 20 indicates an increase in 20% increments of cluster
     * capacity. <code>EXACT_CAPACITY</code> indicates the scaling activity
     * results in an instance group with the number of EC2 instances specified
     * by <code>ScalingAdjustment</code>, which should be expressed as a
     * positive integer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CHANGE_IN_CAPACITY, PERCENT_CHANGE_IN_CAPACITY,
     * EXACT_CAPACITY
     *
     * @param adjustmentType <p>
     *            The way in which EC2 instances are added (if
     *            <code>ScalingAdjustment</code> is a positive number) or
     *            terminated (if <code>ScalingAdjustment</code> is a negative
     *            number) each time the scaling activity is triggered.
     *            <code>CHANGE_IN_CAPACITY</code> is the default.
     *            <code>CHANGE_IN_CAPACITY</code> indicates that the EC2
     *            instance count increments or decrements by
     *            <code>ScalingAdjustment</code>, which should be expressed as
     *            an integer. <code>PERCENT_CHANGE_IN_CAPACITY</code> indicates
     *            the instance count increments or decrements by the percentage
     *            specified by <code>ScalingAdjustment</code>, which should be
     *            expressed as an integer. For example, 20 indicates an increase
     *            in 20% increments of cluster capacity.
     *            <code>EXACT_CAPACITY</code> indicates the scaling activity
     *            results in an instance group with the number of EC2 instances
     *            specified by <code>ScalingAdjustment</code>, which should be
     *            expressed as a positive integer.
     *            </p>
     * @see AdjustmentType
     */
    public void setAdjustmentType(AdjustmentType adjustmentType) {
        this.adjustmentType = adjustmentType.toString();
    }

    /**
     * <p>
     * The way in which EC2 instances are added (if
     * <code>ScalingAdjustment</code> is a positive number) or terminated (if
     * <code>ScalingAdjustment</code> is a negative number) each time the
     * scaling activity is triggered. <code>CHANGE_IN_CAPACITY</code> is the
     * default. <code>CHANGE_IN_CAPACITY</code> indicates that the EC2 instance
     * count increments or decrements by <code>ScalingAdjustment</code>, which
     * should be expressed as an integer.
     * <code>PERCENT_CHANGE_IN_CAPACITY</code> indicates the instance count
     * increments or decrements by the percentage specified by
     * <code>ScalingAdjustment</code>, which should be expressed as an integer.
     * For example, 20 indicates an increase in 20% increments of cluster
     * capacity. <code>EXACT_CAPACITY</code> indicates the scaling activity
     * results in an instance group with the number of EC2 instances specified
     * by <code>ScalingAdjustment</code>, which should be expressed as a
     * positive integer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CHANGE_IN_CAPACITY, PERCENT_CHANGE_IN_CAPACITY,
     * EXACT_CAPACITY
     *
     * @param adjustmentType <p>
     *            The way in which EC2 instances are added (if
     *            <code>ScalingAdjustment</code> is a positive number) or
     *            terminated (if <code>ScalingAdjustment</code> is a negative
     *            number) each time the scaling activity is triggered.
     *            <code>CHANGE_IN_CAPACITY</code> is the default.
     *            <code>CHANGE_IN_CAPACITY</code> indicates that the EC2
     *            instance count increments or decrements by
     *            <code>ScalingAdjustment</code>, which should be expressed as
     *            an integer. <code>PERCENT_CHANGE_IN_CAPACITY</code> indicates
     *            the instance count increments or decrements by the percentage
     *            specified by <code>ScalingAdjustment</code>, which should be
     *            expressed as an integer. For example, 20 indicates an increase
     *            in 20% increments of cluster capacity.
     *            <code>EXACT_CAPACITY</code> indicates the scaling activity
     *            results in an instance group with the number of EC2 instances
     *            specified by <code>ScalingAdjustment</code>, which should be
     *            expressed as a positive integer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AdjustmentType
     */
    public SimpleScalingPolicyConfiguration withAdjustmentType(AdjustmentType adjustmentType) {
        this.adjustmentType = adjustmentType.toString();
        return this;
    }

    /**
     * <p>
     * The amount by which to scale in or scale out, based on the specified
     * <code>AdjustmentType</code>. A positive value adds to the instance
     * group's EC2 instance count while a negative number removes instances. If
     * <code>AdjustmentType</code> is set to <code>EXACT_CAPACITY</code>, the
     * number should only be a positive integer. If <code>AdjustmentType</code>
     * is set to <code>PERCENT_CHANGE_IN_CAPACITY</code>, the value should
     * express the percentage as an integer. For example, -20 indicates a
     * decrease in 20% increments of cluster capacity.
     * </p>
     *
     * @return <p>
     *         The amount by which to scale in or scale out, based on the
     *         specified <code>AdjustmentType</code>. A positive value adds to
     *         the instance group's EC2 instance count while a negative number
     *         removes instances. If <code>AdjustmentType</code> is set to
     *         <code>EXACT_CAPACITY</code>, the number should only be a positive
     *         integer. If <code>AdjustmentType</code> is set to
     *         <code>PERCENT_CHANGE_IN_CAPACITY</code>, the value should express
     *         the percentage as an integer. For example, -20 indicates a
     *         decrease in 20% increments of cluster capacity.
     *         </p>
     */
    public Integer getScalingAdjustment() {
        return scalingAdjustment;
    }

    /**
     * <p>
     * The amount by which to scale in or scale out, based on the specified
     * <code>AdjustmentType</code>. A positive value adds to the instance
     * group's EC2 instance count while a negative number removes instances. If
     * <code>AdjustmentType</code> is set to <code>EXACT_CAPACITY</code>, the
     * number should only be a positive integer. If <code>AdjustmentType</code>
     * is set to <code>PERCENT_CHANGE_IN_CAPACITY</code>, the value should
     * express the percentage as an integer. For example, -20 indicates a
     * decrease in 20% increments of cluster capacity.
     * </p>
     *
     * @param scalingAdjustment <p>
     *            The amount by which to scale in or scale out, based on the
     *            specified <code>AdjustmentType</code>. A positive value adds
     *            to the instance group's EC2 instance count while a negative
     *            number removes instances. If <code>AdjustmentType</code> is
     *            set to <code>EXACT_CAPACITY</code>, the number should only be
     *            a positive integer. If <code>AdjustmentType</code> is set to
     *            <code>PERCENT_CHANGE_IN_CAPACITY</code>, the value should
     *            express the percentage as an integer. For example, -20
     *            indicates a decrease in 20% increments of cluster capacity.
     *            </p>
     */
    public void setScalingAdjustment(Integer scalingAdjustment) {
        this.scalingAdjustment = scalingAdjustment;
    }

    /**
     * <p>
     * The amount by which to scale in or scale out, based on the specified
     * <code>AdjustmentType</code>. A positive value adds to the instance
     * group's EC2 instance count while a negative number removes instances. If
     * <code>AdjustmentType</code> is set to <code>EXACT_CAPACITY</code>, the
     * number should only be a positive integer. If <code>AdjustmentType</code>
     * is set to <code>PERCENT_CHANGE_IN_CAPACITY</code>, the value should
     * express the percentage as an integer. For example, -20 indicates a
     * decrease in 20% increments of cluster capacity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scalingAdjustment <p>
     *            The amount by which to scale in or scale out, based on the
     *            specified <code>AdjustmentType</code>. A positive value adds
     *            to the instance group's EC2 instance count while a negative
     *            number removes instances. If <code>AdjustmentType</code> is
     *            set to <code>EXACT_CAPACITY</code>, the number should only be
     *            a positive integer. If <code>AdjustmentType</code> is set to
     *            <code>PERCENT_CHANGE_IN_CAPACITY</code>, the value should
     *            express the percentage as an integer. For example, -20
     *            indicates a decrease in 20% increments of cluster capacity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SimpleScalingPolicyConfiguration withScalingAdjustment(Integer scalingAdjustment) {
        this.scalingAdjustment = scalingAdjustment;
        return this;
    }

    /**
     * <p>
     * The amount of time, in seconds, after a scaling activity completes before
     * any further trigger-related scaling activities can start. The default
     * value is 0.
     * </p>
     *
     * @return <p>
     *         The amount of time, in seconds, after a scaling activity
     *         completes before any further trigger-related scaling activities
     *         can start. The default value is 0.
     *         </p>
     */
    public Integer getCoolDown() {
        return coolDown;
    }

    /**
     * <p>
     * The amount of time, in seconds, after a scaling activity completes before
     * any further trigger-related scaling activities can start. The default
     * value is 0.
     * </p>
     *
     * @param coolDown <p>
     *            The amount of time, in seconds, after a scaling activity
     *            completes before any further trigger-related scaling
     *            activities can start. The default value is 0.
     *            </p>
     */
    public void setCoolDown(Integer coolDown) {
        this.coolDown = coolDown;
    }

    /**
     * <p>
     * The amount of time, in seconds, after a scaling activity completes before
     * any further trigger-related scaling activities can start. The default
     * value is 0.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param coolDown <p>
     *            The amount of time, in seconds, after a scaling activity
     *            completes before any further trigger-related scaling
     *            activities can start. The default value is 0.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SimpleScalingPolicyConfiguration withCoolDown(Integer coolDown) {
        this.coolDown = coolDown;
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
        if (getAdjustmentType() != null)
            sb.append("AdjustmentType: " + getAdjustmentType() + ",");
        if (getScalingAdjustment() != null)
            sb.append("ScalingAdjustment: " + getScalingAdjustment() + ",");
        if (getCoolDown() != null)
            sb.append("CoolDown: " + getCoolDown());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAdjustmentType() == null) ? 0 : getAdjustmentType().hashCode());
        hashCode = prime * hashCode
                + ((getScalingAdjustment() == null) ? 0 : getScalingAdjustment().hashCode());
        hashCode = prime * hashCode + ((getCoolDown() == null) ? 0 : getCoolDown().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SimpleScalingPolicyConfiguration == false)
            return false;
        SimpleScalingPolicyConfiguration other = (SimpleScalingPolicyConfiguration) obj;

        if (other.getAdjustmentType() == null ^ this.getAdjustmentType() == null)
            return false;
        if (other.getAdjustmentType() != null
                && other.getAdjustmentType().equals(this.getAdjustmentType()) == false)
            return false;
        if (other.getScalingAdjustment() == null ^ this.getScalingAdjustment() == null)
            return false;
        if (other.getScalingAdjustment() != null
                && other.getScalingAdjustment().equals(this.getScalingAdjustment()) == false)
            return false;
        if (other.getCoolDown() == null ^ this.getCoolDown() == null)
            return false;
        if (other.getCoolDown() != null && other.getCoolDown().equals(this.getCoolDown()) == false)
            return false;
        return true;
    }
}
