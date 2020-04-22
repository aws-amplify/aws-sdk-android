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

public class GetReservedNodeExchangeOfferingsResult implements Serializable {
    /**
     * <p>
     * An optional parameter that specifies the starting point for returning a
     * set of response records. When the results of a
     * <code>GetReservedNodeExchangeOfferings</code> request exceed the value
     * specified in MaxRecords, Amazon Redshift returns a value in the marker
     * field of the response. You can retrieve the next set of response records
     * by providing the returned marker value in the marker parameter and
     * retrying the request.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * Returns an array of <a>ReservedNodeOffering</a> objects.
     * </p>
     */
    private java.util.List<ReservedNodeOffering> reservedNodeOfferings;

    /**
     * <p>
     * An optional parameter that specifies the starting point for returning a
     * set of response records. When the results of a
     * <code>GetReservedNodeExchangeOfferings</code> request exceed the value
     * specified in MaxRecords, Amazon Redshift returns a value in the marker
     * field of the response. You can retrieve the next set of response records
     * by providing the returned marker value in the marker parameter and
     * retrying the request.
     * </p>
     *
     * @return <p>
     *         An optional parameter that specifies the starting point for
     *         returning a set of response records. When the results of a
     *         <code>GetReservedNodeExchangeOfferings</code> request exceed the
     *         value specified in MaxRecords, Amazon Redshift returns a value in
     *         the marker field of the response. You can retrieve the next set
     *         of response records by providing the returned marker value in the
     *         marker parameter and retrying the request.
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * An optional parameter that specifies the starting point for returning a
     * set of response records. When the results of a
     * <code>GetReservedNodeExchangeOfferings</code> request exceed the value
     * specified in MaxRecords, Amazon Redshift returns a value in the marker
     * field of the response. You can retrieve the next set of response records
     * by providing the returned marker value in the marker parameter and
     * retrying the request.
     * </p>
     *
     * @param marker <p>
     *            An optional parameter that specifies the starting point for
     *            returning a set of response records. When the results of a
     *            <code>GetReservedNodeExchangeOfferings</code> request exceed
     *            the value specified in MaxRecords, Amazon Redshift returns a
     *            value in the marker field of the response. You can retrieve
     *            the next set of response records by providing the returned
     *            marker value in the marker parameter and retrying the request.
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional parameter that specifies the starting point for returning a
     * set of response records. When the results of a
     * <code>GetReservedNodeExchangeOfferings</code> request exceed the value
     * specified in MaxRecords, Amazon Redshift returns a value in the marker
     * field of the response. You can retrieve the next set of response records
     * by providing the returned marker value in the marker parameter and
     * retrying the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param marker <p>
     *            An optional parameter that specifies the starting point for
     *            returning a set of response records. When the results of a
     *            <code>GetReservedNodeExchangeOfferings</code> request exceed
     *            the value specified in MaxRecords, Amazon Redshift returns a
     *            value in the marker field of the response. You can retrieve
     *            the next set of response records by providing the returned
     *            marker value in the marker parameter and retrying the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetReservedNodeExchangeOfferingsResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * <p>
     * Returns an array of <a>ReservedNodeOffering</a> objects.
     * </p>
     *
     * @return <p>
     *         Returns an array of <a>ReservedNodeOffering</a> objects.
     *         </p>
     */
    public java.util.List<ReservedNodeOffering> getReservedNodeOfferings() {
        return reservedNodeOfferings;
    }

    /**
     * <p>
     * Returns an array of <a>ReservedNodeOffering</a> objects.
     * </p>
     *
     * @param reservedNodeOfferings <p>
     *            Returns an array of <a>ReservedNodeOffering</a> objects.
     *            </p>
     */
    public void setReservedNodeOfferings(
            java.util.Collection<ReservedNodeOffering> reservedNodeOfferings) {
        if (reservedNodeOfferings == null) {
            this.reservedNodeOfferings = null;
            return;
        }

        this.reservedNodeOfferings = new java.util.ArrayList<ReservedNodeOffering>(
                reservedNodeOfferings);
    }

    /**
     * <p>
     * Returns an array of <a>ReservedNodeOffering</a> objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reservedNodeOfferings <p>
     *            Returns an array of <a>ReservedNodeOffering</a> objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetReservedNodeExchangeOfferingsResult withReservedNodeOfferings(
            ReservedNodeOffering... reservedNodeOfferings) {
        if (getReservedNodeOfferings() == null) {
            this.reservedNodeOfferings = new java.util.ArrayList<ReservedNodeOffering>(
                    reservedNodeOfferings.length);
        }
        for (ReservedNodeOffering value : reservedNodeOfferings) {
            this.reservedNodeOfferings.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Returns an array of <a>ReservedNodeOffering</a> objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reservedNodeOfferings <p>
     *            Returns an array of <a>ReservedNodeOffering</a> objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetReservedNodeExchangeOfferingsResult withReservedNodeOfferings(
            java.util.Collection<ReservedNodeOffering> reservedNodeOfferings) {
        setReservedNodeOfferings(reservedNodeOfferings);
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
        if (getMarker() != null)
            sb.append("Marker: " + getMarker() + ",");
        if (getReservedNodeOfferings() != null)
            sb.append("ReservedNodeOfferings: " + getReservedNodeOfferings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime
                * hashCode
                + ((getReservedNodeOfferings() == null) ? 0 : getReservedNodeOfferings().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetReservedNodeExchangeOfferingsResult == false)
            return false;
        GetReservedNodeExchangeOfferingsResult other = (GetReservedNodeExchangeOfferingsResult) obj;

        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getReservedNodeOfferings() == null ^ this.getReservedNodeOfferings() == null)
            return false;
        if (other.getReservedNodeOfferings() != null
                && other.getReservedNodeOfferings().equals(this.getReservedNodeOfferings()) == false)
            return false;
        return true;
    }
}
