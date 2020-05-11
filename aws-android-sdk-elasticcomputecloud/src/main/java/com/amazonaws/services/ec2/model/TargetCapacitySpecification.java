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
 * The number of units to request. You can choose to set the target capacity in
 * terms of instances or a performance characteristic that is important to your
 * application workload, such as vCPUs, memory, or I/O. If the request type is
 * <code>maintain</code>, you can specify a target capacity of 0 and add
 * capacity later.
 * </p>
 * <p>
 * You can use the On-Demand Instance <code>MaxTotalPrice</code> parameter, the
 * Spot Instance <code>MaxTotalPrice</code>, or both to ensure that your fleet
 * cost does not exceed your budget. If you set a maximum price per hour for the
 * On-Demand Instances and Spot Instances in your request, EC2 Fleet will launch
 * instances until it reaches the maximum amount that you're willing to pay.
 * When the maximum amount you're willing to pay is reached, the fleet stops
 * launching instances even if it hasn’t met the target capacity. The
 * <code>MaxTotalPrice</code> parameters are located in <a href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_OnDemandOptions.html"
 * >OnDemandOptions</a> and <a href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_SpotOptions"
 * >SpotOptions</a>
 * </p>
 */
public class TargetCapacitySpecification implements Serializable {
    /**
     * <p>
     * The number of units to request, filled using
     * <code>DefaultTargetCapacityType</code>.
     * </p>
     */
    private Integer totalTargetCapacity;

    /**
     * <p>
     * The number of On-Demand units to request. If you specify a target
     * capacity for Spot units, you cannot specify a target capacity for
     * On-Demand units.
     * </p>
     */
    private Integer onDemandTargetCapacity;

    /**
     * <p>
     * The maximum number of Spot units to launch. If you specify a target
     * capacity for On-Demand units, you cannot specify a target capacity for
     * Spot units.
     * </p>
     */
    private Integer spotTargetCapacity;

    /**
     * <p>
     * The default <code>TotalTargetCapacity</code>, which is either
     * <code>Spot</code> or <code>On-Demand</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>spot, on-demand
     */
    private String defaultTargetCapacityType;

    /**
     * <p>
     * The number of units to request, filled using
     * <code>DefaultTargetCapacityType</code>.
     * </p>
     *
     * @return <p>
     *         The number of units to request, filled using
     *         <code>DefaultTargetCapacityType</code>.
     *         </p>
     */
    public Integer getTotalTargetCapacity() {
        return totalTargetCapacity;
    }

    /**
     * <p>
     * The number of units to request, filled using
     * <code>DefaultTargetCapacityType</code>.
     * </p>
     *
     * @param totalTargetCapacity <p>
     *            The number of units to request, filled using
     *            <code>DefaultTargetCapacityType</code>.
     *            </p>
     */
    public void setTotalTargetCapacity(Integer totalTargetCapacity) {
        this.totalTargetCapacity = totalTargetCapacity;
    }

    /**
     * <p>
     * The number of units to request, filled using
     * <code>DefaultTargetCapacityType</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param totalTargetCapacity <p>
     *            The number of units to request, filled using
     *            <code>DefaultTargetCapacityType</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TargetCapacitySpecification withTotalTargetCapacity(Integer totalTargetCapacity) {
        this.totalTargetCapacity = totalTargetCapacity;
        return this;
    }

    /**
     * <p>
     * The number of On-Demand units to request. If you specify a target
     * capacity for Spot units, you cannot specify a target capacity for
     * On-Demand units.
     * </p>
     *
     * @return <p>
     *         The number of On-Demand units to request. If you specify a target
     *         capacity for Spot units, you cannot specify a target capacity for
     *         On-Demand units.
     *         </p>
     */
    public Integer getOnDemandTargetCapacity() {
        return onDemandTargetCapacity;
    }

    /**
     * <p>
     * The number of On-Demand units to request. If you specify a target
     * capacity for Spot units, you cannot specify a target capacity for
     * On-Demand units.
     * </p>
     *
     * @param onDemandTargetCapacity <p>
     *            The number of On-Demand units to request. If you specify a
     *            target capacity for Spot units, you cannot specify a target
     *            capacity for On-Demand units.
     *            </p>
     */
    public void setOnDemandTargetCapacity(Integer onDemandTargetCapacity) {
        this.onDemandTargetCapacity = onDemandTargetCapacity;
    }

    /**
     * <p>
     * The number of On-Demand units to request. If you specify a target
     * capacity for Spot units, you cannot specify a target capacity for
     * On-Demand units.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param onDemandTargetCapacity <p>
     *            The number of On-Demand units to request. If you specify a
     *            target capacity for Spot units, you cannot specify a target
     *            capacity for On-Demand units.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TargetCapacitySpecification withOnDemandTargetCapacity(Integer onDemandTargetCapacity) {
        this.onDemandTargetCapacity = onDemandTargetCapacity;
        return this;
    }

    /**
     * <p>
     * The maximum number of Spot units to launch. If you specify a target
     * capacity for On-Demand units, you cannot specify a target capacity for
     * Spot units.
     * </p>
     *
     * @return <p>
     *         The maximum number of Spot units to launch. If you specify a
     *         target capacity for On-Demand units, you cannot specify a target
     *         capacity for Spot units.
     *         </p>
     */
    public Integer getSpotTargetCapacity() {
        return spotTargetCapacity;
    }

    /**
     * <p>
     * The maximum number of Spot units to launch. If you specify a target
     * capacity for On-Demand units, you cannot specify a target capacity for
     * Spot units.
     * </p>
     *
     * @param spotTargetCapacity <p>
     *            The maximum number of Spot units to launch. If you specify a
     *            target capacity for On-Demand units, you cannot specify a
     *            target capacity for Spot units.
     *            </p>
     */
    public void setSpotTargetCapacity(Integer spotTargetCapacity) {
        this.spotTargetCapacity = spotTargetCapacity;
    }

    /**
     * <p>
     * The maximum number of Spot units to launch. If you specify a target
     * capacity for On-Demand units, you cannot specify a target capacity for
     * Spot units.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param spotTargetCapacity <p>
     *            The maximum number of Spot units to launch. If you specify a
     *            target capacity for On-Demand units, you cannot specify a
     *            target capacity for Spot units.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TargetCapacitySpecification withSpotTargetCapacity(Integer spotTargetCapacity) {
        this.spotTargetCapacity = spotTargetCapacity;
        return this;
    }

    /**
     * <p>
     * The default <code>TotalTargetCapacity</code>, which is either
     * <code>Spot</code> or <code>On-Demand</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>spot, on-demand
     *
     * @return <p>
     *         The default <code>TotalTargetCapacity</code>, which is either
     *         <code>Spot</code> or <code>On-Demand</code>.
     *         </p>
     * @see DefaultTargetCapacityType
     */
    public String getDefaultTargetCapacityType() {
        return defaultTargetCapacityType;
    }

    /**
     * <p>
     * The default <code>TotalTargetCapacity</code>, which is either
     * <code>Spot</code> or <code>On-Demand</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>spot, on-demand
     *
     * @param defaultTargetCapacityType <p>
     *            The default <code>TotalTargetCapacity</code>, which is either
     *            <code>Spot</code> or <code>On-Demand</code>.
     *            </p>
     * @see DefaultTargetCapacityType
     */
    public void setDefaultTargetCapacityType(String defaultTargetCapacityType) {
        this.defaultTargetCapacityType = defaultTargetCapacityType;
    }

    /**
     * <p>
     * The default <code>TotalTargetCapacity</code>, which is either
     * <code>Spot</code> or <code>On-Demand</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>spot, on-demand
     *
     * @param defaultTargetCapacityType <p>
     *            The default <code>TotalTargetCapacity</code>, which is either
     *            <code>Spot</code> or <code>On-Demand</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DefaultTargetCapacityType
     */
    public TargetCapacitySpecification withDefaultTargetCapacityType(
            String defaultTargetCapacityType) {
        this.defaultTargetCapacityType = defaultTargetCapacityType;
        return this;
    }

    /**
     * <p>
     * The default <code>TotalTargetCapacity</code>, which is either
     * <code>Spot</code> or <code>On-Demand</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>spot, on-demand
     *
     * @param defaultTargetCapacityType <p>
     *            The default <code>TotalTargetCapacity</code>, which is either
     *            <code>Spot</code> or <code>On-Demand</code>.
     *            </p>
     * @see DefaultTargetCapacityType
     */
    public void setDefaultTargetCapacityType(DefaultTargetCapacityType defaultTargetCapacityType) {
        this.defaultTargetCapacityType = defaultTargetCapacityType.toString();
    }

    /**
     * <p>
     * The default <code>TotalTargetCapacity</code>, which is either
     * <code>Spot</code> or <code>On-Demand</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>spot, on-demand
     *
     * @param defaultTargetCapacityType <p>
     *            The default <code>TotalTargetCapacity</code>, which is either
     *            <code>Spot</code> or <code>On-Demand</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DefaultTargetCapacityType
     */
    public TargetCapacitySpecification withDefaultTargetCapacityType(
            DefaultTargetCapacityType defaultTargetCapacityType) {
        this.defaultTargetCapacityType = defaultTargetCapacityType.toString();
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
        if (getTotalTargetCapacity() != null)
            sb.append("TotalTargetCapacity: " + getTotalTargetCapacity() + ",");
        if (getOnDemandTargetCapacity() != null)
            sb.append("OnDemandTargetCapacity: " + getOnDemandTargetCapacity() + ",");
        if (getSpotTargetCapacity() != null)
            sb.append("SpotTargetCapacity: " + getSpotTargetCapacity() + ",");
        if (getDefaultTargetCapacityType() != null)
            sb.append("DefaultTargetCapacityType: " + getDefaultTargetCapacityType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTotalTargetCapacity() == null) ? 0 : getTotalTargetCapacity().hashCode());
        hashCode = prime
                * hashCode
                + ((getOnDemandTargetCapacity() == null) ? 0 : getOnDemandTargetCapacity()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getSpotTargetCapacity() == null) ? 0 : getSpotTargetCapacity().hashCode());
        hashCode = prime
                * hashCode
                + ((getDefaultTargetCapacityType() == null) ? 0 : getDefaultTargetCapacityType()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TargetCapacitySpecification == false)
            return false;
        TargetCapacitySpecification other = (TargetCapacitySpecification) obj;

        if (other.getTotalTargetCapacity() == null ^ this.getTotalTargetCapacity() == null)
            return false;
        if (other.getTotalTargetCapacity() != null
                && other.getTotalTargetCapacity().equals(this.getTotalTargetCapacity()) == false)
            return false;
        if (other.getOnDemandTargetCapacity() == null ^ this.getOnDemandTargetCapacity() == null)
            return false;
        if (other.getOnDemandTargetCapacity() != null
                && other.getOnDemandTargetCapacity().equals(this.getOnDemandTargetCapacity()) == false)
            return false;
        if (other.getSpotTargetCapacity() == null ^ this.getSpotTargetCapacity() == null)
            return false;
        if (other.getSpotTargetCapacity() != null
                && other.getSpotTargetCapacity().equals(this.getSpotTargetCapacity()) == false)
            return false;
        if (other.getDefaultTargetCapacityType() == null
                ^ this.getDefaultTargetCapacityType() == null)
            return false;
        if (other.getDefaultTargetCapacityType() != null
                && other.getDefaultTargetCapacityType().equals(this.getDefaultTargetCapacityType()) == false)
            return false;
        return true;
    }
}
