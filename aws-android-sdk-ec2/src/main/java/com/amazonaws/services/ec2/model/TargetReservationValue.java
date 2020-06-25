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
 * The total value of the new Convertible Reserved Instances.
 * </p>
 */
public class TargetReservationValue implements Serializable {
    /**
     * <p>
     * The total value of the Convertible Reserved Instances that make up the
     * exchange. This is the sum of the list value, remaining upfront price, and
     * additional upfront cost of the exchange.
     * </p>
     */
    private ReservationValue reservationValue;

    /**
     * <p>
     * The configuration of the Convertible Reserved Instances that make up the
     * exchange.
     * </p>
     */
    private TargetConfiguration targetConfiguration;

    /**
     * <p>
     * The total value of the Convertible Reserved Instances that make up the
     * exchange. This is the sum of the list value, remaining upfront price, and
     * additional upfront cost of the exchange.
     * </p>
     *
     * @return <p>
     *         The total value of the Convertible Reserved Instances that make
     *         up the exchange. This is the sum of the list value, remaining
     *         upfront price, and additional upfront cost of the exchange.
     *         </p>
     */
    public ReservationValue getReservationValue() {
        return reservationValue;
    }

    /**
     * <p>
     * The total value of the Convertible Reserved Instances that make up the
     * exchange. This is the sum of the list value, remaining upfront price, and
     * additional upfront cost of the exchange.
     * </p>
     *
     * @param reservationValue <p>
     *            The total value of the Convertible Reserved Instances that
     *            make up the exchange. This is the sum of the list value,
     *            remaining upfront price, and additional upfront cost of the
     *            exchange.
     *            </p>
     */
    public void setReservationValue(ReservationValue reservationValue) {
        this.reservationValue = reservationValue;
    }

    /**
     * <p>
     * The total value of the Convertible Reserved Instances that make up the
     * exchange. This is the sum of the list value, remaining upfront price, and
     * additional upfront cost of the exchange.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reservationValue <p>
     *            The total value of the Convertible Reserved Instances that
     *            make up the exchange. This is the sum of the list value,
     *            remaining upfront price, and additional upfront cost of the
     *            exchange.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TargetReservationValue withReservationValue(ReservationValue reservationValue) {
        this.reservationValue = reservationValue;
        return this;
    }

    /**
     * <p>
     * The configuration of the Convertible Reserved Instances that make up the
     * exchange.
     * </p>
     *
     * @return <p>
     *         The configuration of the Convertible Reserved Instances that make
     *         up the exchange.
     *         </p>
     */
    public TargetConfiguration getTargetConfiguration() {
        return targetConfiguration;
    }

    /**
     * <p>
     * The configuration of the Convertible Reserved Instances that make up the
     * exchange.
     * </p>
     *
     * @param targetConfiguration <p>
     *            The configuration of the Convertible Reserved Instances that
     *            make up the exchange.
     *            </p>
     */
    public void setTargetConfiguration(TargetConfiguration targetConfiguration) {
        this.targetConfiguration = targetConfiguration;
    }

    /**
     * <p>
     * The configuration of the Convertible Reserved Instances that make up the
     * exchange.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetConfiguration <p>
     *            The configuration of the Convertible Reserved Instances that
     *            make up the exchange.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TargetReservationValue withTargetConfiguration(TargetConfiguration targetConfiguration) {
        this.targetConfiguration = targetConfiguration;
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
        if (getTargetConfiguration() != null)
            sb.append("TargetConfiguration: " + getTargetConfiguration());
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
                + ((getTargetConfiguration() == null) ? 0 : getTargetConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TargetReservationValue == false)
            return false;
        TargetReservationValue other = (TargetReservationValue) obj;

        if (other.getReservationValue() == null ^ this.getReservationValue() == null)
            return false;
        if (other.getReservationValue() != null
                && other.getReservationValue().equals(this.getReservationValue()) == false)
            return false;
        if (other.getTargetConfiguration() == null ^ this.getTargetConfiguration() == null)
            return false;
        if (other.getTargetConfiguration() != null
                && other.getTargetConfiguration().equals(this.getTargetConfiguration()) == false)
            return false;
        return true;
    }
}
