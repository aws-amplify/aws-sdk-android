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

public class GetHostReservationPurchasePreviewResult implements Serializable {
    /**
     * <p>
     * The currency in which the <code>totalUpfrontPrice</code> and
     * <code>totalHourlyPrice</code> amounts are specified. At this time, the
     * only supported currency is <code>USD</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USD
     */
    private String currencyCode;

    /**
     * <p>
     * The purchase information of the Dedicated Host reservation and the
     * Dedicated Hosts associated with it.
     * </p>
     */
    private java.util.List<Purchase> purchase;

    /**
     * <p>
     * The potential total hourly price of the reservation per hour.
     * </p>
     */
    private String totalHourlyPrice;

    /**
     * <p>
     * The potential total upfront price. This is billed immediately.
     * </p>
     */
    private String totalUpfrontPrice;

    /**
     * <p>
     * The currency in which the <code>totalUpfrontPrice</code> and
     * <code>totalHourlyPrice</code> amounts are specified. At this time, the
     * only supported currency is <code>USD</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USD
     *
     * @return <p>
     *         The currency in which the <code>totalUpfrontPrice</code> and
     *         <code>totalHourlyPrice</code> amounts are specified. At this
     *         time, the only supported currency is <code>USD</code>.
     *         </p>
     * @see CurrencyCodeValues
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * <p>
     * The currency in which the <code>totalUpfrontPrice</code> and
     * <code>totalHourlyPrice</code> amounts are specified. At this time, the
     * only supported currency is <code>USD</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USD
     *
     * @param currencyCode <p>
     *            The currency in which the <code>totalUpfrontPrice</code> and
     *            <code>totalHourlyPrice</code> amounts are specified. At this
     *            time, the only supported currency is <code>USD</code>.
     *            </p>
     * @see CurrencyCodeValues
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * <p>
     * The currency in which the <code>totalUpfrontPrice</code> and
     * <code>totalHourlyPrice</code> amounts are specified. At this time, the
     * only supported currency is <code>USD</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USD
     *
     * @param currencyCode <p>
     *            The currency in which the <code>totalUpfrontPrice</code> and
     *            <code>totalHourlyPrice</code> amounts are specified. At this
     *            time, the only supported currency is <code>USD</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CurrencyCodeValues
     */
    public GetHostReservationPurchasePreviewResult withCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    /**
     * <p>
     * The currency in which the <code>totalUpfrontPrice</code> and
     * <code>totalHourlyPrice</code> amounts are specified. At this time, the
     * only supported currency is <code>USD</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USD
     *
     * @param currencyCode <p>
     *            The currency in which the <code>totalUpfrontPrice</code> and
     *            <code>totalHourlyPrice</code> amounts are specified. At this
     *            time, the only supported currency is <code>USD</code>.
     *            </p>
     * @see CurrencyCodeValues
     */
    public void setCurrencyCode(CurrencyCodeValues currencyCode) {
        this.currencyCode = currencyCode.toString();
    }

    /**
     * <p>
     * The currency in which the <code>totalUpfrontPrice</code> and
     * <code>totalHourlyPrice</code> amounts are specified. At this time, the
     * only supported currency is <code>USD</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USD
     *
     * @param currencyCode <p>
     *            The currency in which the <code>totalUpfrontPrice</code> and
     *            <code>totalHourlyPrice</code> amounts are specified. At this
     *            time, the only supported currency is <code>USD</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CurrencyCodeValues
     */
    public GetHostReservationPurchasePreviewResult withCurrencyCode(CurrencyCodeValues currencyCode) {
        this.currencyCode = currencyCode.toString();
        return this;
    }

    /**
     * <p>
     * The purchase information of the Dedicated Host reservation and the
     * Dedicated Hosts associated with it.
     * </p>
     *
     * @return <p>
     *         The purchase information of the Dedicated Host reservation and
     *         the Dedicated Hosts associated with it.
     *         </p>
     */
    public java.util.List<Purchase> getPurchase() {
        return purchase;
    }

    /**
     * <p>
     * The purchase information of the Dedicated Host reservation and the
     * Dedicated Hosts associated with it.
     * </p>
     *
     * @param purchase <p>
     *            The purchase information of the Dedicated Host reservation and
     *            the Dedicated Hosts associated with it.
     *            </p>
     */
    public void setPurchase(java.util.Collection<Purchase> purchase) {
        if (purchase == null) {
            this.purchase = null;
            return;
        }

        this.purchase = new java.util.ArrayList<Purchase>(purchase);
    }

    /**
     * <p>
     * The purchase information of the Dedicated Host reservation and the
     * Dedicated Hosts associated with it.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param purchase <p>
     *            The purchase information of the Dedicated Host reservation and
     *            the Dedicated Hosts associated with it.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetHostReservationPurchasePreviewResult withPurchase(Purchase... purchase) {
        if (getPurchase() == null) {
            this.purchase = new java.util.ArrayList<Purchase>(purchase.length);
        }
        for (Purchase value : purchase) {
            this.purchase.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The purchase information of the Dedicated Host reservation and the
     * Dedicated Hosts associated with it.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param purchase <p>
     *            The purchase information of the Dedicated Host reservation and
     *            the Dedicated Hosts associated with it.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetHostReservationPurchasePreviewResult withPurchase(
            java.util.Collection<Purchase> purchase) {
        setPurchase(purchase);
        return this;
    }

    /**
     * <p>
     * The potential total hourly price of the reservation per hour.
     * </p>
     *
     * @return <p>
     *         The potential total hourly price of the reservation per hour.
     *         </p>
     */
    public String getTotalHourlyPrice() {
        return totalHourlyPrice;
    }

    /**
     * <p>
     * The potential total hourly price of the reservation per hour.
     * </p>
     *
     * @param totalHourlyPrice <p>
     *            The potential total hourly price of the reservation per hour.
     *            </p>
     */
    public void setTotalHourlyPrice(String totalHourlyPrice) {
        this.totalHourlyPrice = totalHourlyPrice;
    }

    /**
     * <p>
     * The potential total hourly price of the reservation per hour.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param totalHourlyPrice <p>
     *            The potential total hourly price of the reservation per hour.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetHostReservationPurchasePreviewResult withTotalHourlyPrice(String totalHourlyPrice) {
        this.totalHourlyPrice = totalHourlyPrice;
        return this;
    }

    /**
     * <p>
     * The potential total upfront price. This is billed immediately.
     * </p>
     *
     * @return <p>
     *         The potential total upfront price. This is billed immediately.
     *         </p>
     */
    public String getTotalUpfrontPrice() {
        return totalUpfrontPrice;
    }

    /**
     * <p>
     * The potential total upfront price. This is billed immediately.
     * </p>
     *
     * @param totalUpfrontPrice <p>
     *            The potential total upfront price. This is billed immediately.
     *            </p>
     */
    public void setTotalUpfrontPrice(String totalUpfrontPrice) {
        this.totalUpfrontPrice = totalUpfrontPrice;
    }

    /**
     * <p>
     * The potential total upfront price. This is billed immediately.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param totalUpfrontPrice <p>
     *            The potential total upfront price. This is billed immediately.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetHostReservationPurchasePreviewResult withTotalUpfrontPrice(String totalUpfrontPrice) {
        this.totalUpfrontPrice = totalUpfrontPrice;
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
        if (getCurrencyCode() != null)
            sb.append("CurrencyCode: " + getCurrencyCode() + ",");
        if (getPurchase() != null)
            sb.append("Purchase: " + getPurchase() + ",");
        if (getTotalHourlyPrice() != null)
            sb.append("TotalHourlyPrice: " + getTotalHourlyPrice() + ",");
        if (getTotalUpfrontPrice() != null)
            sb.append("TotalUpfrontPrice: " + getTotalUpfrontPrice());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCurrencyCode() == null) ? 0 : getCurrencyCode().hashCode());
        hashCode = prime * hashCode + ((getPurchase() == null) ? 0 : getPurchase().hashCode());
        hashCode = prime * hashCode
                + ((getTotalHourlyPrice() == null) ? 0 : getTotalHourlyPrice().hashCode());
        hashCode = prime * hashCode
                + ((getTotalUpfrontPrice() == null) ? 0 : getTotalUpfrontPrice().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetHostReservationPurchasePreviewResult == false)
            return false;
        GetHostReservationPurchasePreviewResult other = (GetHostReservationPurchasePreviewResult) obj;

        if (other.getCurrencyCode() == null ^ this.getCurrencyCode() == null)
            return false;
        if (other.getCurrencyCode() != null
                && other.getCurrencyCode().equals(this.getCurrencyCode()) == false)
            return false;
        if (other.getPurchase() == null ^ this.getPurchase() == null)
            return false;
        if (other.getPurchase() != null && other.getPurchase().equals(this.getPurchase()) == false)
            return false;
        if (other.getTotalHourlyPrice() == null ^ this.getTotalHourlyPrice() == null)
            return false;
        if (other.getTotalHourlyPrice() != null
                && other.getTotalHourlyPrice().equals(this.getTotalHourlyPrice()) == false)
            return false;
        if (other.getTotalUpfrontPrice() == null ^ this.getTotalUpfrontPrice() == null)
            return false;
        if (other.getTotalUpfrontPrice() != null
                && other.getTotalUpfrontPrice().equals(this.getTotalUpfrontPrice()) == false)
            return false;
        return true;
    }
}
