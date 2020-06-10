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
 * Describes the result of the purchase.
 * </p>
 */
public class Purchase implements Serializable {
    /**
     * <p>
     * The currency in which the <code>UpfrontPrice</code> and
     * <code>HourlyPrice</code> amounts are specified. At this time, the only
     * supported currency is <code>USD</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USD
     */
    private String currencyCode;

    /**
     * <p>
     * The duration of the reservation's term in seconds.
     * </p>
     */
    private Integer duration;

    /**
     * <p>
     * The IDs of the Dedicated Hosts associated with the reservation.
     * </p>
     */
    private java.util.List<String> hostIdSet;

    /**
     * <p>
     * The ID of the reservation.
     * </p>
     */
    private String hostReservationId;

    /**
     * <p>
     * The hourly price of the reservation per hour.
     * </p>
     */
    private String hourlyPrice;

    /**
     * <p>
     * The instance family on the Dedicated Host that the reservation can be
     * associated with.
     * </p>
     */
    private String instanceFamily;

    /**
     * <p>
     * The payment option for the reservation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AllUpfront, PartialUpfront, NoUpfront
     */
    private String paymentOption;

    /**
     * <p>
     * The upfront price of the reservation.
     * </p>
     */
    private String upfrontPrice;

    /**
     * <p>
     * The currency in which the <code>UpfrontPrice</code> and
     * <code>HourlyPrice</code> amounts are specified. At this time, the only
     * supported currency is <code>USD</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USD
     *
     * @return <p>
     *         The currency in which the <code>UpfrontPrice</code> and
     *         <code>HourlyPrice</code> amounts are specified. At this time, the
     *         only supported currency is <code>USD</code>.
     *         </p>
     * @see CurrencyCodeValues
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * <p>
     * The currency in which the <code>UpfrontPrice</code> and
     * <code>HourlyPrice</code> amounts are specified. At this time, the only
     * supported currency is <code>USD</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USD
     *
     * @param currencyCode <p>
     *            The currency in which the <code>UpfrontPrice</code> and
     *            <code>HourlyPrice</code> amounts are specified. At this time,
     *            the only supported currency is <code>USD</code>.
     *            </p>
     * @see CurrencyCodeValues
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * <p>
     * The currency in which the <code>UpfrontPrice</code> and
     * <code>HourlyPrice</code> amounts are specified. At this time, the only
     * supported currency is <code>USD</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USD
     *
     * @param currencyCode <p>
     *            The currency in which the <code>UpfrontPrice</code> and
     *            <code>HourlyPrice</code> amounts are specified. At this time,
     *            the only supported currency is <code>USD</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CurrencyCodeValues
     */
    public Purchase withCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    /**
     * <p>
     * The currency in which the <code>UpfrontPrice</code> and
     * <code>HourlyPrice</code> amounts are specified. At this time, the only
     * supported currency is <code>USD</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USD
     *
     * @param currencyCode <p>
     *            The currency in which the <code>UpfrontPrice</code> and
     *            <code>HourlyPrice</code> amounts are specified. At this time,
     *            the only supported currency is <code>USD</code>.
     *            </p>
     * @see CurrencyCodeValues
     */
    public void setCurrencyCode(CurrencyCodeValues currencyCode) {
        this.currencyCode = currencyCode.toString();
    }

    /**
     * <p>
     * The currency in which the <code>UpfrontPrice</code> and
     * <code>HourlyPrice</code> amounts are specified. At this time, the only
     * supported currency is <code>USD</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USD
     *
     * @param currencyCode <p>
     *            The currency in which the <code>UpfrontPrice</code> and
     *            <code>HourlyPrice</code> amounts are specified. At this time,
     *            the only supported currency is <code>USD</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CurrencyCodeValues
     */
    public Purchase withCurrencyCode(CurrencyCodeValues currencyCode) {
        this.currencyCode = currencyCode.toString();
        return this;
    }

    /**
     * <p>
     * The duration of the reservation's term in seconds.
     * </p>
     *
     * @return <p>
     *         The duration of the reservation's term in seconds.
     *         </p>
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * <p>
     * The duration of the reservation's term in seconds.
     * </p>
     *
     * @param duration <p>
     *            The duration of the reservation's term in seconds.
     *            </p>
     */
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * <p>
     * The duration of the reservation's term in seconds.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param duration <p>
     *            The duration of the reservation's term in seconds.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Purchase withDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /**
     * <p>
     * The IDs of the Dedicated Hosts associated with the reservation.
     * </p>
     *
     * @return <p>
     *         The IDs of the Dedicated Hosts associated with the reservation.
     *         </p>
     */
    public java.util.List<String> getHostIdSet() {
        return hostIdSet;
    }

    /**
     * <p>
     * The IDs of the Dedicated Hosts associated with the reservation.
     * </p>
     *
     * @param hostIdSet <p>
     *            The IDs of the Dedicated Hosts associated with the
     *            reservation.
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
     * The IDs of the Dedicated Hosts associated with the reservation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hostIdSet <p>
     *            The IDs of the Dedicated Hosts associated with the
     *            reservation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Purchase withHostIdSet(String... hostIdSet) {
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
     * The IDs of the Dedicated Hosts associated with the reservation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hostIdSet <p>
     *            The IDs of the Dedicated Hosts associated with the
     *            reservation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Purchase withHostIdSet(java.util.Collection<String> hostIdSet) {
        setHostIdSet(hostIdSet);
        return this;
    }

    /**
     * <p>
     * The ID of the reservation.
     * </p>
     *
     * @return <p>
     *         The ID of the reservation.
     *         </p>
     */
    public String getHostReservationId() {
        return hostReservationId;
    }

    /**
     * <p>
     * The ID of the reservation.
     * </p>
     *
     * @param hostReservationId <p>
     *            The ID of the reservation.
     *            </p>
     */
    public void setHostReservationId(String hostReservationId) {
        this.hostReservationId = hostReservationId;
    }

    /**
     * <p>
     * The ID of the reservation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hostReservationId <p>
     *            The ID of the reservation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Purchase withHostReservationId(String hostReservationId) {
        this.hostReservationId = hostReservationId;
        return this;
    }

    /**
     * <p>
     * The hourly price of the reservation per hour.
     * </p>
     *
     * @return <p>
     *         The hourly price of the reservation per hour.
     *         </p>
     */
    public String getHourlyPrice() {
        return hourlyPrice;
    }

    /**
     * <p>
     * The hourly price of the reservation per hour.
     * </p>
     *
     * @param hourlyPrice <p>
     *            The hourly price of the reservation per hour.
     *            </p>
     */
    public void setHourlyPrice(String hourlyPrice) {
        this.hourlyPrice = hourlyPrice;
    }

    /**
     * <p>
     * The hourly price of the reservation per hour.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hourlyPrice <p>
     *            The hourly price of the reservation per hour.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Purchase withHourlyPrice(String hourlyPrice) {
        this.hourlyPrice = hourlyPrice;
        return this;
    }

    /**
     * <p>
     * The instance family on the Dedicated Host that the reservation can be
     * associated with.
     * </p>
     *
     * @return <p>
     *         The instance family on the Dedicated Host that the reservation
     *         can be associated with.
     *         </p>
     */
    public String getInstanceFamily() {
        return instanceFamily;
    }

    /**
     * <p>
     * The instance family on the Dedicated Host that the reservation can be
     * associated with.
     * </p>
     *
     * @param instanceFamily <p>
     *            The instance family on the Dedicated Host that the reservation
     *            can be associated with.
     *            </p>
     */
    public void setInstanceFamily(String instanceFamily) {
        this.instanceFamily = instanceFamily;
    }

    /**
     * <p>
     * The instance family on the Dedicated Host that the reservation can be
     * associated with.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceFamily <p>
     *            The instance family on the Dedicated Host that the reservation
     *            can be associated with.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Purchase withInstanceFamily(String instanceFamily) {
        this.instanceFamily = instanceFamily;
        return this;
    }

    /**
     * <p>
     * The payment option for the reservation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AllUpfront, PartialUpfront, NoUpfront
     *
     * @return <p>
     *         The payment option for the reservation.
     *         </p>
     * @see PaymentOption
     */
    public String getPaymentOption() {
        return paymentOption;
    }

    /**
     * <p>
     * The payment option for the reservation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AllUpfront, PartialUpfront, NoUpfront
     *
     * @param paymentOption <p>
     *            The payment option for the reservation.
     *            </p>
     * @see PaymentOption
     */
    public void setPaymentOption(String paymentOption) {
        this.paymentOption = paymentOption;
    }

    /**
     * <p>
     * The payment option for the reservation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AllUpfront, PartialUpfront, NoUpfront
     *
     * @param paymentOption <p>
     *            The payment option for the reservation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PaymentOption
     */
    public Purchase withPaymentOption(String paymentOption) {
        this.paymentOption = paymentOption;
        return this;
    }

    /**
     * <p>
     * The payment option for the reservation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AllUpfront, PartialUpfront, NoUpfront
     *
     * @param paymentOption <p>
     *            The payment option for the reservation.
     *            </p>
     * @see PaymentOption
     */
    public void setPaymentOption(PaymentOption paymentOption) {
        this.paymentOption = paymentOption.toString();
    }

    /**
     * <p>
     * The payment option for the reservation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AllUpfront, PartialUpfront, NoUpfront
     *
     * @param paymentOption <p>
     *            The payment option for the reservation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PaymentOption
     */
    public Purchase withPaymentOption(PaymentOption paymentOption) {
        this.paymentOption = paymentOption.toString();
        return this;
    }

    /**
     * <p>
     * The upfront price of the reservation.
     * </p>
     *
     * @return <p>
     *         The upfront price of the reservation.
     *         </p>
     */
    public String getUpfrontPrice() {
        return upfrontPrice;
    }

    /**
     * <p>
     * The upfront price of the reservation.
     * </p>
     *
     * @param upfrontPrice <p>
     *            The upfront price of the reservation.
     *            </p>
     */
    public void setUpfrontPrice(String upfrontPrice) {
        this.upfrontPrice = upfrontPrice;
    }

    /**
     * <p>
     * The upfront price of the reservation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param upfrontPrice <p>
     *            The upfront price of the reservation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Purchase withUpfrontPrice(String upfrontPrice) {
        this.upfrontPrice = upfrontPrice;
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
        if (getDuration() != null)
            sb.append("Duration: " + getDuration() + ",");
        if (getHostIdSet() != null)
            sb.append("HostIdSet: " + getHostIdSet() + ",");
        if (getHostReservationId() != null)
            sb.append("HostReservationId: " + getHostReservationId() + ",");
        if (getHourlyPrice() != null)
            sb.append("HourlyPrice: " + getHourlyPrice() + ",");
        if (getInstanceFamily() != null)
            sb.append("InstanceFamily: " + getInstanceFamily() + ",");
        if (getPaymentOption() != null)
            sb.append("PaymentOption: " + getPaymentOption() + ",");
        if (getUpfrontPrice() != null)
            sb.append("UpfrontPrice: " + getUpfrontPrice());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCurrencyCode() == null) ? 0 : getCurrencyCode().hashCode());
        hashCode = prime * hashCode + ((getDuration() == null) ? 0 : getDuration().hashCode());
        hashCode = prime * hashCode + ((getHostIdSet() == null) ? 0 : getHostIdSet().hashCode());
        hashCode = prime * hashCode
                + ((getHostReservationId() == null) ? 0 : getHostReservationId().hashCode());
        hashCode = prime * hashCode
                + ((getHourlyPrice() == null) ? 0 : getHourlyPrice().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceFamily() == null) ? 0 : getInstanceFamily().hashCode());
        hashCode = prime * hashCode
                + ((getPaymentOption() == null) ? 0 : getPaymentOption().hashCode());
        hashCode = prime * hashCode
                + ((getUpfrontPrice() == null) ? 0 : getUpfrontPrice().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Purchase == false)
            return false;
        Purchase other = (Purchase) obj;

        if (other.getCurrencyCode() == null ^ this.getCurrencyCode() == null)
            return false;
        if (other.getCurrencyCode() != null
                && other.getCurrencyCode().equals(this.getCurrencyCode()) == false)
            return false;
        if (other.getDuration() == null ^ this.getDuration() == null)
            return false;
        if (other.getDuration() != null && other.getDuration().equals(this.getDuration()) == false)
            return false;
        if (other.getHostIdSet() == null ^ this.getHostIdSet() == null)
            return false;
        if (other.getHostIdSet() != null
                && other.getHostIdSet().equals(this.getHostIdSet()) == false)
            return false;
        if (other.getHostReservationId() == null ^ this.getHostReservationId() == null)
            return false;
        if (other.getHostReservationId() != null
                && other.getHostReservationId().equals(this.getHostReservationId()) == false)
            return false;
        if (other.getHourlyPrice() == null ^ this.getHourlyPrice() == null)
            return false;
        if (other.getHourlyPrice() != null
                && other.getHourlyPrice().equals(this.getHourlyPrice()) == false)
            return false;
        if (other.getInstanceFamily() == null ^ this.getInstanceFamily() == null)
            return false;
        if (other.getInstanceFamily() != null
                && other.getInstanceFamily().equals(this.getInstanceFamily()) == false)
            return false;
        if (other.getPaymentOption() == null ^ this.getPaymentOption() == null)
            return false;
        if (other.getPaymentOption() != null
                && other.getPaymentOption().equals(this.getPaymentOption()) == false)
            return false;
        if (other.getUpfrontPrice() == null ^ this.getUpfrontPrice() == null)
            return false;
        if (other.getUpfrontPrice() != null
                && other.getUpfrontPrice().equals(this.getUpfrontPrice()) == false)
            return false;
        return true;
    }
}
