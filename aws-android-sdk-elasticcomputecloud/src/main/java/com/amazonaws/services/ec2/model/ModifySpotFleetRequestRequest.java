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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Modifies the specified Spot Fleet request.
 * </p>
 * <p>
 * You can only modify a Spot Fleet request of type <code>maintain</code>.
 * </p>
 * <p>
 * While the Spot Fleet request is being modified, it is in the
 * <code>modifying</code> state.
 * </p>
 * <p>
 * To scale up your Spot Fleet, increase its target capacity. The Spot Fleet
 * launches the additional Spot Instances according to the allocation strategy
 * for the Spot Fleet request. If the allocation strategy is
 * <code>lowestPrice</code>, the Spot Fleet launches instances using the Spot
 * Instance pool with the lowest price. If the allocation strategy is
 * <code>diversified</code>, the Spot Fleet distributes the instances across the
 * Spot Instance pools. If the allocation strategy is
 * <code>capacityOptimized</code>, Spot Fleet launches instances from Spot
 * Instance pools with optimal capacity for the number of instances that are
 * launching.
 * </p>
 * <p>
 * To scale down your Spot Fleet, decrease its target capacity. First, the Spot
 * Fleet cancels any open requests that exceed the new target capacity. You can
 * request that the Spot Fleet terminate Spot Instances until the size of the
 * fleet no longer exceeds the new target capacity. If the allocation strategy
 * is <code>lowestPrice</code>, the Spot Fleet terminates the instances with the
 * highest price per unit. If the allocation strategy is
 * <code>capacityOptimized</code>, the Spot Fleet terminates the instances in
 * the Spot Instance pools that have the least available Spot Instance capacity.
 * If the allocation strategy is <code>diversified</code>, the Spot Fleet
 * terminates instances across the Spot Instance pools. Alternatively, you can
 * request that the Spot Fleet keep the fleet at its current size, but not
 * replace any Spot Instances that are interrupted or that you terminate
 * manually.
 * </p>
 * <p>
 * If you are finished with your Spot Fleet for now, but will use it again
 * later, you can set the target capacity to 0.
 * </p>
 */
public class ModifySpotFleetRequestRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Indicates whether running Spot Instances should be terminated if the
     * target capacity of the Spot Fleet request is decreased below the current
     * size of the Spot Fleet.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>noTermination, default
     */
    private String excessCapacityTerminationPolicy;

    /**
     * <p>
     * The ID of the Spot Fleet request.
     * </p>
     */
    private String spotFleetRequestId;

    /**
     * <p>
     * The size of the fleet.
     * </p>
     */
    private Integer targetCapacity;

    /**
     * <p>
     * The number of On-Demand Instances in the fleet.
     * </p>
     */
    private Integer onDemandTargetCapacity;

    /**
     * <p>
     * Indicates whether running Spot Instances should be terminated if the
     * target capacity of the Spot Fleet request is decreased below the current
     * size of the Spot Fleet.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>noTermination, default
     *
     * @return <p>
     *         Indicates whether running Spot Instances should be terminated if
     *         the target capacity of the Spot Fleet request is decreased below
     *         the current size of the Spot Fleet.
     *         </p>
     * @see ExcessCapacityTerminationPolicy
     */
    public String getExcessCapacityTerminationPolicy() {
        return excessCapacityTerminationPolicy;
    }

    /**
     * <p>
     * Indicates whether running Spot Instances should be terminated if the
     * target capacity of the Spot Fleet request is decreased below the current
     * size of the Spot Fleet.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>noTermination, default
     *
     * @param excessCapacityTerminationPolicy <p>
     *            Indicates whether running Spot Instances should be terminated
     *            if the target capacity of the Spot Fleet request is decreased
     *            below the current size of the Spot Fleet.
     *            </p>
     * @see ExcessCapacityTerminationPolicy
     */
    public void setExcessCapacityTerminationPolicy(String excessCapacityTerminationPolicy) {
        this.excessCapacityTerminationPolicy = excessCapacityTerminationPolicy;
    }

    /**
     * <p>
     * Indicates whether running Spot Instances should be terminated if the
     * target capacity of the Spot Fleet request is decreased below the current
     * size of the Spot Fleet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>noTermination, default
     *
     * @param excessCapacityTerminationPolicy <p>
     *            Indicates whether running Spot Instances should be terminated
     *            if the target capacity of the Spot Fleet request is decreased
     *            below the current size of the Spot Fleet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ExcessCapacityTerminationPolicy
     */
    public ModifySpotFleetRequestRequest withExcessCapacityTerminationPolicy(
            String excessCapacityTerminationPolicy) {
        this.excessCapacityTerminationPolicy = excessCapacityTerminationPolicy;
        return this;
    }

    /**
     * <p>
     * Indicates whether running Spot Instances should be terminated if the
     * target capacity of the Spot Fleet request is decreased below the current
     * size of the Spot Fleet.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>noTermination, default
     *
     * @param excessCapacityTerminationPolicy <p>
     *            Indicates whether running Spot Instances should be terminated
     *            if the target capacity of the Spot Fleet request is decreased
     *            below the current size of the Spot Fleet.
     *            </p>
     * @see ExcessCapacityTerminationPolicy
     */
    public void setExcessCapacityTerminationPolicy(
            ExcessCapacityTerminationPolicy excessCapacityTerminationPolicy) {
        this.excessCapacityTerminationPolicy = excessCapacityTerminationPolicy.toString();
    }

    /**
     * <p>
     * Indicates whether running Spot Instances should be terminated if the
     * target capacity of the Spot Fleet request is decreased below the current
     * size of the Spot Fleet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>noTermination, default
     *
     * @param excessCapacityTerminationPolicy <p>
     *            Indicates whether running Spot Instances should be terminated
     *            if the target capacity of the Spot Fleet request is decreased
     *            below the current size of the Spot Fleet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ExcessCapacityTerminationPolicy
     */
    public ModifySpotFleetRequestRequest withExcessCapacityTerminationPolicy(
            ExcessCapacityTerminationPolicy excessCapacityTerminationPolicy) {
        this.excessCapacityTerminationPolicy = excessCapacityTerminationPolicy.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the Spot Fleet request.
     * </p>
     *
     * @return <p>
     *         The ID of the Spot Fleet request.
     *         </p>
     */
    public String getSpotFleetRequestId() {
        return spotFleetRequestId;
    }

    /**
     * <p>
     * The ID of the Spot Fleet request.
     * </p>
     *
     * @param spotFleetRequestId <p>
     *            The ID of the Spot Fleet request.
     *            </p>
     */
    public void setSpotFleetRequestId(String spotFleetRequestId) {
        this.spotFleetRequestId = spotFleetRequestId;
    }

    /**
     * <p>
     * The ID of the Spot Fleet request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param spotFleetRequestId <p>
     *            The ID of the Spot Fleet request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifySpotFleetRequestRequest withSpotFleetRequestId(String spotFleetRequestId) {
        this.spotFleetRequestId = spotFleetRequestId;
        return this;
    }

    /**
     * <p>
     * The size of the fleet.
     * </p>
     *
     * @return <p>
     *         The size of the fleet.
     *         </p>
     */
    public Integer getTargetCapacity() {
        return targetCapacity;
    }

    /**
     * <p>
     * The size of the fleet.
     * </p>
     *
     * @param targetCapacity <p>
     *            The size of the fleet.
     *            </p>
     */
    public void setTargetCapacity(Integer targetCapacity) {
        this.targetCapacity = targetCapacity;
    }

    /**
     * <p>
     * The size of the fleet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetCapacity <p>
     *            The size of the fleet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifySpotFleetRequestRequest withTargetCapacity(Integer targetCapacity) {
        this.targetCapacity = targetCapacity;
        return this;
    }

    /**
     * <p>
     * The number of On-Demand Instances in the fleet.
     * </p>
     *
     * @return <p>
     *         The number of On-Demand Instances in the fleet.
     *         </p>
     */
    public Integer getOnDemandTargetCapacity() {
        return onDemandTargetCapacity;
    }

    /**
     * <p>
     * The number of On-Demand Instances in the fleet.
     * </p>
     *
     * @param onDemandTargetCapacity <p>
     *            The number of On-Demand Instances in the fleet.
     *            </p>
     */
    public void setOnDemandTargetCapacity(Integer onDemandTargetCapacity) {
        this.onDemandTargetCapacity = onDemandTargetCapacity;
    }

    /**
     * <p>
     * The number of On-Demand Instances in the fleet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param onDemandTargetCapacity <p>
     *            The number of On-Demand Instances in the fleet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifySpotFleetRequestRequest withOnDemandTargetCapacity(Integer onDemandTargetCapacity) {
        this.onDemandTargetCapacity = onDemandTargetCapacity;
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
        if (getExcessCapacityTerminationPolicy() != null)
            sb.append("ExcessCapacityTerminationPolicy: " + getExcessCapacityTerminationPolicy()
                    + ",");
        if (getSpotFleetRequestId() != null)
            sb.append("SpotFleetRequestId: " + getSpotFleetRequestId() + ",");
        if (getTargetCapacity() != null)
            sb.append("TargetCapacity: " + getTargetCapacity() + ",");
        if (getOnDemandTargetCapacity() != null)
            sb.append("OnDemandTargetCapacity: " + getOnDemandTargetCapacity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getExcessCapacityTerminationPolicy() == null) ? 0
                        : getExcessCapacityTerminationPolicy().hashCode());
        hashCode = prime * hashCode
                + ((getSpotFleetRequestId() == null) ? 0 : getSpotFleetRequestId().hashCode());
        hashCode = prime * hashCode
                + ((getTargetCapacity() == null) ? 0 : getTargetCapacity().hashCode());
        hashCode = prime
                * hashCode
                + ((getOnDemandTargetCapacity() == null) ? 0 : getOnDemandTargetCapacity()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifySpotFleetRequestRequest == false)
            return false;
        ModifySpotFleetRequestRequest other = (ModifySpotFleetRequestRequest) obj;

        if (other.getExcessCapacityTerminationPolicy() == null
                ^ this.getExcessCapacityTerminationPolicy() == null)
            return false;
        if (other.getExcessCapacityTerminationPolicy() != null
                && other.getExcessCapacityTerminationPolicy().equals(
                        this.getExcessCapacityTerminationPolicy()) == false)
            return false;
        if (other.getSpotFleetRequestId() == null ^ this.getSpotFleetRequestId() == null)
            return false;
        if (other.getSpotFleetRequestId() != null
                && other.getSpotFleetRequestId().equals(this.getSpotFleetRequestId()) == false)
            return false;
        if (other.getTargetCapacity() == null ^ this.getTargetCapacity() == null)
            return false;
        if (other.getTargetCapacity() != null
                && other.getTargetCapacity().equals(this.getTargetCapacity()) == false)
            return false;
        if (other.getOnDemandTargetCapacity() == null ^ this.getOnDemandTargetCapacity() == null)
            return false;
        if (other.getOnDemandTargetCapacity() != null
                && other.getOnDemandTargetCapacity().equals(this.getOnDemandTargetCapacity()) == false)
            return false;
        return true;
    }
}
