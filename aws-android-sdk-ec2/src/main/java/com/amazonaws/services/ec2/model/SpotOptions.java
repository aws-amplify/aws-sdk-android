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
 * Describes the configuration of Spot Instances in an EC2 Fleet.
 * </p>
 */
public class SpotOptions implements Serializable {
    /**
     * <p>
     * Indicates how to allocate the target Spot Instance capacity across the
     * Spot Instance pools specified by the EC2 Fleet.
     * </p>
     * <p>
     * If the allocation strategy is <code>lowest-price</code>, EC2 Fleet
     * launches instances from the Spot Instance pools with the lowest price.
     * This is the default allocation strategy.
     * </p>
     * <p>
     * If the allocation strategy is <code>diversified</code>, EC2 Fleet
     * launches instances from all of the Spot Instance pools that you specify.
     * </p>
     * <p>
     * If the allocation strategy is <code>capacity-optimized</code>, EC2 Fleet
     * launches instances from Spot Instance pools with optimal capacity for the
     * number of instances that are launching.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>lowest-price, diversified, capacity-optimized
     */
    private String allocationStrategy;

    /**
     * <p>
     * The behavior when a Spot Instance is interrupted. The default is
     * <code>terminate</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>hibernate, stop, terminate
     */
    private String instanceInterruptionBehavior;

    /**
     * <p>
     * The number of Spot pools across which to allocate your target Spot
     * capacity. Valid only when <b>AllocationStrategy</b> is set to
     * <code>lowest-price</code>. EC2 Fleet selects the cheapest Spot pools and
     * evenly allocates your target Spot capacity across the number of Spot
     * pools that you specify.
     * </p>
     */
    private Integer instancePoolsToUseCount;

    /**
     * <p>
     * Indicates that the fleet uses a single instance type to launch all Spot
     * Instances in the fleet. Supported only for fleets of type
     * <code>instant</code>.
     * </p>
     */
    private Boolean singleInstanceType;

    /**
     * <p>
     * Indicates that the fleet launches all Spot Instances into a single
     * Availability Zone. Supported only for fleets of type <code>instant</code>
     * .
     * </p>
     */
    private Boolean singleAvailabilityZone;

    /**
     * <p>
     * The minimum target capacity for Spot Instances in the fleet. If the
     * minimum target capacity is not reached, the fleet launches no instances.
     * </p>
     */
    private Integer minTargetCapacity;

    /**
     * <p>
     * The maximum amount per hour for Spot Instances that you're willing to
     * pay.
     * </p>
     */
    private String maxTotalPrice;

    /**
     * <p>
     * Indicates how to allocate the target Spot Instance capacity across the
     * Spot Instance pools specified by the EC2 Fleet.
     * </p>
     * <p>
     * If the allocation strategy is <code>lowest-price</code>, EC2 Fleet
     * launches instances from the Spot Instance pools with the lowest price.
     * This is the default allocation strategy.
     * </p>
     * <p>
     * If the allocation strategy is <code>diversified</code>, EC2 Fleet
     * launches instances from all of the Spot Instance pools that you specify.
     * </p>
     * <p>
     * If the allocation strategy is <code>capacity-optimized</code>, EC2 Fleet
     * launches instances from Spot Instance pools with optimal capacity for the
     * number of instances that are launching.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>lowest-price, diversified, capacity-optimized
     *
     * @return <p>
     *         Indicates how to allocate the target Spot Instance capacity
     *         across the Spot Instance pools specified by the EC2 Fleet.
     *         </p>
     *         <p>
     *         If the allocation strategy is <code>lowest-price</code>, EC2
     *         Fleet launches instances from the Spot Instance pools with the
     *         lowest price. This is the default allocation strategy.
     *         </p>
     *         <p>
     *         If the allocation strategy is <code>diversified</code>, EC2 Fleet
     *         launches instances from all of the Spot Instance pools that you
     *         specify.
     *         </p>
     *         <p>
     *         If the allocation strategy is <code>capacity-optimized</code>,
     *         EC2 Fleet launches instances from Spot Instance pools with
     *         optimal capacity for the number of instances that are launching.
     *         </p>
     * @see SpotAllocationStrategy
     */
    public String getAllocationStrategy() {
        return allocationStrategy;
    }

    /**
     * <p>
     * Indicates how to allocate the target Spot Instance capacity across the
     * Spot Instance pools specified by the EC2 Fleet.
     * </p>
     * <p>
     * If the allocation strategy is <code>lowest-price</code>, EC2 Fleet
     * launches instances from the Spot Instance pools with the lowest price.
     * This is the default allocation strategy.
     * </p>
     * <p>
     * If the allocation strategy is <code>diversified</code>, EC2 Fleet
     * launches instances from all of the Spot Instance pools that you specify.
     * </p>
     * <p>
     * If the allocation strategy is <code>capacity-optimized</code>, EC2 Fleet
     * launches instances from Spot Instance pools with optimal capacity for the
     * number of instances that are launching.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>lowest-price, diversified, capacity-optimized
     *
     * @param allocationStrategy <p>
     *            Indicates how to allocate the target Spot Instance capacity
     *            across the Spot Instance pools specified by the EC2 Fleet.
     *            </p>
     *            <p>
     *            If the allocation strategy is <code>lowest-price</code>, EC2
     *            Fleet launches instances from the Spot Instance pools with the
     *            lowest price. This is the default allocation strategy.
     *            </p>
     *            <p>
     *            If the allocation strategy is <code>diversified</code>, EC2
     *            Fleet launches instances from all of the Spot Instance pools
     *            that you specify.
     *            </p>
     *            <p>
     *            If the allocation strategy is <code>capacity-optimized</code>,
     *            EC2 Fleet launches instances from Spot Instance pools with
     *            optimal capacity for the number of instances that are
     *            launching.
     *            </p>
     * @see SpotAllocationStrategy
     */
    public void setAllocationStrategy(String allocationStrategy) {
        this.allocationStrategy = allocationStrategy;
    }

    /**
     * <p>
     * Indicates how to allocate the target Spot Instance capacity across the
     * Spot Instance pools specified by the EC2 Fleet.
     * </p>
     * <p>
     * If the allocation strategy is <code>lowest-price</code>, EC2 Fleet
     * launches instances from the Spot Instance pools with the lowest price.
     * This is the default allocation strategy.
     * </p>
     * <p>
     * If the allocation strategy is <code>diversified</code>, EC2 Fleet
     * launches instances from all of the Spot Instance pools that you specify.
     * </p>
     * <p>
     * If the allocation strategy is <code>capacity-optimized</code>, EC2 Fleet
     * launches instances from Spot Instance pools with optimal capacity for the
     * number of instances that are launching.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>lowest-price, diversified, capacity-optimized
     *
     * @param allocationStrategy <p>
     *            Indicates how to allocate the target Spot Instance capacity
     *            across the Spot Instance pools specified by the EC2 Fleet.
     *            </p>
     *            <p>
     *            If the allocation strategy is <code>lowest-price</code>, EC2
     *            Fleet launches instances from the Spot Instance pools with the
     *            lowest price. This is the default allocation strategy.
     *            </p>
     *            <p>
     *            If the allocation strategy is <code>diversified</code>, EC2
     *            Fleet launches instances from all of the Spot Instance pools
     *            that you specify.
     *            </p>
     *            <p>
     *            If the allocation strategy is <code>capacity-optimized</code>,
     *            EC2 Fleet launches instances from Spot Instance pools with
     *            optimal capacity for the number of instances that are
     *            launching.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SpotAllocationStrategy
     */
    public SpotOptions withAllocationStrategy(String allocationStrategy) {
        this.allocationStrategy = allocationStrategy;
        return this;
    }

    /**
     * <p>
     * Indicates how to allocate the target Spot Instance capacity across the
     * Spot Instance pools specified by the EC2 Fleet.
     * </p>
     * <p>
     * If the allocation strategy is <code>lowest-price</code>, EC2 Fleet
     * launches instances from the Spot Instance pools with the lowest price.
     * This is the default allocation strategy.
     * </p>
     * <p>
     * If the allocation strategy is <code>diversified</code>, EC2 Fleet
     * launches instances from all of the Spot Instance pools that you specify.
     * </p>
     * <p>
     * If the allocation strategy is <code>capacity-optimized</code>, EC2 Fleet
     * launches instances from Spot Instance pools with optimal capacity for the
     * number of instances that are launching.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>lowest-price, diversified, capacity-optimized
     *
     * @param allocationStrategy <p>
     *            Indicates how to allocate the target Spot Instance capacity
     *            across the Spot Instance pools specified by the EC2 Fleet.
     *            </p>
     *            <p>
     *            If the allocation strategy is <code>lowest-price</code>, EC2
     *            Fleet launches instances from the Spot Instance pools with the
     *            lowest price. This is the default allocation strategy.
     *            </p>
     *            <p>
     *            If the allocation strategy is <code>diversified</code>, EC2
     *            Fleet launches instances from all of the Spot Instance pools
     *            that you specify.
     *            </p>
     *            <p>
     *            If the allocation strategy is <code>capacity-optimized</code>,
     *            EC2 Fleet launches instances from Spot Instance pools with
     *            optimal capacity for the number of instances that are
     *            launching.
     *            </p>
     * @see SpotAllocationStrategy
     */
    public void setAllocationStrategy(SpotAllocationStrategy allocationStrategy) {
        this.allocationStrategy = allocationStrategy.toString();
    }

    /**
     * <p>
     * Indicates how to allocate the target Spot Instance capacity across the
     * Spot Instance pools specified by the EC2 Fleet.
     * </p>
     * <p>
     * If the allocation strategy is <code>lowest-price</code>, EC2 Fleet
     * launches instances from the Spot Instance pools with the lowest price.
     * This is the default allocation strategy.
     * </p>
     * <p>
     * If the allocation strategy is <code>diversified</code>, EC2 Fleet
     * launches instances from all of the Spot Instance pools that you specify.
     * </p>
     * <p>
     * If the allocation strategy is <code>capacity-optimized</code>, EC2 Fleet
     * launches instances from Spot Instance pools with optimal capacity for the
     * number of instances that are launching.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>lowest-price, diversified, capacity-optimized
     *
     * @param allocationStrategy <p>
     *            Indicates how to allocate the target Spot Instance capacity
     *            across the Spot Instance pools specified by the EC2 Fleet.
     *            </p>
     *            <p>
     *            If the allocation strategy is <code>lowest-price</code>, EC2
     *            Fleet launches instances from the Spot Instance pools with the
     *            lowest price. This is the default allocation strategy.
     *            </p>
     *            <p>
     *            If the allocation strategy is <code>diversified</code>, EC2
     *            Fleet launches instances from all of the Spot Instance pools
     *            that you specify.
     *            </p>
     *            <p>
     *            If the allocation strategy is <code>capacity-optimized</code>,
     *            EC2 Fleet launches instances from Spot Instance pools with
     *            optimal capacity for the number of instances that are
     *            launching.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SpotAllocationStrategy
     */
    public SpotOptions withAllocationStrategy(SpotAllocationStrategy allocationStrategy) {
        this.allocationStrategy = allocationStrategy.toString();
        return this;
    }

    /**
     * <p>
     * The behavior when a Spot Instance is interrupted. The default is
     * <code>terminate</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>hibernate, stop, terminate
     *
     * @return <p>
     *         The behavior when a Spot Instance is interrupted. The default is
     *         <code>terminate</code>.
     *         </p>
     * @see SpotInstanceInterruptionBehavior
     */
    public String getInstanceInterruptionBehavior() {
        return instanceInterruptionBehavior;
    }

    /**
     * <p>
     * The behavior when a Spot Instance is interrupted. The default is
     * <code>terminate</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>hibernate, stop, terminate
     *
     * @param instanceInterruptionBehavior <p>
     *            The behavior when a Spot Instance is interrupted. The default
     *            is <code>terminate</code>.
     *            </p>
     * @see SpotInstanceInterruptionBehavior
     */
    public void setInstanceInterruptionBehavior(String instanceInterruptionBehavior) {
        this.instanceInterruptionBehavior = instanceInterruptionBehavior;
    }

    /**
     * <p>
     * The behavior when a Spot Instance is interrupted. The default is
     * <code>terminate</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>hibernate, stop, terminate
     *
     * @param instanceInterruptionBehavior <p>
     *            The behavior when a Spot Instance is interrupted. The default
     *            is <code>terminate</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SpotInstanceInterruptionBehavior
     */
    public SpotOptions withInstanceInterruptionBehavior(String instanceInterruptionBehavior) {
        this.instanceInterruptionBehavior = instanceInterruptionBehavior;
        return this;
    }

    /**
     * <p>
     * The behavior when a Spot Instance is interrupted. The default is
     * <code>terminate</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>hibernate, stop, terminate
     *
     * @param instanceInterruptionBehavior <p>
     *            The behavior when a Spot Instance is interrupted. The default
     *            is <code>terminate</code>.
     *            </p>
     * @see SpotInstanceInterruptionBehavior
     */
    public void setInstanceInterruptionBehavior(
            SpotInstanceInterruptionBehavior instanceInterruptionBehavior) {
        this.instanceInterruptionBehavior = instanceInterruptionBehavior.toString();
    }

    /**
     * <p>
     * The behavior when a Spot Instance is interrupted. The default is
     * <code>terminate</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>hibernate, stop, terminate
     *
     * @param instanceInterruptionBehavior <p>
     *            The behavior when a Spot Instance is interrupted. The default
     *            is <code>terminate</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SpotInstanceInterruptionBehavior
     */
    public SpotOptions withInstanceInterruptionBehavior(
            SpotInstanceInterruptionBehavior instanceInterruptionBehavior) {
        this.instanceInterruptionBehavior = instanceInterruptionBehavior.toString();
        return this;
    }

    /**
     * <p>
     * The number of Spot pools across which to allocate your target Spot
     * capacity. Valid only when <b>AllocationStrategy</b> is set to
     * <code>lowest-price</code>. EC2 Fleet selects the cheapest Spot pools and
     * evenly allocates your target Spot capacity across the number of Spot
     * pools that you specify.
     * </p>
     *
     * @return <p>
     *         The number of Spot pools across which to allocate your target
     *         Spot capacity. Valid only when <b>AllocationStrategy</b> is set
     *         to <code>lowest-price</code>. EC2 Fleet selects the cheapest Spot
     *         pools and evenly allocates your target Spot capacity across the
     *         number of Spot pools that you specify.
     *         </p>
     */
    public Integer getInstancePoolsToUseCount() {
        return instancePoolsToUseCount;
    }

    /**
     * <p>
     * The number of Spot pools across which to allocate your target Spot
     * capacity. Valid only when <b>AllocationStrategy</b> is set to
     * <code>lowest-price</code>. EC2 Fleet selects the cheapest Spot pools and
     * evenly allocates your target Spot capacity across the number of Spot
     * pools that you specify.
     * </p>
     *
     * @param instancePoolsToUseCount <p>
     *            The number of Spot pools across which to allocate your target
     *            Spot capacity. Valid only when <b>AllocationStrategy</b> is
     *            set to <code>lowest-price</code>. EC2 Fleet selects the
     *            cheapest Spot pools and evenly allocates your target Spot
     *            capacity across the number of Spot pools that you specify.
     *            </p>
     */
    public void setInstancePoolsToUseCount(Integer instancePoolsToUseCount) {
        this.instancePoolsToUseCount = instancePoolsToUseCount;
    }

    /**
     * <p>
     * The number of Spot pools across which to allocate your target Spot
     * capacity. Valid only when <b>AllocationStrategy</b> is set to
     * <code>lowest-price</code>. EC2 Fleet selects the cheapest Spot pools and
     * evenly allocates your target Spot capacity across the number of Spot
     * pools that you specify.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instancePoolsToUseCount <p>
     *            The number of Spot pools across which to allocate your target
     *            Spot capacity. Valid only when <b>AllocationStrategy</b> is
     *            set to <code>lowest-price</code>. EC2 Fleet selects the
     *            cheapest Spot pools and evenly allocates your target Spot
     *            capacity across the number of Spot pools that you specify.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SpotOptions withInstancePoolsToUseCount(Integer instancePoolsToUseCount) {
        this.instancePoolsToUseCount = instancePoolsToUseCount;
        return this;
    }

    /**
     * <p>
     * Indicates that the fleet uses a single instance type to launch all Spot
     * Instances in the fleet. Supported only for fleets of type
     * <code>instant</code>.
     * </p>
     *
     * @return <p>
     *         Indicates that the fleet uses a single instance type to launch
     *         all Spot Instances in the fleet. Supported only for fleets of
     *         type <code>instant</code>.
     *         </p>
     */
    public Boolean isSingleInstanceType() {
        return singleInstanceType;
    }

    /**
     * <p>
     * Indicates that the fleet uses a single instance type to launch all Spot
     * Instances in the fleet. Supported only for fleets of type
     * <code>instant</code>.
     * </p>
     *
     * @return <p>
     *         Indicates that the fleet uses a single instance type to launch
     *         all Spot Instances in the fleet. Supported only for fleets of
     *         type <code>instant</code>.
     *         </p>
     */
    public Boolean getSingleInstanceType() {
        return singleInstanceType;
    }

    /**
     * <p>
     * Indicates that the fleet uses a single instance type to launch all Spot
     * Instances in the fleet. Supported only for fleets of type
     * <code>instant</code>.
     * </p>
     *
     * @param singleInstanceType <p>
     *            Indicates that the fleet uses a single instance type to launch
     *            all Spot Instances in the fleet. Supported only for fleets of
     *            type <code>instant</code>.
     *            </p>
     */
    public void setSingleInstanceType(Boolean singleInstanceType) {
        this.singleInstanceType = singleInstanceType;
    }

    /**
     * <p>
     * Indicates that the fleet uses a single instance type to launch all Spot
     * Instances in the fleet. Supported only for fleets of type
     * <code>instant</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param singleInstanceType <p>
     *            Indicates that the fleet uses a single instance type to launch
     *            all Spot Instances in the fleet. Supported only for fleets of
     *            type <code>instant</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SpotOptions withSingleInstanceType(Boolean singleInstanceType) {
        this.singleInstanceType = singleInstanceType;
        return this;
    }

    /**
     * <p>
     * Indicates that the fleet launches all Spot Instances into a single
     * Availability Zone. Supported only for fleets of type <code>instant</code>
     * .
     * </p>
     *
     * @return <p>
     *         Indicates that the fleet launches all Spot Instances into a
     *         single Availability Zone. Supported only for fleets of type
     *         <code>instant</code>.
     *         </p>
     */
    public Boolean isSingleAvailabilityZone() {
        return singleAvailabilityZone;
    }

    /**
     * <p>
     * Indicates that the fleet launches all Spot Instances into a single
     * Availability Zone. Supported only for fleets of type <code>instant</code>
     * .
     * </p>
     *
     * @return <p>
     *         Indicates that the fleet launches all Spot Instances into a
     *         single Availability Zone. Supported only for fleets of type
     *         <code>instant</code>.
     *         </p>
     */
    public Boolean getSingleAvailabilityZone() {
        return singleAvailabilityZone;
    }

    /**
     * <p>
     * Indicates that the fleet launches all Spot Instances into a single
     * Availability Zone. Supported only for fleets of type <code>instant</code>
     * .
     * </p>
     *
     * @param singleAvailabilityZone <p>
     *            Indicates that the fleet launches all Spot Instances into a
     *            single Availability Zone. Supported only for fleets of type
     *            <code>instant</code>.
     *            </p>
     */
    public void setSingleAvailabilityZone(Boolean singleAvailabilityZone) {
        this.singleAvailabilityZone = singleAvailabilityZone;
    }

    /**
     * <p>
     * Indicates that the fleet launches all Spot Instances into a single
     * Availability Zone. Supported only for fleets of type <code>instant</code>
     * .
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param singleAvailabilityZone <p>
     *            Indicates that the fleet launches all Spot Instances into a
     *            single Availability Zone. Supported only for fleets of type
     *            <code>instant</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SpotOptions withSingleAvailabilityZone(Boolean singleAvailabilityZone) {
        this.singleAvailabilityZone = singleAvailabilityZone;
        return this;
    }

    /**
     * <p>
     * The minimum target capacity for Spot Instances in the fleet. If the
     * minimum target capacity is not reached, the fleet launches no instances.
     * </p>
     *
     * @return <p>
     *         The minimum target capacity for Spot Instances in the fleet. If
     *         the minimum target capacity is not reached, the fleet launches no
     *         instances.
     *         </p>
     */
    public Integer getMinTargetCapacity() {
        return minTargetCapacity;
    }

    /**
     * <p>
     * The minimum target capacity for Spot Instances in the fleet. If the
     * minimum target capacity is not reached, the fleet launches no instances.
     * </p>
     *
     * @param minTargetCapacity <p>
     *            The minimum target capacity for Spot Instances in the fleet.
     *            If the minimum target capacity is not reached, the fleet
     *            launches no instances.
     *            </p>
     */
    public void setMinTargetCapacity(Integer minTargetCapacity) {
        this.minTargetCapacity = minTargetCapacity;
    }

    /**
     * <p>
     * The minimum target capacity for Spot Instances in the fleet. If the
     * minimum target capacity is not reached, the fleet launches no instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param minTargetCapacity <p>
     *            The minimum target capacity for Spot Instances in the fleet.
     *            If the minimum target capacity is not reached, the fleet
     *            launches no instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SpotOptions withMinTargetCapacity(Integer minTargetCapacity) {
        this.minTargetCapacity = minTargetCapacity;
        return this;
    }

    /**
     * <p>
     * The maximum amount per hour for Spot Instances that you're willing to
     * pay.
     * </p>
     *
     * @return <p>
     *         The maximum amount per hour for Spot Instances that you're
     *         willing to pay.
     *         </p>
     */
    public String getMaxTotalPrice() {
        return maxTotalPrice;
    }

    /**
     * <p>
     * The maximum amount per hour for Spot Instances that you're willing to
     * pay.
     * </p>
     *
     * @param maxTotalPrice <p>
     *            The maximum amount per hour for Spot Instances that you're
     *            willing to pay.
     *            </p>
     */
    public void setMaxTotalPrice(String maxTotalPrice) {
        this.maxTotalPrice = maxTotalPrice;
    }

    /**
     * <p>
     * The maximum amount per hour for Spot Instances that you're willing to
     * pay.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxTotalPrice <p>
     *            The maximum amount per hour for Spot Instances that you're
     *            willing to pay.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SpotOptions withMaxTotalPrice(String maxTotalPrice) {
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
        if (getInstanceInterruptionBehavior() != null)
            sb.append("InstanceInterruptionBehavior: " + getInstanceInterruptionBehavior() + ",");
        if (getInstancePoolsToUseCount() != null)
            sb.append("InstancePoolsToUseCount: " + getInstancePoolsToUseCount() + ",");
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
                + ((getInstanceInterruptionBehavior() == null) ? 0
                        : getInstanceInterruptionBehavior().hashCode());
        hashCode = prime
                * hashCode
                + ((getInstancePoolsToUseCount() == null) ? 0 : getInstancePoolsToUseCount()
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

        if (obj instanceof SpotOptions == false)
            return false;
        SpotOptions other = (SpotOptions) obj;

        if (other.getAllocationStrategy() == null ^ this.getAllocationStrategy() == null)
            return false;
        if (other.getAllocationStrategy() != null
                && other.getAllocationStrategy().equals(this.getAllocationStrategy()) == false)
            return false;
        if (other.getInstanceInterruptionBehavior() == null
                ^ this.getInstanceInterruptionBehavior() == null)
            return false;
        if (other.getInstanceInterruptionBehavior() != null
                && other.getInstanceInterruptionBehavior().equals(
                        this.getInstanceInterruptionBehavior()) == false)
            return false;
        if (other.getInstancePoolsToUseCount() == null ^ this.getInstancePoolsToUseCount() == null)
            return false;
        if (other.getInstancePoolsToUseCount() != null
                && other.getInstancePoolsToUseCount().equals(this.getInstancePoolsToUseCount()) == false)
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
