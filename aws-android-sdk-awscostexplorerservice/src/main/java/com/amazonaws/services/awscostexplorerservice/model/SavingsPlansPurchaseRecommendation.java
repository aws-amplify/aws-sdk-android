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

/**
 * <p>
 * Contains your request parameters, Savings Plan Recommendations Summary, and
 * Details.
 * </p>
 */
public class SavingsPlansPurchaseRecommendation implements Serializable {
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
     * The requested Savings Plans recommendation type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPUTE_SP, EC2_INSTANCE_SP
     */
    private String savingsPlansType;

    /**
     * <p>
     * The Savings Plans recommendation term in years, used to generate the
     * recommendation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONE_YEAR, THREE_YEARS
     */
    private String termInYears;

    /**
     * <p>
     * The payment option used to generate the recommendation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_UPFRONT, PARTIAL_UPFRONT, ALL_UPFRONT,
     * LIGHT_UTILIZATION, MEDIUM_UTILIZATION, HEAVY_UTILIZATION
     */
    private String paymentOption;

    /**
     * <p>
     * The lookback period in days, used to generate the recommendation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SEVEN_DAYS, THIRTY_DAYS, SIXTY_DAYS
     */
    private String lookbackPeriodInDays;

    /**
     * <p>
     * Details for the Savings Plans we recommend that you purchase to cover
     * existing Savings Plans eligible workloads.
     * </p>
     */
    private java.util.List<SavingsPlansPurchaseRecommendationDetail> savingsPlansPurchaseRecommendationDetails;

    /**
     * <p>
     * Summary metrics for your Savings Plans Recommendations.
     * </p>
     */
    private SavingsPlansPurchaseRecommendationSummary savingsPlansPurchaseRecommendationSummary;

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
    public SavingsPlansPurchaseRecommendation withAccountScope(String accountScope) {
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
    public SavingsPlansPurchaseRecommendation withAccountScope(AccountScope accountScope) {
        this.accountScope = accountScope.toString();
        return this;
    }

    /**
     * <p>
     * The requested Savings Plans recommendation type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPUTE_SP, EC2_INSTANCE_SP
     *
     * @return <p>
     *         The requested Savings Plans recommendation type.
     *         </p>
     * @see SupportedSavingsPlansType
     */
    public String getSavingsPlansType() {
        return savingsPlansType;
    }

    /**
     * <p>
     * The requested Savings Plans recommendation type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPUTE_SP, EC2_INSTANCE_SP
     *
     * @param savingsPlansType <p>
     *            The requested Savings Plans recommendation type.
     *            </p>
     * @see SupportedSavingsPlansType
     */
    public void setSavingsPlansType(String savingsPlansType) {
        this.savingsPlansType = savingsPlansType;
    }

    /**
     * <p>
     * The requested Savings Plans recommendation type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPUTE_SP, EC2_INSTANCE_SP
     *
     * @param savingsPlansType <p>
     *            The requested Savings Plans recommendation type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SupportedSavingsPlansType
     */
    public SavingsPlansPurchaseRecommendation withSavingsPlansType(String savingsPlansType) {
        this.savingsPlansType = savingsPlansType;
        return this;
    }

    /**
     * <p>
     * The requested Savings Plans recommendation type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPUTE_SP, EC2_INSTANCE_SP
     *
     * @param savingsPlansType <p>
     *            The requested Savings Plans recommendation type.
     *            </p>
     * @see SupportedSavingsPlansType
     */
    public void setSavingsPlansType(SupportedSavingsPlansType savingsPlansType) {
        this.savingsPlansType = savingsPlansType.toString();
    }

    /**
     * <p>
     * The requested Savings Plans recommendation type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COMPUTE_SP, EC2_INSTANCE_SP
     *
     * @param savingsPlansType <p>
     *            The requested Savings Plans recommendation type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SupportedSavingsPlansType
     */
    public SavingsPlansPurchaseRecommendation withSavingsPlansType(
            SupportedSavingsPlansType savingsPlansType) {
        this.savingsPlansType = savingsPlansType.toString();
        return this;
    }

    /**
     * <p>
     * The Savings Plans recommendation term in years, used to generate the
     * recommendation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONE_YEAR, THREE_YEARS
     *
     * @return <p>
     *         The Savings Plans recommendation term in years, used to generate
     *         the recommendation.
     *         </p>
     * @see TermInYears
     */
    public String getTermInYears() {
        return termInYears;
    }

    /**
     * <p>
     * The Savings Plans recommendation term in years, used to generate the
     * recommendation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONE_YEAR, THREE_YEARS
     *
     * @param termInYears <p>
     *            The Savings Plans recommendation term in years, used to
     *            generate the recommendation.
     *            </p>
     * @see TermInYears
     */
    public void setTermInYears(String termInYears) {
        this.termInYears = termInYears;
    }

    /**
     * <p>
     * The Savings Plans recommendation term in years, used to generate the
     * recommendation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONE_YEAR, THREE_YEARS
     *
     * @param termInYears <p>
     *            The Savings Plans recommendation term in years, used to
     *            generate the recommendation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TermInYears
     */
    public SavingsPlansPurchaseRecommendation withTermInYears(String termInYears) {
        this.termInYears = termInYears;
        return this;
    }

    /**
     * <p>
     * The Savings Plans recommendation term in years, used to generate the
     * recommendation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONE_YEAR, THREE_YEARS
     *
     * @param termInYears <p>
     *            The Savings Plans recommendation term in years, used to
     *            generate the recommendation.
     *            </p>
     * @see TermInYears
     */
    public void setTermInYears(TermInYears termInYears) {
        this.termInYears = termInYears.toString();
    }

    /**
     * <p>
     * The Savings Plans recommendation term in years, used to generate the
     * recommendation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ONE_YEAR, THREE_YEARS
     *
     * @param termInYears <p>
     *            The Savings Plans recommendation term in years, used to
     *            generate the recommendation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TermInYears
     */
    public SavingsPlansPurchaseRecommendation withTermInYears(TermInYears termInYears) {
        this.termInYears = termInYears.toString();
        return this;
    }

    /**
     * <p>
     * The payment option used to generate the recommendation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_UPFRONT, PARTIAL_UPFRONT, ALL_UPFRONT,
     * LIGHT_UTILIZATION, MEDIUM_UTILIZATION, HEAVY_UTILIZATION
     *
     * @return <p>
     *         The payment option used to generate the recommendation.
     *         </p>
     * @see PaymentOption
     */
    public String getPaymentOption() {
        return paymentOption;
    }

    /**
     * <p>
     * The payment option used to generate the recommendation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_UPFRONT, PARTIAL_UPFRONT, ALL_UPFRONT,
     * LIGHT_UTILIZATION, MEDIUM_UTILIZATION, HEAVY_UTILIZATION
     *
     * @param paymentOption <p>
     *            The payment option used to generate the recommendation.
     *            </p>
     * @see PaymentOption
     */
    public void setPaymentOption(String paymentOption) {
        this.paymentOption = paymentOption;
    }

    /**
     * <p>
     * The payment option used to generate the recommendation.
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
     *            The payment option used to generate the recommendation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PaymentOption
     */
    public SavingsPlansPurchaseRecommendation withPaymentOption(String paymentOption) {
        this.paymentOption = paymentOption;
        return this;
    }

    /**
     * <p>
     * The payment option used to generate the recommendation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_UPFRONT, PARTIAL_UPFRONT, ALL_UPFRONT,
     * LIGHT_UTILIZATION, MEDIUM_UTILIZATION, HEAVY_UTILIZATION
     *
     * @param paymentOption <p>
     *            The payment option used to generate the recommendation.
     *            </p>
     * @see PaymentOption
     */
    public void setPaymentOption(PaymentOption paymentOption) {
        this.paymentOption = paymentOption.toString();
    }

    /**
     * <p>
     * The payment option used to generate the recommendation.
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
     *            The payment option used to generate the recommendation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PaymentOption
     */
    public SavingsPlansPurchaseRecommendation withPaymentOption(PaymentOption paymentOption) {
        this.paymentOption = paymentOption.toString();
        return this;
    }

    /**
     * <p>
     * The lookback period in days, used to generate the recommendation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SEVEN_DAYS, THIRTY_DAYS, SIXTY_DAYS
     *
     * @return <p>
     *         The lookback period in days, used to generate the recommendation.
     *         </p>
     * @see LookbackPeriodInDays
     */
    public String getLookbackPeriodInDays() {
        return lookbackPeriodInDays;
    }

    /**
     * <p>
     * The lookback period in days, used to generate the recommendation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SEVEN_DAYS, THIRTY_DAYS, SIXTY_DAYS
     *
     * @param lookbackPeriodInDays <p>
     *            The lookback period in days, used to generate the
     *            recommendation.
     *            </p>
     * @see LookbackPeriodInDays
     */
    public void setLookbackPeriodInDays(String lookbackPeriodInDays) {
        this.lookbackPeriodInDays = lookbackPeriodInDays;
    }

    /**
     * <p>
     * The lookback period in days, used to generate the recommendation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SEVEN_DAYS, THIRTY_DAYS, SIXTY_DAYS
     *
     * @param lookbackPeriodInDays <p>
     *            The lookback period in days, used to generate the
     *            recommendation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LookbackPeriodInDays
     */
    public SavingsPlansPurchaseRecommendation withLookbackPeriodInDays(String lookbackPeriodInDays) {
        this.lookbackPeriodInDays = lookbackPeriodInDays;
        return this;
    }

    /**
     * <p>
     * The lookback period in days, used to generate the recommendation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SEVEN_DAYS, THIRTY_DAYS, SIXTY_DAYS
     *
     * @param lookbackPeriodInDays <p>
     *            The lookback period in days, used to generate the
     *            recommendation.
     *            </p>
     * @see LookbackPeriodInDays
     */
    public void setLookbackPeriodInDays(LookbackPeriodInDays lookbackPeriodInDays) {
        this.lookbackPeriodInDays = lookbackPeriodInDays.toString();
    }

    /**
     * <p>
     * The lookback period in days, used to generate the recommendation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SEVEN_DAYS, THIRTY_DAYS, SIXTY_DAYS
     *
     * @param lookbackPeriodInDays <p>
     *            The lookback period in days, used to generate the
     *            recommendation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LookbackPeriodInDays
     */
    public SavingsPlansPurchaseRecommendation withLookbackPeriodInDays(
            LookbackPeriodInDays lookbackPeriodInDays) {
        this.lookbackPeriodInDays = lookbackPeriodInDays.toString();
        return this;
    }

    /**
     * <p>
     * Details for the Savings Plans we recommend that you purchase to cover
     * existing Savings Plans eligible workloads.
     * </p>
     *
     * @return <p>
     *         Details for the Savings Plans we recommend that you purchase to
     *         cover existing Savings Plans eligible workloads.
     *         </p>
     */
    public java.util.List<SavingsPlansPurchaseRecommendationDetail> getSavingsPlansPurchaseRecommendationDetails() {
        return savingsPlansPurchaseRecommendationDetails;
    }

    /**
     * <p>
     * Details for the Savings Plans we recommend that you purchase to cover
     * existing Savings Plans eligible workloads.
     * </p>
     *
     * @param savingsPlansPurchaseRecommendationDetails <p>
     *            Details for the Savings Plans we recommend that you purchase
     *            to cover existing Savings Plans eligible workloads.
     *            </p>
     */
    public void setSavingsPlansPurchaseRecommendationDetails(
            java.util.Collection<SavingsPlansPurchaseRecommendationDetail> savingsPlansPurchaseRecommendationDetails) {
        if (savingsPlansPurchaseRecommendationDetails == null) {
            this.savingsPlansPurchaseRecommendationDetails = null;
            return;
        }

        this.savingsPlansPurchaseRecommendationDetails = new java.util.ArrayList<SavingsPlansPurchaseRecommendationDetail>(
                savingsPlansPurchaseRecommendationDetails);
    }

    /**
     * <p>
     * Details for the Savings Plans we recommend that you purchase to cover
     * existing Savings Plans eligible workloads.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param savingsPlansPurchaseRecommendationDetails <p>
     *            Details for the Savings Plans we recommend that you purchase
     *            to cover existing Savings Plans eligible workloads.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SavingsPlansPurchaseRecommendation withSavingsPlansPurchaseRecommendationDetails(
            SavingsPlansPurchaseRecommendationDetail... savingsPlansPurchaseRecommendationDetails) {
        if (getSavingsPlansPurchaseRecommendationDetails() == null) {
            this.savingsPlansPurchaseRecommendationDetails = new java.util.ArrayList<SavingsPlansPurchaseRecommendationDetail>(
                    savingsPlansPurchaseRecommendationDetails.length);
        }
        for (SavingsPlansPurchaseRecommendationDetail value : savingsPlansPurchaseRecommendationDetails) {
            this.savingsPlansPurchaseRecommendationDetails.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Details for the Savings Plans we recommend that you purchase to cover
     * existing Savings Plans eligible workloads.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param savingsPlansPurchaseRecommendationDetails <p>
     *            Details for the Savings Plans we recommend that you purchase
     *            to cover existing Savings Plans eligible workloads.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SavingsPlansPurchaseRecommendation withSavingsPlansPurchaseRecommendationDetails(
            java.util.Collection<SavingsPlansPurchaseRecommendationDetail> savingsPlansPurchaseRecommendationDetails) {
        setSavingsPlansPurchaseRecommendationDetails(savingsPlansPurchaseRecommendationDetails);
        return this;
    }

    /**
     * <p>
     * Summary metrics for your Savings Plans Recommendations.
     * </p>
     *
     * @return <p>
     *         Summary metrics for your Savings Plans Recommendations.
     *         </p>
     */
    public SavingsPlansPurchaseRecommendationSummary getSavingsPlansPurchaseRecommendationSummary() {
        return savingsPlansPurchaseRecommendationSummary;
    }

    /**
     * <p>
     * Summary metrics for your Savings Plans Recommendations.
     * </p>
     *
     * @param savingsPlansPurchaseRecommendationSummary <p>
     *            Summary metrics for your Savings Plans Recommendations.
     *            </p>
     */
    public void setSavingsPlansPurchaseRecommendationSummary(
            SavingsPlansPurchaseRecommendationSummary savingsPlansPurchaseRecommendationSummary) {
        this.savingsPlansPurchaseRecommendationSummary = savingsPlansPurchaseRecommendationSummary;
    }

    /**
     * <p>
     * Summary metrics for your Savings Plans Recommendations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param savingsPlansPurchaseRecommendationSummary <p>
     *            Summary metrics for your Savings Plans Recommendations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SavingsPlansPurchaseRecommendation withSavingsPlansPurchaseRecommendationSummary(
            SavingsPlansPurchaseRecommendationSummary savingsPlansPurchaseRecommendationSummary) {
        this.savingsPlansPurchaseRecommendationSummary = savingsPlansPurchaseRecommendationSummary;
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
        if (getAccountScope() != null)
            sb.append("AccountScope: " + getAccountScope() + ",");
        if (getSavingsPlansType() != null)
            sb.append("SavingsPlansType: " + getSavingsPlansType() + ",");
        if (getTermInYears() != null)
            sb.append("TermInYears: " + getTermInYears() + ",");
        if (getPaymentOption() != null)
            sb.append("PaymentOption: " + getPaymentOption() + ",");
        if (getLookbackPeriodInDays() != null)
            sb.append("LookbackPeriodInDays: " + getLookbackPeriodInDays() + ",");
        if (getSavingsPlansPurchaseRecommendationDetails() != null)
            sb.append("SavingsPlansPurchaseRecommendationDetails: "
                    + getSavingsPlansPurchaseRecommendationDetails() + ",");
        if (getSavingsPlansPurchaseRecommendationSummary() != null)
            sb.append("SavingsPlansPurchaseRecommendationSummary: "
                    + getSavingsPlansPurchaseRecommendationSummary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAccountScope() == null) ? 0 : getAccountScope().hashCode());
        hashCode = prime * hashCode
                + ((getSavingsPlansType() == null) ? 0 : getSavingsPlansType().hashCode());
        hashCode = prime * hashCode
                + ((getTermInYears() == null) ? 0 : getTermInYears().hashCode());
        hashCode = prime * hashCode
                + ((getPaymentOption() == null) ? 0 : getPaymentOption().hashCode());
        hashCode = prime * hashCode
                + ((getLookbackPeriodInDays() == null) ? 0 : getLookbackPeriodInDays().hashCode());
        hashCode = prime
                * hashCode
                + ((getSavingsPlansPurchaseRecommendationDetails() == null) ? 0
                        : getSavingsPlansPurchaseRecommendationDetails().hashCode());
        hashCode = prime
                * hashCode
                + ((getSavingsPlansPurchaseRecommendationSummary() == null) ? 0
                        : getSavingsPlansPurchaseRecommendationSummary().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SavingsPlansPurchaseRecommendation == false)
            return false;
        SavingsPlansPurchaseRecommendation other = (SavingsPlansPurchaseRecommendation) obj;

        if (other.getAccountScope() == null ^ this.getAccountScope() == null)
            return false;
        if (other.getAccountScope() != null
                && other.getAccountScope().equals(this.getAccountScope()) == false)
            return false;
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
        if (other.getLookbackPeriodInDays() == null ^ this.getLookbackPeriodInDays() == null)
            return false;
        if (other.getLookbackPeriodInDays() != null
                && other.getLookbackPeriodInDays().equals(this.getLookbackPeriodInDays()) == false)
            return false;
        if (other.getSavingsPlansPurchaseRecommendationDetails() == null
                ^ this.getSavingsPlansPurchaseRecommendationDetails() == null)
            return false;
        if (other.getSavingsPlansPurchaseRecommendationDetails() != null
                && other.getSavingsPlansPurchaseRecommendationDetails().equals(
                        this.getSavingsPlansPurchaseRecommendationDetails()) == false)
            return false;
        if (other.getSavingsPlansPurchaseRecommendationSummary() == null
                ^ this.getSavingsPlansPurchaseRecommendationSummary() == null)
            return false;
        if (other.getSavingsPlansPurchaseRecommendationSummary() != null
                && other.getSavingsPlansPurchaseRecommendationSummary().equals(
                        this.getSavingsPlansPurchaseRecommendationSummary()) == false)
            return false;
        return true;
    }
}
