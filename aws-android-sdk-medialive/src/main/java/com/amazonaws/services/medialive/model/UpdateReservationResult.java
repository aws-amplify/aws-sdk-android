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

package com.amazonaws.services.medialive.model;

import java.io.Serializable;

/**
 * Placeholder documentation for UpdateReservationResponse
 */
public class UpdateReservationResult implements Serializable {
    /**
     * Reserved resources available to use
     */
    private Reservation reservation;

    /**
     * Reserved resources available to use
     *
     * @return Reserved resources available to use
     */
    public Reservation getReservation() {
        return reservation;
    }

    /**
     * Reserved resources available to use
     *
     * @param reservation Reserved resources available to use
     */
    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    /**
     * Reserved resources available to use
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reservation Reserved resources available to use
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateReservationResult withReservation(Reservation reservation) {
        this.reservation = reservation;
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
        if (getReservation() != null)
            sb.append("Reservation: " + getReservation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getReservation() == null) ? 0 : getReservation().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateReservationResult == false)
            return false;
        UpdateReservationResult other = (UpdateReservationResult) obj;

        if (other.getReservation() == null ^ this.getReservation() == null)
            return false;
        if (other.getReservation() != null
                && other.getReservation().equals(this.getReservation()) == false)
            return false;
        return true;
    }
}
