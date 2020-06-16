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

/**
 * <p>
 * Describes information used to start an instance refresh.
 * </p>
 */
public class RefreshPreferences implements Serializable {
    /**
     * <p>
     * The amount of capacity in the Auto Scaling group that must remain healthy
     * during an instance refresh to allow the operation to continue, as a
     * percentage of the desired capacity of the Auto Scaling group (rounded up
     * to the nearest integer). The default is <code>90</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     */
    private Integer minHealthyPercentage;

    /**
     * <p>
     * The number of seconds until a newly launched instance is configured and
     * ready to use. During this time, Amazon EC2 Auto Scaling does not
     * immediately move on to the next replacement. The default is to use the
     * value specified for the health check grace period for the group.
     * </p>
     * <p>
     * Note: While warming up, a newly launched instance is not counted toward
     * the aggregated metrics of the Auto Scaling group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer instanceWarmup;

    /**
     * <p>
     * The amount of capacity in the Auto Scaling group that must remain healthy
     * during an instance refresh to allow the operation to continue, as a
     * percentage of the desired capacity of the Auto Scaling group (rounded up
     * to the nearest integer). The default is <code>90</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @return <p>
     *         The amount of capacity in the Auto Scaling group that must remain
     *         healthy during an instance refresh to allow the operation to
     *         continue, as a percentage of the desired capacity of the Auto
     *         Scaling group (rounded up to the nearest integer). The default is
     *         <code>90</code>.
     *         </p>
     */
    public Integer getMinHealthyPercentage() {
        return minHealthyPercentage;
    }

    /**
     * <p>
     * The amount of capacity in the Auto Scaling group that must remain healthy
     * during an instance refresh to allow the operation to continue, as a
     * percentage of the desired capacity of the Auto Scaling group (rounded up
     * to the nearest integer). The default is <code>90</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @param minHealthyPercentage <p>
     *            The amount of capacity in the Auto Scaling group that must
     *            remain healthy during an instance refresh to allow the
     *            operation to continue, as a percentage of the desired capacity
     *            of the Auto Scaling group (rounded up to the nearest integer).
     *            The default is <code>90</code>.
     *            </p>
     */
    public void setMinHealthyPercentage(Integer minHealthyPercentage) {
        this.minHealthyPercentage = minHealthyPercentage;
    }

    /**
     * <p>
     * The amount of capacity in the Auto Scaling group that must remain healthy
     * during an instance refresh to allow the operation to continue, as a
     * percentage of the desired capacity of the Auto Scaling group (rounded up
     * to the nearest integer). The default is <code>90</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @param minHealthyPercentage <p>
     *            The amount of capacity in the Auto Scaling group that must
     *            remain healthy during an instance refresh to allow the
     *            operation to continue, as a percentage of the desired capacity
     *            of the Auto Scaling group (rounded up to the nearest integer).
     *            The default is <code>90</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RefreshPreferences withMinHealthyPercentage(Integer minHealthyPercentage) {
        this.minHealthyPercentage = minHealthyPercentage;
        return this;
    }

    /**
     * <p>
     * The number of seconds until a newly launched instance is configured and
     * ready to use. During this time, Amazon EC2 Auto Scaling does not
     * immediately move on to the next replacement. The default is to use the
     * value specified for the health check grace period for the group.
     * </p>
     * <p>
     * Note: While warming up, a newly launched instance is not counted toward
     * the aggregated metrics of the Auto Scaling group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The number of seconds until a newly launched instance is
     *         configured and ready to use. During this time, Amazon EC2 Auto
     *         Scaling does not immediately move on to the next replacement. The
     *         default is to use the value specified for the health check grace
     *         period for the group.
     *         </p>
     *         <p>
     *         Note: While warming up, a newly launched instance is not counted
     *         toward the aggregated metrics of the Auto Scaling group.
     *         </p>
     */
    public Integer getInstanceWarmup() {
        return instanceWarmup;
    }

    /**
     * <p>
     * The number of seconds until a newly launched instance is configured and
     * ready to use. During this time, Amazon EC2 Auto Scaling does not
     * immediately move on to the next replacement. The default is to use the
     * value specified for the health check grace period for the group.
     * </p>
     * <p>
     * Note: While warming up, a newly launched instance is not counted toward
     * the aggregated metrics of the Auto Scaling group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param instanceWarmup <p>
     *            The number of seconds until a newly launched instance is
     *            configured and ready to use. During this time, Amazon EC2 Auto
     *            Scaling does not immediately move on to the next replacement.
     *            The default is to use the value specified for the health check
     *            grace period for the group.
     *            </p>
     *            <p>
     *            Note: While warming up, a newly launched instance is not
     *            counted toward the aggregated metrics of the Auto Scaling
     *            group.
     *            </p>
     */
    public void setInstanceWarmup(Integer instanceWarmup) {
        this.instanceWarmup = instanceWarmup;
    }

    /**
     * <p>
     * The number of seconds until a newly launched instance is configured and
     * ready to use. During this time, Amazon EC2 Auto Scaling does not
     * immediately move on to the next replacement. The default is to use the
     * value specified for the health check grace period for the group.
     * </p>
     * <p>
     * Note: While warming up, a newly launched instance is not counted toward
     * the aggregated metrics of the Auto Scaling group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param instanceWarmup <p>
     *            The number of seconds until a newly launched instance is
     *            configured and ready to use. During this time, Amazon EC2 Auto
     *            Scaling does not immediately move on to the next replacement.
     *            The default is to use the value specified for the health check
     *            grace period for the group.
     *            </p>
     *            <p>
     *            Note: While warming up, a newly launched instance is not
     *            counted toward the aggregated metrics of the Auto Scaling
     *            group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RefreshPreferences withInstanceWarmup(Integer instanceWarmup) {
        this.instanceWarmup = instanceWarmup;
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
        if (getMinHealthyPercentage() != null)
            sb.append("MinHealthyPercentage: " + getMinHealthyPercentage() + ",");
        if (getInstanceWarmup() != null)
            sb.append("InstanceWarmup: " + getInstanceWarmup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getMinHealthyPercentage() == null) ? 0 : getMinHealthyPercentage().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceWarmup() == null) ? 0 : getInstanceWarmup().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RefreshPreferences == false)
            return false;
        RefreshPreferences other = (RefreshPreferences) obj;

        if (other.getMinHealthyPercentage() == null ^ this.getMinHealthyPercentage() == null)
            return false;
        if (other.getMinHealthyPercentage() != null
                && other.getMinHealthyPercentage().equals(this.getMinHealthyPercentage()) == false)
            return false;
        if (other.getInstanceWarmup() == null ^ this.getInstanceWarmup() == null)
            return false;
        if (other.getInstanceWarmup() != null
                && other.getInstanceWarmup().equals(this.getInstanceWarmup()) == false)
            return false;
        return true;
    }
}
