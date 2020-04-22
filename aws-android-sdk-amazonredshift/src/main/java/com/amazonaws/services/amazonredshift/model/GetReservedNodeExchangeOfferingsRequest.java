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

package com.amazonaws.services.amazonredshift.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns an array of DC2 ReservedNodeOfferings that matches the payment type,
 * term, and usage price of the given DC1 reserved node.
 * </p>
 */
public class GetReservedNodeExchangeOfferingsRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * A string representing the node identifier for the DC1 Reserved Node to be
     * exchanged.
     * </p>
     */
    private String reservedNodeId;

    /**
     * <p>
     * An integer setting the maximum number of ReservedNodeOfferings to
     * retrieve.
     * </p>
     */
    private Integer maxRecords;

    /**
     * <p>
     * A value that indicates the starting point for the next set of
     * ReservedNodeOfferings.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * A string representing the node identifier for the DC1 Reserved Node to be
     * exchanged.
     * </p>
     *
     * @return <p>
     *         A string representing the node identifier for the DC1 Reserved
     *         Node to be exchanged.
     *         </p>
     */
    public String getReservedNodeId() {
        return reservedNodeId;
    }

    /**
     * <p>
     * A string representing the node identifier for the DC1 Reserved Node to be
     * exchanged.
     * </p>
     *
     * @param reservedNodeId <p>
     *            A string representing the node identifier for the DC1 Reserved
     *            Node to be exchanged.
     *            </p>
     */
    public void setReservedNodeId(String reservedNodeId) {
        this.reservedNodeId = reservedNodeId;
    }

    /**
     * <p>
     * A string representing the node identifier for the DC1 Reserved Node to be
     * exchanged.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reservedNodeId <p>
     *            A string representing the node identifier for the DC1 Reserved
     *            Node to be exchanged.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetReservedNodeExchangeOfferingsRequest withReservedNodeId(String reservedNodeId) {
        this.reservedNodeId = reservedNodeId;
        return this;
    }

    /**
     * <p>
     * An integer setting the maximum number of ReservedNodeOfferings to
     * retrieve.
     * </p>
     *
     * @return <p>
     *         An integer setting the maximum number of ReservedNodeOfferings to
     *         retrieve.
     *         </p>
     */
    public Integer getMaxRecords() {
        return maxRecords;
    }

    /**
     * <p>
     * An integer setting the maximum number of ReservedNodeOfferings to
     * retrieve.
     * </p>
     *
     * @param maxRecords <p>
     *            An integer setting the maximum number of ReservedNodeOfferings
     *            to retrieve.
     *            </p>
     */
    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }

    /**
     * <p>
     * An integer setting the maximum number of ReservedNodeOfferings to
     * retrieve.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxRecords <p>
     *            An integer setting the maximum number of ReservedNodeOfferings
     *            to retrieve.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetReservedNodeExchangeOfferingsRequest withMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
        return this;
    }

    /**
     * <p>
     * A value that indicates the starting point for the next set of
     * ReservedNodeOfferings.
     * </p>
     *
     * @return <p>
     *         A value that indicates the starting point for the next set of
     *         ReservedNodeOfferings.
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * A value that indicates the starting point for the next set of
     * ReservedNodeOfferings.
     * </p>
     *
     * @param marker <p>
     *            A value that indicates the starting point for the next set of
     *            ReservedNodeOfferings.
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * A value that indicates the starting point for the next set of
     * ReservedNodeOfferings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param marker <p>
     *            A value that indicates the starting point for the next set of
     *            ReservedNodeOfferings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetReservedNodeExchangeOfferingsRequest withMarker(String marker) {
        this.marker = marker;
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
        if (getReservedNodeId() != null)
            sb.append("ReservedNodeId: " + getReservedNodeId() + ",");
        if (getMaxRecords() != null)
            sb.append("MaxRecords: " + getMaxRecords() + ",");
        if (getMarker() != null)
            sb.append("Marker: " + getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getReservedNodeId() == null) ? 0 : getReservedNodeId().hashCode());
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetReservedNodeExchangeOfferingsRequest == false)
            return false;
        GetReservedNodeExchangeOfferingsRequest other = (GetReservedNodeExchangeOfferingsRequest) obj;

        if (other.getReservedNodeId() == null ^ this.getReservedNodeId() == null)
            return false;
        if (other.getReservedNodeId() != null
                && other.getReservedNodeId().equals(this.getReservedNodeId()) == false)
            return false;
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null)
            return false;
        if (other.getMaxRecords() != null
                && other.getMaxRecords().equals(this.getMaxRecords()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }
}
