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

package com.amazonaws.services.awselementalmedialive.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Get details for a reservation.
 */
public class DescribeReservationRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * Unique reservation ID, e.g. '1234567'
     */
    private String reservationId;

    /**
     * Unique reservation ID, e.g. '1234567'
     *
     * @return Unique reservation ID, e.g. '1234567'
     */
    public String getReservationId() {
        return reservationId;
    }

    /**
     * Unique reservation ID, e.g. '1234567'
     *
     * @param reservationId Unique reservation ID, e.g. '1234567'
     */
    public void setReservationId(String reservationId) {
        this.reservationId = reservationId;
    }

    /**
     * Unique reservation ID, e.g. '1234567'
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reservationId Unique reservation ID, e.g. '1234567'
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeReservationRequest withReservationId(String reservationId) {
        this.reservationId = reservationId;
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
        if (getReservationId() != null)
            sb.append("ReservationId: " + getReservationId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getReservationId() == null) ? 0 : getReservationId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeReservationRequest == false)
            return false;
        DescribeReservationRequest other = (DescribeReservationRequest) obj;

        if (other.getReservationId() == null ^ this.getReservationId() == null)
            return false;
        if (other.getReservationId() != null
                && other.getReservationId().equals(this.getReservationId()) == false)
            return false;
        return true;
    }
}
