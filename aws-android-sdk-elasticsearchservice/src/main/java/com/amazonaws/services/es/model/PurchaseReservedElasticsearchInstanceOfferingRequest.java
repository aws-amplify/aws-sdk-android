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

package com.amazonaws.services.es.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Allows you to purchase reserved Elasticsearch instances.
 * </p>
 */
public class PurchaseReservedElasticsearchInstanceOfferingRequest extends AmazonWebServiceRequest
        implements Serializable {
    /**
     * <p>
     * The ID of the reserved Elasticsearch instance offering to purchase.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>\p{XDigit}{8}-\p{XDigit}{4}-\p{XDigit}{4}-\p{XDigit}{4}-\p
     * {XDigit}{12}<br/>
     */
    private String reservedElasticsearchInstanceOfferingId;

    /**
     * <p>
     * A customer-specified identifier to track this reservation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 64<br/>
     */
    private String reservationName;

    /**
     * <p>
     * The number of Elasticsearch instances to reserve.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer instanceCount;

    /**
     * <p>
     * The ID of the reserved Elasticsearch instance offering to purchase.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>\p{XDigit}{8}-\p{XDigit}{4}-\p{XDigit}{4}-\p{XDigit}{4}-\p
     * {XDigit}{12}<br/>
     *
     * @return <p>
     *         The ID of the reserved Elasticsearch instance offering to
     *         purchase.
     *         </p>
     */
    public String getReservedElasticsearchInstanceOfferingId() {
        return reservedElasticsearchInstanceOfferingId;
    }

    /**
     * <p>
     * The ID of the reserved Elasticsearch instance offering to purchase.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>\p{XDigit}{8}-\p{XDigit}{4}-\p{XDigit}{4}-\p{XDigit}{4}-\p
     * {XDigit}{12}<br/>
     *
     * @param reservedElasticsearchInstanceOfferingId <p>
     *            The ID of the reserved Elasticsearch instance offering to
     *            purchase.
     *            </p>
     */
    public void setReservedElasticsearchInstanceOfferingId(
            String reservedElasticsearchInstanceOfferingId) {
        this.reservedElasticsearchInstanceOfferingId = reservedElasticsearchInstanceOfferingId;
    }

    /**
     * <p>
     * The ID of the reserved Elasticsearch instance offering to purchase.
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
     * @param reservedElasticsearchInstanceOfferingId <p>
     *            The ID of the reserved Elasticsearch instance offering to
     *            purchase.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PurchaseReservedElasticsearchInstanceOfferingRequest withReservedElasticsearchInstanceOfferingId(
            String reservedElasticsearchInstanceOfferingId) {
        this.reservedElasticsearchInstanceOfferingId = reservedElasticsearchInstanceOfferingId;
        return this;
    }

    /**
     * <p>
     * A customer-specified identifier to track this reservation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 64<br/>
     *
     * @return <p>
     *         A customer-specified identifier to track this reservation.
     *         </p>
     */
    public String getReservationName() {
        return reservationName;
    }

    /**
     * <p>
     * A customer-specified identifier to track this reservation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 64<br/>
     *
     * @param reservationName <p>
     *            A customer-specified identifier to track this reservation.
     *            </p>
     */
    public void setReservationName(String reservationName) {
        this.reservationName = reservationName;
    }

    /**
     * <p>
     * A customer-specified identifier to track this reservation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 64<br/>
     *
     * @param reservationName <p>
     *            A customer-specified identifier to track this reservation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PurchaseReservedElasticsearchInstanceOfferingRequest withReservationName(
            String reservationName) {
        this.reservationName = reservationName;
        return this;
    }

    /**
     * <p>
     * The number of Elasticsearch instances to reserve.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         The number of Elasticsearch instances to reserve.
     *         </p>
     */
    public Integer getInstanceCount() {
        return instanceCount;
    }

    /**
     * <p>
     * The number of Elasticsearch instances to reserve.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param instanceCount <p>
     *            The number of Elasticsearch instances to reserve.
     *            </p>
     */
    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }

    /**
     * <p>
     * The number of Elasticsearch instances to reserve.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param instanceCount <p>
     *            The number of Elasticsearch instances to reserve.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PurchaseReservedElasticsearchInstanceOfferingRequest withInstanceCount(
            Integer instanceCount) {
        this.instanceCount = instanceCount;
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
        if (getReservedElasticsearchInstanceOfferingId() != null)
            sb.append("ReservedElasticsearchInstanceOfferingId: "
                    + getReservedElasticsearchInstanceOfferingId() + ",");
        if (getReservationName() != null)
            sb.append("ReservationName: " + getReservationName() + ",");
        if (getInstanceCount() != null)
            sb.append("InstanceCount: " + getInstanceCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getReservedElasticsearchInstanceOfferingId() == null) ? 0
                        : getReservedElasticsearchInstanceOfferingId().hashCode());
        hashCode = prime * hashCode
                + ((getReservationName() == null) ? 0 : getReservationName().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceCount() == null) ? 0 : getInstanceCount().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PurchaseReservedElasticsearchInstanceOfferingRequest == false)
            return false;
        PurchaseReservedElasticsearchInstanceOfferingRequest other = (PurchaseReservedElasticsearchInstanceOfferingRequest) obj;

        if (other.getReservedElasticsearchInstanceOfferingId() == null
                ^ this.getReservedElasticsearchInstanceOfferingId() == null)
            return false;
        if (other.getReservedElasticsearchInstanceOfferingId() != null
                && other.getReservedElasticsearchInstanceOfferingId().equals(
                        this.getReservedElasticsearchInstanceOfferingId()) == false)
            return false;
        if (other.getReservationName() == null ^ this.getReservationName() == null)
            return false;
        if (other.getReservationName() != null
                && other.getReservationName().equals(this.getReservationName()) == false)
            return false;
        if (other.getInstanceCount() == null ^ this.getInstanceCount() == null)
            return false;
        if (other.getInstanceCount() != null
                && other.getInstanceCount().equals(this.getInstanceCount()) == false)
            return false;
        return true;
    }
}
