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

package com.amazonaws.services.awscostexplorerservice.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Gets recommendations for which reservations to purchase. These
 * recommendations could help you reduce your costs. Reservations provide a
 * discounted hourly rate (up to 75%) compared to On-Demand pricing.
 * </p>
 * <p>
 * AWS generates your recommendations by identifying your On-Demand usage during
 * a specific time period and collecting your usage into categories that are
 * eligible for a reservation. After AWS has these categories, it simulates
 * every combination of reservations in each category of usage to identify the
 * best number of each type of RI to purchase to maximize your estimated
 * savings.
 * </p>
 * <p>
 * For example, AWS automatically aggregates your Amazon EC2 Linux, shared
 * tenancy, and c4 family usage in the US West (Oregon) Region and recommends
 * that you buy size-flexible regional reservations to apply to the c4 family
 * usage. AWS recommends the smallest size instance in an instance family. This
 * makes it easier to purchase a size-flexible RI. AWS also shows the equal
 * number of normalized units so that you can purchase any instance size that
 * you want. For this example, your RI recommendation would be for
 * <code>c4.large</code> because that is the smallest size instance in the c4
 * instance family.
 * </p>
 */
public class GetReservationPurchaseRecommendationRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The account ID that is associated with the recommendation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String accountId;

    /**
     * <p>
     * The specific service that you want recommendations for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String service;

    /**
     * <p>
     * The account scope that you want your recommendations for. Amazon Web
     * Services calculates recommendations including the payer account and
     * linked accounts if the value is set to <code>PAYER</code>. If the value
     * is <code>LINKED</code>, recommendations are calculated for individual
     * linked accounts only.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PAYER, LINKED
     */
    private String accountScope;

    /**
     * <p>
     * The number of previous days that you want AWS to consider when it
     * calculates your recommendations.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SEVEN_DAYS, THIRTY_DAYS, SIXTY_DAYS
     */
    private String lookbackPeriodInDays;

    /**
     * <p>
     * The reservation term that you want recommendations for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONE_YEAR, THREE_YEARS
     */
    private String termInYears;

    /**
     * <p>
     * The reservation purchase option that you want recommendations for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_UPFRONT, PARTIAL_UPFRONT, ALL_UPFRONT,
     * LIGHT_UTILIZATION, MEDIUM_UTILIZATION, HEAVY_UTILIZATION
     */
    private String paymentOption;

    /**
     * <p>
     * The hardware specifications for the service instances that you want
     * recommendations for, such as standard or convertible Amazon EC2
     * instances.
     * </p>
     */
    private ServiceSpecification serviceSpecification;

    /**
     * <p>
     * The number of recommendations that you want returned in a single response
     * object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer pageSize;

    /**
     * <p>
     * The pagination token that indicates the next set of results that you want
     * to retrieve.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8192<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String nextPageToken;

    /**
     * <p>
     * The account ID that is associated with the recommendation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         The account ID that is associated with the recommendation.
     *         </p>
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * <p>
     * The account ID that is associated with the recommendation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param accountId <p>
     *            The account ID that is associated with the recommendation.
     *            </p>
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The account ID that is associated with the recommendation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param accountId <p>
     *            The account ID that is associated with the recommendation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetReservationPurchaseRecommendationRequest withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * <p>
     * The specific service that you want recommendations for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         The specific service that you want recommendations for.
     *         </p>
     */
    public String getService() {
        return service;
    }

    /**
     * <p>
     * The specific service that you want recommendations for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param service <p>
     *            The specific service that you want recommendations for.
     *            </p>
     */
    public void setService(String service) {
        this.service = service;
    }

    /**
     * <p>
     * The specific service that you want recommendations for.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param service <p>
     *            The specific service that you want recommendations for.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetReservationPurchaseRecommendationRequest withService(String service) {
        this.service = service;
        return this;
    }

    /**
     * <p>
     * The account scope that you want your recommendations for. Amazon Web
     * Services calculates recommendations including the payer account and
     * linked accounts if the value is set to <code>PAYER</code>. If the value
     * is <code>LINKED</code>, recommendations are calculated for individual
     * linked accounts only.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PAYER, LINKED
     *
     * @return <p>
     *         The account scope that you want your recommendations for. Amazon
     *         Web Services calculates recommendations including the payer
     *         account and linked accounts if the value is set to
     *         <code>PAYER</code>. If the value is <code>LINKED</code>,
     *         recommendations are calculated for individual linked accounts
     *         only.
     *         </p>
     * @see AccountScope
     */
    public String getAccountScope() {
        return accountScope;
    }

    /**
     * <p>
     * The account scope that you want your recommendations for. Amazon Web
     * Services calculates recommendations including the payer account and
     * linked accounts if the value is set to <code>PAYER</code>. If the value
     * is <code>LINKED</code>, recommendations are calculated for individual
     * linked accounts only.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PAYER, LINKED
     *
     * @param accountScope <p>
     *            The account scope that you want your recommendations for.
     *            Amazon Web Services calculates recommendations including the
     *            payer account and linked accounts if the value is set to
     *            <code>PAYER</code>. If the value is <code>LINKED</code>,
     *            recommendations are calculated for individual linked accounts
     *            only.
     *            </p>
     * @see AccountScope
     */
    public void setAccountScope(String accountScope) {
        this.accountScope = accountScope;
    }

    /**
     * <p>
     * The account scope that you want your recommendations for. Amazon Web
     * Services calculates recommendations including the payer account and
     * linked accounts if the value is set to <code>PAYER</code>. If the value
     * is <code>LINKED</code>, recommendations are calculated for individual
     * linked accounts only.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PAYER, LINKED
     *
     * @param accountScope <p>
     *            The account scope that you want your recommendations for.
     *            Amazon Web Services calculates recommendations including the
     *            payer account and linked accounts if the value is set to
     *            <code>PAYER</code>. If the value is <code>LINKED</code>,
     *            recommendations are calculated for individual linked accounts
     *            only.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AccountScope
     */
    public GetReservationPurchaseRecommendationRequest withAccountScope(String accountScope) {
        this.accountScope = accountScope;
        return this;
    }

    /**
     * <p>
     * The account scope that you want your recommendations for. Amazon Web
     * Services calculates recommendations including the payer account and
     * linked accounts if the value is set to <code>PAYER</code>. If the value
     * is <code>LINKED</code>, recommendations are calculated for individual
     * linked accounts only.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PAYER, LINKED
     *
     * @param accountScope <p>
     *            The account scope that you want your recommendations for.
     *            Amazon Web Services calculates recommendations including the
     *            payer account and linked accounts if the value is set to
     *            <code>PAYER</code>. If the value is <code>LINKED</code>,
     *            recommendations are calculated for individual linked accounts
     *            only.
     *            </p>
     * @see AccountScope
     */
    public void setAccountScope(AccountScope accountScope) {
        this.accountScope = accountScope.toString();
    }

    /**
     * <p>
     * The account scope that you want your recommendations for. Amazon Web
     * Services calculates recommendations including the payer account and
     * linked accounts if the value is set to <code>PAYER</code>. If the value
     * is <code>LINKED</code>, recommendations are calculated for individual
     * linked accounts only.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PAYER, LINKED
     *
     * @param accountScope <p>
     *            The account scope that you want your recommendations for.
     *            Amazon Web Services calculates recommendations including the
     *            payer account and linked accounts if the value is set to
     *            <code>PAYER</code>. If the value is <code>LINKED</code>,
     *            recommendations are calculated for individual linked accounts
     *            only.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AccountScope
     */
    public GetReservationPurchaseRecommendationRequest withAccountScope(AccountScope accountScope) {
        this.accountScope = accountScope.toString();
        return this;
    }

    /**
     * <p>
     * The number of previous days that you want AWS to consider when it
     * calculates your recommendations.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SEVEN_DAYS, THIRTY_DAYS, SIXTY_DAYS
     *
     * @return <p>
     *         The number of previous days that you want AWS to consider when it
     *         calculates your recommendations.
     *         </p>
     * @see LookbackPeriodInDays
     */
    public String getLookbackPeriodInDays() {
        return lookbackPeriodInDays;
    }

    /**
     * <p>
     * The number of previous days that you want AWS to consider when it
     * calculates your recommendations.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SEVEN_DAYS, THIRTY_DAYS, SIXTY_DAYS
     *
     * @param lookbackPeriodInDays <p>
     *            The number of previous days that you want AWS to consider when
     *            it calculates your recommendations.
     *            </p>
     * @see LookbackPeriodInDays
     */
    public void setLookbackPeriodInDays(String lookbackPeriodInDays) {
        this.lookbackPeriodInDays = lookbackPeriodInDays;
    }

    /**
     * <p>
     * The number of previous days that you want AWS to consider when it
     * calculates your recommendations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SEVEN_DAYS, THIRTY_DAYS, SIXTY_DAYS
     *
     * @param lookbackPeriodInDays <p>
     *            The number of previous days that you want AWS to consider when
     *            it calculates your recommendations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LookbackPeriodInDays
     */
    public GetReservationPurchaseRecommendationRequest withLookbackPeriodInDays(
            String lookbackPeriodInDays) {
        this.lookbackPeriodInDays = lookbackPeriodInDays;
        return this;
    }

    /**
     * <p>
     * The number of previous days that you want AWS to consider when it
     * calculates your recommendations.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SEVEN_DAYS, THIRTY_DAYS, SIXTY_DAYS
     *
     * @param lookbackPeriodInDays <p>
     *            The number of previous days that you want AWS to consider when
     *            it calculates your recommendations.
     *            </p>
     * @see LookbackPeriodInDays
     */
    public void setLookbackPeriodInDays(LookbackPeriodInDays lookbackPeriodInDays) {
        this.lookbackPeriodInDays = lookbackPeriodInDays.toString();
    }

    /**
     * <p>
     * The number of previous days that you want AWS to consider when it
     * calculates your recommendations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SEVEN_DAYS, THIRTY_DAYS, SIXTY_DAYS
     *
     * @param lookbackPeriodInDays <p>
     *            The number of previous days that you want AWS to consider when
     *            it calculates your recommendations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LookbackPeriodInDays
     */
    public GetReservationPurchaseRecommendationRequest withLookbackPeriodInDays(
            LookbackPeriodInDays lookbackPeriodInDays) {
        this.lookbackPeriodInDays = lookbackPeriodInDays.toString();
        return this;
    }

    /**
     * <p>
     * The reservation term that you want recommendations for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONE_YEAR, THREE_YEARS
     *
     * @return <p>
     *         The reservation term that you want recommendations for.
     *         </p>
     * @see TermInYears
     */
    public String getTermInYears() {
        return termInYears;
    }

    /**
     * <p>
     * The reservation term that you want recommendations for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONE_YEAR, THREE_YEARS
     *
     * @param termInYears <p>
     *            The reservation term that you want recommendations for.
     *            </p>
     * @see TermInYears
     */
    public void setTermInYears(String termInYears) {
        this.termInYears = termInYears;
    }

    /**
     * <p>
     * The reservation term that you want recommendations for.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONE_YEAR, THREE_YEARS
     *
     * @param termInYears <p>
     *            The reservation term that you want recommendations for.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TermInYears
     */
    public GetReservationPurchaseRecommendationRequest withTermInYears(String termInYears) {
        this.termInYears = termInYears;
        return this;
    }

    /**
     * <p>
     * The reservation term that you want recommendations for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONE_YEAR, THREE_YEARS
     *
     * @param termInYears <p>
     *            The reservation term that you want recommendations for.
     *            </p>
     * @see TermInYears
     */
    public void setTermInYears(TermInYears termInYears) {
        this.termInYears = termInYears.toString();
    }

    /**
     * <p>
     * The reservation term that you want recommendations for.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONE_YEAR, THREE_YEARS
     *
     * @param termInYears <p>
     *            The reservation term that you want recommendations for.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TermInYears
     */
    public GetReservationPurchaseRecommendationRequest withTermInYears(TermInYears termInYears) {
        this.termInYears = termInYears.toString();
        return this;
    }

    /**
     * <p>
     * The reservation purchase option that you want recommendations for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_UPFRONT, PARTIAL_UPFRONT, ALL_UPFRONT,
     * LIGHT_UTILIZATION, MEDIUM_UTILIZATION, HEAVY_UTILIZATION
     *
     * @return <p>
     *         The reservation purchase option that you want recommendations
     *         for.
     *         </p>
     * @see PaymentOption
     */
    public String getPaymentOption() {
        return paymentOption;
    }

    /**
     * <p>
     * The reservation purchase option that you want recommendations for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_UPFRONT, PARTIAL_UPFRONT, ALL_UPFRONT,
     * LIGHT_UTILIZATION, MEDIUM_UTILIZATION, HEAVY_UTILIZATION
     *
     * @param paymentOption <p>
     *            The reservation purchase option that you want recommendations
     *            for.
     *            </p>
     * @see PaymentOption
     */
    public void setPaymentOption(String paymentOption) {
        this.paymentOption = paymentOption;
    }

    /**
     * <p>
     * The reservation purchase option that you want recommendations for.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_UPFRONT, PARTIAL_UPFRONT, ALL_UPFRONT,
     * LIGHT_UTILIZATION, MEDIUM_UTILIZATION, HEAVY_UTILIZATION
     *
     * @param paymentOption <p>
     *            The reservation purchase option that you want recommendations
     *            for.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PaymentOption
     */
    public GetReservationPurchaseRecommendationRequest withPaymentOption(String paymentOption) {
        this.paymentOption = paymentOption;
        return this;
    }

    /**
     * <p>
     * The reservation purchase option that you want recommendations for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_UPFRONT, PARTIAL_UPFRONT, ALL_UPFRONT,
     * LIGHT_UTILIZATION, MEDIUM_UTILIZATION, HEAVY_UTILIZATION
     *
     * @param paymentOption <p>
     *            The reservation purchase option that you want recommendations
     *            for.
     *            </p>
     * @see PaymentOption
     */
    public void setPaymentOption(PaymentOption paymentOption) {
        this.paymentOption = paymentOption.toString();
    }

    /**
     * <p>
     * The reservation purchase option that you want recommendations for.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_UPFRONT, PARTIAL_UPFRONT, ALL_UPFRONT,
     * LIGHT_UTILIZATION, MEDIUM_UTILIZATION, HEAVY_UTILIZATION
     *
     * @param paymentOption <p>
     *            The reservation purchase option that you want recommendations
     *            for.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PaymentOption
     */
    public GetReservationPurchaseRecommendationRequest withPaymentOption(PaymentOption paymentOption) {
        this.paymentOption = paymentOption.toString();
        return this;
    }

    /**
     * <p>
     * The hardware specifications for the service instances that you want
     * recommendations for, such as standard or convertible Amazon EC2
     * instances.
     * </p>
     *
     * @return <p>
     *         The hardware specifications for the service instances that you
     *         want recommendations for, such as standard or convertible Amazon
     *         EC2 instances.
     *         </p>
     */
    public ServiceSpecification getServiceSpecification() {
        return serviceSpecification;
    }

    /**
     * <p>
     * The hardware specifications for the service instances that you want
     * recommendations for, such as standard or convertible Amazon EC2
     * instances.
     * </p>
     *
     * @param serviceSpecification <p>
     *            The hardware specifications for the service instances that you
     *            want recommendations for, such as standard or convertible
     *            Amazon EC2 instances.
     *            </p>
     */
    public void setServiceSpecification(ServiceSpecification serviceSpecification) {
        this.serviceSpecification = serviceSpecification;
    }

    /**
     * <p>
     * The hardware specifications for the service instances that you want
     * recommendations for, such as standard or convertible Amazon EC2
     * instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceSpecification <p>
     *            The hardware specifications for the service instances that you
     *            want recommendations for, such as standard or convertible
     *            Amazon EC2 instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetReservationPurchaseRecommendationRequest withServiceSpecification(
            ServiceSpecification serviceSpecification) {
        this.serviceSpecification = serviceSpecification;
        return this;
    }

    /**
     * <p>
     * The number of recommendations that you want returned in a single response
     * object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The number of recommendations that you want returned in a single
     *         response object.
     *         </p>
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * <p>
     * The number of recommendations that you want returned in a single response
     * object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param pageSize <p>
     *            The number of recommendations that you want returned in a
     *            single response object.
     *            </p>
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * <p>
     * The number of recommendations that you want returned in a single response
     * object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param pageSize <p>
     *            The number of recommendations that you want returned in a
     *            single response object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetReservationPurchaseRecommendationRequest withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * <p>
     * The pagination token that indicates the next set of results that you want
     * to retrieve.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8192<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         The pagination token that indicates the next set of results that
     *         you want to retrieve.
     *         </p>
     */
    public String getNextPageToken() {
        return nextPageToken;
    }

    /**
     * <p>
     * The pagination token that indicates the next set of results that you want
     * to retrieve.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8192<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param nextPageToken <p>
     *            The pagination token that indicates the next set of results
     *            that you want to retrieve.
     *            </p>
     */
    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    /**
     * <p>
     * The pagination token that indicates the next set of results that you want
     * to retrieve.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8192<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param nextPageToken <p>
     *            The pagination token that indicates the next set of results
     *            that you want to retrieve.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetReservationPurchaseRecommendationRequest withNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
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
        if (getAccountId() != null)
            sb.append("AccountId: " + getAccountId() + ",");
        if (getService() != null)
            sb.append("Service: " + getService() + ",");
        if (getAccountScope() != null)
            sb.append("AccountScope: " + getAccountScope() + ",");
        if (getLookbackPeriodInDays() != null)
            sb.append("LookbackPeriodInDays: " + getLookbackPeriodInDays() + ",");
        if (getTermInYears() != null)
            sb.append("TermInYears: " + getTermInYears() + ",");
        if (getPaymentOption() != null)
            sb.append("PaymentOption: " + getPaymentOption() + ",");
        if (getServiceSpecification() != null)
            sb.append("ServiceSpecification: " + getServiceSpecification() + ",");
        if (getPageSize() != null)
            sb.append("PageSize: " + getPageSize() + ",");
        if (getNextPageToken() != null)
            sb.append("NextPageToken: " + getNextPageToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getService() == null) ? 0 : getService().hashCode());
        hashCode = prime * hashCode
                + ((getAccountScope() == null) ? 0 : getAccountScope().hashCode());
        hashCode = prime * hashCode
                + ((getLookbackPeriodInDays() == null) ? 0 : getLookbackPeriodInDays().hashCode());
        hashCode = prime * hashCode
                + ((getTermInYears() == null) ? 0 : getTermInYears().hashCode());
        hashCode = prime * hashCode
                + ((getPaymentOption() == null) ? 0 : getPaymentOption().hashCode());
        hashCode = prime * hashCode
                + ((getServiceSpecification() == null) ? 0 : getServiceSpecification().hashCode());
        hashCode = prime * hashCode + ((getPageSize() == null) ? 0 : getPageSize().hashCode());
        hashCode = prime * hashCode
                + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetReservationPurchaseRecommendationRequest == false)
            return false;
        GetReservationPurchaseRecommendationRequest other = (GetReservationPurchaseRecommendationRequest) obj;

        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null
                && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getService() == null ^ this.getService() == null)
            return false;
        if (other.getService() != null && other.getService().equals(this.getService()) == false)
            return false;
        if (other.getAccountScope() == null ^ this.getAccountScope() == null)
            return false;
        if (other.getAccountScope() != null
                && other.getAccountScope().equals(this.getAccountScope()) == false)
            return false;
        if (other.getLookbackPeriodInDays() == null ^ this.getLookbackPeriodInDays() == null)
            return false;
        if (other.getLookbackPeriodInDays() != null
                && other.getLookbackPeriodInDays().equals(this.getLookbackPeriodInDays()) == false)
            return false;
        if (other.getTermInYears() == null ^ this.getTermInYears() == null)
            return false;
        if (other.getTermInYears() != null
                && other.getTermInYears().equals(this.getTermInYears()) == false)
            return false;
        if (other.getPaymentOption() == null ^ this.getPaymentOption() == null)
            return false;
        if (other.getPaymentOption() != null
                && other.getPaymentOption().equals(this.getPaymentOption()) == false)
            return false;
        if (other.getServiceSpecification() == null ^ this.getServiceSpecification() == null)
            return false;
        if (other.getServiceSpecification() != null
                && other.getServiceSpecification().equals(this.getServiceSpecification()) == false)
            return false;
        if (other.getPageSize() == null ^ this.getPageSize() == null)
            return false;
        if (other.getPageSize() != null && other.getPageSize().equals(this.getPageSize()) == false)
            return false;
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null)
            return false;
        if (other.getNextPageToken() != null
                && other.getNextPageToken().equals(this.getNextPageToken()) == false)
            return false;
        return true;
    }
}
