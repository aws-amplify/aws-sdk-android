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

public class CreateCapacityReservationResult implements Serializable {
    /**
     * <p>
     * Information about the Capacity Reservation.
     * </p>
     */
    private CapacityReservation capacityReservation;

    /**
     * <p>
     * Information about the Capacity Reservation.
     * </p>
     *
     * @return <p>
     *         Information about the Capacity Reservation.
     *         </p>
     */
    public CapacityReservation getCapacityReservation() {
        return capacityReservation;
    }

    /**
     * <p>
     * Information about the Capacity Reservation.
     * </p>
     *
     * @param capacityReservation <p>
     *            Information about the Capacity Reservation.
     *            </p>
     */
    public void setCapacityReservation(CapacityReservation capacityReservation) {
        this.capacityReservation = capacityReservation;
    }

    /**
     * <p>
     * Information about the Capacity Reservation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param capacityReservation <p>
     *            Information about the Capacity Reservation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCapacityReservationResult withCapacityReservation(
            CapacityReservation capacityReservation) {
        this.capacityReservation = capacityReservation;
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
        if (getCapacityReservation() != null)
            sb.append("CapacityReservation: " + getCapacityReservation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCapacityReservation() == null) ? 0 : getCapacityReservation().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateCapacityReservationResult == false)
            return false;
        CreateCapacityReservationResult other = (CreateCapacityReservationResult) obj;

        if (other.getCapacityReservation() == null ^ this.getCapacityReservation() == null)
            return false;
        if (other.getCapacityReservation() != null
                && other.getCapacityReservation().equals(this.getCapacityReservation()) == false)
            return false;
        return true;
    }
}
