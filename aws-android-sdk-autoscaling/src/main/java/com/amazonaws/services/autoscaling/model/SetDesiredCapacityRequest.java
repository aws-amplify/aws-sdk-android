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
 * Sets the size of the specified Auto Scaling group.
 * </p>
 * <p>
 * For more information about desired capacity, see <a href=
 * "http://docs.aws.amazon.com/autoscaling/ec2/userguide/WhatIsAutoScaling.html"
 * >What Is Amazon EC2 Auto Scaling?</a> in the <i>Amazon EC2 Auto Scaling User
 * Guide</i>.
 * </p>
 */
public class SetDesiredCapacityRequest extends AmazonWebServiceRequest implements Serializable {
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
     * The number of EC2 instances that should be running in the Auto Scaling
     * group.
     * </p>
     */
    private Integer desiredCapacity;

    /**
     * <p>
     * Indicates whether Amazon EC2 Auto Scaling waits for the cooldown period
     * to complete before initiating a scaling activity to set your Auto Scaling
     * group to its new capacity. By default, Amazon EC2 Auto Scaling does not
     * honor the cooldown period during manual scaling activities.
     * </p>
     */
    private Boolean honorCooldown;

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
    public SetDesiredCapacityRequest withAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
        return this;
    }

    /**
     * <p>
     * The number of EC2 instances that should be running in the Auto Scaling
     * group.
     * </p>
     *
     * @return <p>
     *         The number of EC2 instances that should be running in the Auto
     *         Scaling group.
     *         </p>
     */
    public Integer getDesiredCapacity() {
        return desiredCapacity;
    }

    /**
     * <p>
     * The number of EC2 instances that should be running in the Auto Scaling
     * group.
     * </p>
     *
     * @param desiredCapacity <p>
     *            The number of EC2 instances that should be running in the Auto
     *            Scaling group.
     *            </p>
     */
    public void setDesiredCapacity(Integer desiredCapacity) {
        this.desiredCapacity = desiredCapacity;
    }

    /**
     * <p>
     * The number of EC2 instances that should be running in the Auto Scaling
     * group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param desiredCapacity <p>
     *            The number of EC2 instances that should be running in the Auto
     *            Scaling group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SetDesiredCapacityRequest withDesiredCapacity(Integer desiredCapacity) {
        this.desiredCapacity = desiredCapacity;
        return this;
    }

    /**
     * <p>
     * Indicates whether Amazon EC2 Auto Scaling waits for the cooldown period
     * to complete before initiating a scaling activity to set your Auto Scaling
     * group to its new capacity. By default, Amazon EC2 Auto Scaling does not
     * honor the cooldown period during manual scaling activities.
     * </p>
     *
     * @return <p>
     *         Indicates whether Amazon EC2 Auto Scaling waits for the cooldown
     *         period to complete before initiating a scaling activity to set
     *         your Auto Scaling group to its new capacity. By default, Amazon
     *         EC2 Auto Scaling does not honor the cooldown period during manual
     *         scaling activities.
     *         </p>
     */
    public Boolean isHonorCooldown() {
        return honorCooldown;
    }

    /**
     * <p>
     * Indicates whether Amazon EC2 Auto Scaling waits for the cooldown period
     * to complete before initiating a scaling activity to set your Auto Scaling
     * group to its new capacity. By default, Amazon EC2 Auto Scaling does not
     * honor the cooldown period during manual scaling activities.
     * </p>
     *
     * @return <p>
     *         Indicates whether Amazon EC2 Auto Scaling waits for the cooldown
     *         period to complete before initiating a scaling activity to set
     *         your Auto Scaling group to its new capacity. By default, Amazon
     *         EC2 Auto Scaling does not honor the cooldown period during manual
     *         scaling activities.
     *         </p>
     */
    public Boolean getHonorCooldown() {
        return honorCooldown;
    }

    /**
     * <p>
     * Indicates whether Amazon EC2 Auto Scaling waits for the cooldown period
     * to complete before initiating a scaling activity to set your Auto Scaling
     * group to its new capacity. By default, Amazon EC2 Auto Scaling does not
     * honor the cooldown period during manual scaling activities.
     * </p>
     *
     * @param honorCooldown <p>
     *            Indicates whether Amazon EC2 Auto Scaling waits for the
     *            cooldown period to complete before initiating a scaling
     *            activity to set your Auto Scaling group to its new capacity.
     *            By default, Amazon EC2 Auto Scaling does not honor the
     *            cooldown period during manual scaling activities.
     *            </p>
     */
    public void setHonorCooldown(Boolean honorCooldown) {
        this.honorCooldown = honorCooldown;
    }

    /**
     * <p>
     * Indicates whether Amazon EC2 Auto Scaling waits for the cooldown period
     * to complete before initiating a scaling activity to set your Auto Scaling
     * group to its new capacity. By default, Amazon EC2 Auto Scaling does not
     * honor the cooldown period during manual scaling activities.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param honorCooldown <p>
     *            Indicates whether Amazon EC2 Auto Scaling waits for the
     *            cooldown period to complete before initiating a scaling
     *            activity to set your Auto Scaling group to its new capacity.
     *            By default, Amazon EC2 Auto Scaling does not honor the
     *            cooldown period during manual scaling activities.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SetDesiredCapacityRequest withHonorCooldown(Boolean honorCooldown) {
        this.honorCooldown = honorCooldown;
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
        if (getDesiredCapacity() != null)
            sb.append("DesiredCapacity: " + getDesiredCapacity() + ",");
        if (getHonorCooldown() != null)
            sb.append("HonorCooldown: " + getHonorCooldown());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAutoScalingGroupName() == null) ? 0 : getAutoScalingGroupName().hashCode());
        hashCode = prime * hashCode
                + ((getDesiredCapacity() == null) ? 0 : getDesiredCapacity().hashCode());
        hashCode = prime * hashCode
                + ((getHonorCooldown() == null) ? 0 : getHonorCooldown().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SetDesiredCapacityRequest == false)
            return false;
        SetDesiredCapacityRequest other = (SetDesiredCapacityRequest) obj;

        if (other.getAutoScalingGroupName() == null ^ this.getAutoScalingGroupName() == null)
            return false;
        if (other.getAutoScalingGroupName() != null
                && other.getAutoScalingGroupName().equals(this.getAutoScalingGroupName()) == false)
            return false;
        if (other.getDesiredCapacity() == null ^ this.getDesiredCapacity() == null)
            return false;
        if (other.getDesiredCapacity() != null
                && other.getDesiredCapacity().equals(this.getDesiredCapacity()) == false)
            return false;
        if (other.getHonorCooldown() == null ^ this.getHonorCooldown() == null)
            return false;
        if (other.getHonorCooldown() != null
                && other.getHonorCooldown().equals(this.getHonorCooldown()) == false)
            return false;
        return true;
    }
}
