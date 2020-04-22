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
 * Details of a reserved Elasticsearch instance offering.
 * </p>
 */
public class ReservedElasticsearchInstanceOffering implements Serializable {
    /**
     * <p>
     * The Elasticsearch reserved instance offering identifier.
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
     * The Elasticsearch instance type offered by the reserved instance
     * offering.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>m3.medium.elasticsearch, m3.large.elasticsearch,
     * m3.xlarge.elasticsearch, m3.2xlarge.elasticsearch,
     * m4.large.elasticsearch, m4.xlarge.elasticsearch,
     * m4.2xlarge.elasticsearch, m4.4xlarge.elasticsearch,
     * m4.10xlarge.elasticsearch, m5.large.elasticsearch,
     * m5.xlarge.elasticsearch, m5.2xlarge.elasticsearch,
     * m5.4xlarge.elasticsearch, m5.12xlarge.elasticsearch,
     * r5.large.elasticsearch, r5.xlarge.elasticsearch,
     * r5.2xlarge.elasticsearch, r5.4xlarge.elasticsearch,
     * r5.12xlarge.elasticsearch, c5.large.elasticsearch,
     * c5.xlarge.elasticsearch, c5.2xlarge.elasticsearch,
     * c5.4xlarge.elasticsearch, c5.9xlarge.elasticsearch,
     * c5.18xlarge.elasticsearch, ultrawarm1.medium.elasticsearch,
     * ultrawarm1.large.elasticsearch, t2.micro.elasticsearch,
     * t2.small.elasticsearch, t2.medium.elasticsearch, r3.large.elasticsearch,
     * r3.xlarge.elasticsearch, r3.2xlarge.elasticsearch,
     * r3.4xlarge.elasticsearch, r3.8xlarge.elasticsearch,
     * i2.xlarge.elasticsearch, i2.2xlarge.elasticsearch,
     * d2.xlarge.elasticsearch, d2.2xlarge.elasticsearch,
     * d2.4xlarge.elasticsearch, d2.8xlarge.elasticsearch,
     * c4.large.elasticsearch, c4.xlarge.elasticsearch,
     * c4.2xlarge.elasticsearch, c4.4xlarge.elasticsearch,
     * c4.8xlarge.elasticsearch, r4.large.elasticsearch,
     * r4.xlarge.elasticsearch, r4.2xlarge.elasticsearch,
     * r4.4xlarge.elasticsearch, r4.8xlarge.elasticsearch,
     * r4.16xlarge.elasticsearch, i3.large.elasticsearch,
     * i3.xlarge.elasticsearch, i3.2xlarge.elasticsearch,
     * i3.4xlarge.elasticsearch, i3.8xlarge.elasticsearch,
     * i3.16xlarge.elasticsearch
     */
    private String elasticsearchInstanceType;

    /**
     * <p>
     * The duration, in seconds, for which the offering will reserve the
     * Elasticsearch instance.
     * </p>
     */
    private Integer duration;

    /**
     * <p>
     * The upfront fixed charge you will pay to purchase the specific reserved
     * Elasticsearch instance offering.
     * </p>
     */
    private Double fixedPrice;

    /**
     * <p>
     * The rate you are charged for each hour the domain that is using the
     * offering is running.
     * </p>
     */
    private Double usagePrice;

    /**
     * <p>
     * The currency code for the reserved Elasticsearch instance offering.
     * </p>
     */
    private String currencyCode;

    /**
     * <p>
     * Payment option for the reserved Elasticsearch instance offering
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL_UPFRONT, PARTIAL_UPFRONT, NO_UPFRONT
     */
    private String paymentOption;

    /**
     * <p>
     * The charge to your account regardless of whether you are creating any
     * domains using the instance offering.
     * </p>
     */
    private java.util.List<RecurringCharge> recurringCharges;

    /**
     * <p>
     * The Elasticsearch reserved instance offering identifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>\p{XDigit}{8}-\p{XDigit}{4}-\p{XDigit}{4}-\p{XDigit}{4}-\p
     * {XDigit}{12}<br/>
     *
     * @return <p>
     *         The Elasticsearch reserved instance offering identifier.
     *         </p>
     */
    public String getReservedElasticsearchInstanceOfferingId() {
        return reservedElasticsearchInstanceOfferingId;
    }

    /**
     * <p>
     * The Elasticsearch reserved instance offering identifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>\p{XDigit}{8}-\p{XDigit}{4}-\p{XDigit}{4}-\p{XDigit}{4}-\p
     * {XDigit}{12}<br/>
     *
     * @param reservedElasticsearchInstanceOfferingId <p>
     *            The Elasticsearch reserved instance offering identifier.
     *            </p>
     */
    public void setReservedElasticsearchInstanceOfferingId(
            String reservedElasticsearchInstanceOfferingId) {
        this.reservedElasticsearchInstanceOfferingId = reservedElasticsearchInstanceOfferingId;
    }

    /**
     * <p>
     * The Elasticsearch reserved instance offering identifier.
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
     *            The Elasticsearch reserved instance offering identifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedElasticsearchInstanceOffering withReservedElasticsearchInstanceOfferingId(
            String reservedElasticsearchInstanceOfferingId) {
        this.reservedElasticsearchInstanceOfferingId = reservedElasticsearchInstanceOfferingId;
        return this;
    }

    /**
     * <p>
     * The Elasticsearch instance type offered by the reserved instance
     * offering.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>m3.medium.elasticsearch, m3.large.elasticsearch,
     * m3.xlarge.elasticsearch, m3.2xlarge.elasticsearch,
     * m4.large.elasticsearch, m4.xlarge.elasticsearch,
     * m4.2xlarge.elasticsearch, m4.4xlarge.elasticsearch,
     * m4.10xlarge.elasticsearch, m5.large.elasticsearch,
     * m5.xlarge.elasticsearch, m5.2xlarge.elasticsearch,
     * m5.4xlarge.elasticsearch, m5.12xlarge.elasticsearch,
     * r5.large.elasticsearch, r5.xlarge.elasticsearch,
     * r5.2xlarge.elasticsearch, r5.4xlarge.elasticsearch,
     * r5.12xlarge.elasticsearch, c5.large.elasticsearch,
     * c5.xlarge.elasticsearch, c5.2xlarge.elasticsearch,
     * c5.4xlarge.elasticsearch, c5.9xlarge.elasticsearch,
     * c5.18xlarge.elasticsearch, ultrawarm1.medium.elasticsearch,
     * ultrawarm1.large.elasticsearch, t2.micro.elasticsearch,
     * t2.small.elasticsearch, t2.medium.elasticsearch, r3.large.elasticsearch,
     * r3.xlarge.elasticsearch, r3.2xlarge.elasticsearch,
     * r3.4xlarge.elasticsearch, r3.8xlarge.elasticsearch,
     * i2.xlarge.elasticsearch, i2.2xlarge.elasticsearch,
     * d2.xlarge.elasticsearch, d2.2xlarge.elasticsearch,
     * d2.4xlarge.elasticsearch, d2.8xlarge.elasticsearch,
     * c4.large.elasticsearch, c4.xlarge.elasticsearch,
     * c4.2xlarge.elasticsearch, c4.4xlarge.elasticsearch,
     * c4.8xlarge.elasticsearch, r4.large.elasticsearch,
     * r4.xlarge.elasticsearch, r4.2xlarge.elasticsearch,
     * r4.4xlarge.elasticsearch, r4.8xlarge.elasticsearch,
     * r4.16xlarge.elasticsearch, i3.large.elasticsearch,
     * i3.xlarge.elasticsearch, i3.2xlarge.elasticsearch,
     * i3.4xlarge.elasticsearch, i3.8xlarge.elasticsearch,
     * i3.16xlarge.elasticsearch
     *
     * @return <p>
     *         The Elasticsearch instance type offered by the reserved instance
     *         offering.
     *         </p>
     * @see ESPartitionInstanceType
     */
    public String getElasticsearchInstanceType() {
        return elasticsearchInstanceType;
    }

    /**
     * <p>
     * The Elasticsearch instance type offered by the reserved instance
     * offering.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>m3.medium.elasticsearch, m3.large.elasticsearch,
     * m3.xlarge.elasticsearch, m3.2xlarge.elasticsearch,
     * m4.large.elasticsearch, m4.xlarge.elasticsearch,
     * m4.2xlarge.elasticsearch, m4.4xlarge.elasticsearch,
     * m4.10xlarge.elasticsearch, m5.large.elasticsearch,
     * m5.xlarge.elasticsearch, m5.2xlarge.elasticsearch,
     * m5.4xlarge.elasticsearch, m5.12xlarge.elasticsearch,
     * r5.large.elasticsearch, r5.xlarge.elasticsearch,
     * r5.2xlarge.elasticsearch, r5.4xlarge.elasticsearch,
     * r5.12xlarge.elasticsearch, c5.large.elasticsearch,
     * c5.xlarge.elasticsearch, c5.2xlarge.elasticsearch,
     * c5.4xlarge.elasticsearch, c5.9xlarge.elasticsearch,
     * c5.18xlarge.elasticsearch, ultrawarm1.medium.elasticsearch,
     * ultrawarm1.large.elasticsearch, t2.micro.elasticsearch,
     * t2.small.elasticsearch, t2.medium.elasticsearch, r3.large.elasticsearch,
     * r3.xlarge.elasticsearch, r3.2xlarge.elasticsearch,
     * r3.4xlarge.elasticsearch, r3.8xlarge.elasticsearch,
     * i2.xlarge.elasticsearch, i2.2xlarge.elasticsearch,
     * d2.xlarge.elasticsearch, d2.2xlarge.elasticsearch,
     * d2.4xlarge.elasticsearch, d2.8xlarge.elasticsearch,
     * c4.large.elasticsearch, c4.xlarge.elasticsearch,
     * c4.2xlarge.elasticsearch, c4.4xlarge.elasticsearch,
     * c4.8xlarge.elasticsearch, r4.large.elasticsearch,
     * r4.xlarge.elasticsearch, r4.2xlarge.elasticsearch,
     * r4.4xlarge.elasticsearch, r4.8xlarge.elasticsearch,
     * r4.16xlarge.elasticsearch, i3.large.elasticsearch,
     * i3.xlarge.elasticsearch, i3.2xlarge.elasticsearch,
     * i3.4xlarge.elasticsearch, i3.8xlarge.elasticsearch,
     * i3.16xlarge.elasticsearch
     *
     * @param elasticsearchInstanceType <p>
     *            The Elasticsearch instance type offered by the reserved
     *            instance offering.
     *            </p>
     * @see ESPartitionInstanceType
     */
    public void setElasticsearchInstanceType(String elasticsearchInstanceType) {
        this.elasticsearchInstanceType = elasticsearchInstanceType;
    }

    /**
     * <p>
     * The Elasticsearch instance type offered by the reserved instance
     * offering.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>m3.medium.elasticsearch, m3.large.elasticsearch,
     * m3.xlarge.elasticsearch, m3.2xlarge.elasticsearch,
     * m4.large.elasticsearch, m4.xlarge.elasticsearch,
     * m4.2xlarge.elasticsearch, m4.4xlarge.elasticsearch,
     * m4.10xlarge.elasticsearch, m5.large.elasticsearch,
     * m5.xlarge.elasticsearch, m5.2xlarge.elasticsearch,
     * m5.4xlarge.elasticsearch, m5.12xlarge.elasticsearch,
     * r5.large.elasticsearch, r5.xlarge.elasticsearch,
     * r5.2xlarge.elasticsearch, r5.4xlarge.elasticsearch,
     * r5.12xlarge.elasticsearch, c5.large.elasticsearch,
     * c5.xlarge.elasticsearch, c5.2xlarge.elasticsearch,
     * c5.4xlarge.elasticsearch, c5.9xlarge.elasticsearch,
     * c5.18xlarge.elasticsearch, ultrawarm1.medium.elasticsearch,
     * ultrawarm1.large.elasticsearch, t2.micro.elasticsearch,
     * t2.small.elasticsearch, t2.medium.elasticsearch, r3.large.elasticsearch,
     * r3.xlarge.elasticsearch, r3.2xlarge.elasticsearch,
     * r3.4xlarge.elasticsearch, r3.8xlarge.elasticsearch,
     * i2.xlarge.elasticsearch, i2.2xlarge.elasticsearch,
     * d2.xlarge.elasticsearch, d2.2xlarge.elasticsearch,
     * d2.4xlarge.elasticsearch, d2.8xlarge.elasticsearch,
     * c4.large.elasticsearch, c4.xlarge.elasticsearch,
     * c4.2xlarge.elasticsearch, c4.4xlarge.elasticsearch,
     * c4.8xlarge.elasticsearch, r4.large.elasticsearch,
     * r4.xlarge.elasticsearch, r4.2xlarge.elasticsearch,
     * r4.4xlarge.elasticsearch, r4.8xlarge.elasticsearch,
     * r4.16xlarge.elasticsearch, i3.large.elasticsearch,
     * i3.xlarge.elasticsearch, i3.2xlarge.elasticsearch,
     * i3.4xlarge.elasticsearch, i3.8xlarge.elasticsearch,
     * i3.16xlarge.elasticsearch
     *
     * @param elasticsearchInstanceType <p>
     *            The Elasticsearch instance type offered by the reserved
     *            instance offering.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ESPartitionInstanceType
     */
    public ReservedElasticsearchInstanceOffering withElasticsearchInstanceType(
            String elasticsearchInstanceType) {
        this.elasticsearchInstanceType = elasticsearchInstanceType;
        return this;
    }

    /**
     * <p>
     * The Elasticsearch instance type offered by the reserved instance
     * offering.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>m3.medium.elasticsearch, m3.large.elasticsearch,
     * m3.xlarge.elasticsearch, m3.2xlarge.elasticsearch,
     * m4.large.elasticsearch, m4.xlarge.elasticsearch,
     * m4.2xlarge.elasticsearch, m4.4xlarge.elasticsearch,
     * m4.10xlarge.elasticsearch, m5.large.elasticsearch,
     * m5.xlarge.elasticsearch, m5.2xlarge.elasticsearch,
     * m5.4xlarge.elasticsearch, m5.12xlarge.elasticsearch,
     * r5.large.elasticsearch, r5.xlarge.elasticsearch,
     * r5.2xlarge.elasticsearch, r5.4xlarge.elasticsearch,
     * r5.12xlarge.elasticsearch, c5.large.elasticsearch,
     * c5.xlarge.elasticsearch, c5.2xlarge.elasticsearch,
     * c5.4xlarge.elasticsearch, c5.9xlarge.elasticsearch,
     * c5.18xlarge.elasticsearch, ultrawarm1.medium.elasticsearch,
     * ultrawarm1.large.elasticsearch, t2.micro.elasticsearch,
     * t2.small.elasticsearch, t2.medium.elasticsearch, r3.large.elasticsearch,
     * r3.xlarge.elasticsearch, r3.2xlarge.elasticsearch,
     * r3.4xlarge.elasticsearch, r3.8xlarge.elasticsearch,
     * i2.xlarge.elasticsearch, i2.2xlarge.elasticsearch,
     * d2.xlarge.elasticsearch, d2.2xlarge.elasticsearch,
     * d2.4xlarge.elasticsearch, d2.8xlarge.elasticsearch,
     * c4.large.elasticsearch, c4.xlarge.elasticsearch,
     * c4.2xlarge.elasticsearch, c4.4xlarge.elasticsearch,
     * c4.8xlarge.elasticsearch, r4.large.elasticsearch,
     * r4.xlarge.elasticsearch, r4.2xlarge.elasticsearch,
     * r4.4xlarge.elasticsearch, r4.8xlarge.elasticsearch,
     * r4.16xlarge.elasticsearch, i3.large.elasticsearch,
     * i3.xlarge.elasticsearch, i3.2xlarge.elasticsearch,
     * i3.4xlarge.elasticsearch, i3.8xlarge.elasticsearch,
     * i3.16xlarge.elasticsearch
     *
     * @param elasticsearchInstanceType <p>
     *            The Elasticsearch instance type offered by the reserved
     *            instance offering.
     *            </p>
     * @see ESPartitionInstanceType
     */
    public void setElasticsearchInstanceType(ESPartitionInstanceType elasticsearchInstanceType) {
        this.elasticsearchInstanceType = elasticsearchInstanceType.toString();
    }

    /**
     * <p>
     * The Elasticsearch instance type offered by the reserved instance
     * offering.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>m3.medium.elasticsearch, m3.large.elasticsearch,
     * m3.xlarge.elasticsearch, m3.2xlarge.elasticsearch,
     * m4.large.elasticsearch, m4.xlarge.elasticsearch,
     * m4.2xlarge.elasticsearch, m4.4xlarge.elasticsearch,
     * m4.10xlarge.elasticsearch, m5.large.elasticsearch,
     * m5.xlarge.elasticsearch, m5.2xlarge.elasticsearch,
     * m5.4xlarge.elasticsearch, m5.12xlarge.elasticsearch,
     * r5.large.elasticsearch, r5.xlarge.elasticsearch,
     * r5.2xlarge.elasticsearch, r5.4xlarge.elasticsearch,
     * r5.12xlarge.elasticsearch, c5.large.elasticsearch,
     * c5.xlarge.elasticsearch, c5.2xlarge.elasticsearch,
     * c5.4xlarge.elasticsearch, c5.9xlarge.elasticsearch,
     * c5.18xlarge.elasticsearch, ultrawarm1.medium.elasticsearch,
     * ultrawarm1.large.elasticsearch, t2.micro.elasticsearch,
     * t2.small.elasticsearch, t2.medium.elasticsearch, r3.large.elasticsearch,
     * r3.xlarge.elasticsearch, r3.2xlarge.elasticsearch,
     * r3.4xlarge.elasticsearch, r3.8xlarge.elasticsearch,
     * i2.xlarge.elasticsearch, i2.2xlarge.elasticsearch,
     * d2.xlarge.elasticsearch, d2.2xlarge.elasticsearch,
     * d2.4xlarge.elasticsearch, d2.8xlarge.elasticsearch,
     * c4.large.elasticsearch, c4.xlarge.elasticsearch,
     * c4.2xlarge.elasticsearch, c4.4xlarge.elasticsearch,
     * c4.8xlarge.elasticsearch, r4.large.elasticsearch,
     * r4.xlarge.elasticsearch, r4.2xlarge.elasticsearch,
     * r4.4xlarge.elasticsearch, r4.8xlarge.elasticsearch,
     * r4.16xlarge.elasticsearch, i3.large.elasticsearch,
     * i3.xlarge.elasticsearch, i3.2xlarge.elasticsearch,
     * i3.4xlarge.elasticsearch, i3.8xlarge.elasticsearch,
     * i3.16xlarge.elasticsearch
     *
     * @param elasticsearchInstanceType <p>
     *            The Elasticsearch instance type offered by the reserved
     *            instance offering.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ESPartitionInstanceType
     */
    public ReservedElasticsearchInstanceOffering withElasticsearchInstanceType(
            ESPartitionInstanceType elasticsearchInstanceType) {
        this.elasticsearchInstanceType = elasticsearchInstanceType.toString();
        return this;
    }

    /**
     * <p>
     * The duration, in seconds, for which the offering will reserve the
     * Elasticsearch instance.
     * </p>
     *
     * @return <p>
     *         The duration, in seconds, for which the offering will reserve the
     *         Elasticsearch instance.
     *         </p>
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * <p>
     * The duration, in seconds, for which the offering will reserve the
     * Elasticsearch instance.
     * </p>
     *
     * @param duration <p>
     *            The duration, in seconds, for which the offering will reserve
     *            the Elasticsearch instance.
     *            </p>
     */
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * <p>
     * The duration, in seconds, for which the offering will reserve the
     * Elasticsearch instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param duration <p>
     *            The duration, in seconds, for which the offering will reserve
     *            the Elasticsearch instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedElasticsearchInstanceOffering withDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /**
     * <p>
     * The upfront fixed charge you will pay to purchase the specific reserved
     * Elasticsearch instance offering.
     * </p>
     *
     * @return <p>
     *         The upfront fixed charge you will pay to purchase the specific
     *         reserved Elasticsearch instance offering.
     *         </p>
     */
    public Double getFixedPrice() {
        return fixedPrice;
    }

    /**
     * <p>
     * The upfront fixed charge you will pay to purchase the specific reserved
     * Elasticsearch instance offering.
     * </p>
     *
     * @param fixedPrice <p>
     *            The upfront fixed charge you will pay to purchase the specific
     *            reserved Elasticsearch instance offering.
     *            </p>
     */
    public void setFixedPrice(Double fixedPrice) {
        this.fixedPrice = fixedPrice;
    }

    /**
     * <p>
     * The upfront fixed charge you will pay to purchase the specific reserved
     * Elasticsearch instance offering.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fixedPrice <p>
     *            The upfront fixed charge you will pay to purchase the specific
     *            reserved Elasticsearch instance offering.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedElasticsearchInstanceOffering withFixedPrice(Double fixedPrice) {
        this.fixedPrice = fixedPrice;
        return this;
    }

    /**
     * <p>
     * The rate you are charged for each hour the domain that is using the
     * offering is running.
     * </p>
     *
     * @return <p>
     *         The rate you are charged for each hour the domain that is using
     *         the offering is running.
     *         </p>
     */
    public Double getUsagePrice() {
        return usagePrice;
    }

    /**
     * <p>
     * The rate you are charged for each hour the domain that is using the
     * offering is running.
     * </p>
     *
     * @param usagePrice <p>
     *            The rate you are charged for each hour the domain that is
     *            using the offering is running.
     *            </p>
     */
    public void setUsagePrice(Double usagePrice) {
        this.usagePrice = usagePrice;
    }

    /**
     * <p>
     * The rate you are charged for each hour the domain that is using the
     * offering is running.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param usagePrice <p>
     *            The rate you are charged for each hour the domain that is
     *            using the offering is running.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedElasticsearchInstanceOffering withUsagePrice(Double usagePrice) {
        this.usagePrice = usagePrice;
        return this;
    }

    /**
     * <p>
     * The currency code for the reserved Elasticsearch instance offering.
     * </p>
     *
     * @return <p>
     *         The currency code for the reserved Elasticsearch instance
     *         offering.
     *         </p>
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * <p>
     * The currency code for the reserved Elasticsearch instance offering.
     * </p>
     *
     * @param currencyCode <p>
     *            The currency code for the reserved Elasticsearch instance
     *            offering.
     *            </p>
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * <p>
     * The currency code for the reserved Elasticsearch instance offering.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param currencyCode <p>
     *            The currency code for the reserved Elasticsearch instance
     *            offering.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedElasticsearchInstanceOffering withCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    /**
     * <p>
     * Payment option for the reserved Elasticsearch instance offering
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL_UPFRONT, PARTIAL_UPFRONT, NO_UPFRONT
     *
     * @return <p>
     *         Payment option for the reserved Elasticsearch instance offering
     *         </p>
     * @see ReservedElasticsearchInstancePaymentOption
     */
    public String getPaymentOption() {
        return paymentOption;
    }

    /**
     * <p>
     * Payment option for the reserved Elasticsearch instance offering
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL_UPFRONT, PARTIAL_UPFRONT, NO_UPFRONT
     *
     * @param paymentOption <p>
     *            Payment option for the reserved Elasticsearch instance
     *            offering
     *            </p>
     * @see ReservedElasticsearchInstancePaymentOption
     */
    public void setPaymentOption(String paymentOption) {
        this.paymentOption = paymentOption;
    }

    /**
     * <p>
     * Payment option for the reserved Elasticsearch instance offering
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL_UPFRONT, PARTIAL_UPFRONT, NO_UPFRONT
     *
     * @param paymentOption <p>
     *            Payment option for the reserved Elasticsearch instance
     *            offering
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ReservedElasticsearchInstancePaymentOption
     */
    public ReservedElasticsearchInstanceOffering withPaymentOption(String paymentOption) {
        this.paymentOption = paymentOption;
        return this;
    }

    /**
     * <p>
     * Payment option for the reserved Elasticsearch instance offering
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL_UPFRONT, PARTIAL_UPFRONT, NO_UPFRONT
     *
     * @param paymentOption <p>
     *            Payment option for the reserved Elasticsearch instance
     *            offering
     *            </p>
     * @see ReservedElasticsearchInstancePaymentOption
     */
    public void setPaymentOption(ReservedElasticsearchInstancePaymentOption paymentOption) {
        this.paymentOption = paymentOption.toString();
    }

    /**
     * <p>
     * Payment option for the reserved Elasticsearch instance offering
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL_UPFRONT, PARTIAL_UPFRONT, NO_UPFRONT
     *
     * @param paymentOption <p>
     *            Payment option for the reserved Elasticsearch instance
     *            offering
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ReservedElasticsearchInstancePaymentOption
     */
    public ReservedElasticsearchInstanceOffering withPaymentOption(
            ReservedElasticsearchInstancePaymentOption paymentOption) {
        this.paymentOption = paymentOption.toString();
        return this;
    }

    /**
     * <p>
     * The charge to your account regardless of whether you are creating any
     * domains using the instance offering.
     * </p>
     *
     * @return <p>
     *         The charge to your account regardless of whether you are creating
     *         any domains using the instance offering.
     *         </p>
     */
    public java.util.List<RecurringCharge> getRecurringCharges() {
        return recurringCharges;
    }

    /**
     * <p>
     * The charge to your account regardless of whether you are creating any
     * domains using the instance offering.
     * </p>
     *
     * @param recurringCharges <p>
     *            The charge to your account regardless of whether you are
     *            creating any domains using the instance offering.
     *            </p>
     */
    public void setRecurringCharges(java.util.Collection<RecurringCharge> recurringCharges) {
        if (recurringCharges == null) {
            this.recurringCharges = null;
            return;
        }

        this.recurringCharges = new java.util.ArrayList<RecurringCharge>(recurringCharges);
    }

    /**
     * <p>
     * The charge to your account regardless of whether you are creating any
     * domains using the instance offering.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param recurringCharges <p>
     *            The charge to your account regardless of whether you are
     *            creating any domains using the instance offering.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedElasticsearchInstanceOffering withRecurringCharges(
            RecurringCharge... recurringCharges) {
        if (getRecurringCharges() == null) {
            this.recurringCharges = new java.util.ArrayList<RecurringCharge>(
                    recurringCharges.length);
        }
        for (RecurringCharge value : recurringCharges) {
            this.recurringCharges.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The charge to your account regardless of whether you are creating any
     * domains using the instance offering.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param recurringCharges <p>
     *            The charge to your account regardless of whether you are
     *            creating any domains using the instance offering.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservedElasticsearchInstanceOffering withRecurringCharges(
            java.util.Collection<RecurringCharge> recurringCharges) {
        setRecurringCharges(recurringCharges);
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
        if (getElasticsearchInstanceType() != null)
            sb.append("ElasticsearchInstanceType: " + getElasticsearchInstanceType() + ",");
        if (getDuration() != null)
            sb.append("Duration: " + getDuration() + ",");
        if (getFixedPrice() != null)
            sb.append("FixedPrice: " + getFixedPrice() + ",");
        if (getUsagePrice() != null)
            sb.append("UsagePrice: " + getUsagePrice() + ",");
        if (getCurrencyCode() != null)
            sb.append("CurrencyCode: " + getCurrencyCode() + ",");
        if (getPaymentOption() != null)
            sb.append("PaymentOption: " + getPaymentOption() + ",");
        if (getRecurringCharges() != null)
            sb.append("RecurringCharges: " + getRecurringCharges());
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
        hashCode = prime
                * hashCode
                + ((getElasticsearchInstanceType() == null) ? 0 : getElasticsearchInstanceType()
                        .hashCode());
        hashCode = prime * hashCode + ((getDuration() == null) ? 0 : getDuration().hashCode());
        hashCode = prime * hashCode + ((getFixedPrice() == null) ? 0 : getFixedPrice().hashCode());
        hashCode = prime * hashCode + ((getUsagePrice() == null) ? 0 : getUsagePrice().hashCode());
        hashCode = prime * hashCode
                + ((getCurrencyCode() == null) ? 0 : getCurrencyCode().hashCode());
        hashCode = prime * hashCode
                + ((getPaymentOption() == null) ? 0 : getPaymentOption().hashCode());
        hashCode = prime * hashCode
                + ((getRecurringCharges() == null) ? 0 : getRecurringCharges().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReservedElasticsearchInstanceOffering == false)
            return false;
        ReservedElasticsearchInstanceOffering other = (ReservedElasticsearchInstanceOffering) obj;

        if (other.getReservedElasticsearchInstanceOfferingId() == null
                ^ this.getReservedElasticsearchInstanceOfferingId() == null)
            return false;
        if (other.getReservedElasticsearchInstanceOfferingId() != null
                && other.getReservedElasticsearchInstanceOfferingId().equals(
                        this.getReservedElasticsearchInstanceOfferingId()) == false)
            return false;
        if (other.getElasticsearchInstanceType() == null
                ^ this.getElasticsearchInstanceType() == null)
            return false;
        if (other.getElasticsearchInstanceType() != null
                && other.getElasticsearchInstanceType().equals(this.getElasticsearchInstanceType()) == false)
            return false;
        if (other.getDuration() == null ^ this.getDuration() == null)
            return false;
        if (other.getDuration() != null && other.getDuration().equals(this.getDuration()) == false)
            return false;
        if (other.getFixedPrice() == null ^ this.getFixedPrice() == null)
            return false;
        if (other.getFixedPrice() != null
                && other.getFixedPrice().equals(this.getFixedPrice()) == false)
            return false;
        if (other.getUsagePrice() == null ^ this.getUsagePrice() == null)
            return false;
        if (other.getUsagePrice() != null
                && other.getUsagePrice().equals(this.getUsagePrice()) == false)
            return false;
        if (other.getCurrencyCode() == null ^ this.getCurrencyCode() == null)
            return false;
        if (other.getCurrencyCode() != null
                && other.getCurrencyCode().equals(this.getCurrencyCode()) == false)
            return false;
        if (other.getPaymentOption() == null ^ this.getPaymentOption() == null)
            return false;
        if (other.getPaymentOption() != null
                && other.getPaymentOption().equals(this.getPaymentOption()) == false)
            return false;
        if (other.getRecurringCharges() == null ^ this.getRecurringCharges() == null)
            return false;
        if (other.getRecurringCharges() != null
                && other.getRecurringCharges().equals(this.getRecurringCharges()) == false)
            return false;
        return true;
    }
}
