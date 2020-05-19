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
 * Describes the strategy for using unused Capacity Reservations for fulfilling
 * On-Demand capacity.
 * </p>
 * <note>
 * <p>
 * This strategy can only be used if the EC2 Fleet is of type
 * <code>instant</code>.
 * </p>
 * </note>
 * <p>
 * For more information about Capacity Reservations, see <a href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-capacity-reservations.html"
 * >On-Demand Capacity Reservations</a> in the <i>Amazon Elastic Compute Cloud
 * User Guide</i>. For examples of using Capacity Reservations in an EC2 Fleet,
 * see <a href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-fleet-examples.html"
 * >EC2 Fleet Example Configurations</a> in the <i>Amazon Elastic Compute Cloud
 * User Guide</i>.
 * </p>
 */
public class CapacityReservationOptionsRequest implements Serializable {
    /**
     * <p>
     * Indicates whether to use unused Capacity Reservations for fulfilling
     * On-Demand capacity.
     * </p>
     * <p>
     * If you specify <code>use-capacity-reservations-first</code>, the fleet
     * uses unused Capacity Reservations to fulfill On-Demand capacity up to the
     * target On-Demand capacity. If multiple instance pools have unused
     * Capacity Reservations, the On-Demand allocation strategy (
     * <code>lowest-price</code> or <code>prioritized</code>) is applied. If the
     * number of unused Capacity Reservations is less than the On-Demand target
     * capacity, the remaining On-Demand target capacity is launched according
     * to the On-Demand allocation strategy (<code>lowest-price</code> or
     * <code>prioritized</code>).
     * </p>
     * <p>
     * If you do not specify a value, the fleet fulfils the On-Demand capacity
     * according to the chosen On-Demand allocation strategy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>use-capacity-reservations-first
     */
    private String usageStrategy;

    /**
     * <p>
     * Indicates whether to use unused Capacity Reservations for fulfilling
     * On-Demand capacity.
     * </p>
     * <p>
     * If you specify <code>use-capacity-reservations-first</code>, the fleet
     * uses unused Capacity Reservations to fulfill On-Demand capacity up to the
     * target On-Demand capacity. If multiple instance pools have unused
     * Capacity Reservations, the On-Demand allocation strategy (
     * <code>lowest-price</code> or <code>prioritized</code>) is applied. If the
     * number of unused Capacity Reservations is less than the On-Demand target
     * capacity, the remaining On-Demand target capacity is launched according
     * to the On-Demand allocation strategy (<code>lowest-price</code> or
     * <code>prioritized</code>).
     * </p>
     * <p>
     * If you do not specify a value, the fleet fulfils the On-Demand capacity
     * according to the chosen On-Demand allocation strategy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>use-capacity-reservations-first
     *
     * @return <p>
     *         Indicates whether to use unused Capacity Reservations for
     *         fulfilling On-Demand capacity.
     *         </p>
     *         <p>
     *         If you specify <code>use-capacity-reservations-first</code>, the
     *         fleet uses unused Capacity Reservations to fulfill On-Demand
     *         capacity up to the target On-Demand capacity. If multiple
     *         instance pools have unused Capacity Reservations, the On-Demand
     *         allocation strategy (<code>lowest-price</code> or
     *         <code>prioritized</code>) is applied. If the number of unused
     *         Capacity Reservations is less than the On-Demand target capacity,
     *         the remaining On-Demand target capacity is launched according to
     *         the On-Demand allocation strategy (<code>lowest-price</code> or
     *         <code>prioritized</code>).
     *         </p>
     *         <p>
     *         If you do not specify a value, the fleet fulfils the On-Demand
     *         capacity according to the chosen On-Demand allocation strategy.
     *         </p>
     * @see FleetCapacityReservationUsageStrategy
     */
    public String getUsageStrategy() {
        return usageStrategy;
    }

    /**
     * <p>
     * Indicates whether to use unused Capacity Reservations for fulfilling
     * On-Demand capacity.
     * </p>
     * <p>
     * If you specify <code>use-capacity-reservations-first</code>, the fleet
     * uses unused Capacity Reservations to fulfill On-Demand capacity up to the
     * target On-Demand capacity. If multiple instance pools have unused
     * Capacity Reservations, the On-Demand allocation strategy (
     * <code>lowest-price</code> or <code>prioritized</code>) is applied. If the
     * number of unused Capacity Reservations is less than the On-Demand target
     * capacity, the remaining On-Demand target capacity is launched according
     * to the On-Demand allocation strategy (<code>lowest-price</code> or
     * <code>prioritized</code>).
     * </p>
     * <p>
     * If you do not specify a value, the fleet fulfils the On-Demand capacity
     * according to the chosen On-Demand allocation strategy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>use-capacity-reservations-first
     *
     * @param usageStrategy <p>
     *            Indicates whether to use unused Capacity Reservations for
     *            fulfilling On-Demand capacity.
     *            </p>
     *            <p>
     *            If you specify <code>use-capacity-reservations-first</code>,
     *            the fleet uses unused Capacity Reservations to fulfill
     *            On-Demand capacity up to the target On-Demand capacity. If
     *            multiple instance pools have unused Capacity Reservations, the
     *            On-Demand allocation strategy (<code>lowest-price</code> or
     *            <code>prioritized</code>) is applied. If the number of unused
     *            Capacity Reservations is less than the On-Demand target
     *            capacity, the remaining On-Demand target capacity is launched
     *            according to the On-Demand allocation strategy (
     *            <code>lowest-price</code> or <code>prioritized</code>).
     *            </p>
     *            <p>
     *            If you do not specify a value, the fleet fulfils the On-Demand
     *            capacity according to the chosen On-Demand allocation
     *            strategy.
     *            </p>
     * @see FleetCapacityReservationUsageStrategy
     */
    public void setUsageStrategy(String usageStrategy) {
        this.usageStrategy = usageStrategy;
    }

    /**
     * <p>
     * Indicates whether to use unused Capacity Reservations for fulfilling
     * On-Demand capacity.
     * </p>
     * <p>
     * If you specify <code>use-capacity-reservations-first</code>, the fleet
     * uses unused Capacity Reservations to fulfill On-Demand capacity up to the
     * target On-Demand capacity. If multiple instance pools have unused
     * Capacity Reservations, the On-Demand allocation strategy (
     * <code>lowest-price</code> or <code>prioritized</code>) is applied. If the
     * number of unused Capacity Reservations is less than the On-Demand target
     * capacity, the remaining On-Demand target capacity is launched according
     * to the On-Demand allocation strategy (<code>lowest-price</code> or
     * <code>prioritized</code>).
     * </p>
     * <p>
     * If you do not specify a value, the fleet fulfils the On-Demand capacity
     * according to the chosen On-Demand allocation strategy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>use-capacity-reservations-first
     *
     * @param usageStrategy <p>
     *            Indicates whether to use unused Capacity Reservations for
     *            fulfilling On-Demand capacity.
     *            </p>
     *            <p>
     *            If you specify <code>use-capacity-reservations-first</code>,
     *            the fleet uses unused Capacity Reservations to fulfill
     *            On-Demand capacity up to the target On-Demand capacity. If
     *            multiple instance pools have unused Capacity Reservations, the
     *            On-Demand allocation strategy (<code>lowest-price</code> or
     *            <code>prioritized</code>) is applied. If the number of unused
     *            Capacity Reservations is less than the On-Demand target
     *            capacity, the remaining On-Demand target capacity is launched
     *            according to the On-Demand allocation strategy (
     *            <code>lowest-price</code> or <code>prioritized</code>).
     *            </p>
     *            <p>
     *            If you do not specify a value, the fleet fulfils the On-Demand
     *            capacity according to the chosen On-Demand allocation
     *            strategy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FleetCapacityReservationUsageStrategy
     */
    public CapacityReservationOptionsRequest withUsageStrategy(String usageStrategy) {
        this.usageStrategy = usageStrategy;
        return this;
    }

    /**
     * <p>
     * Indicates whether to use unused Capacity Reservations for fulfilling
     * On-Demand capacity.
     * </p>
     * <p>
     * If you specify <code>use-capacity-reservations-first</code>, the fleet
     * uses unused Capacity Reservations to fulfill On-Demand capacity up to the
     * target On-Demand capacity. If multiple instance pools have unused
     * Capacity Reservations, the On-Demand allocation strategy (
     * <code>lowest-price</code> or <code>prioritized</code>) is applied. If the
     * number of unused Capacity Reservations is less than the On-Demand target
     * capacity, the remaining On-Demand target capacity is launched according
     * to the On-Demand allocation strategy (<code>lowest-price</code> or
     * <code>prioritized</code>).
     * </p>
     * <p>
     * If you do not specify a value, the fleet fulfils the On-Demand capacity
     * according to the chosen On-Demand allocation strategy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>use-capacity-reservations-first
     *
     * @param usageStrategy <p>
     *            Indicates whether to use unused Capacity Reservations for
     *            fulfilling On-Demand capacity.
     *            </p>
     *            <p>
     *            If you specify <code>use-capacity-reservations-first</code>,
     *            the fleet uses unused Capacity Reservations to fulfill
     *            On-Demand capacity up to the target On-Demand capacity. If
     *            multiple instance pools have unused Capacity Reservations, the
     *            On-Demand allocation strategy (<code>lowest-price</code> or
     *            <code>prioritized</code>) is applied. If the number of unused
     *            Capacity Reservations is less than the On-Demand target
     *            capacity, the remaining On-Demand target capacity is launched
     *            according to the On-Demand allocation strategy (
     *            <code>lowest-price</code> or <code>prioritized</code>).
     *            </p>
     *            <p>
     *            If you do not specify a value, the fleet fulfils the On-Demand
     *            capacity according to the chosen On-Demand allocation
     *            strategy.
     *            </p>
     * @see FleetCapacityReservationUsageStrategy
     */
    public void setUsageStrategy(FleetCapacityReservationUsageStrategy usageStrategy) {
        this.usageStrategy = usageStrategy.toString();
    }

    /**
     * <p>
     * Indicates whether to use unused Capacity Reservations for fulfilling
     * On-Demand capacity.
     * </p>
     * <p>
     * If you specify <code>use-capacity-reservations-first</code>, the fleet
     * uses unused Capacity Reservations to fulfill On-Demand capacity up to the
     * target On-Demand capacity. If multiple instance pools have unused
     * Capacity Reservations, the On-Demand allocation strategy (
     * <code>lowest-price</code> or <code>prioritized</code>) is applied. If the
     * number of unused Capacity Reservations is less than the On-Demand target
     * capacity, the remaining On-Demand target capacity is launched according
     * to the On-Demand allocation strategy (<code>lowest-price</code> or
     * <code>prioritized</code>).
     * </p>
     * <p>
     * If you do not specify a value, the fleet fulfils the On-Demand capacity
     * according to the chosen On-Demand allocation strategy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>use-capacity-reservations-first
     *
     * @param usageStrategy <p>
     *            Indicates whether to use unused Capacity Reservations for
     *            fulfilling On-Demand capacity.
     *            </p>
     *            <p>
     *            If you specify <code>use-capacity-reservations-first</code>,
     *            the fleet uses unused Capacity Reservations to fulfill
     *            On-Demand capacity up to the target On-Demand capacity. If
     *            multiple instance pools have unused Capacity Reservations, the
     *            On-Demand allocation strategy (<code>lowest-price</code> or
     *            <code>prioritized</code>) is applied. If the number of unused
     *            Capacity Reservations is less than the On-Demand target
     *            capacity, the remaining On-Demand target capacity is launched
     *            according to the On-Demand allocation strategy (
     *            <code>lowest-price</code> or <code>prioritized</code>).
     *            </p>
     *            <p>
     *            If you do not specify a value, the fleet fulfils the On-Demand
     *            capacity according to the chosen On-Demand allocation
     *            strategy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FleetCapacityReservationUsageStrategy
     */
    public CapacityReservationOptionsRequest withUsageStrategy(
            FleetCapacityReservationUsageStrategy usageStrategy) {
        this.usageStrategy = usageStrategy.toString();
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
        if (getUsageStrategy() != null)
            sb.append("UsageStrategy: " + getUsageStrategy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getUsageStrategy() == null) ? 0 : getUsageStrategy().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CapacityReservationOptionsRequest == false)
            return false;
        CapacityReservationOptionsRequest other = (CapacityReservationOptionsRequest) obj;

        if (other.getUsageStrategy() == null ^ this.getUsageStrategy() == null)
            return false;
        if (other.getUsageStrategy() != null
                && other.getUsageStrategy().equals(this.getUsageStrategy()) == false)
            return false;
        return true;
    }
}
