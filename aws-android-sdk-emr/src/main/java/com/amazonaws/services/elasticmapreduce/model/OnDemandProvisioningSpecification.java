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

package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;

/**
 * <p>
 * The launch specification for On-Demand instances in the instance fleet, which
 * determines the allocation strategy.
 * </p>
 * <note>
 * <p>
 * The instance fleet configuration is available only in Amazon EMR versions
 * 4.8.0 and later, excluding 5.0.x versions. On-Demand instances allocation
 * strategy is available in Amazon EMR version 5.12.1 and later.
 * </p>
 * </note>
 */
public class OnDemandProvisioningSpecification implements Serializable {
    /**
     * <p>
     * Specifies the strategy to use in launching On-Demand instance fleets.
     * Currently, the only option is lowest-price (the default), which launches
     * the lowest price first.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>lowest-price
     */
    private String allocationStrategy;

    /**
     * <p>
     * Specifies the strategy to use in launching On-Demand instance fleets.
     * Currently, the only option is lowest-price (the default), which launches
     * the lowest price first.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>lowest-price
     *
     * @return <p>
     *         Specifies the strategy to use in launching On-Demand instance
     *         fleets. Currently, the only option is lowest-price (the default),
     *         which launches the lowest price first.
     *         </p>
     * @see OnDemandProvisioningAllocationStrategy
     */
    public String getAllocationStrategy() {
        return allocationStrategy;
    }

    /**
     * <p>
     * Specifies the strategy to use in launching On-Demand instance fleets.
     * Currently, the only option is lowest-price (the default), which launches
     * the lowest price first.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>lowest-price
     *
     * @param allocationStrategy <p>
     *            Specifies the strategy to use in launching On-Demand instance
     *            fleets. Currently, the only option is lowest-price (the
     *            default), which launches the lowest price first.
     *            </p>
     * @see OnDemandProvisioningAllocationStrategy
     */
    public void setAllocationStrategy(String allocationStrategy) {
        this.allocationStrategy = allocationStrategy;
    }

    /**
     * <p>
     * Specifies the strategy to use in launching On-Demand instance fleets.
     * Currently, the only option is lowest-price (the default), which launches
     * the lowest price first.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>lowest-price
     *
     * @param allocationStrategy <p>
     *            Specifies the strategy to use in launching On-Demand instance
     *            fleets. Currently, the only option is lowest-price (the
     *            default), which launches the lowest price first.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OnDemandProvisioningAllocationStrategy
     */
    public OnDemandProvisioningSpecification withAllocationStrategy(String allocationStrategy) {
        this.allocationStrategy = allocationStrategy;
        return this;
    }

    /**
     * <p>
     * Specifies the strategy to use in launching On-Demand instance fleets.
     * Currently, the only option is lowest-price (the default), which launches
     * the lowest price first.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>lowest-price
     *
     * @param allocationStrategy <p>
     *            Specifies the strategy to use in launching On-Demand instance
     *            fleets. Currently, the only option is lowest-price (the
     *            default), which launches the lowest price first.
     *            </p>
     * @see OnDemandProvisioningAllocationStrategy
     */
    public void setAllocationStrategy(OnDemandProvisioningAllocationStrategy allocationStrategy) {
        this.allocationStrategy = allocationStrategy.toString();
    }

    /**
     * <p>
     * Specifies the strategy to use in launching On-Demand instance fleets.
     * Currently, the only option is lowest-price (the default), which launches
     * the lowest price first.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>lowest-price
     *
     * @param allocationStrategy <p>
     *            Specifies the strategy to use in launching On-Demand instance
     *            fleets. Currently, the only option is lowest-price (the
     *            default), which launches the lowest price first.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OnDemandProvisioningAllocationStrategy
     */
    public OnDemandProvisioningSpecification withAllocationStrategy(
            OnDemandProvisioningAllocationStrategy allocationStrategy) {
        this.allocationStrategy = allocationStrategy.toString();
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
            sb.append("AllocationStrategy: " + getAllocationStrategy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAllocationStrategy() == null) ? 0 : getAllocationStrategy().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OnDemandProvisioningSpecification == false)
            return false;
        OnDemandProvisioningSpecification other = (OnDemandProvisioningSpecification) obj;

        if (other.getAllocationStrategy() == null ^ this.getAllocationStrategy() == null)
            return false;
        if (other.getAllocationStrategy() != null
                && other.getAllocationStrategy().equals(this.getAllocationStrategy()) == false)
            return false;
        return true;
    }
}
