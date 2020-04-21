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
 * Retrieves your request parameters, Savings Plan Recommendations Summary and
 * Details.
 * </p>
 */
public class GetSavingsPlansPurchaseRecommendationRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The Savings Plans recommendation type requested.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPUTE_SP, EC2_INSTANCE_SP
     */
    private String savingsPlansType;

    /**
     * <p>
     * The savings plan recommendation term used to generated these
     * recommendations.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONE_YEAR, THREE_YEARS
     */
    private String termInYears;

    /**
     * <p>
     * The payment option used to generate these recommendations.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_UPFRONT, PARTIAL_UPFRONT, ALL_UPFRONT,
     * LIGHT_UTILIZATION, MEDIUM_UTILIZATION, HEAVY_UTILIZATION
     */
    private String paymentOption;

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
     * The token to retrieve the next set of results. Amazon Web Services
     * provides the token when the response from a previous call has more
     * results than the maximum page size.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8192<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String nextPageToken;

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
     * The lookback period used to generate the recommendation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SEVEN_DAYS, THIRTY_DAYS, SIXTY_DAYS
     */
    private String lookbackPeriodInDays;

    /**
     * <p>
     * You can filter your recommendations by Account ID with the
     * <code>LINKED_ACCOUNT</code> dimension. To filter your recommendations by
     * Account ID, specify <code>Key</code> as <code>LINKED_ACCOUNT</code> and
     * <code>Value</code> as the comma-separated Acount ID(s) for which you want
     * to see Savings Plans purchase recommendations.
     * </p>
     * <p>
     * For GetSavingsPlansPurchaseRecommendation, the <code>Filter</code> does
     * not include <code>CostCategories</code> or <code>Tags</code>. It only
     * includes <code>Dimensions</code>. With <code>Dimensions</code>,
     * <code>Key</code> must be <code>LINKED_ACCOUNT</code> and
     * <code>Value</code> can be a single Account ID or multiple comma-separated
     * Account IDs for which you want to see Savings Plans Purchase
     * Recommendations. <code>AND</code> and <code>OR</code> operators are not
     * supported.
     * </p>
     */
    private Expression filter;

    /**
     * <p>
     * The Savings Plans recommendation type requested.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPUTE_SP, EC2_INSTANCE_SP
     *
     * @return <p>
     *         The Savings Plans recommendation type requested.
     *         </p>
     * @see SupportedSavingsPlansType
     */
    public String getSavingsPlansType() {
        return savingsPlansType;
    }

    /**
     * <p>
     * The Savings Plans recommendation type requested.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPUTE_SP, EC2_INSTANCE_SP
     *
     * @param savingsPlansType <p>
     *            The Savings Plans recommendation type requested.
     *            </p>
     * @see SupportedSavingsPlansType
     */
    public void setSavingsPlansType(String savingsPlansType) {
        this.savingsPlansType = savingsPlansType;
    }

    /**
     * <p>
     * The Savings Plans recommendation type requested.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPUTE_SP, EC2_INSTANCE_SP
     *
     * @param savingsPlansType <p>
     *            The Savings Plans recommendation type requested.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SupportedSavingsPlansType
     */
    public GetSavingsPlansPurchaseRecommendationRequest withSavingsPlansType(String savingsPlansType) {
        this.savingsPlansType = savingsPlansType;
        return this;
    }

    /**
     * <p>
     * The Savings Plans recommendation type requested.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPUTE_SP, EC2_INSTANCE_SP
     *
     * @param savingsPlansType <p>
     *            The Savings Plans recommendation type requested.
     *            </p>
     * @see SupportedSavingsPlansType
     */
    public void setSavingsPlansType(SupportedSavingsPlansType savingsPlansType) {
        this.savingsPlansType = savingsPlansType.toString();
    }

    /**
     * <p>
     * The Savings Plans recommendation type requested.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPUTE_SP, EC2_INSTANCE_SP
     *
     * @param savingsPlansType <p>
     *            The Savings Plans recommendation type requested.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SupportedSavingsPlansType
     */
    public GetSavingsPlansPurchaseRecommendationRequest withSavingsPlansType(
            SupportedSavingsPlansType savingsPlansType) {
        this.savingsPlansType = savingsPlansType.toString();
        return this;
    }

    /**
     * <p>
     * The savings plan recommendation term used to generated these
     * recommendations.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONE_YEAR, THREE_YEARS
     *
     * @return <p>
     *         The savings plan recommendation term used to generated these
     *         recommendations.
     *         </p>
     * @see TermInYears
     */
    public String getTermInYears() {
        return termInYears;
    }

    /**
     * <p>
     * The savings plan recommendation term used to generated these
     * recommendations.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONE_YEAR, THREE_YEARS
     *
     * @param termInYears <p>
     *            The savings plan recommendation term used to generated these
     *            recommendations.
     *            </p>
     * @see TermInYears
     */
    public void setTermInYears(String termInYears) {
        this.termInYears = termInYears;
    }

    /**
     * <p>
     * The savings plan recommendation term used to generated these
     * recommendations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONE_YEAR, THREE_YEARS
     *
     * @param termInYears <p>
     *            The savings plan recommendation term used to generated these
     *            recommendations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TermInYears
     */
    public GetSavingsPlansPurchaseRecommendationRequest withTermInYears(String termInYears) {
        this.termInYears = termInYears;
        return this;
    }

    /**
     * <p>
     * The savings plan recommendation term used to generated these
     * recommendations.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONE_YEAR, THREE_YEARS
     *
     * @param termInYears <p>
     *            The savings plan recommendation term used to generated these
     *            recommendations.
     *            </p>
     * @see TermInYears
     */
    public void setTermInYears(TermInYears termInYears) {
        this.termInYears = termInYears.toString();
    }

    /**
     * <p>
     * The savings plan recommendation term used to generated these
     * recommendations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONE_YEAR, THREE_YEARS
     *
     * @param termInYears <p>
     *            The savings plan recommendation term used to generated these
     *            recommendations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TermInYears
     */
    public GetSavingsPlansPurchaseRecommendationRequest withTermInYears(TermInYears termInYears) {
        this.termInYears = termInYears.toString();
        return this;
    }

    /**
     * <p>
     * The payment option used to generate these recommendations.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_UPFRONT, PARTIAL_UPFRONT, ALL_UPFRONT,
     * LIGHT_UTILIZATION, MEDIUM_UTILIZATION, HEAVY_UTILIZATION
     *
     * @return <p>
     *         The payment option used to generate these recommendations.
     *         </p>
     * @see PaymentOption
     */
    public String getPaymentOption() {
        return paymentOption;
    }

    /**
     * <p>
     * The payment option used to generate these recommendations.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_UPFRONT, PARTIAL_UPFRONT, ALL_UPFRONT,
     * LIGHT_UTILIZATION, MEDIUM_UTILIZATION, HEAVY_UTILIZATION
     *
     * @param paymentOption <p>
     *            The payment option used to generate these recommendations.
     *            </p>
     * @see PaymentOption
     */
    public void setPaymentOption(String paymentOption) {
        this.paymentOption = paymentOption;
    }

    /**
     * <p>
     * The payment option used to generate these recommendations.
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
     *            The payment option used to generate these recommendations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PaymentOption
     */
    public GetSavingsPlansPurchaseRecommendationRequest withPaymentOption(String paymentOption) {
        this.paymentOption = paymentOption;
        return this;
    }

    /**
     * <p>
     * The payment option used to generate these recommendations.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_UPFRONT, PARTIAL_UPFRONT, ALL_UPFRONT,
     * LIGHT_UTILIZATION, MEDIUM_UTILIZATION, HEAVY_UTILIZATION
     *
     * @param paymentOption <p>
     *            The payment option used to generate these recommendations.
     *            </p>
     * @see PaymentOption
     */
    public void setPaymentOption(PaymentOption paymentOption) {
        this.paymentOption = paymentOption.toString();
    }

    /**
     * <p>
     * The payment option used to generate these recommendations.
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
     *            The payment option used to generate these recommendations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PaymentOption
     */
    public GetSavingsPlansPurchaseRecommendationRequest withPaymentOption(
            PaymentOption paymentOption) {
        this.paymentOption = paymentOption.toString();
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
    public GetSavingsPlansPurchaseRecommendationRequest withAccountScope(String accountScope) {
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
    public GetSavingsPlansPurchaseRecommendationRequest withAccountScope(AccountScope accountScope) {
        this.accountScope = accountScope.toString();
        return this;
    }

    /**
     * <p>
     * The token to retrieve the next set of results. Amazon Web Services
     * provides the token when the response from a previous call has more
     * results than the maximum page size.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8192<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         The token to retrieve the next set of results. Amazon Web
     *         Services provides the token when the response from a previous
     *         call has more results than the maximum page size.
     *         </p>
     */
    public String getNextPageToken() {
        return nextPageToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results. Amazon Web Services
     * provides the token when the response from a previous call has more
     * results than the maximum page size.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8192<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param nextPageToken <p>
     *            The token to retrieve the next set of results. Amazon Web
     *            Services provides the token when the response from a previous
     *            call has more results than the maximum page size.
     *            </p>
     */
    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results. Amazon Web Services
     * provides the token when the response from a previous call has more
     * results than the maximum page size.
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
     *            The token to retrieve the next set of results. Amazon Web
     *            Services provides the token when the response from a previous
     *            call has more results than the maximum page size.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetSavingsPlansPurchaseRecommendationRequest withNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
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
    public GetSavingsPlansPurchaseRecommendationRequest withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * <p>
     * The lookback period used to generate the recommendation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SEVEN_DAYS, THIRTY_DAYS, SIXTY_DAYS
     *
     * @return <p>
     *         The lookback period used to generate the recommendation.
     *         </p>
     * @see LookbackPeriodInDays
     */
    public String getLookbackPeriodInDays() {
        return lookbackPeriodInDays;
    }

    /**
     * <p>
     * The lookback period used to generate the recommendation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SEVEN_DAYS, THIRTY_DAYS, SIXTY_DAYS
     *
     * @param lookbackPeriodInDays <p>
     *            The lookback period used to generate the recommendation.
     *            </p>
     * @see LookbackPeriodInDays
     */
    public void setLookbackPeriodInDays(String lookbackPeriodInDays) {
        this.lookbackPeriodInDays = lookbackPeriodInDays;
    }

    /**
     * <p>
     * The lookback period used to generate the recommendation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SEVEN_DAYS, THIRTY_DAYS, SIXTY_DAYS
     *
     * @param lookbackPeriodInDays <p>
     *            The lookback period used to generate the recommendation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LookbackPeriodInDays
     */
    public GetSavingsPlansPurchaseRecommendationRequest withLookbackPeriodInDays(
            String lookbackPeriodInDays) {
        this.lookbackPeriodInDays = lookbackPeriodInDays;
        return this;
    }

    /**
     * <p>
     * The lookback period used to generate the recommendation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SEVEN_DAYS, THIRTY_DAYS, SIXTY_DAYS
     *
     * @param lookbackPeriodInDays <p>
     *            The lookback period used to generate the recommendation.
     *            </p>
     * @see LookbackPeriodInDays
     */
    public void setLookbackPeriodInDays(LookbackPeriodInDays lookbackPeriodInDays) {
        this.lookbackPeriodInDays = lookbackPeriodInDays.toString();
    }

    /**
     * <p>
     * The lookback period used to generate the recommendation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SEVEN_DAYS, THIRTY_DAYS, SIXTY_DAYS
     *
     * @param lookbackPeriodInDays <p>
     *            The lookback period used to generate the recommendation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LookbackPeriodInDays
     */
    public GetSavingsPlansPurchaseRecommendationRequest withLookbackPeriodInDays(
            LookbackPeriodInDays lookbackPeriodInDays) {
        this.lookbackPeriodInDays = lookbackPeriodInDays.toString();
        return this;
    }

    /**
     * <p>
     * You can filter your recommendations by Account ID with the
     * <code>LINKED_ACCOUNT</code> dimension. To filter your recommendations by
     * Account ID, specify <code>Key</code> as <code>LINKED_ACCOUNT</code> and
     * <code>Value</code> as the comma-separated Acount ID(s) for which you want
     * to see Savings Plans purchase recommendations.
     * </p>
     * <p>
     * For GetSavingsPlansPurchaseRecommendation, the <code>Filter</code> does
     * not include <code>CostCategories</code> or <code>Tags</code>. It only
     * includes <code>Dimensions</code>. With <code>Dimensions</code>,
     * <code>Key</code> must be <code>LINKED_ACCOUNT</code> and
     * <code>Value</code> can be a single Account ID or multiple comma-separated
     * Account IDs for which you want to see Savings Plans Purchase
     * Recommendations. <code>AND</code> and <code>OR</code> operators are not
     * supported.
     * </p>
     *
     * @return <p>
     *         You can filter your recommendations by Account ID with the
     *         <code>LINKED_ACCOUNT</code> dimension. To filter your
     *         recommendations by Account ID, specify <code>Key</code> as
     *         <code>LINKED_ACCOUNT</code> and <code>Value</code> as the
     *         comma-separated Acount ID(s) for which you want to see Savings
     *         Plans purchase recommendations.
     *         </p>
     *         <p>
     *         For GetSavingsPlansPurchaseRecommendation, the
     *         <code>Filter</code> does not include <code>CostCategories</code>
     *         or <code>Tags</code>. It only includes <code>Dimensions</code>.
     *         With <code>Dimensions</code>, <code>Key</code> must be
     *         <code>LINKED_ACCOUNT</code> and <code>Value</code> can be a
     *         single Account ID or multiple comma-separated Account IDs for
     *         which you want to see Savings Plans Purchase Recommendations.
     *         <code>AND</code> and <code>OR</code> operators are not supported.
     *         </p>
     */
    public Expression getFilter() {
        return filter;
    }

    /**
     * <p>
     * You can filter your recommendations by Account ID with the
     * <code>LINKED_ACCOUNT</code> dimension. To filter your recommendations by
     * Account ID, specify <code>Key</code> as <code>LINKED_ACCOUNT</code> and
     * <code>Value</code> as the comma-separated Acount ID(s) for which you want
     * to see Savings Plans purchase recommendations.
     * </p>
     * <p>
     * For GetSavingsPlansPurchaseRecommendation, the <code>Filter</code> does
     * not include <code>CostCategories</code> or <code>Tags</code>. It only
     * includes <code>Dimensions</code>. With <code>Dimensions</code>,
     * <code>Key</code> must be <code>LINKED_ACCOUNT</code> and
     * <code>Value</code> can be a single Account ID or multiple comma-separated
     * Account IDs for which you want to see Savings Plans Purchase
     * Recommendations. <code>AND</code> and <code>OR</code> operators are not
     * supported.
     * </p>
     *
     * @param filter <p>
     *            You can filter your recommendations by Account ID with the
     *            <code>LINKED_ACCOUNT</code> dimension. To filter your
     *            recommendations by Account ID, specify <code>Key</code> as
     *            <code>LINKED_ACCOUNT</code> and <code>Value</code> as the
     *            comma-separated Acount ID(s) for which you want to see Savings
     *            Plans purchase recommendations.
     *            </p>
     *            <p>
     *            For GetSavingsPlansPurchaseRecommendation, the
     *            <code>Filter</code> does not include
     *            <code>CostCategories</code> or <code>Tags</code>. It only
     *            includes <code>Dimensions</code>. With <code>Dimensions</code>, <code>Key</code> must be <code>LINKED_ACCOUNT</code> and
     *            <code>Value</code> can be a single Account ID or multiple
     *            comma-separated Account IDs for which you want to see Savings
     *            Plans Purchase Recommendations. <code>AND</code> and
     *            <code>OR</code> operators are not supported.
     *            </p>
     */
    public void setFilter(Expression filter) {
        this.filter = filter;
    }

    /**
     * <p>
     * You can filter your recommendations by Account ID with the
     * <code>LINKED_ACCOUNT</code> dimension. To filter your recommendations by
     * Account ID, specify <code>Key</code> as <code>LINKED_ACCOUNT</code> and
     * <code>Value</code> as the comma-separated Acount ID(s) for which you want
     * to see Savings Plans purchase recommendations.
     * </p>
     * <p>
     * For GetSavingsPlansPurchaseRecommendation, the <code>Filter</code> does
     * not include <code>CostCategories</code> or <code>Tags</code>. It only
     * includes <code>Dimensions</code>. With <code>Dimensions</code>,
     * <code>Key</code> must be <code>LINKED_ACCOUNT</code> and
     * <code>Value</code> can be a single Account ID or multiple comma-separated
     * Account IDs for which you want to see Savings Plans Purchase
     * Recommendations. <code>AND</code> and <code>OR</code> operators are not
     * supported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filter <p>
     *            You can filter your recommendations by Account ID with the
     *            <code>LINKED_ACCOUNT</code> dimension. To filter your
     *            recommendations by Account ID, specify <code>Key</code> as
     *            <code>LINKED_ACCOUNT</code> and <code>Value</code> as the
     *            comma-separated Acount ID(s) for which you want to see Savings
     *            Plans purchase recommendations.
     *            </p>
     *            <p>
     *            For GetSavingsPlansPurchaseRecommendation, the
     *            <code>Filter</code> does not include
     *            <code>CostCategories</code> or <code>Tags</code>. It only
     *            includes <code>Dimensions</code>. With <code>Dimensions</code>, <code>Key</code> must be <code>LINKED_ACCOUNT</code> and
     *            <code>Value</code> can be a single Account ID or multiple
     *            comma-separated Account IDs for which you want to see Savings
     *            Plans Purchase Recommendations. <code>AND</code> and
     *            <code>OR</code> operators are not supported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetSavingsPlansPurchaseRecommendationRequest withFilter(Expression filter) {
        this.filter = filter;
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
        if (getSavingsPlansType() != null)
            sb.append("SavingsPlansType: " + getSavingsPlansType() + ",");
        if (getTermInYears() != null)
            sb.append("TermInYears: " + getTermInYears() + ",");
        if (getPaymentOption() != null)
            sb.append("PaymentOption: " + getPaymentOption() + ",");
        if (getAccountScope() != null)
            sb.append("AccountScope: " + getAccountScope() + ",");
        if (getNextPageToken() != null)
            sb.append("NextPageToken: " + getNextPageToken() + ",");
        if (getPageSize() != null)
            sb.append("PageSize: " + getPageSize() + ",");
        if (getLookbackPeriodInDays() != null)
            sb.append("LookbackPeriodInDays: " + getLookbackPeriodInDays() + ",");
        if (getFilter() != null)
            sb.append("Filter: " + getFilter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSavingsPlansType() == null) ? 0 : getSavingsPlansType().hashCode());
        hashCode = prime * hashCode
                + ((getTermInYears() == null) ? 0 : getTermInYears().hashCode());
        hashCode = prime * hashCode
                + ((getPaymentOption() == null) ? 0 : getPaymentOption().hashCode());
        hashCode = prime * hashCode
                + ((getAccountScope() == null) ? 0 : getAccountScope().hashCode());
        hashCode = prime * hashCode
                + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode());
        hashCode = prime * hashCode + ((getPageSize() == null) ? 0 : getPageSize().hashCode());
        hashCode = prime * hashCode
                + ((getLookbackPeriodInDays() == null) ? 0 : getLookbackPeriodInDays().hashCode());
        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSavingsPlansPurchaseRecommendationRequest == false)
            return false;
        GetSavingsPlansPurchaseRecommendationRequest other = (GetSavingsPlansPurchaseRecommendationRequest) obj;

        if (other.getSavingsPlansType() == null ^ this.getSavingsPlansType() == null)
            return false;
        if (other.getSavingsPlansType() != null
                && other.getSavingsPlansType().equals(this.getSavingsPlansType()) == false)
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
        if (other.getAccountScope() == null ^ this.getAccountScope() == null)
            return false;
        if (other.getAccountScope() != null
                && other.getAccountScope().equals(this.getAccountScope()) == false)
            return false;
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null)
            return false;
        if (other.getNextPageToken() != null
                && other.getNextPageToken().equals(this.getNextPageToken()) == false)
            return false;
        if (other.getPageSize() == null ^ this.getPageSize() == null)
            return false;
        if (other.getPageSize() != null && other.getPageSize().equals(this.getPageSize()) == false)
            return false;
        if (other.getLookbackPeriodInDays() == null ^ this.getLookbackPeriodInDays() == null)
            return false;
        if (other.getLookbackPeriodInDays() != null
                && other.getLookbackPeriodInDays().equals(this.getLookbackPeriodInDays()) == false)
            return false;
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
            return false;
        return true;
    }
}
