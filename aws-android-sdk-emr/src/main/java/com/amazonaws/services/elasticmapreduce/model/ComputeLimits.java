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
 * The EC2 unit limits for a managed scaling policy. The managed scaling
 * activity of a cluster can not be above or below these limits. The limit only
 * applies to the core and task nodes. The master node cannot be scaled after
 * initial configuration.
 * </p>
 */
public class ComputeLimits implements Serializable {
    /**
     * <p>
     * The unit type used for specifying a managed scaling policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InstanceFleetUnits, Instances, VCPU
     */
    private String unitType;

    /**
     * <p>
     * The lower boundary of EC2 units. It is measured through VCPU cores or
     * instances for instance groups and measured through units for instance
     * fleets. Managed scaling activities are not allowed beyond this boundary.
     * The limit only applies to the core and task nodes. The master node cannot
     * be scaled after initial configuration.
     * </p>
     */
    private Integer minimumCapacityUnits;

    /**
     * <p>
     * The upper boundary of EC2 units. It is measured through VCPU cores or
     * instances for instance groups and measured through units for instance
     * fleets. Managed scaling activities are not allowed beyond this boundary.
     * The limit only applies to the core and task nodes. The master node cannot
     * be scaled after initial configuration.
     * </p>
     */
    private Integer maximumCapacityUnits;

    /**
     * <p>
     * The upper boundary of on-demand EC2 units. It is measured through VCPU
     * cores or instances for instance groups and measured through units for
     * instance fleets. The on-demand units are not allowed to scale beyond this
     * boundary. The limit only applies to the core and task nodes. The master
     * node cannot be scaled after initial configuration.
     * </p>
     */
    private Integer maximumOnDemandCapacityUnits;

    /**
     * <p>
     * The unit type used for specifying a managed scaling policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InstanceFleetUnits, Instances, VCPU
     *
     * @return <p>
     *         The unit type used for specifying a managed scaling policy.
     *         </p>
     * @see ComputeLimitsUnitType
     */
    public String getUnitType() {
        return unitType;
    }

    /**
     * <p>
     * The unit type used for specifying a managed scaling policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InstanceFleetUnits, Instances, VCPU
     *
     * @param unitType <p>
     *            The unit type used for specifying a managed scaling policy.
     *            </p>
     * @see ComputeLimitsUnitType
     */
    public void setUnitType(String unitType) {
        this.unitType = unitType;
    }

    /**
     * <p>
     * The unit type used for specifying a managed scaling policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InstanceFleetUnits, Instances, VCPU
     *
     * @param unitType <p>
     *            The unit type used for specifying a managed scaling policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ComputeLimitsUnitType
     */
    public ComputeLimits withUnitType(String unitType) {
        this.unitType = unitType;
        return this;
    }

    /**
     * <p>
     * The unit type used for specifying a managed scaling policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InstanceFleetUnits, Instances, VCPU
     *
     * @param unitType <p>
     *            The unit type used for specifying a managed scaling policy.
     *            </p>
     * @see ComputeLimitsUnitType
     */
    public void setUnitType(ComputeLimitsUnitType unitType) {
        this.unitType = unitType.toString();
    }

    /**
     * <p>
     * The unit type used for specifying a managed scaling policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InstanceFleetUnits, Instances, VCPU
     *
     * @param unitType <p>
     *            The unit type used for specifying a managed scaling policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ComputeLimitsUnitType
     */
    public ComputeLimits withUnitType(ComputeLimitsUnitType unitType) {
        this.unitType = unitType.toString();
        return this;
    }

    /**
     * <p>
     * The lower boundary of EC2 units. It is measured through VCPU cores or
     * instances for instance groups and measured through units for instance
     * fleets. Managed scaling activities are not allowed beyond this boundary.
     * The limit only applies to the core and task nodes. The master node cannot
     * be scaled after initial configuration.
     * </p>
     *
     * @return <p>
     *         The lower boundary of EC2 units. It is measured through VCPU
     *         cores or instances for instance groups and measured through units
     *         for instance fleets. Managed scaling activities are not allowed
     *         beyond this boundary. The limit only applies to the core and task
     *         nodes. The master node cannot be scaled after initial
     *         configuration.
     *         </p>
     */
    public Integer getMinimumCapacityUnits() {
        return minimumCapacityUnits;
    }

    /**
     * <p>
     * The lower boundary of EC2 units. It is measured through VCPU cores or
     * instances for instance groups and measured through units for instance
     * fleets. Managed scaling activities are not allowed beyond this boundary.
     * The limit only applies to the core and task nodes. The master node cannot
     * be scaled after initial configuration.
     * </p>
     *
     * @param minimumCapacityUnits <p>
     *            The lower boundary of EC2 units. It is measured through VCPU
     *            cores or instances for instance groups and measured through
     *            units for instance fleets. Managed scaling activities are not
     *            allowed beyond this boundary. The limit only applies to the
     *            core and task nodes. The master node cannot be scaled after
     *            initial configuration.
     *            </p>
     */
    public void setMinimumCapacityUnits(Integer minimumCapacityUnits) {
        this.minimumCapacityUnits = minimumCapacityUnits;
    }

    /**
     * <p>
     * The lower boundary of EC2 units. It is measured through VCPU cores or
     * instances for instance groups and measured through units for instance
     * fleets. Managed scaling activities are not allowed beyond this boundary.
     * The limit only applies to the core and task nodes. The master node cannot
     * be scaled after initial configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param minimumCapacityUnits <p>
     *            The lower boundary of EC2 units. It is measured through VCPU
     *            cores or instances for instance groups and measured through
     *            units for instance fleets. Managed scaling activities are not
     *            allowed beyond this boundary. The limit only applies to the
     *            core and task nodes. The master node cannot be scaled after
     *            initial configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ComputeLimits withMinimumCapacityUnits(Integer minimumCapacityUnits) {
        this.minimumCapacityUnits = minimumCapacityUnits;
        return this;
    }

    /**
     * <p>
     * The upper boundary of EC2 units. It is measured through VCPU cores or
     * instances for instance groups and measured through units for instance
     * fleets. Managed scaling activities are not allowed beyond this boundary.
     * The limit only applies to the core and task nodes. The master node cannot
     * be scaled after initial configuration.
     * </p>
     *
     * @return <p>
     *         The upper boundary of EC2 units. It is measured through VCPU
     *         cores or instances for instance groups and measured through units
     *         for instance fleets. Managed scaling activities are not allowed
     *         beyond this boundary. The limit only applies to the core and task
     *         nodes. The master node cannot be scaled after initial
     *         configuration.
     *         </p>
     */
    public Integer getMaximumCapacityUnits() {
        return maximumCapacityUnits;
    }

    /**
     * <p>
     * The upper boundary of EC2 units. It is measured through VCPU cores or
     * instances for instance groups and measured through units for instance
     * fleets. Managed scaling activities are not allowed beyond this boundary.
     * The limit only applies to the core and task nodes. The master node cannot
     * be scaled after initial configuration.
     * </p>
     *
     * @param maximumCapacityUnits <p>
     *            The upper boundary of EC2 units. It is measured through VCPU
     *            cores or instances for instance groups and measured through
     *            units for instance fleets. Managed scaling activities are not
     *            allowed beyond this boundary. The limit only applies to the
     *            core and task nodes. The master node cannot be scaled after
     *            initial configuration.
     *            </p>
     */
    public void setMaximumCapacityUnits(Integer maximumCapacityUnits) {
        this.maximumCapacityUnits = maximumCapacityUnits;
    }

    /**
     * <p>
     * The upper boundary of EC2 units. It is measured through VCPU cores or
     * instances for instance groups and measured through units for instance
     * fleets. Managed scaling activities are not allowed beyond this boundary.
     * The limit only applies to the core and task nodes. The master node cannot
     * be scaled after initial configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maximumCapacityUnits <p>
     *            The upper boundary of EC2 units. It is measured through VCPU
     *            cores or instances for instance groups and measured through
     *            units for instance fleets. Managed scaling activities are not
     *            allowed beyond this boundary. The limit only applies to the
     *            core and task nodes. The master node cannot be scaled after
     *            initial configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ComputeLimits withMaximumCapacityUnits(Integer maximumCapacityUnits) {
        this.maximumCapacityUnits = maximumCapacityUnits;
        return this;
    }

    /**
     * <p>
     * The upper boundary of on-demand EC2 units. It is measured through VCPU
     * cores or instances for instance groups and measured through units for
     * instance fleets. The on-demand units are not allowed to scale beyond this
     * boundary. The limit only applies to the core and task nodes. The master
     * node cannot be scaled after initial configuration.
     * </p>
     *
     * @return <p>
     *         The upper boundary of on-demand EC2 units. It is measured through
     *         VCPU cores or instances for instance groups and measured through
     *         units for instance fleets. The on-demand units are not allowed to
     *         scale beyond this boundary. The limit only applies to the core
     *         and task nodes. The master node cannot be scaled after initial
     *         configuration.
     *         </p>
     */
    public Integer getMaximumOnDemandCapacityUnits() {
        return maximumOnDemandCapacityUnits;
    }

    /**
     * <p>
     * The upper boundary of on-demand EC2 units. It is measured through VCPU
     * cores or instances for instance groups and measured through units for
     * instance fleets. The on-demand units are not allowed to scale beyond this
     * boundary. The limit only applies to the core and task nodes. The master
     * node cannot be scaled after initial configuration.
     * </p>
     *
     * @param maximumOnDemandCapacityUnits <p>
     *            The upper boundary of on-demand EC2 units. It is measured
     *            through VCPU cores or instances for instance groups and
     *            measured through units for instance fleets. The on-demand
     *            units are not allowed to scale beyond this boundary. The limit
     *            only applies to the core and task nodes. The master node
     *            cannot be scaled after initial configuration.
     *            </p>
     */
    public void setMaximumOnDemandCapacityUnits(Integer maximumOnDemandCapacityUnits) {
        this.maximumOnDemandCapacityUnits = maximumOnDemandCapacityUnits;
    }

    /**
     * <p>
     * The upper boundary of on-demand EC2 units. It is measured through VCPU
     * cores or instances for instance groups and measured through units for
     * instance fleets. The on-demand units are not allowed to scale beyond this
     * boundary. The limit only applies to the core and task nodes. The master
     * node cannot be scaled after initial configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maximumOnDemandCapacityUnits <p>
     *            The upper boundary of on-demand EC2 units. It is measured
     *            through VCPU cores or instances for instance groups and
     *            measured through units for instance fleets. The on-demand
     *            units are not allowed to scale beyond this boundary. The limit
     *            only applies to the core and task nodes. The master node
     *            cannot be scaled after initial configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ComputeLimits withMaximumOnDemandCapacityUnits(Integer maximumOnDemandCapacityUnits) {
        this.maximumOnDemandCapacityUnits = maximumOnDemandCapacityUnits;
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
        if (getUnitType() != null)
            sb.append("UnitType: " + getUnitType() + ",");
        if (getMinimumCapacityUnits() != null)
            sb.append("MinimumCapacityUnits: " + getMinimumCapacityUnits() + ",");
        if (getMaximumCapacityUnits() != null)
            sb.append("MaximumCapacityUnits: " + getMaximumCapacityUnits() + ",");
        if (getMaximumOnDemandCapacityUnits() != null)
            sb.append("MaximumOnDemandCapacityUnits: " + getMaximumOnDemandCapacityUnits());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUnitType() == null) ? 0 : getUnitType().hashCode());
        hashCode = prime * hashCode
                + ((getMinimumCapacityUnits() == null) ? 0 : getMinimumCapacityUnits().hashCode());
        hashCode = prime * hashCode
                + ((getMaximumCapacityUnits() == null) ? 0 : getMaximumCapacityUnits().hashCode());
        hashCode = prime
                * hashCode
                + ((getMaximumOnDemandCapacityUnits() == null) ? 0
                        : getMaximumOnDemandCapacityUnits().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ComputeLimits == false)
            return false;
        ComputeLimits other = (ComputeLimits) obj;

        if (other.getUnitType() == null ^ this.getUnitType() == null)
            return false;
        if (other.getUnitType() != null && other.getUnitType().equals(this.getUnitType()) == false)
            return false;
        if (other.getMinimumCapacityUnits() == null ^ this.getMinimumCapacityUnits() == null)
            return false;
        if (other.getMinimumCapacityUnits() != null
                && other.getMinimumCapacityUnits().equals(this.getMinimumCapacityUnits()) == false)
            return false;
        if (other.getMaximumCapacityUnits() == null ^ this.getMaximumCapacityUnits() == null)
            return false;
        if (other.getMaximumCapacityUnits() != null
                && other.getMaximumCapacityUnits().equals(this.getMaximumCapacityUnits()) == false)
            return false;
        if (other.getMaximumOnDemandCapacityUnits() == null
                ^ this.getMaximumOnDemandCapacityUnits() == null)
            return false;
        if (other.getMaximumOnDemandCapacityUnits() != null
                && other.getMaximumOnDemandCapacityUnits().equals(
                        this.getMaximumOnDemandCapacityUnits()) == false)
            return false;
        return true;
    }
}
