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

/**
 * Placeholder documentation for ListReservationsResponse
 */
public class ListReservationsResult implements Serializable {
    /**
     * Token to retrieve the next page of results
     */
    private String nextToken;

    /**
     * List of reservations
     */
    private java.util.List<Reservation> reservations;

    /**
     * Token to retrieve the next page of results
     *
     * @return Token to retrieve the next page of results
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * Token to retrieve the next page of results
     *
     * @param nextToken Token to retrieve the next page of results
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * Token to retrieve the next page of results
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken Token to retrieve the next page of results
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListReservationsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * List of reservations
     *
     * @return List of reservations
     */
    public java.util.List<Reservation> getReservations() {
        return reservations;
    }

    /**
     * List of reservations
     *
     * @param reservations List of reservations
     */
    public void setReservations(java.util.Collection<Reservation> reservations) {
        if (reservations == null) {
            this.reservations = null;
            return;
        }

        this.reservations = new java.util.ArrayList<Reservation>(reservations);
    }

    /**
     * List of reservations
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reservations List of reservations
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListReservationsResult withReservations(Reservation... reservations) {
        if (getReservations() == null) {
            this.reservations = new java.util.ArrayList<Reservation>(reservations.length);
        }
        for (Reservation value : reservations) {
            this.reservations.add(value);
        }
        return this;
    }

    /**
     * List of reservations
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reservations List of reservations
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListReservationsResult withReservations(java.util.Collection<Reservation> reservations) {
        setReservations(reservations);
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
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getReservations() != null)
            sb.append("Reservations: " + getReservations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode
                + ((getReservations() == null) ? 0 : getReservations().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListReservationsResult == false)
            return false;
        ListReservationsResult other = (ListReservationsResult) obj;

        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getReservations() == null ^ this.getReservations() == null)
            return false;
        if (other.getReservations() != null
                && other.getReservations().equals(this.getReservations()) == false)
            return false;
        return true;
    }
}
