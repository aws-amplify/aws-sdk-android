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
 * The launch specification for Spot instances in the fleet, which determines
 * the defined duration, provisioning timeout behavior, and allocation strategy.
 * </p>
 * <note>
 * <p>
 * The instance fleet configuration is available only in Amazon EMR versions
 * 4.8.0 and later, excluding 5.0.x versions. On-Demand and Spot instance
 * allocation strategies are available in Amazon EMR version 5.12.1 and later.
 * </p>
 * </note>
 */
public class InstanceFleetProvisioningSpecifications implements Serializable {
    /**
     * <p>
     * The launch specification for Spot instances in the fleet, which
     * determines the defined duration, provisioning timeout behavior, and
     * allocation strategy.
     * </p>
     */
    private SpotProvisioningSpecification spotSpecification;

    /**
     * <p>
     * The launch specification for On-Demand instances in the instance fleet,
     * which determines the allocation strategy.
     * </p>
     * <note>
     * <p>
     * The instance fleet configuration is available only in Amazon EMR versions
     * 4.8.0 and later, excluding 5.0.x versions. On-Demand instances allocation
     * strategy is available in Amazon EMR version 5.12.1 and later.
     * </p>
     * </note>
     */
    private OnDemandProvisioningSpecification onDemandSpecification;

    /**
     * <p>
     * The launch specification for Spot instances in the fleet, which
     * determines the defined duration, provisioning timeout behavior, and
     * allocation strategy.
     * </p>
     *
     * @return <p>
     *         The launch specification for Spot instances in the fleet, which
     *         determines the defined duration, provisioning timeout behavior,
     *         and allocation strategy.
     *         </p>
     */
    public SpotProvisioningSpecification getSpotSpecification() {
        return spotSpecification;
    }

    /**
     * <p>
     * The launch specification for Spot instances in the fleet, which
     * determines the defined duration, provisioning timeout behavior, and
     * allocation strategy.
     * </p>
     *
     * @param spotSpecification <p>
     *            The launch specification for Spot instances in the fleet,
     *            which determines the defined duration, provisioning timeout
     *            behavior, and allocation strategy.
     *            </p>
     */
    public void setSpotSpecification(SpotProvisioningSpecification spotSpecification) {
        this.spotSpecification = spotSpecification;
    }

    /**
     * <p>
     * The launch specification for Spot instances in the fleet, which
     * determines the defined duration, provisioning timeout behavior, and
     * allocation strategy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param spotSpecification <p>
     *            The launch specification for Spot instances in the fleet,
     *            which determines the defined duration, provisioning timeout
     *            behavior, and allocation strategy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceFleetProvisioningSpecifications withSpotSpecification(
            SpotProvisioningSpecification spotSpecification) {
        this.spotSpecification = spotSpecification;
        return this;
    }

    /**
     * <p>
     * The launch specification for On-Demand instances in the instance fleet,
     * which determines the allocation strategy.
     * </p>
     * <note>
     * <p>
     * The instance fleet configuration is available only in Amazon EMR versions
     * 4.8.0 and later, excluding 5.0.x versions. On-Demand instances allocation
     * strategy is available in Amazon EMR version 5.12.1 and later.
     * </p>
     * </note>
     *
     * @return <p>
     *         The launch specification for On-Demand instances in the instance
     *         fleet, which determines the allocation strategy.
     *         </p>
     *         <note>
     *         <p>
     *         The instance fleet configuration is available only in Amazon EMR
     *         versions 4.8.0 and later, excluding 5.0.x versions. On-Demand
     *         instances allocation strategy is available in Amazon EMR version
     *         5.12.1 and later.
     *         </p>
     *         </note>
     */
    public OnDemandProvisioningSpecification getOnDemandSpecification() {
        return onDemandSpecification;
    }

    /**
     * <p>
     * The launch specification for On-Demand instances in the instance fleet,
     * which determines the allocation strategy.
     * </p>
     * <note>
     * <p>
     * The instance fleet configuration is available only in Amazon EMR versions
     * 4.8.0 and later, excluding 5.0.x versions. On-Demand instances allocation
     * strategy is available in Amazon EMR version 5.12.1 and later.
     * </p>
     * </note>
     *
     * @param onDemandSpecification <p>
     *            The launch specification for On-Demand instances in the
     *            instance fleet, which determines the allocation strategy.
     *            </p>
     *            <note>
     *            <p>
     *            The instance fleet configuration is available only in Amazon
     *            EMR versions 4.8.0 and later, excluding 5.0.x versions.
     *            On-Demand instances allocation strategy is available in Amazon
     *            EMR version 5.12.1 and later.
     *            </p>
     *            </note>
     */
    public void setOnDemandSpecification(OnDemandProvisioningSpecification onDemandSpecification) {
        this.onDemandSpecification = onDemandSpecification;
    }

    /**
     * <p>
     * The launch specification for On-Demand instances in the instance fleet,
     * which determines the allocation strategy.
     * </p>
     * <note>
     * <p>
     * The instance fleet configuration is available only in Amazon EMR versions
     * 4.8.0 and later, excluding 5.0.x versions. On-Demand instances allocation
     * strategy is available in Amazon EMR version 5.12.1 and later.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param onDemandSpecification <p>
     *            The launch specification for On-Demand instances in the
     *            instance fleet, which determines the allocation strategy.
     *            </p>
     *            <note>
     *            <p>
     *            The instance fleet configuration is available only in Amazon
     *            EMR versions 4.8.0 and later, excluding 5.0.x versions.
     *            On-Demand instances allocation strategy is available in Amazon
     *            EMR version 5.12.1 and later.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceFleetProvisioningSpecifications withOnDemandSpecification(
            OnDemandProvisioningSpecification onDemandSpecification) {
        this.onDemandSpecification = onDemandSpecification;
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
        if (getSpotSpecification() != null)
            sb.append("SpotSpecification: " + getSpotSpecification() + ",");
        if (getOnDemandSpecification() != null)
            sb.append("OnDemandSpecification: " + getOnDemandSpecification());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSpotSpecification() == null) ? 0 : getSpotSpecification().hashCode());
        hashCode = prime
                * hashCode
                + ((getOnDemandSpecification() == null) ? 0 : getOnDemandSpecification().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceFleetProvisioningSpecifications == false)
            return false;
        InstanceFleetProvisioningSpecifications other = (InstanceFleetProvisioningSpecifications) obj;

        if (other.getSpotSpecification() == null ^ this.getSpotSpecification() == null)
            return false;
        if (other.getSpotSpecification() != null
                && other.getSpotSpecification().equals(this.getSpotSpecification()) == false)
            return false;
        if (other.getOnDemandSpecification() == null ^ this.getOnDemandSpecification() == null)
            return false;
        if (other.getOnDemandSpecification() != null
                && other.getOnDemandSpecification().equals(this.getOnDemandSpecification()) == false)
            return false;
        return true;
    }
}
