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

package com.amazonaws.services.ecs.model;

import java.io.Serializable;

/**
 * <p>
 * The managed scaling settings for the Auto Scaling group capacity provider.
 * </p>
 * <p>
 * When managed scaling is enabled, Amazon ECS manages the scale-in and
 * scale-out actions of the Auto Scaling group. Amazon ECS manages a target
 * tracking scaling policy using an Amazon ECS-managed CloudWatch metric with
 * the specified <code>targetCapacity</code> value as the target value for the
 * metric. For more information, see <a href=
 * "https://docs.aws.amazon.com/AmazonECS/latest/developerguide/asg-capacity-providers.html#asg-capacity-providers-managed-scaling"
 * >Using Managed Scaling</a> in the <i>Amazon Elastic Container Service
 * Developer Guide</i>.
 * </p>
 * <p>
 * If managed scaling is disabled, the user must manage the scaling of the Auto
 * Scaling group.
 * </p>
 */
public class ManagedScaling implements Serializable {
    /**
     * <p>
     * Whether or not to enable managed scaling for the capacity provider.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     */
    private String status;

    /**
     * <p>
     * The target capacity value for the capacity provider. The specified value
     * must be greater than <code>0</code> and less than or equal to
     * <code>100</code>. A value of <code>100</code> will result in the Amazon
     * EC2 instances in your Auto Scaling group being completely utilized.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     */
    private Integer targetCapacity;

    /**
     * <p>
     * The minimum number of container instances that Amazon ECS will scale in
     * or scale out at one time. If this parameter is omitted, the default value
     * of <code>1</code> is used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10000<br/>
     */
    private Integer minimumScalingStepSize;

    /**
     * <p>
     * The maximum number of container instances that Amazon ECS will scale in
     * or scale out at one time. If this parameter is omitted, the default value
     * of <code>10000</code> is used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10000<br/>
     */
    private Integer maximumScalingStepSize;

    /**
     * <p>
     * Whether or not to enable managed scaling for the capacity provider.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @return <p>
     *         Whether or not to enable managed scaling for the capacity
     *         provider.
     *         </p>
     * @see ManagedScalingStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * Whether or not to enable managed scaling for the capacity provider.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param status <p>
     *            Whether or not to enable managed scaling for the capacity
     *            provider.
     *            </p>
     * @see ManagedScalingStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Whether or not to enable managed scaling for the capacity provider.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param status <p>
     *            Whether or not to enable managed scaling for the capacity
     *            provider.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ManagedScalingStatus
     */
    public ManagedScaling withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * Whether or not to enable managed scaling for the capacity provider.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param status <p>
     *            Whether or not to enable managed scaling for the capacity
     *            provider.
     *            </p>
     * @see ManagedScalingStatus
     */
    public void setStatus(ManagedScalingStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * Whether or not to enable managed scaling for the capacity provider.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param status <p>
     *            Whether or not to enable managed scaling for the capacity
     *            provider.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ManagedScalingStatus
     */
    public ManagedScaling withStatus(ManagedScalingStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The target capacity value for the capacity provider. The specified value
     * must be greater than <code>0</code> and less than or equal to
     * <code>100</code>. A value of <code>100</code> will result in the Amazon
     * EC2 instances in your Auto Scaling group being completely utilized.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @return <p>
     *         The target capacity value for the capacity provider. The
     *         specified value must be greater than <code>0</code> and less than
     *         or equal to <code>100</code>. A value of <code>100</code> will
     *         result in the Amazon EC2 instances in your Auto Scaling group
     *         being completely utilized.
     *         </p>
     */
    public Integer getTargetCapacity() {
        return targetCapacity;
    }

    /**
     * <p>
     * The target capacity value for the capacity provider. The specified value
     * must be greater than <code>0</code> and less than or equal to
     * <code>100</code>. A value of <code>100</code> will result in the Amazon
     * EC2 instances in your Auto Scaling group being completely utilized.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param targetCapacity <p>
     *            The target capacity value for the capacity provider. The
     *            specified value must be greater than <code>0</code> and less
     *            than or equal to <code>100</code>. A value of <code>100</code>
     *            will result in the Amazon EC2 instances in your Auto Scaling
     *            group being completely utilized.
     *            </p>
     */
    public void setTargetCapacity(Integer targetCapacity) {
        this.targetCapacity = targetCapacity;
    }

    /**
     * <p>
     * The target capacity value for the capacity provider. The specified value
     * must be greater than <code>0</code> and less than or equal to
     * <code>100</code>. A value of <code>100</code> will result in the Amazon
     * EC2 instances in your Auto Scaling group being completely utilized.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param targetCapacity <p>
     *            The target capacity value for the capacity provider. The
     *            specified value must be greater than <code>0</code> and less
     *            than or equal to <code>100</code>. A value of <code>100</code>
     *            will result in the Amazon EC2 instances in your Auto Scaling
     *            group being completely utilized.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ManagedScaling withTargetCapacity(Integer targetCapacity) {
        this.targetCapacity = targetCapacity;
        return this;
    }

    /**
     * <p>
     * The minimum number of container instances that Amazon ECS will scale in
     * or scale out at one time. If this parameter is omitted, the default value
     * of <code>1</code> is used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10000<br/>
     *
     * @return <p>
     *         The minimum number of container instances that Amazon ECS will
     *         scale in or scale out at one time. If this parameter is omitted,
     *         the default value of <code>1</code> is used.
     *         </p>
     */
    public Integer getMinimumScalingStepSize() {
        return minimumScalingStepSize;
    }

    /**
     * <p>
     * The minimum number of container instances that Amazon ECS will scale in
     * or scale out at one time. If this parameter is omitted, the default value
     * of <code>1</code> is used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10000<br/>
     *
     * @param minimumScalingStepSize <p>
     *            The minimum number of container instances that Amazon ECS will
     *            scale in or scale out at one time. If this parameter is
     *            omitted, the default value of <code>1</code> is used.
     *            </p>
     */
    public void setMinimumScalingStepSize(Integer minimumScalingStepSize) {
        this.minimumScalingStepSize = minimumScalingStepSize;
    }

    /**
     * <p>
     * The minimum number of container instances that Amazon ECS will scale in
     * or scale out at one time. If this parameter is omitted, the default value
     * of <code>1</code> is used.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10000<br/>
     *
     * @param minimumScalingStepSize <p>
     *            The minimum number of container instances that Amazon ECS will
     *            scale in or scale out at one time. If this parameter is
     *            omitted, the default value of <code>1</code> is used.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ManagedScaling withMinimumScalingStepSize(Integer minimumScalingStepSize) {
        this.minimumScalingStepSize = minimumScalingStepSize;
        return this;
    }

    /**
     * <p>
     * The maximum number of container instances that Amazon ECS will scale in
     * or scale out at one time. If this parameter is omitted, the default value
     * of <code>10000</code> is used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10000<br/>
     *
     * @return <p>
     *         The maximum number of container instances that Amazon ECS will
     *         scale in or scale out at one time. If this parameter is omitted,
     *         the default value of <code>10000</code> is used.
     *         </p>
     */
    public Integer getMaximumScalingStepSize() {
        return maximumScalingStepSize;
    }

    /**
     * <p>
     * The maximum number of container instances that Amazon ECS will scale in
     * or scale out at one time. If this parameter is omitted, the default value
     * of <code>10000</code> is used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10000<br/>
     *
     * @param maximumScalingStepSize <p>
     *            The maximum number of container instances that Amazon ECS will
     *            scale in or scale out at one time. If this parameter is
     *            omitted, the default value of <code>10000</code> is used.
     *            </p>
     */
    public void setMaximumScalingStepSize(Integer maximumScalingStepSize) {
        this.maximumScalingStepSize = maximumScalingStepSize;
    }

    /**
     * <p>
     * The maximum number of container instances that Amazon ECS will scale in
     * or scale out at one time. If this parameter is omitted, the default value
     * of <code>10000</code> is used.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10000<br/>
     *
     * @param maximumScalingStepSize <p>
     *            The maximum number of container instances that Amazon ECS will
     *            scale in or scale out at one time. If this parameter is
     *            omitted, the default value of <code>10000</code> is used.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ManagedScaling withMaximumScalingStepSize(Integer maximumScalingStepSize) {
        this.maximumScalingStepSize = maximumScalingStepSize;
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
        if (getStatus() != null)
            sb.append("status: " + getStatus() + ",");
        if (getTargetCapacity() != null)
            sb.append("targetCapacity: " + getTargetCapacity() + ",");
        if (getMinimumScalingStepSize() != null)
            sb.append("minimumScalingStepSize: " + getMinimumScalingStepSize() + ",");
        if (getMaximumScalingStepSize() != null)
            sb.append("maximumScalingStepSize: " + getMaximumScalingStepSize());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getTargetCapacity() == null) ? 0 : getTargetCapacity().hashCode());
        hashCode = prime
                * hashCode
                + ((getMinimumScalingStepSize() == null) ? 0 : getMinimumScalingStepSize()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getMaximumScalingStepSize() == null) ? 0 : getMaximumScalingStepSize()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ManagedScaling == false)
            return false;
        ManagedScaling other = (ManagedScaling) obj;

        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTargetCapacity() == null ^ this.getTargetCapacity() == null)
            return false;
        if (other.getTargetCapacity() != null
                && other.getTargetCapacity().equals(this.getTargetCapacity()) == false)
            return false;
        if (other.getMinimumScalingStepSize() == null ^ this.getMinimumScalingStepSize() == null)
            return false;
        if (other.getMinimumScalingStepSize() != null
                && other.getMinimumScalingStepSize().equals(this.getMinimumScalingStepSize()) == false)
            return false;
        if (other.getMaximumScalingStepSize() == null ^ this.getMaximumScalingStepSize() == null)
            return false;
        if (other.getMaximumScalingStepSize() != null
                && other.getMaximumScalingStepSize().equals(this.getMaximumScalingStepSize()) == false)
            return false;
        return true;
    }
}
