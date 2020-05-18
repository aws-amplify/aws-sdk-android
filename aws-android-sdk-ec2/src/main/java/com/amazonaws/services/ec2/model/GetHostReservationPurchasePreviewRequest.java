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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Preview a reservation purchase with configurations that match those of your
 * Dedicated Host. You must have active Dedicated Hosts in your account before
 * you purchase a reservation.
 * </p>
 * <p>
 * This is a preview of the <a>PurchaseHostReservation</a> action and does not
 * result in the offering being purchased.
 * </p>
 */
public class GetHostReservationPurchasePreviewRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The IDs of the Dedicated Hosts with which the reservation is associated.
     * </p>
     */
    private java.util.List<String> hostIdSet;

    /**
     * <p>
     * The offering ID of the reservation.
     * </p>
     */
    private String offeringId;

    /**
     * <p>
     * The IDs of the Dedicated Hosts with which the reservation is associated.
     * </p>
     *
     * @return <p>
     *         The IDs of the Dedicated Hosts with which the reservation is
     *         associated.
     *         </p>
     */
    public java.util.List<String> getHostIdSet() {
        return hostIdSet;
    }

    /**
     * <p>
     * The IDs of the Dedicated Hosts with which the reservation is associated.
     * </p>
     *
     * @param hostIdSet <p>
     *            The IDs of the Dedicated Hosts with which the reservation is
     *            associated.
     *            </p>
     */
    public void setHostIdSet(java.util.Collection<String> hostIdSet) {
        if (hostIdSet == null) {
            this.hostIdSet = null;
            return;
        }

        this.hostIdSet = new java.util.ArrayList<String>(hostIdSet);
    }

    /**
     * <p>
     * The IDs of the Dedicated Hosts with which the reservation is associated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hostIdSet <p>
     *            The IDs of the Dedicated Hosts with which the reservation is
     *            associated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetHostReservationPurchasePreviewRequest withHostIdSet(String... hostIdSet) {
        if (getHostIdSet() == null) {
            this.hostIdSet = new java.util.ArrayList<String>(hostIdSet.length);
        }
        for (String value : hostIdSet) {
            this.hostIdSet.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the Dedicated Hosts with which the reservation is associated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hostIdSet <p>
     *            The IDs of the Dedicated Hosts with which the reservation is
     *            associated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetHostReservationPurchasePreviewRequest withHostIdSet(
            java.util.Collection<String> hostIdSet) {
        setHostIdSet(hostIdSet);
        return this;
    }

    /**
     * <p>
     * The offering ID of the reservation.
     * </p>
     *
     * @return <p>
     *         The offering ID of the reservation.
     *         </p>
     */
    public String getOfferingId() {
        return offeringId;
    }

    /**
     * <p>
     * The offering ID of the reservation.
     * </p>
     *
     * @param offeringId <p>
     *            The offering ID of the reservation.
     *            </p>
     */
    public void setOfferingId(String offeringId) {
        this.offeringId = offeringId;
    }

    /**
     * <p>
     * The offering ID of the reservation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param offeringId <p>
     *            The offering ID of the reservation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetHostReservationPurchasePreviewRequest withOfferingId(String offeringId) {
        this.offeringId = offeringId;
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
        if (getHostIdSet() != null)
            sb.append("HostIdSet: " + getHostIdSet() + ",");
        if (getOfferingId() != null)
            sb.append("OfferingId: " + getOfferingId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHostIdSet() == null) ? 0 : getHostIdSet().hashCode());
        hashCode = prime * hashCode + ((getOfferingId() == null) ? 0 : getOfferingId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetHostReservationPurchasePreviewRequest == false)
            return false;
        GetHostReservationPurchasePreviewRequest other = (GetHostReservationPurchasePreviewRequest) obj;

        if (other.getHostIdSet() == null ^ this.getHostIdSet() == null)
            return false;
        if (other.getHostIdSet() != null
                && other.getHostIdSet().equals(this.getHostIdSet()) == false)
            return false;
        if (other.getOfferingId() == null ^ this.getOfferingId() == null)
            return false;
        if (other.getOfferingId() != null
                && other.getOfferingId().equals(this.getOfferingId()) == false)
            return false;
        return true;
    }
}
