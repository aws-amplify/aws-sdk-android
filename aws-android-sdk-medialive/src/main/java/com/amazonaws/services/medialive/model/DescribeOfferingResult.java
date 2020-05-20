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

package com.amazonaws.services.medialive.model;

import java.io.Serializable;

/**
 * Placeholder documentation for DescribeOfferingResponse
 */
public class DescribeOfferingResult implements Serializable {
    /**
     * Unique offering ARN, e.g.
     * 'arn:aws:medialive:us-west-2:123456789012:offering:87654321'
     */
    private String arn;

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
     * One-time charge for each reserved resource, e.g. '0.0' for a NO_UPFRONT
     * offering
     */
    private Double fixedPrice;

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
     * Resource configuration details
     */
    private ReservationResourceSpecification resourceSpecification;

    /**
     * Recurring usage charge for each reserved resource, e.g. '157.0'
     */
    private Double usagePrice;

    /**
     * Unique offering ARN, e.g.
     * 'arn:aws:medialive:us-west-2:123456789012:offering:87654321'
     *
     * @return Unique offering ARN, e.g.
     *         'arn:aws:medialive:us-west-2:123456789012:offering:87654321'
     */
    public String getArn() {
        return arn;
    }

    /**
     * Unique offering ARN, e.g.
     * 'arn:aws:medialive:us-west-2:123456789012:offering:87654321'
     *
     * @param arn Unique offering ARN, e.g.
     *            'arn:aws:medialive:us-west-2:123456789012:offering:87654321'
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * Unique offering ARN, e.g.
     * 'arn:aws:medialive:us-west-2:123456789012:offering:87654321'
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param arn Unique offering ARN, e.g.
     *            'arn:aws:medialive:us-west-2:123456789012:offering:87654321'
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeOfferingResult withArn(String arn) {
        this.arn = arn;
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
    public DescribeOfferingResult withCurrencyCode(String currencyCode) {
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
    public DescribeOfferingResult withDuration(Integer duration) {
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
    public DescribeOfferingResult withDurationUnits(String durationUnits) {
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
    public DescribeOfferingResult withDurationUnits(OfferingDurationUnits durationUnits) {
        this.durationUnits = durationUnits.toString();
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
    public DescribeOfferingResult withFixedPrice(Double fixedPrice) {
        this.fixedPrice = fixedPrice;
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
    public DescribeOfferingResult withOfferingDescription(String offeringDescription) {
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
    public DescribeOfferingResult withOfferingId(String offeringId) {
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
    public DescribeOfferingResult withOfferingType(String offeringType) {
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
    public DescribeOfferingResult withOfferingType(OfferingType offeringType) {
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
    public DescribeOfferingResult withRegion(String region) {
        this.region = region;
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
    public DescribeOfferingResult withResourceSpecification(
            ReservationResourceSpecification resourceSpecification) {
        this.resourceSpecification = resourceSpecification;
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
    public DescribeOfferingResult withUsagePrice(Double usagePrice) {
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
        if (getCurrencyCode() != null)
            sb.append("CurrencyCode: " + getCurrencyCode() + ",");
        if (getDuration() != null)
            sb.append("Duration: " + getDuration() + ",");
        if (getDurationUnits() != null)
            sb.append("DurationUnits: " + getDurationUnits() + ",");
        if (getFixedPrice() != null)
            sb.append("FixedPrice: " + getFixedPrice() + ",");
        if (getOfferingDescription() != null)
            sb.append("OfferingDescription: " + getOfferingDescription() + ",");
        if (getOfferingId() != null)
            sb.append("OfferingId: " + getOfferingId() + ",");
        if (getOfferingType() != null)
            sb.append("OfferingType: " + getOfferingType() + ",");
        if (getRegion() != null)
            sb.append("Region: " + getRegion() + ",");
        if (getResourceSpecification() != null)
            sb.append("ResourceSpecification: " + getResourceSpecification() + ",");
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
        hashCode = prime * hashCode
                + ((getCurrencyCode() == null) ? 0 : getCurrencyCode().hashCode());
        hashCode = prime * hashCode + ((getDuration() == null) ? 0 : getDuration().hashCode());
        hashCode = prime * hashCode
                + ((getDurationUnits() == null) ? 0 : getDurationUnits().hashCode());
        hashCode = prime * hashCode + ((getFixedPrice() == null) ? 0 : getFixedPrice().hashCode());
        hashCode = prime * hashCode
                + ((getOfferingDescription() == null) ? 0 : getOfferingDescription().hashCode());
        hashCode = prime * hashCode + ((getOfferingId() == null) ? 0 : getOfferingId().hashCode());
        hashCode = prime * hashCode
                + ((getOfferingType() == null) ? 0 : getOfferingType().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime
                * hashCode
                + ((getResourceSpecification() == null) ? 0 : getResourceSpecification().hashCode());
        hashCode = prime * hashCode + ((getUsagePrice() == null) ? 0 : getUsagePrice().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeOfferingResult == false)
            return false;
        DescribeOfferingResult other = (DescribeOfferingResult) obj;

        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
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
        if (other.getFixedPrice() == null ^ this.getFixedPrice() == null)
            return false;
        if (other.getFixedPrice() != null
                && other.getFixedPrice().equals(this.getFixedPrice()) == false)
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
        if (other.getResourceSpecification() == null ^ this.getResourceSpecification() == null)
            return false;
        if (other.getResourceSpecification() != null
                && other.getResourceSpecification().equals(this.getResourceSpecification()) == false)
            return false;
        if (other.getUsagePrice() == null ^ this.getUsagePrice() == null)
            return false;
        if (other.getUsagePrice() != null
                && other.getUsagePrice().equals(this.getUsagePrice()) == false)
            return false;
        return true;
    }
}
