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

package com.amazonaws.services.amazonelasticsearchservice.model;

import java.io.Serializable;

/**
 * <p>
 * Represents the output of a
 * <code>PurchaseReservedElasticsearchInstanceOffering</code> operation.
 * </p>
 */
public class PurchaseReservedElasticsearchInstanceOfferingResult implements Serializable {
    /**
     * <p>
     * Details of the reserved Elasticsearch instance which was purchased.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>\p{XDigit}{8}-\p{XDigit}{4}-\p{XDigit}{4}-\p{XDigit}{4}-\p
     * {XDigit}{12}<br/>
     */
    private String reservedElasticsearchInstanceId;

    /**
     * <p>
     * The customer-specified identifier used to track this reservation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 64<br/>
     */
    private String reservationName;

    /**
     * <p>
     * Details of the reserved Elasticsearch instance which was purchased.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>\p{XDigit}{8}-\p{XDigit}{4}-\p{XDigit}{4}-\p{XDigit}{4}-\p
     * {XDigit}{12}<br/>
     *
     * @return <p>
     *         Details of the reserved Elasticsearch instance which was
     *         purchased.
     *         </p>
     */
    public String getReservedElasticsearchInstanceId() {
        return reservedElasticsearchInstanceId;
    }

    /**
     * <p>
     * Details of the reserved Elasticsearch instance which was purchased.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>\p{XDigit}{8}-\p{XDigit}{4}-\p{XDigit}{4}-\p{XDigit}{4}-\p
     * {XDigit}{12}<br/>
     *
     * @param reservedElasticsearchInstanceId <p>
     *            Details of the reserved Elasticsearch instance which was
     *            purchased.
     *            </p>
     */
    public void setReservedElasticsearchInstanceId(String reservedElasticsearchInstanceId) {
        this.reservedElasticsearchInstanceId = reservedElasticsearchInstanceId;
    }

    /**
     * <p>
     * Details of the reserved Elasticsearch instance which was purchased.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>\p{XDigit}{8}-\p{XDigit}{4}-\p{XDigit}{4}-\p{XDigit}{4}-\p
     * {XDigit}{12}<br/>
     *
     * @param reservedElasticsearchInstanceId <p>
     *            Details of the reserved Elasticsearch instance which was
     *            purchased.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PurchaseReservedElasticsearchInstanceOfferingResult withReservedElasticsearchInstanceId(
            String reservedElasticsearchInstanceId) {
        this.reservedElasticsearchInstanceId = reservedElasticsearchInstanceId;
        return this;
    }

    /**
     * <p>
     * The customer-specified identifier used to track this reservation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 64<br/>
     *
     * @return <p>
     *         The customer-specified identifier used to track this reservation.
     *         </p>
     */
    public String getReservationName() {
        return reservationName;
    }

    /**
     * <p>
     * The customer-specified identifier used to track this reservation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 64<br/>
     *
     * @param reservationName <p>
     *            The customer-specified identifier used to track this
     *            reservation.
     *            </p>
     */
    public void setReservationName(String reservationName) {
        this.reservationName = reservationName;
    }

    /**
     * <p>
     * The customer-specified identifier used to track this reservation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 64<br/>
     *
     * @param reservationName <p>
     *            The customer-specified identifier used to track this
     *            reservation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PurchaseReservedElasticsearchInstanceOfferingResult withReservationName(
            String reservationName) {
        this.reservationName = reservationName;
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
        if (getReservedElasticsearchInstanceId() != null)
            sb.append("ReservedElasticsearchInstanceId: " + getReservedElasticsearchInstanceId()
                    + ",");
        if (getReservationName() != null)
            sb.append("ReservationName: " + getReservationName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getReservedElasticsearchInstanceId() == null) ? 0
                        : getReservedElasticsearchInstanceId().hashCode());
        hashCode = prime * hashCode
                + ((getReservationName() == null) ? 0 : getReservationName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PurchaseReservedElasticsearchInstanceOfferingResult == false)
            return false;
        PurchaseReservedElasticsearchInstanceOfferingResult other = (PurchaseReservedElasticsearchInstanceOfferingResult) obj;

        if (other.getReservedElasticsearchInstanceId() == null
                ^ this.getReservedElasticsearchInstanceId() == null)
            return false;
        if (other.getReservedElasticsearchInstanceId() != null
                && other.getReservedElasticsearchInstanceId().equals(
                        this.getReservedElasticsearchInstanceId()) == false)
            return false;
        if (other.getReservationName() == null ^ this.getReservationName() == null)
            return false;
        if (other.getReservationName() != null
                && other.getReservationName().equals(this.getReservationName()) == false)
            return false;
        return true;
    }
}
