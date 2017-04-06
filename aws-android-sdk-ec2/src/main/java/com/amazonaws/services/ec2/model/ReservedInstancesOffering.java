/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Describes a Reserved Instance offering.
 * </p>
 */
public class ReservedInstancesOffering implements Serializable {

    /**
     * The ID of the Reserved Instance offering.
     */
    private String reservedInstancesOfferingId;

    /**
     * The instance type on which the Reserved Instance can be used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, t2.nano, t2.micro, t2.small, t2.medium, t2.large, m1.small, m1.medium, m1.large, m1.xlarge, m3.medium, m3.large, m3.xlarge, m3.2xlarge, m4.large, m4.xlarge, m4.2xlarge, m4.4xlarge, m4.10xlarge, m2.xlarge, m2.2xlarge, m2.4xlarge, cr1.8xlarge, r3.large, r3.xlarge, r3.2xlarge, r3.4xlarge, r3.8xlarge, x1.4xlarge, x1.8xlarge, x1.16xlarge, x1.32xlarge, i2.xlarge, i2.2xlarge, i2.4xlarge, i2.8xlarge, hi1.4xlarge, hs1.8xlarge, c1.medium, c1.xlarge, c3.large, c3.xlarge, c3.2xlarge, c3.4xlarge, c3.8xlarge, c4.large, c4.xlarge, c4.2xlarge, c4.4xlarge, c4.8xlarge, cc1.4xlarge, cc2.8xlarge, g2.2xlarge, g2.8xlarge, cg1.4xlarge, d2.xlarge, d2.2xlarge, d2.4xlarge, d2.8xlarge
     */
    private String instanceType;

    /**
     * The Availability Zone in which the Reserved Instance can be used.
     */
    private String availabilityZone;

    /**
     * The duration of the Reserved Instance, in seconds.
     */
    private Long duration;

    /**
     * The usage price of the Reserved Instance, per hour.
     */
    private Float usagePrice;

    /**
     * The purchase price of the Reserved Instance.
     */
    private Float fixedPrice;

    /**
     * The Reserved Instance product platform description.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Linux/UNIX, Linux/UNIX (Amazon VPC), Windows, Windows (Amazon VPC)
     */
    private String productDescription;

    /**
     * The tenancy of the instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, dedicated, host
     */
    private String instanceTenancy;

    /**
     * The currency of the Reserved Instance offering you are purchasing.
     * It's specified using ISO 4217 standard currency codes. At this time,
     * the only supported currency is <code>USD</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USD
     */
    private String currencyCode;

    /**
     * The Reserved Instance offering type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Heavy Utilization, Medium Utilization, Light Utilization, No Upfront, Partial Upfront, All Upfront
     */
    private String offeringType;

    /**
     * The recurring charge tag assigned to the resource.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<RecurringCharge> recurringCharges;

    /**
     * Indicates whether the offering is available through the Reserved
     * Instance Marketplace (resale) or AWS. If it's a Reserved Instance
     * Marketplace offering, this is <code>true</code>.
     */
    private Boolean marketplace;

    /**
     * The pricing details of the Reserved Instance offering.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<PricingDetail> pricingDetails;

    /**
     * The ID of the Reserved Instance offering.
     *
     * @return The ID of the Reserved Instance offering.
     */
    public String getReservedInstancesOfferingId() {
        return reservedInstancesOfferingId;
    }
    
    /**
     * The ID of the Reserved Instance offering.
     *
     * @param reservedInstancesOfferingId The ID of the Reserved Instance offering.
     */
    public void setReservedInstancesOfferingId(String reservedInstancesOfferingId) {
        this.reservedInstancesOfferingId = reservedInstancesOfferingId;
    }
    
    /**
     * The ID of the Reserved Instance offering.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservedInstancesOfferingId The ID of the Reserved Instance offering.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ReservedInstancesOffering withReservedInstancesOfferingId(String reservedInstancesOfferingId) {
        this.reservedInstancesOfferingId = reservedInstancesOfferingId;
        return this;
    }

    /**
     * The instance type on which the Reserved Instance can be used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, t2.nano, t2.micro, t2.small, t2.medium, t2.large, m1.small, m1.medium, m1.large, m1.xlarge, m3.medium, m3.large, m3.xlarge, m3.2xlarge, m4.large, m4.xlarge, m4.2xlarge, m4.4xlarge, m4.10xlarge, m2.xlarge, m2.2xlarge, m2.4xlarge, cr1.8xlarge, r3.large, r3.xlarge, r3.2xlarge, r3.4xlarge, r3.8xlarge, x1.4xlarge, x1.8xlarge, x1.16xlarge, x1.32xlarge, i2.xlarge, i2.2xlarge, i2.4xlarge, i2.8xlarge, hi1.4xlarge, hs1.8xlarge, c1.medium, c1.xlarge, c3.large, c3.xlarge, c3.2xlarge, c3.4xlarge, c3.8xlarge, c4.large, c4.xlarge, c4.2xlarge, c4.4xlarge, c4.8xlarge, cc1.4xlarge, cc2.8xlarge, g2.2xlarge, g2.8xlarge, cg1.4xlarge, d2.xlarge, d2.2xlarge, d2.4xlarge, d2.8xlarge
     *
     * @return The instance type on which the Reserved Instance can be used.
     *
     * @see InstanceType
     */
    public String getInstanceType() {
        return instanceType;
    }
    
    /**
     * The instance type on which the Reserved Instance can be used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, t2.nano, t2.micro, t2.small, t2.medium, t2.large, m1.small, m1.medium, m1.large, m1.xlarge, m3.medium, m3.large, m3.xlarge, m3.2xlarge, m4.large, m4.xlarge, m4.2xlarge, m4.4xlarge, m4.10xlarge, m2.xlarge, m2.2xlarge, m2.4xlarge, cr1.8xlarge, r3.large, r3.xlarge, r3.2xlarge, r3.4xlarge, r3.8xlarge, x1.4xlarge, x1.8xlarge, x1.16xlarge, x1.32xlarge, i2.xlarge, i2.2xlarge, i2.4xlarge, i2.8xlarge, hi1.4xlarge, hs1.8xlarge, c1.medium, c1.xlarge, c3.large, c3.xlarge, c3.2xlarge, c3.4xlarge, c3.8xlarge, c4.large, c4.xlarge, c4.2xlarge, c4.4xlarge, c4.8xlarge, cc1.4xlarge, cc2.8xlarge, g2.2xlarge, g2.8xlarge, cg1.4xlarge, d2.xlarge, d2.2xlarge, d2.4xlarge, d2.8xlarge
     *
     * @param instanceType The instance type on which the Reserved Instance can be used.
     *
     * @see InstanceType
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }
    
    /**
     * The instance type on which the Reserved Instance can be used.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, t2.nano, t2.micro, t2.small, t2.medium, t2.large, m1.small, m1.medium, m1.large, m1.xlarge, m3.medium, m3.large, m3.xlarge, m3.2xlarge, m4.large, m4.xlarge, m4.2xlarge, m4.4xlarge, m4.10xlarge, m2.xlarge, m2.2xlarge, m2.4xlarge, cr1.8xlarge, r3.large, r3.xlarge, r3.2xlarge, r3.4xlarge, r3.8xlarge, x1.4xlarge, x1.8xlarge, x1.16xlarge, x1.32xlarge, i2.xlarge, i2.2xlarge, i2.4xlarge, i2.8xlarge, hi1.4xlarge, hs1.8xlarge, c1.medium, c1.xlarge, c3.large, c3.xlarge, c3.2xlarge, c3.4xlarge, c3.8xlarge, c4.large, c4.xlarge, c4.2xlarge, c4.4xlarge, c4.8xlarge, cc1.4xlarge, cc2.8xlarge, g2.2xlarge, g2.8xlarge, cg1.4xlarge, d2.xlarge, d2.2xlarge, d2.4xlarge, d2.8xlarge
     *
     * @param instanceType The instance type on which the Reserved Instance can be used.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see InstanceType
     */
    public ReservedInstancesOffering withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * The instance type on which the Reserved Instance can be used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, t2.nano, t2.micro, t2.small, t2.medium, t2.large, m1.small, m1.medium, m1.large, m1.xlarge, m3.medium, m3.large, m3.xlarge, m3.2xlarge, m4.large, m4.xlarge, m4.2xlarge, m4.4xlarge, m4.10xlarge, m2.xlarge, m2.2xlarge, m2.4xlarge, cr1.8xlarge, r3.large, r3.xlarge, r3.2xlarge, r3.4xlarge, r3.8xlarge, x1.4xlarge, x1.8xlarge, x1.16xlarge, x1.32xlarge, i2.xlarge, i2.2xlarge, i2.4xlarge, i2.8xlarge, hi1.4xlarge, hs1.8xlarge, c1.medium, c1.xlarge, c3.large, c3.xlarge, c3.2xlarge, c3.4xlarge, c3.8xlarge, c4.large, c4.xlarge, c4.2xlarge, c4.4xlarge, c4.8xlarge, cc1.4xlarge, cc2.8xlarge, g2.2xlarge, g2.8xlarge, cg1.4xlarge, d2.xlarge, d2.2xlarge, d2.4xlarge, d2.8xlarge
     *
     * @param instanceType The instance type on which the Reserved Instance can be used.
     *
     * @see InstanceType
     */
    public void setInstanceType(InstanceType instanceType) {
        this.instanceType = instanceType.toString();
    }
    
    /**
     * The instance type on which the Reserved Instance can be used.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t1.micro, t2.nano, t2.micro, t2.small, t2.medium, t2.large, m1.small, m1.medium, m1.large, m1.xlarge, m3.medium, m3.large, m3.xlarge, m3.2xlarge, m4.large, m4.xlarge, m4.2xlarge, m4.4xlarge, m4.10xlarge, m2.xlarge, m2.2xlarge, m2.4xlarge, cr1.8xlarge, r3.large, r3.xlarge, r3.2xlarge, r3.4xlarge, r3.8xlarge, x1.4xlarge, x1.8xlarge, x1.16xlarge, x1.32xlarge, i2.xlarge, i2.2xlarge, i2.4xlarge, i2.8xlarge, hi1.4xlarge, hs1.8xlarge, c1.medium, c1.xlarge, c3.large, c3.xlarge, c3.2xlarge, c3.4xlarge, c3.8xlarge, c4.large, c4.xlarge, c4.2xlarge, c4.4xlarge, c4.8xlarge, cc1.4xlarge, cc2.8xlarge, g2.2xlarge, g2.8xlarge, cg1.4xlarge, d2.xlarge, d2.2xlarge, d2.4xlarge, d2.8xlarge
     *
     * @param instanceType The instance type on which the Reserved Instance can be used.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see InstanceType
     */
    public ReservedInstancesOffering withInstanceType(InstanceType instanceType) {
        this.instanceType = instanceType.toString();
        return this;
    }

    /**
     * The Availability Zone in which the Reserved Instance can be used.
     *
     * @return The Availability Zone in which the Reserved Instance can be used.
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }
    
    /**
     * The Availability Zone in which the Reserved Instance can be used.
     *
     * @param availabilityZone The Availability Zone in which the Reserved Instance can be used.
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }
    
    /**
     * The Availability Zone in which the Reserved Instance can be used.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZone The Availability Zone in which the Reserved Instance can be used.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ReservedInstancesOffering withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * The duration of the Reserved Instance, in seconds.
     *
     * @return The duration of the Reserved Instance, in seconds.
     */
    public Long getDuration() {
        return duration;
    }
    
    /**
     * The duration of the Reserved Instance, in seconds.
     *
     * @param duration The duration of the Reserved Instance, in seconds.
     */
    public void setDuration(Long duration) {
        this.duration = duration;
    }
    
    /**
     * The duration of the Reserved Instance, in seconds.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param duration The duration of the Reserved Instance, in seconds.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ReservedInstancesOffering withDuration(Long duration) {
        this.duration = duration;
        return this;
    }

    /**
     * The usage price of the Reserved Instance, per hour.
     *
     * @return The usage price of the Reserved Instance, per hour.
     */
    public Float getUsagePrice() {
        return usagePrice;
    }
    
    /**
     * The usage price of the Reserved Instance, per hour.
     *
     * @param usagePrice The usage price of the Reserved Instance, per hour.
     */
    public void setUsagePrice(Float usagePrice) {
        this.usagePrice = usagePrice;
    }
    
    /**
     * The usage price of the Reserved Instance, per hour.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param usagePrice The usage price of the Reserved Instance, per hour.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ReservedInstancesOffering withUsagePrice(Float usagePrice) {
        this.usagePrice = usagePrice;
        return this;
    }

    /**
     * The purchase price of the Reserved Instance.
     *
     * @return The purchase price of the Reserved Instance.
     */
    public Float getFixedPrice() {
        return fixedPrice;
    }
    
    /**
     * The purchase price of the Reserved Instance.
     *
     * @param fixedPrice The purchase price of the Reserved Instance.
     */
    public void setFixedPrice(Float fixedPrice) {
        this.fixedPrice = fixedPrice;
    }
    
    /**
     * The purchase price of the Reserved Instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param fixedPrice The purchase price of the Reserved Instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ReservedInstancesOffering withFixedPrice(Float fixedPrice) {
        this.fixedPrice = fixedPrice;
        return this;
    }

    /**
     * The Reserved Instance product platform description.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Linux/UNIX, Linux/UNIX (Amazon VPC), Windows, Windows (Amazon VPC)
     *
     * @return The Reserved Instance product platform description.
     *
     * @see RIProductDescription
     */
    public String getProductDescription() {
        return productDescription;
    }
    
    /**
     * The Reserved Instance product platform description.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Linux/UNIX, Linux/UNIX (Amazon VPC), Windows, Windows (Amazon VPC)
     *
     * @param productDescription The Reserved Instance product platform description.
     *
     * @see RIProductDescription
     */
    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }
    
    /**
     * The Reserved Instance product platform description.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Linux/UNIX, Linux/UNIX (Amazon VPC), Windows, Windows (Amazon VPC)
     *
     * @param productDescription The Reserved Instance product platform description.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see RIProductDescription
     */
    public ReservedInstancesOffering withProductDescription(String productDescription) {
        this.productDescription = productDescription;
        return this;
    }

    /**
     * The Reserved Instance product platform description.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Linux/UNIX, Linux/UNIX (Amazon VPC), Windows, Windows (Amazon VPC)
     *
     * @param productDescription The Reserved Instance product platform description.
     *
     * @see RIProductDescription
     */
    public void setProductDescription(RIProductDescription productDescription) {
        this.productDescription = productDescription.toString();
    }
    
    /**
     * The Reserved Instance product platform description.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Linux/UNIX, Linux/UNIX (Amazon VPC), Windows, Windows (Amazon VPC)
     *
     * @param productDescription The Reserved Instance product platform description.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see RIProductDescription
     */
    public ReservedInstancesOffering withProductDescription(RIProductDescription productDescription) {
        this.productDescription = productDescription.toString();
        return this;
    }

    /**
     * The tenancy of the instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, dedicated, host
     *
     * @return The tenancy of the instance.
     *
     * @see Tenancy
     */
    public String getInstanceTenancy() {
        return instanceTenancy;
    }
    
    /**
     * The tenancy of the instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, dedicated, host
     *
     * @param instanceTenancy The tenancy of the instance.
     *
     * @see Tenancy
     */
    public void setInstanceTenancy(String instanceTenancy) {
        this.instanceTenancy = instanceTenancy;
    }
    
    /**
     * The tenancy of the instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, dedicated, host
     *
     * @param instanceTenancy The tenancy of the instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see Tenancy
     */
    public ReservedInstancesOffering withInstanceTenancy(String instanceTenancy) {
        this.instanceTenancy = instanceTenancy;
        return this;
    }

    /**
     * The tenancy of the instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, dedicated, host
     *
     * @param instanceTenancy The tenancy of the instance.
     *
     * @see Tenancy
     */
    public void setInstanceTenancy(Tenancy instanceTenancy) {
        this.instanceTenancy = instanceTenancy.toString();
    }
    
    /**
     * The tenancy of the instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, dedicated, host
     *
     * @param instanceTenancy The tenancy of the instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see Tenancy
     */
    public ReservedInstancesOffering withInstanceTenancy(Tenancy instanceTenancy) {
        this.instanceTenancy = instanceTenancy.toString();
        return this;
    }

    /**
     * The currency of the Reserved Instance offering you are purchasing.
     * It's specified using ISO 4217 standard currency codes. At this time,
     * the only supported currency is <code>USD</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USD
     *
     * @return The currency of the Reserved Instance offering you are purchasing.
     *         It's specified using ISO 4217 standard currency codes. At this time,
     *         the only supported currency is <code>USD</code>.
     *
     * @see CurrencyCodeValues
     */
    public String getCurrencyCode() {
        return currencyCode;
    }
    
    /**
     * The currency of the Reserved Instance offering you are purchasing.
     * It's specified using ISO 4217 standard currency codes. At this time,
     * the only supported currency is <code>USD</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USD
     *
     * @param currencyCode The currency of the Reserved Instance offering you are purchasing.
     *         It's specified using ISO 4217 standard currency codes. At this time,
     *         the only supported currency is <code>USD</code>.
     *
     * @see CurrencyCodeValues
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }
    
    /**
     * The currency of the Reserved Instance offering you are purchasing.
     * It's specified using ISO 4217 standard currency codes. At this time,
     * the only supported currency is <code>USD</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USD
     *
     * @param currencyCode The currency of the Reserved Instance offering you are purchasing.
     *         It's specified using ISO 4217 standard currency codes. At this time,
     *         the only supported currency is <code>USD</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see CurrencyCodeValues
     */
    public ReservedInstancesOffering withCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    /**
     * The currency of the Reserved Instance offering you are purchasing.
     * It's specified using ISO 4217 standard currency codes. At this time,
     * the only supported currency is <code>USD</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USD
     *
     * @param currencyCode The currency of the Reserved Instance offering you are purchasing.
     *         It's specified using ISO 4217 standard currency codes. At this time,
     *         the only supported currency is <code>USD</code>.
     *
     * @see CurrencyCodeValues
     */
    public void setCurrencyCode(CurrencyCodeValues currencyCode) {
        this.currencyCode = currencyCode.toString();
    }
    
    /**
     * The currency of the Reserved Instance offering you are purchasing.
     * It's specified using ISO 4217 standard currency codes. At this time,
     * the only supported currency is <code>USD</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USD
     *
     * @param currencyCode The currency of the Reserved Instance offering you are purchasing.
     *         It's specified using ISO 4217 standard currency codes. At this time,
     *         the only supported currency is <code>USD</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see CurrencyCodeValues
     */
    public ReservedInstancesOffering withCurrencyCode(CurrencyCodeValues currencyCode) {
        this.currencyCode = currencyCode.toString();
        return this;
    }

    /**
     * The Reserved Instance offering type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Heavy Utilization, Medium Utilization, Light Utilization, No Upfront, Partial Upfront, All Upfront
     *
     * @return The Reserved Instance offering type.
     *
     * @see OfferingTypeValues
     */
    public String getOfferingType() {
        return offeringType;
    }
    
    /**
     * The Reserved Instance offering type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Heavy Utilization, Medium Utilization, Light Utilization, No Upfront, Partial Upfront, All Upfront
     *
     * @param offeringType The Reserved Instance offering type.
     *
     * @see OfferingTypeValues
     */
    public void setOfferingType(String offeringType) {
        this.offeringType = offeringType;
    }
    
    /**
     * The Reserved Instance offering type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Heavy Utilization, Medium Utilization, Light Utilization, No Upfront, Partial Upfront, All Upfront
     *
     * @param offeringType The Reserved Instance offering type.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see OfferingTypeValues
     */
    public ReservedInstancesOffering withOfferingType(String offeringType) {
        this.offeringType = offeringType;
        return this;
    }

    /**
     * The Reserved Instance offering type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Heavy Utilization, Medium Utilization, Light Utilization, No Upfront, Partial Upfront, All Upfront
     *
     * @param offeringType The Reserved Instance offering type.
     *
     * @see OfferingTypeValues
     */
    public void setOfferingType(OfferingTypeValues offeringType) {
        this.offeringType = offeringType.toString();
    }
    
    /**
     * The Reserved Instance offering type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Heavy Utilization, Medium Utilization, Light Utilization, No Upfront, Partial Upfront, All Upfront
     *
     * @param offeringType The Reserved Instance offering type.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see OfferingTypeValues
     */
    public ReservedInstancesOffering withOfferingType(OfferingTypeValues offeringType) {
        this.offeringType = offeringType.toString();
        return this;
    }

    /**
     * The recurring charge tag assigned to the resource.
     *
     * @return The recurring charge tag assigned to the resource.
     */
    public java.util.List<RecurringCharge> getRecurringCharges() {
        if (recurringCharges == null) {
              recurringCharges = new com.amazonaws.internal.ListWithAutoConstructFlag<RecurringCharge>();
              recurringCharges.setAutoConstruct(true);
        }
        return recurringCharges;
    }
    
    /**
     * The recurring charge tag assigned to the resource.
     *
     * @param recurringCharges The recurring charge tag assigned to the resource.
     */
    public void setRecurringCharges(java.util.Collection<RecurringCharge> recurringCharges) {
        if (recurringCharges == null) {
            this.recurringCharges = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<RecurringCharge> recurringChargesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<RecurringCharge>(recurringCharges.size());
        recurringChargesCopy.addAll(recurringCharges);
        this.recurringCharges = recurringChargesCopy;
    }
    
    /**
     * The recurring charge tag assigned to the resource.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param recurringCharges The recurring charge tag assigned to the resource.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ReservedInstancesOffering withRecurringCharges(RecurringCharge... recurringCharges) {
        if (getRecurringCharges() == null) setRecurringCharges(new java.util.ArrayList<RecurringCharge>(recurringCharges.length));
        for (RecurringCharge value : recurringCharges) {
            getRecurringCharges().add(value);
        }
        return this;
    }
    
    /**
     * The recurring charge tag assigned to the resource.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param recurringCharges The recurring charge tag assigned to the resource.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ReservedInstancesOffering withRecurringCharges(java.util.Collection<RecurringCharge> recurringCharges) {
        if (recurringCharges == null) {
            this.recurringCharges = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<RecurringCharge> recurringChargesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<RecurringCharge>(recurringCharges.size());
            recurringChargesCopy.addAll(recurringCharges);
            this.recurringCharges = recurringChargesCopy;
        }

        return this;
    }

    /**
     * Indicates whether the offering is available through the Reserved
     * Instance Marketplace (resale) or AWS. If it's a Reserved Instance
     * Marketplace offering, this is <code>true</code>.
     *
     * @return Indicates whether the offering is available through the Reserved
     *         Instance Marketplace (resale) or AWS. If it's a Reserved Instance
     *         Marketplace offering, this is <code>true</code>.
     */
    public Boolean isMarketplace() {
        return marketplace;
    }
    
    /**
     * Indicates whether the offering is available through the Reserved
     * Instance Marketplace (resale) or AWS. If it's a Reserved Instance
     * Marketplace offering, this is <code>true</code>.
     *
     * @param marketplace Indicates whether the offering is available through the Reserved
     *         Instance Marketplace (resale) or AWS. If it's a Reserved Instance
     *         Marketplace offering, this is <code>true</code>.
     */
    public void setMarketplace(Boolean marketplace) {
        this.marketplace = marketplace;
    }
    
    /**
     * Indicates whether the offering is available through the Reserved
     * Instance Marketplace (resale) or AWS. If it's a Reserved Instance
     * Marketplace offering, this is <code>true</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marketplace Indicates whether the offering is available through the Reserved
     *         Instance Marketplace (resale) or AWS. If it's a Reserved Instance
     *         Marketplace offering, this is <code>true</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ReservedInstancesOffering withMarketplace(Boolean marketplace) {
        this.marketplace = marketplace;
        return this;
    }

    /**
     * Indicates whether the offering is available through the Reserved
     * Instance Marketplace (resale) or AWS. If it's a Reserved Instance
     * Marketplace offering, this is <code>true</code>.
     *
     * @return Indicates whether the offering is available through the Reserved
     *         Instance Marketplace (resale) or AWS. If it's a Reserved Instance
     *         Marketplace offering, this is <code>true</code>.
     */
    public Boolean getMarketplace() {
        return marketplace;
    }

    /**
     * The pricing details of the Reserved Instance offering.
     *
     * @return The pricing details of the Reserved Instance offering.
     */
    public java.util.List<PricingDetail> getPricingDetails() {
        if (pricingDetails == null) {
              pricingDetails = new com.amazonaws.internal.ListWithAutoConstructFlag<PricingDetail>();
              pricingDetails.setAutoConstruct(true);
        }
        return pricingDetails;
    }
    
    /**
     * The pricing details of the Reserved Instance offering.
     *
     * @param pricingDetails The pricing details of the Reserved Instance offering.
     */
    public void setPricingDetails(java.util.Collection<PricingDetail> pricingDetails) {
        if (pricingDetails == null) {
            this.pricingDetails = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<PricingDetail> pricingDetailsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<PricingDetail>(pricingDetails.size());
        pricingDetailsCopy.addAll(pricingDetails);
        this.pricingDetails = pricingDetailsCopy;
    }
    
    /**
     * The pricing details of the Reserved Instance offering.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param pricingDetails The pricing details of the Reserved Instance offering.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ReservedInstancesOffering withPricingDetails(PricingDetail... pricingDetails) {
        if (getPricingDetails() == null) setPricingDetails(new java.util.ArrayList<PricingDetail>(pricingDetails.length));
        for (PricingDetail value : pricingDetails) {
            getPricingDetails().add(value);
        }
        return this;
    }
    
    /**
     * The pricing details of the Reserved Instance offering.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param pricingDetails The pricing details of the Reserved Instance offering.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ReservedInstancesOffering withPricingDetails(java.util.Collection<PricingDetail> pricingDetails) {
        if (pricingDetails == null) {
            this.pricingDetails = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<PricingDetail> pricingDetailsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<PricingDetail>(pricingDetails.size());
            pricingDetailsCopy.addAll(pricingDetails);
            this.pricingDetails = pricingDetailsCopy;
        }

        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getReservedInstancesOfferingId() != null) sb.append("ReservedInstancesOfferingId: " + getReservedInstancesOfferingId() + ",");
        if (getInstanceType() != null) sb.append("InstanceType: " + getInstanceType() + ",");
        if (getAvailabilityZone() != null) sb.append("AvailabilityZone: " + getAvailabilityZone() + ",");
        if (getDuration() != null) sb.append("Duration: " + getDuration() + ",");
        if (getUsagePrice() != null) sb.append("UsagePrice: " + getUsagePrice() + ",");
        if (getFixedPrice() != null) sb.append("FixedPrice: " + getFixedPrice() + ",");
        if (getProductDescription() != null) sb.append("ProductDescription: " + getProductDescription() + ",");
        if (getInstanceTenancy() != null) sb.append("InstanceTenancy: " + getInstanceTenancy() + ",");
        if (getCurrencyCode() != null) sb.append("CurrencyCode: " + getCurrencyCode() + ",");
        if (getOfferingType() != null) sb.append("OfferingType: " + getOfferingType() + ",");
        if (getRecurringCharges() != null) sb.append("RecurringCharges: " + getRecurringCharges() + ",");
        if (isMarketplace() != null) sb.append("Marketplace: " + isMarketplace() + ",");
        if (getPricingDetails() != null) sb.append("PricingDetails: " + getPricingDetails() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getReservedInstancesOfferingId() == null) ? 0 : getReservedInstancesOfferingId().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode()); 
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode()); 
        hashCode = prime * hashCode + ((getDuration() == null) ? 0 : getDuration().hashCode()); 
        hashCode = prime * hashCode + ((getUsagePrice() == null) ? 0 : getUsagePrice().hashCode()); 
        hashCode = prime * hashCode + ((getFixedPrice() == null) ? 0 : getFixedPrice().hashCode()); 
        hashCode = prime * hashCode + ((getProductDescription() == null) ? 0 : getProductDescription().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceTenancy() == null) ? 0 : getInstanceTenancy().hashCode()); 
        hashCode = prime * hashCode + ((getCurrencyCode() == null) ? 0 : getCurrencyCode().hashCode()); 
        hashCode = prime * hashCode + ((getOfferingType() == null) ? 0 : getOfferingType().hashCode()); 
        hashCode = prime * hashCode + ((getRecurringCharges() == null) ? 0 : getRecurringCharges().hashCode()); 
        hashCode = prime * hashCode + ((isMarketplace() == null) ? 0 : isMarketplace().hashCode()); 
        hashCode = prime * hashCode + ((getPricingDetails() == null) ? 0 : getPricingDetails().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ReservedInstancesOffering == false) return false;
        ReservedInstancesOffering other = (ReservedInstancesOffering)obj;
        
        if (other.getReservedInstancesOfferingId() == null ^ this.getReservedInstancesOfferingId() == null) return false;
        if (other.getReservedInstancesOfferingId() != null && other.getReservedInstancesOfferingId().equals(this.getReservedInstancesOfferingId()) == false) return false; 
        if (other.getInstanceType() == null ^ this.getInstanceType() == null) return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false) return false; 
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null) return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false) return false; 
        if (other.getDuration() == null ^ this.getDuration() == null) return false;
        if (other.getDuration() != null && other.getDuration().equals(this.getDuration()) == false) return false; 
        if (other.getUsagePrice() == null ^ this.getUsagePrice() == null) return false;
        if (other.getUsagePrice() != null && other.getUsagePrice().equals(this.getUsagePrice()) == false) return false; 
        if (other.getFixedPrice() == null ^ this.getFixedPrice() == null) return false;
        if (other.getFixedPrice() != null && other.getFixedPrice().equals(this.getFixedPrice()) == false) return false; 
        if (other.getProductDescription() == null ^ this.getProductDescription() == null) return false;
        if (other.getProductDescription() != null && other.getProductDescription().equals(this.getProductDescription()) == false) return false; 
        if (other.getInstanceTenancy() == null ^ this.getInstanceTenancy() == null) return false;
        if (other.getInstanceTenancy() != null && other.getInstanceTenancy().equals(this.getInstanceTenancy()) == false) return false; 
        if (other.getCurrencyCode() == null ^ this.getCurrencyCode() == null) return false;
        if (other.getCurrencyCode() != null && other.getCurrencyCode().equals(this.getCurrencyCode()) == false) return false; 
        if (other.getOfferingType() == null ^ this.getOfferingType() == null) return false;
        if (other.getOfferingType() != null && other.getOfferingType().equals(this.getOfferingType()) == false) return false; 
        if (other.getRecurringCharges() == null ^ this.getRecurringCharges() == null) return false;
        if (other.getRecurringCharges() != null && other.getRecurringCharges().equals(this.getRecurringCharges()) == false) return false; 
        if (other.isMarketplace() == null ^ this.isMarketplace() == null) return false;
        if (other.isMarketplace() != null && other.isMarketplace().equals(this.isMarketplace()) == false) return false; 
        if (other.getPricingDetails() == null ^ this.getPricingDetails() == null) return false;
        if (other.getPricingDetails() != null && other.getPricingDetails().equals(this.getPricingDetails()) == false) return false; 
        return true;
    }
    
}
    