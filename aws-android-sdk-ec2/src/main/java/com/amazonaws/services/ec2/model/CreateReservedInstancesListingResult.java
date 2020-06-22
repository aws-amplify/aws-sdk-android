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
 * Contains the output of CreateReservedInstancesListing.
 * </p>
 */
public class CreateReservedInstancesListingResult implements Serializable {
    /**
     * <p>
     * Information about the Standard Reserved Instance listing.
     * </p>
     */
    private java.util.List<ReservedInstancesListing> reservedInstancesListings;

    /**
     * <p>
     * Information about the Standard Reserved Instance listing.
     * </p>
     *
     * @return <p>
     *         Information about the Standard Reserved Instance listing.
     *         </p>
     */
    public java.util.List<ReservedInstancesListing> getReservedInstancesListings() {
        return reservedInstancesListings;
    }

    /**
     * <p>
     * Information about the Standard Reserved Instance listing.
     * </p>
     *
     * @param reservedInstancesListings <p>
     *            Information about the Standard Reserved Instance listing.
     *            </p>
     */
    public void setReservedInstancesListings(
            java.util.Collection<ReservedInstancesListing> reservedInstancesListings) {
        if (reservedInstancesListings == null) {
            this.reservedInstancesListings = null;
            return;
        }

        this.reservedInstancesListings = new java.util.ArrayList<ReservedInstancesListing>(
                reservedInstancesListings);
    }

    /**
     * <p>
     * Information about the Standard Reserved Instance listing.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reservedInstancesListings <p>
     *            Information about the Standard Reserved Instance listing.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateReservedInstancesListingResult withReservedInstancesListings(
            ReservedInstancesListing... reservedInstancesListings) {
        if (getReservedInstancesListings() == null) {
            this.reservedInstancesListings = new java.util.ArrayList<ReservedInstancesListing>(
                    reservedInstancesListings.length);
        }
        for (ReservedInstancesListing value : reservedInstancesListings) {
            this.reservedInstancesListings.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the Standard Reserved Instance listing.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reservedInstancesListings <p>
     *            Information about the Standard Reserved Instance listing.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateReservedInstancesListingResult withReservedInstancesListings(
            java.util.Collection<ReservedInstancesListing> reservedInstancesListings) {
        setReservedInstancesListings(reservedInstancesListings);
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
        if (getReservedInstancesListings() != null)
            sb.append("ReservedInstancesListings: " + getReservedInstancesListings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getReservedInstancesListings() == null) ? 0 : getReservedInstancesListings()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateReservedInstancesListingResult == false)
            return false;
        CreateReservedInstancesListingResult other = (CreateReservedInstancesListingResult) obj;

        if (other.getReservedInstancesListings() == null
                ^ this.getReservedInstancesListings() == null)
            return false;
        if (other.getReservedInstancesListings() != null
                && other.getReservedInstancesListings().equals(this.getReservedInstancesListings()) == false)
            return false;
        return true;
    }
}
