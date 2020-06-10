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
 * Details about the Dedicated Host Reservation and associated Dedicated Hosts.
 * </p>
 */
public class HostReservation implements Serializable {
    /**
     * <p>
     * The number of Dedicated Hosts the reservation is associated with.
     * </p>
     */
    private Integer count;

    /**
     * <p>
     * The currency in which the <code>upfrontPrice</code> and
     * <code>hourlyPrice</code> amounts are specified. At this time, the only
     * supported currency is <code>USD</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USD
     */
    private String currencyCode;

    /**
     * <p>
     * The length of the reservation's term, specified in seconds. Can be
     * <code>31536000 (1 year)</code> | <code>94608000 (3 years)</code>.
     * </p>
     */
    private Integer duration;

    /**
     * <p>
     * The date and time that the reservation ends.
     * </p>
     */
    private java.util.Date end;

    /**
     * <p>
     * The IDs of the Dedicated Hosts associated with the reservation.
     * </p>
     */
    private java.util.List<String> hostIdSet;

    /**
     * <p>
     * The ID of the reservation that specifies the associated Dedicated Hosts.
     * </p>
     */
    private String hostReservationId;

    /**
     * <p>
     * The hourly price of the reservation.
     * </p>
     */
    private String hourlyPrice;

    /**
     * <p>
     * The instance family of the Dedicated Host Reservation. The instance
     * family on the Dedicated Host must be the same in order for it to benefit
     * from the reservation.
     * </p>
     */
    private String instanceFamily;

    /**
     * <p>
     * The ID of the reservation. This remains the same regardless of which
     * Dedicated Hosts are associated with it.
     * </p>
     */
    private String offeringId;

    /**
     * <p>
     * The payment option selected for this reservation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AllUpfront, PartialUpfront, NoUpfront
     */
    private String paymentOption;

    /**
     * <p>
     * The date and time that the reservation started.
     * </p>
     */
    private java.util.Date start;

    /**
     * <p>
     * The state of the reservation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>payment-pending, payment-failed, active, retired
     */
    private String state;

    /**
     * <p>
     * The upfront price of the reservation.
     * </p>
     */
    private String upfrontPrice;

    /**
     * <p>
     * Any tags assigned to the Dedicated Host Reservation.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The number of Dedicated Hosts the reservation is associated with.
     * </p>
     *
     * @return <p>
     *         The number of Dedicated Hosts the reservation is associated with.
     *         </p>
     */
    public Integer getCount() {
        return count;
    }

    /**
     * <p>
     * The number of Dedicated Hosts the reservation is associated with.
     * </p>
     *
     * @param count <p>
     *            The number of Dedicated Hosts the reservation is associated
     *            with.
     *            </p>
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * <p>
     * The number of Dedicated Hosts the reservation is associated with.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param count <p>
     *            The number of Dedicated Hosts the reservation is associated
     *            with.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HostReservation withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * <p>
     * The currency in which the <code>upfrontPrice</code> and
     * <code>hourlyPrice</code> amounts are specified. At this time, the only
     * supported currency is <code>USD</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USD
     *
     * @return <p>
     *         The currency in which the <code>upfrontPrice</code> and
     *         <code>hourlyPrice</code> amounts are specified. At this time, the
     *         only supported currency is <code>USD</code>.
     *         </p>
     * @see CurrencyCodeValues
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * <p>
     * The currency in which the <code>upfrontPrice</code> and
     * <code>hourlyPrice</code> amounts are specified. At this time, the only
     * supported currency is <code>USD</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USD
     *
     * @param currencyCode <p>
     *            The currency in which the <code>upfrontPrice</code> and
     *            <code>hourlyPrice</code> amounts are specified. At this time,
     *            the only supported currency is <code>USD</code>.
     *            </p>
     * @see CurrencyCodeValues
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * <p>
     * The currency in which the <code>upfrontPrice</code> and
     * <code>hourlyPrice</code> amounts are specified. At this time, the only
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
     *            The currency in which the <code>upfrontPrice</code> and
     *            <code>hourlyPrice</code> amounts are specified. At this time,
     *            the only supported currency is <code>USD</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CurrencyCodeValues
     */
    public HostReservation withCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    /**
     * <p>
     * The currency in which the <code>upfrontPrice</code> and
     * <code>hourlyPrice</code> amounts are specified. At this time, the only
     * supported currency is <code>USD</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USD
     *
     * @param currencyCode <p>
     *            The currency in which the <code>upfrontPrice</code> and
     *            <code>hourlyPrice</code> amounts are specified. At this time,
     *            the only supported currency is <code>USD</code>.
     *            </p>
     * @see CurrencyCodeValues
     */
    public void setCurrencyCode(CurrencyCodeValues currencyCode) {
        this.currencyCode = currencyCode.toString();
    }

    /**
     * <p>
     * The currency in which the <code>upfrontPrice</code> and
     * <code>hourlyPrice</code> amounts are specified. At this time, the only
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
     *            The currency in which the <code>upfrontPrice</code> and
     *            <code>hourlyPrice</code> amounts are specified. At this time,
     *            the only supported currency is <code>USD</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CurrencyCodeValues
     */
    public HostReservation withCurrencyCode(CurrencyCodeValues currencyCode) {
        this.currencyCode = currencyCode.toString();
        return this;
    }

    /**
     * <p>
     * The length of the reservation's term, specified in seconds. Can be
     * <code>31536000 (1 year)</code> | <code>94608000 (3 years)</code>.
     * </p>
     *
     * @return <p>
     *         The length of the reservation's term, specified in seconds. Can
     *         be <code>31536000 (1 year)</code> |
     *         <code>94608000 (3 years)</code>.
     *         </p>
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * <p>
     * The length of the reservation's term, specified in seconds. Can be
     * <code>31536000 (1 year)</code> | <code>94608000 (3 years)</code>.
     * </p>
     *
     * @param duration <p>
     *            The length of the reservation's term, specified in seconds.
     *            Can be <code>31536000 (1 year)</code> |
     *            <code>94608000 (3 years)</code>.
     *            </p>
     */
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * <p>
     * The length of the reservation's term, specified in seconds. Can be
     * <code>31536000 (1 year)</code> | <code>94608000 (3 years)</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param duration <p>
     *            The length of the reservation's term, specified in seconds.
     *            Can be <code>31536000 (1 year)</code> |
     *            <code>94608000 (3 years)</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HostReservation withDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /**
     * <p>
     * The date and time that the reservation ends.
     * </p>
     *
     * @return <p>
     *         The date and time that the reservation ends.
     *         </p>
     */
    public java.util.Date getEnd() {
        return end;
    }

    /**
     * <p>
     * The date and time that the reservation ends.
     * </p>
     *
     * @param end <p>
     *            The date and time that the reservation ends.
     *            </p>
     */
    public void setEnd(java.util.Date end) {
        this.end = end;
    }

    /**
     * <p>
     * The date and time that the reservation ends.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param end <p>
     *            The date and time that the reservation ends.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HostReservation withEnd(java.util.Date end) {
        this.end = end;
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
    public HostReservation withHostIdSet(String... hostIdSet) {
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
    public HostReservation withHostIdSet(java.util.Collection<String> hostIdSet) {
        setHostIdSet(hostIdSet);
        return this;
    }

    /**
     * <p>
     * The ID of the reservation that specifies the associated Dedicated Hosts.
     * </p>
     *
     * @return <p>
     *         The ID of the reservation that specifies the associated Dedicated
     *         Hosts.
     *         </p>
     */
    public String getHostReservationId() {
        return hostReservationId;
    }

    /**
     * <p>
     * The ID of the reservation that specifies the associated Dedicated Hosts.
     * </p>
     *
     * @param hostReservationId <p>
     *            The ID of the reservation that specifies the associated
     *            Dedicated Hosts.
     *            </p>
     */
    public void setHostReservationId(String hostReservationId) {
        this.hostReservationId = hostReservationId;
    }

    /**
     * <p>
     * The ID of the reservation that specifies the associated Dedicated Hosts.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hostReservationId <p>
     *            The ID of the reservation that specifies the associated
     *            Dedicated Hosts.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HostReservation withHostReservationId(String hostReservationId) {
        this.hostReservationId = hostReservationId;
        return this;
    }

    /**
     * <p>
     * The hourly price of the reservation.
     * </p>
     *
     * @return <p>
     *         The hourly price of the reservation.
     *         </p>
     */
    public String getHourlyPrice() {
        return hourlyPrice;
    }

    /**
     * <p>
     * The hourly price of the reservation.
     * </p>
     *
     * @param hourlyPrice <p>
     *            The hourly price of the reservation.
     *            </p>
     */
    public void setHourlyPrice(String hourlyPrice) {
        this.hourlyPrice = hourlyPrice;
    }

    /**
     * <p>
     * The hourly price of the reservation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hourlyPrice <p>
     *            The hourly price of the reservation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HostReservation withHourlyPrice(String hourlyPrice) {
        this.hourlyPrice = hourlyPrice;
        return this;
    }

    /**
     * <p>
     * The instance family of the Dedicated Host Reservation. The instance
     * family on the Dedicated Host must be the same in order for it to benefit
     * from the reservation.
     * </p>
     *
     * @return <p>
     *         The instance family of the Dedicated Host Reservation. The
     *         instance family on the Dedicated Host must be the same in order
     *         for it to benefit from the reservation.
     *         </p>
     */
    public String getInstanceFamily() {
        return instanceFamily;
    }

    /**
     * <p>
     * The instance family of the Dedicated Host Reservation. The instance
     * family on the Dedicated Host must be the same in order for it to benefit
     * from the reservation.
     * </p>
     *
     * @param instanceFamily <p>
     *            The instance family of the Dedicated Host Reservation. The
     *            instance family on the Dedicated Host must be the same in
     *            order for it to benefit from the reservation.
     *            </p>
     */
    public void setInstanceFamily(String instanceFamily) {
        this.instanceFamily = instanceFamily;
    }

    /**
     * <p>
     * The instance family of the Dedicated Host Reservation. The instance
     * family on the Dedicated Host must be the same in order for it to benefit
     * from the reservation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceFamily <p>
     *            The instance family of the Dedicated Host Reservation. The
     *            instance family on the Dedicated Host must be the same in
     *            order for it to benefit from the reservation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HostReservation withInstanceFamily(String instanceFamily) {
        this.instanceFamily = instanceFamily;
        return this;
    }

    /**
     * <p>
     * The ID of the reservation. This remains the same regardless of which
     * Dedicated Hosts are associated with it.
     * </p>
     *
     * @return <p>
     *         The ID of the reservation. This remains the same regardless of
     *         which Dedicated Hosts are associated with it.
     *         </p>
     */
    public String getOfferingId() {
        return offeringId;
    }

    /**
     * <p>
     * The ID of the reservation. This remains the same regardless of which
     * Dedicated Hosts are associated with it.
     * </p>
     *
     * @param offeringId <p>
     *            The ID of the reservation. This remains the same regardless of
     *            which Dedicated Hosts are associated with it.
     *            </p>
     */
    public void setOfferingId(String offeringId) {
        this.offeringId = offeringId;
    }

    /**
     * <p>
     * The ID of the reservation. This remains the same regardless of which
     * Dedicated Hosts are associated with it.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param offeringId <p>
     *            The ID of the reservation. This remains the same regardless of
     *            which Dedicated Hosts are associated with it.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HostReservation withOfferingId(String offeringId) {
        this.offeringId = offeringId;
        return this;
    }

    /**
     * <p>
     * The payment option selected for this reservation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AllUpfront, PartialUpfront, NoUpfront
     *
     * @return <p>
     *         The payment option selected for this reservation.
     *         </p>
     * @see PaymentOption
     */
    public String getPaymentOption() {
        return paymentOption;
    }

    /**
     * <p>
     * The payment option selected for this reservation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AllUpfront, PartialUpfront, NoUpfront
     *
     * @param paymentOption <p>
     *            The payment option selected for this reservation.
     *            </p>
     * @see PaymentOption
     */
    public void setPaymentOption(String paymentOption) {
        this.paymentOption = paymentOption;
    }

    /**
     * <p>
     * The payment option selected for this reservation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AllUpfront, PartialUpfront, NoUpfront
     *
     * @param paymentOption <p>
     *            The payment option selected for this reservation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PaymentOption
     */
    public HostReservation withPaymentOption(String paymentOption) {
        this.paymentOption = paymentOption;
        return this;
    }

    /**
     * <p>
     * The payment option selected for this reservation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AllUpfront, PartialUpfront, NoUpfront
     *
     * @param paymentOption <p>
     *            The payment option selected for this reservation.
     *            </p>
     * @see PaymentOption
     */
    public void setPaymentOption(PaymentOption paymentOption) {
        this.paymentOption = paymentOption.toString();
    }

    /**
     * <p>
     * The payment option selected for this reservation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AllUpfront, PartialUpfront, NoUpfront
     *
     * @param paymentOption <p>
     *            The payment option selected for this reservation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PaymentOption
     */
    public HostReservation withPaymentOption(PaymentOption paymentOption) {
        this.paymentOption = paymentOption.toString();
        return this;
    }

    /**
     * <p>
     * The date and time that the reservation started.
     * </p>
     *
     * @return <p>
     *         The date and time that the reservation started.
     *         </p>
     */
    public java.util.Date getStart() {
        return start;
    }

    /**
     * <p>
     * The date and time that the reservation started.
     * </p>
     *
     * @param start <p>
     *            The date and time that the reservation started.
     *            </p>
     */
    public void setStart(java.util.Date start) {
        this.start = start;
    }

    /**
     * <p>
     * The date and time that the reservation started.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param start <p>
     *            The date and time that the reservation started.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HostReservation withStart(java.util.Date start) {
        this.start = start;
        return this;
    }

    /**
     * <p>
     * The state of the reservation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>payment-pending, payment-failed, active, retired
     *
     * @return <p>
     *         The state of the reservation.
     *         </p>
     * @see ReservationState
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The state of the reservation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>payment-pending, payment-failed, active, retired
     *
     * @param state <p>
     *            The state of the reservation.
     *            </p>
     * @see ReservationState
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the reservation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>payment-pending, payment-failed, active, retired
     *
     * @param state <p>
     *            The state of the reservation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ReservationState
     */
    public HostReservation withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The state of the reservation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>payment-pending, payment-failed, active, retired
     *
     * @param state <p>
     *            The state of the reservation.
     *            </p>
     * @see ReservationState
     */
    public void setState(ReservationState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The state of the reservation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>payment-pending, payment-failed, active, retired
     *
     * @param state <p>
     *            The state of the reservation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ReservationState
     */
    public HostReservation withState(ReservationState state) {
        this.state = state.toString();
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
    public HostReservation withUpfrontPrice(String upfrontPrice) {
        this.upfrontPrice = upfrontPrice;
        return this;
    }

    /**
     * <p>
     * Any tags assigned to the Dedicated Host Reservation.
     * </p>
     *
     * @return <p>
     *         Any tags assigned to the Dedicated Host Reservation.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Any tags assigned to the Dedicated Host Reservation.
     * </p>
     *
     * @param tags <p>
     *            Any tags assigned to the Dedicated Host Reservation.
     *            </p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Any tags assigned to the Dedicated Host Reservation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Any tags assigned to the Dedicated Host Reservation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HostReservation withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Any tags assigned to the Dedicated Host Reservation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Any tags assigned to the Dedicated Host Reservation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HostReservation withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getCount() != null)
            sb.append("Count: " + getCount() + ",");
        if (getCurrencyCode() != null)
            sb.append("CurrencyCode: " + getCurrencyCode() + ",");
        if (getDuration() != null)
            sb.append("Duration: " + getDuration() + ",");
        if (getEnd() != null)
            sb.append("End: " + getEnd() + ",");
        if (getHostIdSet() != null)
            sb.append("HostIdSet: " + getHostIdSet() + ",");
        if (getHostReservationId() != null)
            sb.append("HostReservationId: " + getHostReservationId() + ",");
        if (getHourlyPrice() != null)
            sb.append("HourlyPrice: " + getHourlyPrice() + ",");
        if (getInstanceFamily() != null)
            sb.append("InstanceFamily: " + getInstanceFamily() + ",");
        if (getOfferingId() != null)
            sb.append("OfferingId: " + getOfferingId() + ",");
        if (getPaymentOption() != null)
            sb.append("PaymentOption: " + getPaymentOption() + ",");
        if (getStart() != null)
            sb.append("Start: " + getStart() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getUpfrontPrice() != null)
            sb.append("UpfrontPrice: " + getUpfrontPrice() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        hashCode = prime * hashCode
                + ((getCurrencyCode() == null) ? 0 : getCurrencyCode().hashCode());
        hashCode = prime * hashCode + ((getDuration() == null) ? 0 : getDuration().hashCode());
        hashCode = prime * hashCode + ((getEnd() == null) ? 0 : getEnd().hashCode());
        hashCode = prime * hashCode + ((getHostIdSet() == null) ? 0 : getHostIdSet().hashCode());
        hashCode = prime * hashCode
                + ((getHostReservationId() == null) ? 0 : getHostReservationId().hashCode());
        hashCode = prime * hashCode
                + ((getHourlyPrice() == null) ? 0 : getHourlyPrice().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceFamily() == null) ? 0 : getInstanceFamily().hashCode());
        hashCode = prime * hashCode + ((getOfferingId() == null) ? 0 : getOfferingId().hashCode());
        hashCode = prime * hashCode
                + ((getPaymentOption() == null) ? 0 : getPaymentOption().hashCode());
        hashCode = prime * hashCode + ((getStart() == null) ? 0 : getStart().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode
                + ((getUpfrontPrice() == null) ? 0 : getUpfrontPrice().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HostReservation == false)
            return false;
        HostReservation other = (HostReservation) obj;

        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
            return false;
        if (other.getCurrencyCode() == null ^ this.getCurrencyCode() == null)
            return false;
        if (other.getCurrencyCode() != null
                && other.getCurrencyCode().equals(this.getCurrencyCode()) == false)
            return false;
        if (other.getDuration() == null ^ this.getDuration() == null)
            return false;
        if (other.getDuration() != null && other.getDuration().equals(this.getDuration()) == false)
            return false;
        if (other.getEnd() == null ^ this.getEnd() == null)
            return false;
        if (other.getEnd() != null && other.getEnd().equals(this.getEnd()) == false)
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
        if (other.getOfferingId() == null ^ this.getOfferingId() == null)
            return false;
        if (other.getOfferingId() != null
                && other.getOfferingId().equals(this.getOfferingId()) == false)
            return false;
        if (other.getPaymentOption() == null ^ this.getPaymentOption() == null)
            return false;
        if (other.getPaymentOption() != null
                && other.getPaymentOption().equals(this.getPaymentOption()) == false)
            return false;
        if (other.getStart() == null ^ this.getStart() == null)
            return false;
        if (other.getStart() != null && other.getStart().equals(this.getStart()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getUpfrontPrice() == null ^ this.getUpfrontPrice() == null)
            return false;
        if (other.getUpfrontPrice() != null
                && other.getUpfrontPrice().equals(this.getUpfrontPrice()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
