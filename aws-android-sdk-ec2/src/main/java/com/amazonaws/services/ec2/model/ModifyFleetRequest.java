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
 * Modifies the specified EC2 Fleet.
 * </p>
 * <p>
 * You can only modify an EC2 Fleet request of type <code>maintain</code>.
 * </p>
 * <p>
 * While the EC2 Fleet is being modified, it is in the <code>modifying</code>
 * state.
 * </p>
 * <p>
 * To scale up your EC2 Fleet, increase its target capacity. The EC2 Fleet
 * launches the additional Spot Instances according to the allocation strategy
 * for the EC2 Fleet request. If the allocation strategy is
 * <code>lowest-price</code>, the EC2 Fleet launches instances using the Spot
 * Instance pool with the lowest price. If the allocation strategy is
 * <code>diversified</code>, the EC2 Fleet distributes the instances across the
 * Spot Instance pools. If the allocation strategy is
 * <code>capacity-optimized</code>, EC2 Fleet launches instances from Spot
 * Instance pools with optimal capacity for the number of instances that are
 * launching.
 * </p>
 * <p>
 * To scale down your EC2 Fleet, decrease its target capacity. First, the EC2
 * Fleet cancels any open requests that exceed the new target capacity. You can
 * request that the EC2 Fleet terminate Spot Instances until the size of the
 * fleet no longer exceeds the new target capacity. If the allocation strategy
 * is <code>lowest-price</code>, the EC2 Fleet terminates the instances with the
 * highest price per unit. If the allocation strategy is
 * <code>capacity-optimized</code>, the EC2 Fleet terminates the instances in
 * the Spot Instance pools that have the least available Spot Instance capacity.
 * If the allocation strategy is <code>diversified</code>, the EC2 Fleet
 * terminates instances across the Spot Instance pools. Alternatively, you can
 * request that the EC2 Fleet keep the fleet at its current size, but not
 * replace any Spot Instances that are interrupted or that you terminate
 * manually.
 * </p>
 * <p>
 * If you are finished with your EC2 Fleet for now, but will use it again later,
 * you can set the target capacity to 0.
 * </p>
 */
public class ModifyFleetRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     */
    private Boolean dryRun;

    /**
     * <p>
     * Indicates whether running instances should be terminated if the total
     * target capacity of the EC2 Fleet is decreased below the current size of
     * the EC2 Fleet.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>no-termination, termination
     */
    private String excessCapacityTerminationPolicy;

    /**
     * <p>
     * The ID of the EC2 Fleet.
     * </p>
     */
    private String fleetId;

    /**
     * <p>
     * The size of the EC2 Fleet.
     * </p>
     */
    private TargetCapacitySpecificationRequest targetCapacitySpecification;

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean isDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean getDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     */
    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyFleetRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * <p>
     * Indicates whether running instances should be terminated if the total
     * target capacity of the EC2 Fleet is decreased below the current size of
     * the EC2 Fleet.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>no-termination, termination
     *
     * @return <p>
     *         Indicates whether running instances should be terminated if the
     *         total target capacity of the EC2 Fleet is decreased below the
     *         current size of the EC2 Fleet.
     *         </p>
     * @see FleetExcessCapacityTerminationPolicy
     */
    public String getExcessCapacityTerminationPolicy() {
        return excessCapacityTerminationPolicy;
    }

    /**
     * <p>
     * Indicates whether running instances should be terminated if the total
     * target capacity of the EC2 Fleet is decreased below the current size of
     * the EC2 Fleet.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>no-termination, termination
     *
     * @param excessCapacityTerminationPolicy <p>
     *            Indicates whether running instances should be terminated if
     *            the total target capacity of the EC2 Fleet is decreased below
     *            the current size of the EC2 Fleet.
     *            </p>
     * @see FleetExcessCapacityTerminationPolicy
     */
    public void setExcessCapacityTerminationPolicy(String excessCapacityTerminationPolicy) {
        this.excessCapacityTerminationPolicy = excessCapacityTerminationPolicy;
    }

    /**
     * <p>
     * Indicates whether running instances should be terminated if the total
     * target capacity of the EC2 Fleet is decreased below the current size of
     * the EC2 Fleet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>no-termination, termination
     *
     * @param excessCapacityTerminationPolicy <p>
     *            Indicates whether running instances should be terminated if
     *            the total target capacity of the EC2 Fleet is decreased below
     *            the current size of the EC2 Fleet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FleetExcessCapacityTerminationPolicy
     */
    public ModifyFleetRequest withExcessCapacityTerminationPolicy(
            String excessCapacityTerminationPolicy) {
        this.excessCapacityTerminationPolicy = excessCapacityTerminationPolicy;
        return this;
    }

    /**
     * <p>
     * Indicates whether running instances should be terminated if the total
     * target capacity of the EC2 Fleet is decreased below the current size of
     * the EC2 Fleet.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>no-termination, termination
     *
     * @param excessCapacityTerminationPolicy <p>
     *            Indicates whether running instances should be terminated if
     *            the total target capacity of the EC2 Fleet is decreased below
     *            the current size of the EC2 Fleet.
     *            </p>
     * @see FleetExcessCapacityTerminationPolicy
     */
    public void setExcessCapacityTerminationPolicy(
            FleetExcessCapacityTerminationPolicy excessCapacityTerminationPolicy) {
        this.excessCapacityTerminationPolicy = excessCapacityTerminationPolicy.toString();
    }

    /**
     * <p>
     * Indicates whether running instances should be terminated if the total
     * target capacity of the EC2 Fleet is decreased below the current size of
     * the EC2 Fleet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>no-termination, termination
     *
     * @param excessCapacityTerminationPolicy <p>
     *            Indicates whether running instances should be terminated if
     *            the total target capacity of the EC2 Fleet is decreased below
     *            the current size of the EC2 Fleet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FleetExcessCapacityTerminationPolicy
     */
    public ModifyFleetRequest withExcessCapacityTerminationPolicy(
            FleetExcessCapacityTerminationPolicy excessCapacityTerminationPolicy) {
        this.excessCapacityTerminationPolicy = excessCapacityTerminationPolicy.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the EC2 Fleet.
     * </p>
     *
     * @return <p>
     *         The ID of the EC2 Fleet.
     *         </p>
     */
    public String getFleetId() {
        return fleetId;
    }

    /**
     * <p>
     * The ID of the EC2 Fleet.
     * </p>
     *
     * @param fleetId <p>
     *            The ID of the EC2 Fleet.
     *            </p>
     */
    public void setFleetId(String fleetId) {
        this.fleetId = fleetId;
    }

    /**
     * <p>
     * The ID of the EC2 Fleet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fleetId <p>
     *            The ID of the EC2 Fleet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyFleetRequest withFleetId(String fleetId) {
        this.fleetId = fleetId;
        return this;
    }

    /**
     * <p>
     * The size of the EC2 Fleet.
     * </p>
     *
     * @return <p>
     *         The size of the EC2 Fleet.
     *         </p>
     */
    public TargetCapacitySpecificationRequest getTargetCapacitySpecification() {
        return targetCapacitySpecification;
    }

    /**
     * <p>
     * The size of the EC2 Fleet.
     * </p>
     *
     * @param targetCapacitySpecification <p>
     *            The size of the EC2 Fleet.
     *            </p>
     */
    public void setTargetCapacitySpecification(
            TargetCapacitySpecificationRequest targetCapacitySpecification) {
        this.targetCapacitySpecification = targetCapacitySpecification;
    }

    /**
     * <p>
     * The size of the EC2 Fleet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetCapacitySpecification <p>
     *            The size of the EC2 Fleet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyFleetRequest withTargetCapacitySpecification(
            TargetCapacitySpecificationRequest targetCapacitySpecification) {
        this.targetCapacitySpecification = targetCapacitySpecification;
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
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun() + ",");
        if (getExcessCapacityTerminationPolicy() != null)
            sb.append("ExcessCapacityTerminationPolicy: " + getExcessCapacityTerminationPolicy()
                    + ",");
        if (getFleetId() != null)
            sb.append("FleetId: " + getFleetId() + ",");
        if (getTargetCapacitySpecification() != null)
            sb.append("TargetCapacitySpecification: " + getTargetCapacitySpecification());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        hashCode = prime
                * hashCode
                + ((getExcessCapacityTerminationPolicy() == null) ? 0
                        : getExcessCapacityTerminationPolicy().hashCode());
        hashCode = prime * hashCode + ((getFleetId() == null) ? 0 : getFleetId().hashCode());
        hashCode = prime
                * hashCode
                + ((getTargetCapacitySpecification() == null) ? 0
                        : getTargetCapacitySpecification().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyFleetRequest == false)
            return false;
        ModifyFleetRequest other = (ModifyFleetRequest) obj;

        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        if (other.getExcessCapacityTerminationPolicy() == null
                ^ this.getExcessCapacityTerminationPolicy() == null)
            return false;
        if (other.getExcessCapacityTerminationPolicy() != null
                && other.getExcessCapacityTerminationPolicy().equals(
                        this.getExcessCapacityTerminationPolicy()) == false)
            return false;
        if (other.getFleetId() == null ^ this.getFleetId() == null)
            return false;
        if (other.getFleetId() != null && other.getFleetId().equals(this.getFleetId()) == false)
            return false;
        if (other.getTargetCapacitySpecification() == null
                ^ this.getTargetCapacitySpecification() == null)
            return false;
        if (other.getTargetCapacitySpecification() != null
                && other.getTargetCapacitySpecification().equals(
                        this.getTargetCapacitySpecification()) == false)
            return false;
        return true;
    }
}
