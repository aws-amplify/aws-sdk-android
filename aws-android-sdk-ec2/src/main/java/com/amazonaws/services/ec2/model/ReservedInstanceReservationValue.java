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
 * The total value of the Convertible Reserved Instance.
 * </p>
 */
public class ReservedInstanceReservationValue implements Serializable {
    /**
     * <p>
     * The total value of the Convertible Reserved Instance that you are
     * exchanging.
     * </p>
     */
    private ReservationValue reservationValue;

    /**
     * <p>
     * The ID of the Convertible Reserved Instance that you are exchanging.
     * </p>
     */
    private String reservedInstanceId;

    /**
     * <p>
     * The total value of the Convertible Reserved Instance that you are
     * exchanging.
     * </p>
     *
     * @return <p>
     *         The total value of the Convertible Reserved Instance that you are
     *         exchanging.
     *         </p>
     */
    public ReservationValue getReservationValue() {
        return reservationValue;
    }

    /**
     * <p>
     * The total value of the Convertible Reserved Instance that you are
     * exchanging.
     * </p>
     *
     * @param reservationValue <p>
     *            The total value of the Convertible Reserved Instance that you
     *            are exchanging.
     *            </p>
     */
    public void setReservationValue(ReservationValue reservationValue) {
        this.reservationValue = reservationValue;
    }

    /**
     * <p>
     * The total value of the Convertible Reserved Instance that you are
     * exchanging.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reservationValue <p>
     *            The total value of the Convertible Reserved Instance that you
     *            are exchanging.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedInstanceReservationValue withReservationValue(ReservationValue reservationValue) {
        this.reservationValue = reservationValue;
        return this;
    }

    /**
     * <p>
     * The ID of the Convertible Reserved Instance that you are exchanging.
     * </p>
     *
     * @return <p>
     *         The ID of the Convertible Reserved Instance that you are
     *         exchanging.
     *         </p>
     */
    public String getReservedInstanceId() {
        return reservedInstanceId;
    }

    /**
     * <p>
     * The ID of the Convertible Reserved Instance that you are exchanging.
     * </p>
     *
     * @param reservedInstanceId <p>
     *            The ID of the Convertible Reserved Instance that you are
     *            exchanging.
     *            </p>
     */
    public void setReservedInstanceId(String reservedInstanceId) {
        this.reservedInstanceId = reservedInstanceId;
    }

    /**
     * <p>
     * The ID of the Convertible Reserved Instance that you are exchanging.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reservedInstanceId <p>
     *            The ID of the Convertible Reserved Instance that you are
     *            exchanging.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedInstanceReservationValue withReservedInstanceId(String reservedInstanceId) {
        this.reservedInstanceId = reservedInstanceId;
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
        if (getReservationValue() != null)
            sb.append("ReservationValue: " + getReservationValue() + ",");
        if (getReservedInstanceId() != null)
            sb.append("ReservedInstanceId: " + getReservedInstanceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getReservationValue() == null) ? 0 : getReservationValue().hashCode());
        hashCode = prime * hashCode
                + ((getReservedInstanceId() == null) ? 0 : getReservedInstanceId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReservedInstanceReservationValue == false)
            return false;
        ReservedInstanceReservationValue other = (ReservedInstanceReservationValue) obj;

        if (other.getReservationValue() == null ^ this.getReservationValue() == null)
            return false;
        if (other.getReservationValue() != null
                && other.getReservationValue().equals(this.getReservationValue()) == false)
            return false;
        if (other.getReservedInstanceId() == null ^ this.getReservedInstanceId() == null)
            return false;
        if (other.getReservedInstanceId() != null
                && other.getReservedInstanceId().equals(this.getReservedInstanceId()) == false)
            return false;
        return true;
    }
}
