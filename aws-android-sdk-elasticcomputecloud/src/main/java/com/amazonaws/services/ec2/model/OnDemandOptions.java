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

/**
 * <p>
 * Describes the configuration of On-Demand Instances in an EC2 Fleet.
 * </p>
 */
public class OnDemandOptions implements Serializable {
    /**
     * <p>
     * The order of the launch template overrides to use in fulfilling On-Demand
     * capacity. If you specify <code>lowest-price</code>, EC2 Fleet uses price
     * to determine the order, launching the lowest price first. If you specify
     * <code>prioritized</code>, EC2 Fleet uses the priority that you assigned
     * to each launch template override, launching the highest priority first.
     * If you do not specify a value, EC2 Fleet defaults to
     * <code>lowest-price</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>lowest-price, prioritized
     */
    private String allocationStrategy;

    /**
     * <p>
     * The strategy for using unused Capacity Reservations for fulfilling
     * On-Demand capacity. Supported only for fleets of type
     * <code>instant</code>.
     * </p>
     */
    private CapacityReservationOptions capacityReservationOptions;

    /**
     * <p>
     * Indicates that the fleet uses a single instance type to launch all
     * On-Demand Instances in the fleet. Supported only for fleets of type
     * <code>instant</code>.
     * </p>
     */
    private Boolean singleInstanceType;

    /**
     * <p>
     * Indicates that the fleet launches all On-Demand Instances into a single
     * Availability Zone. Supported only for fleets of type <code>instant</code>
     * .
     * </p>
     */
    private Boolean singleAvailabilityZone;

    /**
     * <p>
     * The minimum target capacity for On-Demand Instances in the fleet. If the
     * minimum target capacity is not reached, the fleet launches no instances.
     * </p>
     */
    private Integer minTargetCapacity;

    /**
     * <p>
     * The maximum amount per hour for On-Demand Instances that you're willing
     * to pay.
     * </p>
     */
    private String maxTotalPrice;

    /**
     * <p>
     * The order of the launch template overrides to use in fulfilling On-Demand
     * capacity. If you specify <code>lowest-price</code>, EC2 Fleet uses price
     * to determine the order, launching the lowest price first. If you specify
     * <code>prioritized</code>, EC2 Fleet uses the priority that you assigned
     * to each launch template override, launching the highest priority first.
     * If you do not specify a value, EC2 Fleet defaults to
     * <code>lowest-price</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>lowest-price, prioritized
     *
     * @return <p>
     *         The order of the launch template overrides to use in fulfilling
     *         On-Demand capacity. If you specify <code>lowest-price</code>, EC2
     *         Fleet uses price to determine the order, launching the lowest
     *         price first. If you specify <code>prioritized</code>, EC2 Fleet
     *         uses the priority that you assigned to each launch template
     *         override, launching the highest priority first. If you do not
     *         specify a value, EC2 Fleet defaults to <code>lowest-price</code>.
     *         </p>
     * @see FleetOnDemandAllocationStrategy
     */
    public String getAllocationStrategy() {
        return allocationStrategy;
    }

    /**
     * <p>
     * The order of the launch template overrides to use in fulfilling On-Demand
     * capacity. If you specify <code>lowest-price</code>, EC2 Fleet uses price
     * to determine the order, launching the lowest price first. If you specify
     * <code>prioritized</code>, EC2 Fleet uses the priority that you assigned
     * to each launch template override, launching the highest priority first.
     * If you do not specify a value, EC2 Fleet defaults to
     * <code>lowest-price</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>lowest-price, prioritized
     *
     * @param allocationStrategy <p>
     *            The order of the launch template overrides to use in
     *            fulfilling On-Demand capacity. If you specify
     *            <code>lowest-price</code>, EC2 Fleet uses price to determine
     *            the order, launching the lowest price first. If you specify
     *            <code>prioritized</code>, EC2 Fleet uses the priority that you
     *            assigned to each launch template override, launching the
     *            highest priority first. If you do not specify a value, EC2
     *            Fleet defaults to <code>lowest-price</code>.
     *            </p>
     * @see FleetOnDemandAllocationStrategy
     */
    public void setAllocationStrategy(String allocationStrategy) {
        this.allocationStrategy = allocationStrategy;
    }

    /**
     * <p>
     * The order of the launch template overrides to use in fulfilling On-Demand
     * capacity. If you specify <code>lowest-price</code>, EC2 Fleet uses price
     * to determine the order, launching the lowest price first. If you specify
     * <code>prioritized</code>, EC2 Fleet uses the priority that you assigned
     * to each launch template override, launching the highest priority first.
     * If you do not specify a value, EC2 Fleet defaults to
     * <code>lowest-price</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>lowest-price, prioritized
     *
     * @param allocationStrategy <p>
     *            The order of the launch template overrides to use in
     *            fulfilling On-Demand capacity. If you specify
     *            <code>lowest-price</code>, EC2 Fleet uses price to determine
     *            the order, launching the lowest price first. If you specify
     *            <code>prioritized</code>, EC2 Fleet uses the priority that you
     *            assigned to each launch template override, launching the
     *            highest priority first. If you do not specify a value, EC2
     *            Fleet defaults to <code>lowest-price</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FleetOnDemandAllocationStrategy
     */
    public OnDemandOptions withAllocationStrategy(String allocationStrategy) {
        this.allocationStrategy = allocationStrategy;
        return this;
    }

    /**
     * <p>
     * The order of the launch template overrides to use in fulfilling On-Demand
     * capacity. If you specify <code>lowest-price</code>, EC2 Fleet uses price
     * to determine the order, launching the lowest price first. If you specify
     * <code>prioritized</code>, EC2 Fleet uses the priority that you assigned
     * to each launch template override, launching the highest priority first.
     * If you do not specify a value, EC2 Fleet defaults to
     * <code>lowest-price</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>lowest-price, prioritized
     *
     * @param allocationStrategy <p>
     *            The order of the launch template overrides to use in
     *            fulfilling On-Demand capacity. If you specify
     *            <code>lowest-price</code>, EC2 Fleet uses price to determine
     *            the order, launching the lowest price first. If you specify
     *            <code>prioritized</code>, EC2 Fleet uses the priority that you
     *            assigned to each launch template override, launching the
     *            highest priority first. If you do not specify a value, EC2
     *            Fleet defaults to <code>lowest-price</code>.
     *            </p>
     * @see FleetOnDemandAllocationStrategy
     */
    public void setAllocationStrategy(FleetOnDemandAllocationStrategy allocationStrategy) {
        this.allocationStrategy = allocationStrategy.toString();
    }

    /**
     * <p>
     * The order of the launch template overrides to use in fulfilling On-Demand
     * capacity. If you specify <code>lowest-price</code>, EC2 Fleet uses price
     * to determine the order, launching the lowest price first. If you specify
     * <code>prioritized</code>, EC2 Fleet uses the priority that you assigned
     * to each launch template override, launching the highest priority first.
     * If you do not specify a value, EC2 Fleet defaults to
     * <code>lowest-price</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>lowest-price, prioritized
     *
     * @param allocationStrategy <p>
     *            The order of the launch template overrides to use in
     *            fulfilling On-Demand capacity. If you specify
     *            <code>lowest-price</code>, EC2 Fleet uses price to determine
     *            the order, launching the lowest price first. If you specify
     *            <code>prioritized</code>, EC2 Fleet uses the priority that you
     *            assigned to each launch template override, launching the
     *            highest priority first. If you do not specify a value, EC2
     *            Fleet defaults to <code>lowest-price</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FleetOnDemandAllocationStrategy
     */
    public OnDemandOptions withAllocationStrategy(FleetOnDemandAllocationStrategy allocationStrategy) {
        this.allocationStrategy = allocationStrategy.toString();
        return this;
    }

    /**
     * <p>
     * The strategy for using unused Capacity Reservations for fulfilling
     * On-Demand capacity. Supported only for fleets of type
     * <code>instant</code>.
     * </p>
     *
     * @return <p>
     *         The strategy for using unused Capacity Reservations for
     *         fulfilling On-Demand capacity. Supported only for fleets of type
     *         <code>instant</code>.
     *         </p>
     */
    public CapacityReservationOptions getCapacityReservationOptions() {
        return capacityReservationOptions;
    }

    /**
     * <p>
     * The strategy for using unused Capacity Reservations for fulfilling
     * On-Demand capacity. Supported only for fleets of type
     * <code>instant</code>.
     * </p>
     *
     * @param capacityReservationOptions <p>
     *            The strategy for using unused Capacity Reservations for
     *            fulfilling On-Demand capacity. Supported only for fleets of
     *            type <code>instant</code>.
     *            </p>
     */
    public void setCapacityReservationOptions(CapacityReservationOptions capacityReservationOptions) {
        this.capacityReservationOptions = capacityReservationOptions;
    }

    /**
     * <p>
     * The strategy for using unused Capacity Reservations for fulfilling
     * On-Demand capacity. Supported only for fleets of type
     * <code>instant</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param capacityReservationOptions <p>
     *            The strategy for using unused Capacity Reservations for
     *            fulfilling On-Demand capacity. Supported only for fleets of
     *            type <code>instant</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OnDemandOptions withCapacityReservationOptions(
            CapacityReservationOptions capacityReservationOptions) {
        this.capacityReservationOptions = capacityReservationOptions;
        return this;
    }

    /**
     * <p>
     * Indicates that the fleet uses a single instance type to launch all
     * On-Demand Instances in the fleet. Supported only for fleets of type
     * <code>instant</code>.
     * </p>
     *
     * @return <p>
     *         Indicates that the fleet uses a single instance type to launch
     *         all On-Demand Instances in the fleet. Supported only for fleets
     *         of type <code>instant</code>.
     *         </p>
     */
    public Boolean isSingleInstanceType() {
        return singleInstanceType;
    }

    /**
     * <p>
     * Indicates that the fleet uses a single instance type to launch all
     * On-Demand Instances in the fleet. Supported only for fleets of type
     * <code>instant</code>.
     * </p>
     *
     * @return <p>
     *         Indicates that the fleet uses a single instance type to launch
     *         all On-Demand Instances in the fleet. Supported only for fleets
     *         of type <code>instant</code>.
     *         </p>
     */
    public Boolean getSingleInstanceType() {
        return singleInstanceType;
    }

    /**
     * <p>
     * Indicates that the fleet uses a single instance type to launch all
     * On-Demand Instances in the fleet. Supported only for fleets of type
     * <code>instant</code>.
     * </p>
     *
     * @param singleInstanceType <p>
     *            Indicates that the fleet uses a single instance type to launch
     *            all On-Demand Instances in the fleet. Supported only for
     *            fleets of type <code>instant</code>.
     *            </p>
     */
    public void setSingleInstanceType(Boolean singleInstanceType) {
        this.singleInstanceType = singleInstanceType;
    }

    /**
     * <p>
     * Indicates that the fleet uses a single instance type to launch all
     * On-Demand Instances in the fleet. Supported only for fleets of type
     * <code>instant</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param singleInstanceType <p>
     *            Indicates that the fleet uses a single instance type to launch
     *            all On-Demand Instances in the fleet. Supported only for
     *            fleets of type <code>instant</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OnDemandOptions withSingleInstanceType(Boolean singleInstanceType) {
        this.singleInstanceType = singleInstanceType;
        return this;
    }

    /**
     * <p>
     * Indicates that the fleet launches all On-Demand Instances into a single
     * Availability Zone. Supported only for fleets of type <code>instant</code>
     * .
     * </p>
     *
     * @return <p>
     *         Indicates that the fleet launches all On-Demand Instances into a
     *         single Availability Zone. Supported only for fleets of type
     *         <code>instant</code>.
     *         </p>
     */
    public Boolean isSingleAvailabilityZone() {
        return singleAvailabilityZone;
    }

    /**
     * <p>
     * Indicates that the fleet launches all On-Demand Instances into a single
     * Availability Zone. Supported only for fleets of type <code>instant</code>
     * .
     * </p>
     *
     * @return <p>
     *         Indicates that the fleet launches all On-Demand Instances into a
     *         single Availability Zone. Supported only for fleets of type
     *         <code>instant</code>.
     *         </p>
     */
    public Boolean getSingleAvailabilityZone() {
        return singleAvailabilityZone;
    }

    /**
     * <p>
     * Indicates that the fleet launches all On-Demand Instances into a single
     * Availability Zone. Supported only for fleets of type <code>instant</code>
     * .
     * </p>
     *
     * @param singleAvailabilityZone <p>
     *            Indicates that the fleet launches all On-Demand Instances into
     *            a single Availability Zone. Supported only for fleets of type
     *            <code>instant</code>.
     *            </p>
     */
    public void setSingleAvailabilityZone(Boolean singleAvailabilityZone) {
        this.singleAvailabilityZone = singleAvailabilityZone;
    }

    /**
     * <p>
     * Indicates that the fleet launches all On-Demand Instances into a single
     * Availability Zone. Supported only for fleets of type <code>instant</code>
     * .
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param singleAvailabilityZone <p>
     *            Indicates that the fleet launches all On-Demand Instances into
     *            a single Availability Zone. Supported only for fleets of type
     *            <code>instant</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OnDemandOptions withSingleAvailabilityZone(Boolean singleAvailabilityZone) {
        this.singleAvailabilityZone = singleAvailabilityZone;
        return this;
    }

    /**
     * <p>
     * The minimum target capacity for On-Demand Instances in the fleet. If the
     * minimum target capacity is not reached, the fleet launches no instances.
     * </p>
     *
     * @return <p>
     *         The minimum target capacity for On-Demand Instances in the fleet.
     *         If the minimum target capacity is not reached, the fleet launches
     *         no instances.
     *         </p>
     */
    public Integer getMinTargetCapacity() {
        return minTargetCapacity;
    }

    /**
     * <p>
     * The minimum target capacity for On-Demand Instances in the fleet. If the
     * minimum target capacity is not reached, the fleet launches no instances.
     * </p>
     *
     * @param minTargetCapacity <p>
     *            The minimum target capacity for On-Demand Instances in the
     *            fleet. If the minimum target capacity is not reached, the
     *            fleet launches no instances.
     *            </p>
     */
    public void setMinTargetCapacity(Integer minTargetCapacity) {
        this.minTargetCapacity = minTargetCapacity;
    }

    /**
     * <p>
     * The minimum target capacity for On-Demand Instances in the fleet. If the
     * minimum target capacity is not reached, the fleet launches no instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param minTargetCapacity <p>
     *            The minimum target capacity for On-Demand Instances in the
     *            fleet. If the minimum target capacity is not reached, the
     *            fleet launches no instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OnDemandOptions withMinTargetCapacity(Integer minTargetCapacity) {
        this.minTargetCapacity = minTargetCapacity;
        return this;
    }

    /**
     * <p>
     * The maximum amount per hour for On-Demand Instances that you're willing
     * to pay.
     * </p>
     *
     * @return <p>
     *         The maximum amount per hour for On-Demand Instances that you're
     *         willing to pay.
     *         </p>
     */
    public String getMaxTotalPrice() {
        return maxTotalPrice;
    }

    /**
     * <p>
     * The maximum amount per hour for On-Demand Instances that you're willing
     * to pay.
     * </p>
     *
     * @param maxTotalPrice <p>
     *            The maximum amount per hour for On-Demand Instances that
     *            you're willing to pay.
     *            </p>
     */
    public void setMaxTotalPrice(String maxTotalPrice) {
        this.maxTotalPrice = maxTotalPrice;
    }

    /**
     * <p>
     * The maximum amount per hour for On-Demand Instances that you're willing
     * to pay.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxTotalPrice <p>
     *            The maximum amount per hour for On-Demand Instances that
     *            you're willing to pay.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OnDemandOptions withMaxTotalPrice(String maxTotalPrice) {
        this.maxTotalPrice = maxTotalPrice;
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
        if (getAllocationStrategy() != null)
            sb.append("AllocationStrategy: " + getAllocationStrategy() + ",");
        if (getCapacityReservationOptions() != null)
            sb.append("CapacityReservationOptions: " + getCapacityReservationOptions() + ",");
        if (getSingleInstanceType() != null)
            sb.append("SingleInstanceType: " + getSingleInstanceType() + ",");
        if (getSingleAvailabilityZone() != null)
            sb.append("SingleAvailabilityZone: " + getSingleAvailabilityZone() + ",");
        if (getMinTargetCapacity() != null)
            sb.append("MinTargetCapacity: " + getMinTargetCapacity() + ",");
        if (getMaxTotalPrice() != null)
            sb.append("MaxTotalPrice: " + getMaxTotalPrice());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAllocationStrategy() == null) ? 0 : getAllocationStrategy().hashCode());
        hashCode = prime
                * hashCode
                + ((getCapacityReservationOptions() == null) ? 0 : getCapacityReservationOptions()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getSingleInstanceType() == null) ? 0 : getSingleInstanceType().hashCode());
        hashCode = prime
                * hashCode
                + ((getSingleAvailabilityZone() == null) ? 0 : getSingleAvailabilityZone()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getMinTargetCapacity() == null) ? 0 : getMinTargetCapacity().hashCode());
        hashCode = prime * hashCode
                + ((getMaxTotalPrice() == null) ? 0 : getMaxTotalPrice().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OnDemandOptions == false)
            return false;
        OnDemandOptions other = (OnDemandOptions) obj;

        if (other.getAllocationStrategy() == null ^ this.getAllocationStrategy() == null)
            return false;
        if (other.getAllocationStrategy() != null
                && other.getAllocationStrategy().equals(this.getAllocationStrategy()) == false)
            return false;
        if (other.getCapacityReservationOptions() == null
                ^ this.getCapacityReservationOptions() == null)
            return false;
        if (other.getCapacityReservationOptions() != null
                && other.getCapacityReservationOptions().equals(
                        this.getCapacityReservationOptions()) == false)
            return false;
        if (other.getSingleInstanceType() == null ^ this.getSingleInstanceType() == null)
            return false;
        if (other.getSingleInstanceType() != null
                && other.getSingleInstanceType().equals(this.getSingleInstanceType()) == false)
            return false;
        if (other.getSingleAvailabilityZone() == null ^ this.getSingleAvailabilityZone() == null)
            return false;
        if (other.getSingleAvailabilityZone() != null
                && other.getSingleAvailabilityZone().equals(this.getSingleAvailabilityZone()) == false)
            return false;
        if (other.getMinTargetCapacity() == null ^ this.getMinTargetCapacity() == null)
            return false;
        if (other.getMinTargetCapacity() != null
                && other.getMinTargetCapacity().equals(this.getMinTargetCapacity()) == false)
            return false;
        if (other.getMaxTotalPrice() == null ^ this.getMaxTotalPrice() == null)
            return false;
        if (other.getMaxTotalPrice() != null
                && other.getMaxTotalPrice().equals(this.getMaxTotalPrice()) == false)
            return false;
        return true;
    }
}
