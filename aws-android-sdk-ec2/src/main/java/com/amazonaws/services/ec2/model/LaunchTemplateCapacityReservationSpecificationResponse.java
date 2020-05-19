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
 * Information about the Capacity Reservation targeting option.
 * </p>
 */
public class LaunchTemplateCapacityReservationSpecificationResponse implements Serializable {
    /**
     * <p>
     * Indicates the instance's Capacity Reservation preferences. Possible
     * preferences include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>open</code> - The instance can run in any <code>open</code>
     * Capacity Reservation that has matching attributes (instance type,
     * platform, Availability Zone).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>none</code> - The instance avoids running in a Capacity Reservation
     * even if one is available. The instance runs in On-Demand capacity.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>open, none
     */
    private String capacityReservationPreference;

    /**
     * <p>
     * Information about the target Capacity Reservation.
     * </p>
     */
    private CapacityReservationTargetResponse capacityReservationTarget;

    /**
     * <p>
     * Indicates the instance's Capacity Reservation preferences. Possible
     * preferences include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>open</code> - The instance can run in any <code>open</code>
     * Capacity Reservation that has matching attributes (instance type,
     * platform, Availability Zone).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>none</code> - The instance avoids running in a Capacity Reservation
     * even if one is available. The instance runs in On-Demand capacity.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>open, none
     *
     * @return <p>
     *         Indicates the instance's Capacity Reservation preferences.
     *         Possible preferences include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>open</code> - The instance can run in any <code>open</code>
     *         Capacity Reservation that has matching attributes (instance type,
     *         platform, Availability Zone).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>none</code> - The instance avoids running in a Capacity
     *         Reservation even if one is available. The instance runs in
     *         On-Demand capacity.
     *         </p>
     *         </li>
     *         </ul>
     * @see CapacityReservationPreference
     */
    public String getCapacityReservationPreference() {
        return capacityReservationPreference;
    }

    /**
     * <p>
     * Indicates the instance's Capacity Reservation preferences. Possible
     * preferences include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>open</code> - The instance can run in any <code>open</code>
     * Capacity Reservation that has matching attributes (instance type,
     * platform, Availability Zone).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>none</code> - The instance avoids running in a Capacity Reservation
     * even if one is available. The instance runs in On-Demand capacity.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>open, none
     *
     * @param capacityReservationPreference <p>
     *            Indicates the instance's Capacity Reservation preferences.
     *            Possible preferences include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>open</code> - The instance can run in any
     *            <code>open</code> Capacity Reservation that has matching
     *            attributes (instance type, platform, Availability Zone).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>none</code> - The instance avoids running in a Capacity
     *            Reservation even if one is available. The instance runs in
     *            On-Demand capacity.
     *            </p>
     *            </li>
     *            </ul>
     * @see CapacityReservationPreference
     */
    public void setCapacityReservationPreference(String capacityReservationPreference) {
        this.capacityReservationPreference = capacityReservationPreference;
    }

    /**
     * <p>
     * Indicates the instance's Capacity Reservation preferences. Possible
     * preferences include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>open</code> - The instance can run in any <code>open</code>
     * Capacity Reservation that has matching attributes (instance type,
     * platform, Availability Zone).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>none</code> - The instance avoids running in a Capacity Reservation
     * even if one is available. The instance runs in On-Demand capacity.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>open, none
     *
     * @param capacityReservationPreference <p>
     *            Indicates the instance's Capacity Reservation preferences.
     *            Possible preferences include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>open</code> - The instance can run in any
     *            <code>open</code> Capacity Reservation that has matching
     *            attributes (instance type, platform, Availability Zone).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>none</code> - The instance avoids running in a Capacity
     *            Reservation even if one is available. The instance runs in
     *            On-Demand capacity.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CapacityReservationPreference
     */
    public LaunchTemplateCapacityReservationSpecificationResponse withCapacityReservationPreference(
            String capacityReservationPreference) {
        this.capacityReservationPreference = capacityReservationPreference;
        return this;
    }

    /**
     * <p>
     * Indicates the instance's Capacity Reservation preferences. Possible
     * preferences include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>open</code> - The instance can run in any <code>open</code>
     * Capacity Reservation that has matching attributes (instance type,
     * platform, Availability Zone).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>none</code> - The instance avoids running in a Capacity Reservation
     * even if one is available. The instance runs in On-Demand capacity.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>open, none
     *
     * @param capacityReservationPreference <p>
     *            Indicates the instance's Capacity Reservation preferences.
     *            Possible preferences include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>open</code> - The instance can run in any
     *            <code>open</code> Capacity Reservation that has matching
     *            attributes (instance type, platform, Availability Zone).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>none</code> - The instance avoids running in a Capacity
     *            Reservation even if one is available. The instance runs in
     *            On-Demand capacity.
     *            </p>
     *            </li>
     *            </ul>
     * @see CapacityReservationPreference
     */
    public void setCapacityReservationPreference(
            CapacityReservationPreference capacityReservationPreference) {
        this.capacityReservationPreference = capacityReservationPreference.toString();
    }

    /**
     * <p>
     * Indicates the instance's Capacity Reservation preferences. Possible
     * preferences include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>open</code> - The instance can run in any <code>open</code>
     * Capacity Reservation that has matching attributes (instance type,
     * platform, Availability Zone).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>none</code> - The instance avoids running in a Capacity Reservation
     * even if one is available. The instance runs in On-Demand capacity.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>open, none
     *
     * @param capacityReservationPreference <p>
     *            Indicates the instance's Capacity Reservation preferences.
     *            Possible preferences include:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>open</code> - The instance can run in any
     *            <code>open</code> Capacity Reservation that has matching
     *            attributes (instance type, platform, Availability Zone).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>none</code> - The instance avoids running in a Capacity
     *            Reservation even if one is available. The instance runs in
     *            On-Demand capacity.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CapacityReservationPreference
     */
    public LaunchTemplateCapacityReservationSpecificationResponse withCapacityReservationPreference(
            CapacityReservationPreference capacityReservationPreference) {
        this.capacityReservationPreference = capacityReservationPreference.toString();
        return this;
    }

    /**
     * <p>
     * Information about the target Capacity Reservation.
     * </p>
     *
     * @return <p>
     *         Information about the target Capacity Reservation.
     *         </p>
     */
    public CapacityReservationTargetResponse getCapacityReservationTarget() {
        return capacityReservationTarget;
    }

    /**
     * <p>
     * Information about the target Capacity Reservation.
     * </p>
     *
     * @param capacityReservationTarget <p>
     *            Information about the target Capacity Reservation.
     *            </p>
     */
    public void setCapacityReservationTarget(
            CapacityReservationTargetResponse capacityReservationTarget) {
        this.capacityReservationTarget = capacityReservationTarget;
    }

    /**
     * <p>
     * Information about the target Capacity Reservation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param capacityReservationTarget <p>
     *            Information about the target Capacity Reservation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LaunchTemplateCapacityReservationSpecificationResponse withCapacityReservationTarget(
            CapacityReservationTargetResponse capacityReservationTarget) {
        this.capacityReservationTarget = capacityReservationTarget;
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
        if (getCapacityReservationPreference() != null)
            sb.append("CapacityReservationPreference: " + getCapacityReservationPreference() + ",");
        if (getCapacityReservationTarget() != null)
            sb.append("CapacityReservationTarget: " + getCapacityReservationTarget());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getCapacityReservationPreference() == null) ? 0
                        : getCapacityReservationPreference().hashCode());
        hashCode = prime
                * hashCode
                + ((getCapacityReservationTarget() == null) ? 0 : getCapacityReservationTarget()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LaunchTemplateCapacityReservationSpecificationResponse == false)
            return false;
        LaunchTemplateCapacityReservationSpecificationResponse other = (LaunchTemplateCapacityReservationSpecificationResponse) obj;

        if (other.getCapacityReservationPreference() == null
                ^ this.getCapacityReservationPreference() == null)
            return false;
        if (other.getCapacityReservationPreference() != null
                && other.getCapacityReservationPreference().equals(
                        this.getCapacityReservationPreference()) == false)
            return false;
        if (other.getCapacityReservationTarget() == null
                ^ this.getCapacityReservationTarget() == null)
            return false;
        if (other.getCapacityReservationTarget() != null
                && other.getCapacityReservationTarget().equals(this.getCapacityReservationTarget()) == false)
            return false;
        return true;
    }
}
