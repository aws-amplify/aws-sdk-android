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
 * Placeholder documentation for DescribeReservationResponse
 */
public class DescribeReservationResult implements Serializable {
    /**
     * Unique reservation ARN, e.g.
     * 'arn:aws:medialive:us-west-2:123456789012:reservation:1234567'
     */
    private String arn;

    /**
     * Number of reserved resources
     */
    private Integer count;

    /**
     * Currency code for usagePrice and fixedPrice in ISO-4217 format, e.g.
     * 'USD'
     */
    private String currencyCode;

    /**
     * Lease duration, e.g. '12'
     */
    private Integer duration;

    /**
     * Units for duration, e.g. 'MONTHS'
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MONTHS
     */
    private String durationUnits;

    /**
     * Reservation UTC end date and time in ISO-8601 format, e.g.
     * '2019-03-01T00:00:00'
     */
    private String end;

    /**
     * One-time charge for each reserved resource, e.g. '0.0' for a NO_UPFRONT
     * offering
     */
    private Double fixedPrice;

    /**
     * User specified reservation name
     */
    private String name;

    /**
     * Offering description, e.g. 'HD AVC output at 10-20 Mbps, 30 fps, and
     * standard VQ in US West (Oregon)'
     */
    private String offeringDescription;

    /**
     * Unique offering ID, e.g. '87654321'
     */
    private String offeringId;

    /**
     * Offering type, e.g. 'NO_UPFRONT'
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_UPFRONT
     */
    private String offeringType;

    /**
     * AWS region, e.g. 'us-west-2'
     */
    private String region;

    /**
     * Unique reservation ID, e.g. '1234567'
     */
    private String reservationId;

    /**
     * Resource configuration details
     */
    private ReservationResourceSpecification resourceSpecification;

    /**
     * Reservation UTC start date and time in ISO-8601 format, e.g.
     * '2018-03-01T00:00:00'
     */
    private String start;

    /**
     * Current state of reservation, e.g. 'ACTIVE'
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, EXPIRED, CANCELED, DELETED
     */
    private String state;

    /**
     * A collection of key-value pairs
     */
    private java.util.Map<String, String> tags;

    /**
     * Recurring usage charge for each reserved resource, e.g. '157.0'
     */
    private Double usagePrice;

    /**
     * Unique reservation ARN, e.g.
     * 'arn:aws:medialive:us-west-2:123456789012:reservation:1234567'
     *
     * @return Unique reservation ARN, e.g.
     *         'arn:aws:medialive:us-west-2:123456789012:reservation:1234567'
     */
    public String getArn() {
        return arn;
    }

    /**
     * Unique reservation ARN, e.g.
     * 'arn:aws:medialive:us-west-2:123456789012:reservation:1234567'
     *
     * @param arn Unique reservation ARN, e.g.
     *            'arn:aws:medialive:us-west-2:123456789012:reservation:1234567'
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * Unique reservation ARN, e.g.
     * 'arn:aws:medialive:us-west-2:123456789012:reservation:1234567'
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param arn Unique reservation ARN, e.g.
     *            'arn:aws:medialive:us-west-2:123456789012:reservation:1234567'
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeReservationResult withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * Number of reserved resources
     *
     * @return Number of reserved resources
     */
    public Integer getCount() {
        return count;
    }

    /**
     * Number of reserved resources
     *
     * @param count Number of reserved resources
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * Number of reserved resources
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param count Number of reserved resources
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeReservationResult withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * Currency code for usagePrice and fixedPrice in ISO-4217 format, e.g.
     * 'USD'
     *
     * @return Currency code for usagePrice and fixedPrice in ISO-4217 format,
     *         e.g. 'USD'
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Currency code for usagePrice and fixedPrice in ISO-4217 format, e.g.
     * 'USD'
     *
     * @param currencyCode Currency code for usagePrice and fixedPrice in
     *            ISO-4217 format, e.g. 'USD'
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * Currency code for usagePrice and fixedPrice in ISO-4217 format, e.g.
     * 'USD'
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param currencyCode Currency code for usagePrice and fixedPrice in
     *            ISO-4217 format, e.g. 'USD'
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeReservationResult withCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    /**
     * Lease duration, e.g. '12'
     *
     * @return Lease duration, e.g. '12'
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * Lease duration, e.g. '12'
     *
     * @param duration Lease duration, e.g. '12'
     */
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * Lease duration, e.g. '12'
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param duration Lease duration, e.g. '12'
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeReservationResult withDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /**
     * Units for duration, e.g. 'MONTHS'
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MONTHS
     *
     * @return Units for duration, e.g. 'MONTHS'
     * @see OfferingDurationUnits
     */
    public String getDurationUnits() {
        return durationUnits;
    }

    /**
     * Units for duration, e.g. 'MONTHS'
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MONTHS
     *
     * @param durationUnits Units for duration, e.g. 'MONTHS'
     * @see OfferingDurationUnits
     */
    public void setDurationUnits(String durationUnits) {
        this.durationUnits = durationUnits;
    }

    /**
     * Units for duration, e.g. 'MONTHS'
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MONTHS
     *
     * @param durationUnits Units for duration, e.g. 'MONTHS'
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OfferingDurationUnits
     */
    public DescribeReservationResult withDurationUnits(String durationUnits) {
        this.durationUnits = durationUnits;
        return this;
    }

    /**
     * Units for duration, e.g. 'MONTHS'
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MONTHS
     *
     * @param durationUnits Units for duration, e.g. 'MONTHS'
     * @see OfferingDurationUnits
     */
    public void setDurationUnits(OfferingDurationUnits durationUnits) {
        this.durationUnits = durationUnits.toString();
    }

    /**
     * Units for duration, e.g. 'MONTHS'
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MONTHS
     *
     * @param durationUnits Units for duration, e.g. 'MONTHS'
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OfferingDurationUnits
     */
    public DescribeReservationResult withDurationUnits(OfferingDurationUnits durationUnits) {
        this.durationUnits = durationUnits.toString();
        return this;
    }

    /**
     * Reservation UTC end date and time in ISO-8601 format, e.g.
     * '2019-03-01T00:00:00'
     *
     * @return Reservation UTC end date and time in ISO-8601 format, e.g.
     *         '2019-03-01T00:00:00'
     */
    public String getEnd() {
        return end;
    }

    /**
     * Reservation UTC end date and time in ISO-8601 format, e.g.
     * '2019-03-01T00:00:00'
     *
     * @param end Reservation UTC end date and time in ISO-8601 format, e.g.
     *            '2019-03-01T00:00:00'
     */
    public void setEnd(String end) {
        this.end = end;
    }

    /**
     * Reservation UTC end date and time in ISO-8601 format, e.g.
     * '2019-03-01T00:00:00'
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param end Reservation UTC end date and time in ISO-8601 format, e.g.
     *            '2019-03-01T00:00:00'
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeReservationResult withEnd(String end) {
        this.end = end;
        return this;
    }

    /**
     * One-time charge for each reserved resource, e.g. '0.0' for a NO_UPFRONT
     * offering
     *
     * @return One-time charge for each reserved resource, e.g. '0.0' for a
     *         NO_UPFRONT offering
     */
    public Double getFixedPrice() {
        return fixedPrice;
    }

    /**
     * One-time charge for each reserved resource, e.g. '0.0' for a NO_UPFRONT
     * offering
     *
     * @param fixedPrice One-time charge for each reserved resource, e.g. '0.0'
     *            for a NO_UPFRONT offering
     */
    public void setFixedPrice(Double fixedPrice) {
        this.fixedPrice = fixedPrice;
    }

    /**
     * One-time charge for each reserved resource, e.g. '0.0' for a NO_UPFRONT
     * offering
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fixedPrice One-time charge for each reserved resource, e.g. '0.0'
     *            for a NO_UPFRONT offering
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeReservationResult withFixedPrice(Double fixedPrice) {
        this.fixedPrice = fixedPrice;
        return this;
    }

    /**
     * User specified reservation name
     *
     * @return User specified reservation name
     */
    public String getName() {
        return name;
    }

    /**
     * User specified reservation name
     *
     * @param name User specified reservation name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * User specified reservation name
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name User specified reservation name
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeReservationResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Offering description, e.g. 'HD AVC output at 10-20 Mbps, 30 fps, and
     * standard VQ in US West (Oregon)'
     *
     * @return Offering description, e.g. 'HD AVC output at 10-20 Mbps, 30 fps,
     *         and standard VQ in US West (Oregon)'
     */
    public String getOfferingDescription() {
        return offeringDescription;
    }

    /**
     * Offering description, e.g. 'HD AVC output at 10-20 Mbps, 30 fps, and
     * standard VQ in US West (Oregon)'
     *
     * @param offeringDescription Offering description, e.g. 'HD AVC output at
     *            10-20 Mbps, 30 fps, and standard VQ in US West (Oregon)'
     */
    public void setOfferingDescription(String offeringDescription) {
        this.offeringDescription = offeringDescription;
    }

    /**
     * Offering description, e.g. 'HD AVC output at 10-20 Mbps, 30 fps, and
     * standard VQ in US West (Oregon)'
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param offeringDescription Offering description, e.g. 'HD AVC output at
     *            10-20 Mbps, 30 fps, and standard VQ in US West (Oregon)'
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeReservationResult withOfferingDescription(String offeringDescription) {
        this.offeringDescription = offeringDescription;
        return this;
    }

    /**
     * Unique offering ID, e.g. '87654321'
     *
     * @return Unique offering ID, e.g. '87654321'
     */
    public String getOfferingId() {
        return offeringId;
    }

    /**
     * Unique offering ID, e.g. '87654321'
     *
     * @param offeringId Unique offering ID, e.g. '87654321'
     */
    public void setOfferingId(String offeringId) {
        this.offeringId = offeringId;
    }

    /**
     * Unique offering ID, e.g. '87654321'
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param offeringId Unique offering ID, e.g. '87654321'
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeReservationResult withOfferingId(String offeringId) {
        this.offeringId = offeringId;
        return this;
    }

    /**
     * Offering type, e.g. 'NO_UPFRONT'
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_UPFRONT
     *
     * @return Offering type, e.g. 'NO_UPFRONT'
     * @see OfferingType
     */
    public String getOfferingType() {
        return offeringType;
    }

    /**
     * Offering type, e.g. 'NO_UPFRONT'
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_UPFRONT
     *
     * @param offeringType Offering type, e.g. 'NO_UPFRONT'
     * @see OfferingType
     */
    public void setOfferingType(String offeringType) {
        this.offeringType = offeringType;
    }

    /**
     * Offering type, e.g. 'NO_UPFRONT'
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_UPFRONT
     *
     * @param offeringType Offering type, e.g. 'NO_UPFRONT'
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OfferingType
     */
    public DescribeReservationResult withOfferingType(String offeringType) {
        this.offeringType = offeringType;
        return this;
    }

    /**
     * Offering type, e.g. 'NO_UPFRONT'
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_UPFRONT
     *
     * @param offeringType Offering type, e.g. 'NO_UPFRONT'
     * @see OfferingType
     */
    public void setOfferingType(OfferingType offeringType) {
        this.offeringType = offeringType.toString();
    }

    /**
     * Offering type, e.g. 'NO_UPFRONT'
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_UPFRONT
     *
     * @param offeringType Offering type, e.g. 'NO_UPFRONT'
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OfferingType
     */
    public DescribeReservationResult withOfferingType(OfferingType offeringType) {
        this.offeringType = offeringType.toString();
        return this;
    }

    /**
     * AWS region, e.g. 'us-west-2'
     *
     * @return AWS region, e.g. 'us-west-2'
     */
    public String getRegion() {
        return region;
    }

    /**
     * AWS region, e.g. 'us-west-2'
     *
     * @param region AWS region, e.g. 'us-west-2'
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * AWS region, e.g. 'us-west-2'
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param region AWS region, e.g. 'us-west-2'
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeReservationResult withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * Unique reservation ID, e.g. '1234567'
     *
     * @return Unique reservation ID, e.g. '1234567'
     */
    public String getReservationId() {
        return reservationId;
    }

    /**
     * Unique reservation ID, e.g. '1234567'
     *
     * @param reservationId Unique reservation ID, e.g. '1234567'
     */
    public void setReservationId(String reservationId) {
        this.reservationId = reservationId;
    }

    /**
     * Unique reservation ID, e.g. '1234567'
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reservationId Unique reservation ID, e.g. '1234567'
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeReservationResult withReservationId(String reservationId) {
        this.reservationId = reservationId;
        return this;
    }

    /**
     * Resource configuration details
     *
     * @return Resource configuration details
     */
    public ReservationResourceSpecification getResourceSpecification() {
        return resourceSpecification;
    }

    /**
     * Resource configuration details
     *
     * @param resourceSpecification Resource configuration details
     */
    public void setResourceSpecification(ReservationResourceSpecification resourceSpecification) {
        this.resourceSpecification = resourceSpecification;
    }

    /**
     * Resource configuration details
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceSpecification Resource configuration details
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeReservationResult withResourceSpecification(
            ReservationResourceSpecification resourceSpecification) {
        this.resourceSpecification = resourceSpecification;
        return this;
    }

    /**
     * Reservation UTC start date and time in ISO-8601 format, e.g.
     * '2018-03-01T00:00:00'
     *
     * @return Reservation UTC start date and time in ISO-8601 format, e.g.
     *         '2018-03-01T00:00:00'
     */
    public String getStart() {
        return start;
    }

    /**
     * Reservation UTC start date and time in ISO-8601 format, e.g.
     * '2018-03-01T00:00:00'
     *
     * @param start Reservation UTC start date and time in ISO-8601 format, e.g.
     *            '2018-03-01T00:00:00'
     */
    public void setStart(String start) {
        this.start = start;
    }

    /**
     * Reservation UTC start date and time in ISO-8601 format, e.g.
     * '2018-03-01T00:00:00'
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param start Reservation UTC start date and time in ISO-8601 format, e.g.
     *            '2018-03-01T00:00:00'
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeReservationResult withStart(String start) {
        this.start = start;
        return this;
    }

    /**
     * Current state of reservation, e.g. 'ACTIVE'
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, EXPIRED, CANCELED, DELETED
     *
     * @return Current state of reservation, e.g. 'ACTIVE'
     * @see ReservationState
     */
    public String getState() {
        return state;
    }

    /**
     * Current state of reservation, e.g. 'ACTIVE'
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, EXPIRED, CANCELED, DELETED
     *
     * @param state Current state of reservation, e.g. 'ACTIVE'
     * @see ReservationState
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Current state of reservation, e.g. 'ACTIVE'
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, EXPIRED, CANCELED, DELETED
     *
     * @param state Current state of reservation, e.g. 'ACTIVE'
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ReservationState
     */
    public DescribeReservationResult withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * Current state of reservation, e.g. 'ACTIVE'
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, EXPIRED, CANCELED, DELETED
     *
     * @param state Current state of reservation, e.g. 'ACTIVE'
     * @see ReservationState
     */
    public void setState(ReservationState state) {
        this.state = state.toString();
    }

    /**
     * Current state of reservation, e.g. 'ACTIVE'
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACTIVE, EXPIRED, CANCELED, DELETED
     *
     * @param state Current state of reservation, e.g. 'ACTIVE'
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ReservationState
     */
    public DescribeReservationResult withState(ReservationState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * A collection of key-value pairs
     *
     * @return A collection of key-value pairs
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * A collection of key-value pairs
     *
     * @param tags A collection of key-value pairs
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * A collection of key-value pairs
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags A collection of key-value pairs
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeReservationResult withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * A collection of key-value pairs
     * <p>
     * The method adds a new key-value pair into Tags parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Tags.
     * @param value The corresponding value of the entry to be added into Tags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeReservationResult addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public DescribeReservationResult clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * Recurring usage charge for each reserved resource, e.g. '157.0'
     *
     * @return Recurring usage charge for each reserved resource, e.g. '157.0'
     */
    public Double getUsagePrice() {
        return usagePrice;
    }

    /**
     * Recurring usage charge for each reserved resource, e.g. '157.0'
     *
     * @param usagePrice Recurring usage charge for each reserved resource, e.g.
     *            '157.0'
     */
    public void setUsagePrice(Double usagePrice) {
        this.usagePrice = usagePrice;
    }

    /**
     * Recurring usage charge for each reserved resource, e.g. '157.0'
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param usagePrice Recurring usage charge for each reserved resource, e.g.
     *            '157.0'
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeReservationResult withUsagePrice(Double usagePrice) {
        this.usagePrice = usagePrice;
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
        if (getArn() != null)
            sb.append("Arn: " + getArn() + ",");
        if (getCount() != null)
            sb.append("Count: " + getCount() + ",");
        if (getCurrencyCode() != null)
            sb.append("CurrencyCode: " + getCurrencyCode() + ",");
        if (getDuration() != null)
            sb.append("Duration: " + getDuration() + ",");
        if (getDurationUnits() != null)
            sb.append("DurationUnits: " + getDurationUnits() + ",");
        if (getEnd() != null)
            sb.append("End: " + getEnd() + ",");
        if (getFixedPrice() != null)
            sb.append("FixedPrice: " + getFixedPrice() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getOfferingDescription() != null)
            sb.append("OfferingDescription: " + getOfferingDescription() + ",");
        if (getOfferingId() != null)
            sb.append("OfferingId: " + getOfferingId() + ",");
        if (getOfferingType() != null)
            sb.append("OfferingType: " + getOfferingType() + ",");
        if (getRegion() != null)
            sb.append("Region: " + getRegion() + ",");
        if (getReservationId() != null)
            sb.append("ReservationId: " + getReservationId() + ",");
        if (getResourceSpecification() != null)
            sb.append("ResourceSpecification: " + getResourceSpecification() + ",");
        if (getStart() != null)
            sb.append("Start: " + getStart() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getUsagePrice() != null)
            sb.append("UsagePrice: " + getUsagePrice());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        hashCode = prime * hashCode
                + ((getCurrencyCode() == null) ? 0 : getCurrencyCode().hashCode());
        hashCode = prime * hashCode + ((getDuration() == null) ? 0 : getDuration().hashCode());
        hashCode = prime * hashCode
                + ((getDurationUnits() == null) ? 0 : getDurationUnits().hashCode());
        hashCode = prime * hashCode + ((getEnd() == null) ? 0 : getEnd().hashCode());
        hashCode = prime * hashCode + ((getFixedPrice() == null) ? 0 : getFixedPrice().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getOfferingDescription() == null) ? 0 : getOfferingDescription().hashCode());
        hashCode = prime * hashCode + ((getOfferingId() == null) ? 0 : getOfferingId().hashCode());
        hashCode = prime * hashCode
                + ((getOfferingType() == null) ? 0 : getOfferingType().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode
                + ((getReservationId() == null) ? 0 : getReservationId().hashCode());
        hashCode = prime
                * hashCode
                + ((getResourceSpecification() == null) ? 0 : getResourceSpecification().hashCode());
        hashCode = prime * hashCode + ((getStart() == null) ? 0 : getStart().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getUsagePrice() == null) ? 0 : getUsagePrice().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeReservationResult == false)
            return false;
        DescribeReservationResult other = (DescribeReservationResult) obj;

        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
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
        if (other.getDurationUnits() == null ^ this.getDurationUnits() == null)
            return false;
        if (other.getDurationUnits() != null
                && other.getDurationUnits().equals(this.getDurationUnits()) == false)
            return false;
        if (other.getEnd() == null ^ this.getEnd() == null)
            return false;
        if (other.getEnd() != null && other.getEnd().equals(this.getEnd()) == false)
            return false;
        if (other.getFixedPrice() == null ^ this.getFixedPrice() == null)
            return false;
        if (other.getFixedPrice() != null
                && other.getFixedPrice().equals(this.getFixedPrice()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOfferingDescription() == null ^ this.getOfferingDescription() == null)
            return false;
        if (other.getOfferingDescription() != null
                && other.getOfferingDescription().equals(this.getOfferingDescription()) == false)
            return false;
        if (other.getOfferingId() == null ^ this.getOfferingId() == null)
            return false;
        if (other.getOfferingId() != null
                && other.getOfferingId().equals(this.getOfferingId()) == false)
            return false;
        if (other.getOfferingType() == null ^ this.getOfferingType() == null)
            return false;
        if (other.getOfferingType() != null
                && other.getOfferingType().equals(this.getOfferingType()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getReservationId() == null ^ this.getReservationId() == null)
            return false;
        if (other.getReservationId() != null
                && other.getReservationId().equals(this.getReservationId()) == false)
            return false;
        if (other.getResourceSpecification() == null ^ this.getResourceSpecification() == null)
            return false;
        if (other.getResourceSpecification() != null
                && other.getResourceSpecification().equals(this.getResourceSpecification()) == false)
            return false;
        if (other.getStart() == null ^ this.getStart() == null)
            return false;
        if (other.getStart() != null && other.getStart().equals(this.getStart()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getUsagePrice() == null ^ this.getUsagePrice() == null)
            return false;
        if (other.getUsagePrice() != null
                && other.getUsagePrice().equals(this.getUsagePrice()) == false)
            return false;
        return true;
    }
}
