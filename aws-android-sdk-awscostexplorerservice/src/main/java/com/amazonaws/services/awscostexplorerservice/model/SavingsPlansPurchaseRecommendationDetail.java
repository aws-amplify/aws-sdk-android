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
 * Details for your recommended Savings Plans.
 * </p>
 */
public class SavingsPlansPurchaseRecommendationDetail implements Serializable {
    /**
     * <p>
     * Details for your recommended Savings Plans.
     * </p>
     */
    private SavingsPlansDetails savingsPlansDetails;

    /**
     * <p>
     * The <code>AccountID</code> the recommendation is generated for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String accountId;

    /**
     * <p>
     * The upfront cost of the recommended Savings Plans, based on the selected
     * payment option.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String upfrontCost;

    /**
     * <p>
     * The estimated return on investment based on the recommended Savings Plans
     * purchased. This is calculated as <code>estimatedSavingsAmount</code>/
     * <code>estimatedSPCost</code>*100.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String estimatedROI;

    /**
     * <p>
     * The currency code Amazon Web Services used to generate the
     * recommendations and present potential savings.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String currencyCode;

    /**
     * <p>
     * The cost of the recommended Savings Plans over the length of the lookback
     * period.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String estimatedSPCost;

    /**
     * <p>
     * The remaining On-Demand cost estimated to not be covered by the
     * recommended Savings Plans, over the length of the lookback period.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String estimatedOnDemandCost;

    /**
     * <p>
     * The estimated On-Demand costs you would expect with no additional
     * commitment, based on your usage of the selected time period and the
     * Savings Plans you own.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String estimatedOnDemandCostWithCurrentCommitment;

    /**
     * <p>
     * The estimated savings amount based on the recommended Savings Plans over
     * the length of the lookback period.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String estimatedSavingsAmount;

    /**
     * <p>
     * The estimated savings percentage relative to the total cost of applicable
     * On-Demand usage over the lookback period.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String estimatedSavingsPercentage;

    /**
     * <p>
     * The recommended hourly commitment level for the Savings Plans type, and
     * configuration based on the usage during the lookback period.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String hourlyCommitmentToPurchase;

    /**
     * <p>
     * The estimated utilization of the recommended Savings Plans.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String estimatedAverageUtilization;

    /**
     * <p>
     * The estimated monthly savings amount, based on the recommended Savings
     * Plans.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String estimatedMonthlySavingsAmount;

    /**
     * <p>
     * The lowest value of hourly On-Demand spend over the lookback period of
     * the applicable usage type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String currentMinimumHourlyOnDemandSpend;

    /**
     * <p>
     * The highest value of hourly On-Demand spend over the lookback period of
     * the applicable usage type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String currentMaximumHourlyOnDemandSpend;

    /**
     * <p>
     * The average value of hourly On-Demand spend over the lookback period of
     * the applicable usage type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String currentAverageHourlyOnDemandSpend;

    /**
     * <p>
     * Details for your recommended Savings Plans.
     * </p>
     *
     * @return <p>
     *         Details for your recommended Savings Plans.
     *         </p>
     */
    public SavingsPlansDetails getSavingsPlansDetails() {
        return savingsPlansDetails;
    }

    /**
     * <p>
     * Details for your recommended Savings Plans.
     * </p>
     *
     * @param savingsPlansDetails <p>
     *            Details for your recommended Savings Plans.
     *            </p>
     */
    public void setSavingsPlansDetails(SavingsPlansDetails savingsPlansDetails) {
        this.savingsPlansDetails = savingsPlansDetails;
    }

    /**
     * <p>
     * Details for your recommended Savings Plans.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param savingsPlansDetails <p>
     *            Details for your recommended Savings Plans.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SavingsPlansPurchaseRecommendationDetail withSavingsPlansDetails(
            SavingsPlansDetails savingsPlansDetails) {
        this.savingsPlansDetails = savingsPlansDetails;
        return this;
    }

    /**
     * <p>
     * The <code>AccountID</code> the recommendation is generated for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         The <code>AccountID</code> the recommendation is generated for.
     *         </p>
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * <p>
     * The <code>AccountID</code> the recommendation is generated for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param accountId <p>
     *            The <code>AccountID</code> the recommendation is generated
     *            for.
     *            </p>
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The <code>AccountID</code> the recommendation is generated for.
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
     *            The <code>AccountID</code> the recommendation is generated
     *            for.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SavingsPlansPurchaseRecommendationDetail withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * <p>
     * The upfront cost of the recommended Savings Plans, based on the selected
     * payment option.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         The upfront cost of the recommended Savings Plans, based on the
     *         selected payment option.
     *         </p>
     */
    public String getUpfrontCost() {
        return upfrontCost;
    }

    /**
     * <p>
     * The upfront cost of the recommended Savings Plans, based on the selected
     * payment option.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param upfrontCost <p>
     *            The upfront cost of the recommended Savings Plans, based on
     *            the selected payment option.
     *            </p>
     */
    public void setUpfrontCost(String upfrontCost) {
        this.upfrontCost = upfrontCost;
    }

    /**
     * <p>
     * The upfront cost of the recommended Savings Plans, based on the selected
     * payment option.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param upfrontCost <p>
     *            The upfront cost of the recommended Savings Plans, based on
     *            the selected payment option.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SavingsPlansPurchaseRecommendationDetail withUpfrontCost(String upfrontCost) {
        this.upfrontCost = upfrontCost;
        return this;
    }

    /**
     * <p>
     * The estimated return on investment based on the recommended Savings Plans
     * purchased. This is calculated as <code>estimatedSavingsAmount</code>/
     * <code>estimatedSPCost</code>*100.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         The estimated return on investment based on the recommended
     *         Savings Plans purchased. This is calculated as
     *         <code>estimatedSavingsAmount</code>/ <code>estimatedSPCost</code>
     *         *100.
     *         </p>
     */
    public String getEstimatedROI() {
        return estimatedROI;
    }

    /**
     * <p>
     * The estimated return on investment based on the recommended Savings Plans
     * purchased. This is calculated as <code>estimatedSavingsAmount</code>/
     * <code>estimatedSPCost</code>*100.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param estimatedROI <p>
     *            The estimated return on investment based on the recommended
     *            Savings Plans purchased. This is calculated as
     *            <code>estimatedSavingsAmount</code>/
     *            <code>estimatedSPCost</code>*100.
     *            </p>
     */
    public void setEstimatedROI(String estimatedROI) {
        this.estimatedROI = estimatedROI;
    }

    /**
     * <p>
     * The estimated return on investment based on the recommended Savings Plans
     * purchased. This is calculated as <code>estimatedSavingsAmount</code>/
     * <code>estimatedSPCost</code>*100.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param estimatedROI <p>
     *            The estimated return on investment based on the recommended
     *            Savings Plans purchased. This is calculated as
     *            <code>estimatedSavingsAmount</code>/
     *            <code>estimatedSPCost</code>*100.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SavingsPlansPurchaseRecommendationDetail withEstimatedROI(String estimatedROI) {
        this.estimatedROI = estimatedROI;
        return this;
    }

    /**
     * <p>
     * The currency code Amazon Web Services used to generate the
     * recommendations and present potential savings.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         The currency code Amazon Web Services used to generate the
     *         recommendations and present potential savings.
     *         </p>
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * <p>
     * The currency code Amazon Web Services used to generate the
     * recommendations and present potential savings.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param currencyCode <p>
     *            The currency code Amazon Web Services used to generate the
     *            recommendations and present potential savings.
     *            </p>
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * <p>
     * The currency code Amazon Web Services used to generate the
     * recommendations and present potential savings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param currencyCode <p>
     *            The currency code Amazon Web Services used to generate the
     *            recommendations and present potential savings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SavingsPlansPurchaseRecommendationDetail withCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    /**
     * <p>
     * The cost of the recommended Savings Plans over the length of the lookback
     * period.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         The cost of the recommended Savings Plans over the length of the
     *         lookback period.
     *         </p>
     */
    public String getEstimatedSPCost() {
        return estimatedSPCost;
    }

    /**
     * <p>
     * The cost of the recommended Savings Plans over the length of the lookback
     * period.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param estimatedSPCost <p>
     *            The cost of the recommended Savings Plans over the length of
     *            the lookback period.
     *            </p>
     */
    public void setEstimatedSPCost(String estimatedSPCost) {
        this.estimatedSPCost = estimatedSPCost;
    }

    /**
     * <p>
     * The cost of the recommended Savings Plans over the length of the lookback
     * period.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param estimatedSPCost <p>
     *            The cost of the recommended Savings Plans over the length of
     *            the lookback period.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SavingsPlansPurchaseRecommendationDetail withEstimatedSPCost(String estimatedSPCost) {
        this.estimatedSPCost = estimatedSPCost;
        return this;
    }

    /**
     * <p>
     * The remaining On-Demand cost estimated to not be covered by the
     * recommended Savings Plans, over the length of the lookback period.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         The remaining On-Demand cost estimated to not be covered by the
     *         recommended Savings Plans, over the length of the lookback
     *         period.
     *         </p>
     */
    public String getEstimatedOnDemandCost() {
        return estimatedOnDemandCost;
    }

    /**
     * <p>
     * The remaining On-Demand cost estimated to not be covered by the
     * recommended Savings Plans, over the length of the lookback period.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param estimatedOnDemandCost <p>
     *            The remaining On-Demand cost estimated to not be covered by
     *            the recommended Savings Plans, over the length of the lookback
     *            period.
     *            </p>
     */
    public void setEstimatedOnDemandCost(String estimatedOnDemandCost) {
        this.estimatedOnDemandCost = estimatedOnDemandCost;
    }

    /**
     * <p>
     * The remaining On-Demand cost estimated to not be covered by the
     * recommended Savings Plans, over the length of the lookback period.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param estimatedOnDemandCost <p>
     *            The remaining On-Demand cost estimated to not be covered by
     *            the recommended Savings Plans, over the length of the lookback
     *            period.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SavingsPlansPurchaseRecommendationDetail withEstimatedOnDemandCost(
            String estimatedOnDemandCost) {
        this.estimatedOnDemandCost = estimatedOnDemandCost;
        return this;
    }

    /**
     * <p>
     * The estimated On-Demand costs you would expect with no additional
     * commitment, based on your usage of the selected time period and the
     * Savings Plans you own.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         The estimated On-Demand costs you would expect with no additional
     *         commitment, based on your usage of the selected time period and
     *         the Savings Plans you own.
     *         </p>
     */
    public String getEstimatedOnDemandCostWithCurrentCommitment() {
        return estimatedOnDemandCostWithCurrentCommitment;
    }

    /**
     * <p>
     * The estimated On-Demand costs you would expect with no additional
     * commitment, based on your usage of the selected time period and the
     * Savings Plans you own.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param estimatedOnDemandCostWithCurrentCommitment <p>
     *            The estimated On-Demand costs you would expect with no
     *            additional commitment, based on your usage of the selected
     *            time period and the Savings Plans you own.
     *            </p>
     */
    public void setEstimatedOnDemandCostWithCurrentCommitment(
            String estimatedOnDemandCostWithCurrentCommitment) {
        this.estimatedOnDemandCostWithCurrentCommitment = estimatedOnDemandCostWithCurrentCommitment;
    }

    /**
     * <p>
     * The estimated On-Demand costs you would expect with no additional
     * commitment, based on your usage of the selected time period and the
     * Savings Plans you own.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param estimatedOnDemandCostWithCurrentCommitment <p>
     *            The estimated On-Demand costs you would expect with no
     *            additional commitment, based on your usage of the selected
     *            time period and the Savings Plans you own.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SavingsPlansPurchaseRecommendationDetail withEstimatedOnDemandCostWithCurrentCommitment(
            String estimatedOnDemandCostWithCurrentCommitment) {
        this.estimatedOnDemandCostWithCurrentCommitment = estimatedOnDemandCostWithCurrentCommitment;
        return this;
    }

    /**
     * <p>
     * The estimated savings amount based on the recommended Savings Plans over
     * the length of the lookback period.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         The estimated savings amount based on the recommended Savings
     *         Plans over the length of the lookback period.
     *         </p>
     */
    public String getEstimatedSavingsAmount() {
        return estimatedSavingsAmount;
    }

    /**
     * <p>
     * The estimated savings amount based on the recommended Savings Plans over
     * the length of the lookback period.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param estimatedSavingsAmount <p>
     *            The estimated savings amount based on the recommended Savings
     *            Plans over the length of the lookback period.
     *            </p>
     */
    public void setEstimatedSavingsAmount(String estimatedSavingsAmount) {
        this.estimatedSavingsAmount = estimatedSavingsAmount;
    }

    /**
     * <p>
     * The estimated savings amount based on the recommended Savings Plans over
     * the length of the lookback period.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param estimatedSavingsAmount <p>
     *            The estimated savings amount based on the recommended Savings
     *            Plans over the length of the lookback period.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SavingsPlansPurchaseRecommendationDetail withEstimatedSavingsAmount(
            String estimatedSavingsAmount) {
        this.estimatedSavingsAmount = estimatedSavingsAmount;
        return this;
    }

    /**
     * <p>
     * The estimated savings percentage relative to the total cost of applicable
     * On-Demand usage over the lookback period.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         The estimated savings percentage relative to the total cost of
     *         applicable On-Demand usage over the lookback period.
     *         </p>
     */
    public String getEstimatedSavingsPercentage() {
        return estimatedSavingsPercentage;
    }

    /**
     * <p>
     * The estimated savings percentage relative to the total cost of applicable
     * On-Demand usage over the lookback period.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param estimatedSavingsPercentage <p>
     *            The estimated savings percentage relative to the total cost of
     *            applicable On-Demand usage over the lookback period.
     *            </p>
     */
    public void setEstimatedSavingsPercentage(String estimatedSavingsPercentage) {
        this.estimatedSavingsPercentage = estimatedSavingsPercentage;
    }

    /**
     * <p>
     * The estimated savings percentage relative to the total cost of applicable
     * On-Demand usage over the lookback period.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param estimatedSavingsPercentage <p>
     *            The estimated savings percentage relative to the total cost of
     *            applicable On-Demand usage over the lookback period.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SavingsPlansPurchaseRecommendationDetail withEstimatedSavingsPercentage(
            String estimatedSavingsPercentage) {
        this.estimatedSavingsPercentage = estimatedSavingsPercentage;
        return this;
    }

    /**
     * <p>
     * The recommended hourly commitment level for the Savings Plans type, and
     * configuration based on the usage during the lookback period.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         The recommended hourly commitment level for the Savings Plans
     *         type, and configuration based on the usage during the lookback
     *         period.
     *         </p>
     */
    public String getHourlyCommitmentToPurchase() {
        return hourlyCommitmentToPurchase;
    }

    /**
     * <p>
     * The recommended hourly commitment level for the Savings Plans type, and
     * configuration based on the usage during the lookback period.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param hourlyCommitmentToPurchase <p>
     *            The recommended hourly commitment level for the Savings Plans
     *            type, and configuration based on the usage during the lookback
     *            period.
     *            </p>
     */
    public void setHourlyCommitmentToPurchase(String hourlyCommitmentToPurchase) {
        this.hourlyCommitmentToPurchase = hourlyCommitmentToPurchase;
    }

    /**
     * <p>
     * The recommended hourly commitment level for the Savings Plans type, and
     * configuration based on the usage during the lookback period.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param hourlyCommitmentToPurchase <p>
     *            The recommended hourly commitment level for the Savings Plans
     *            type, and configuration based on the usage during the lookback
     *            period.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SavingsPlansPurchaseRecommendationDetail withHourlyCommitmentToPurchase(
            String hourlyCommitmentToPurchase) {
        this.hourlyCommitmentToPurchase = hourlyCommitmentToPurchase;
        return this;
    }

    /**
     * <p>
     * The estimated utilization of the recommended Savings Plans.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         The estimated utilization of the recommended Savings Plans.
     *         </p>
     */
    public String getEstimatedAverageUtilization() {
        return estimatedAverageUtilization;
    }

    /**
     * <p>
     * The estimated utilization of the recommended Savings Plans.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param estimatedAverageUtilization <p>
     *            The estimated utilization of the recommended Savings Plans.
     *            </p>
     */
    public void setEstimatedAverageUtilization(String estimatedAverageUtilization) {
        this.estimatedAverageUtilization = estimatedAverageUtilization;
    }

    /**
     * <p>
     * The estimated utilization of the recommended Savings Plans.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param estimatedAverageUtilization <p>
     *            The estimated utilization of the recommended Savings Plans.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SavingsPlansPurchaseRecommendationDetail withEstimatedAverageUtilization(
            String estimatedAverageUtilization) {
        this.estimatedAverageUtilization = estimatedAverageUtilization;
        return this;
    }

    /**
     * <p>
     * The estimated monthly savings amount, based on the recommended Savings
     * Plans.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         The estimated monthly savings amount, based on the recommended
     *         Savings Plans.
     *         </p>
     */
    public String getEstimatedMonthlySavingsAmount() {
        return estimatedMonthlySavingsAmount;
    }

    /**
     * <p>
     * The estimated monthly savings amount, based on the recommended Savings
     * Plans.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param estimatedMonthlySavingsAmount <p>
     *            The estimated monthly savings amount, based on the recommended
     *            Savings Plans.
     *            </p>
     */
    public void setEstimatedMonthlySavingsAmount(String estimatedMonthlySavingsAmount) {
        this.estimatedMonthlySavingsAmount = estimatedMonthlySavingsAmount;
    }

    /**
     * <p>
     * The estimated monthly savings amount, based on the recommended Savings
     * Plans.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param estimatedMonthlySavingsAmount <p>
     *            The estimated monthly savings amount, based on the recommended
     *            Savings Plans.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SavingsPlansPurchaseRecommendationDetail withEstimatedMonthlySavingsAmount(
            String estimatedMonthlySavingsAmount) {
        this.estimatedMonthlySavingsAmount = estimatedMonthlySavingsAmount;
        return this;
    }

    /**
     * <p>
     * The lowest value of hourly On-Demand spend over the lookback period of
     * the applicable usage type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         The lowest value of hourly On-Demand spend over the lookback
     *         period of the applicable usage type.
     *         </p>
     */
    public String getCurrentMinimumHourlyOnDemandSpend() {
        return currentMinimumHourlyOnDemandSpend;
    }

    /**
     * <p>
     * The lowest value of hourly On-Demand spend over the lookback period of
     * the applicable usage type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param currentMinimumHourlyOnDemandSpend <p>
     *            The lowest value of hourly On-Demand spend over the lookback
     *            period of the applicable usage type.
     *            </p>
     */
    public void setCurrentMinimumHourlyOnDemandSpend(String currentMinimumHourlyOnDemandSpend) {
        this.currentMinimumHourlyOnDemandSpend = currentMinimumHourlyOnDemandSpend;
    }

    /**
     * <p>
     * The lowest value of hourly On-Demand spend over the lookback period of
     * the applicable usage type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param currentMinimumHourlyOnDemandSpend <p>
     *            The lowest value of hourly On-Demand spend over the lookback
     *            period of the applicable usage type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SavingsPlansPurchaseRecommendationDetail withCurrentMinimumHourlyOnDemandSpend(
            String currentMinimumHourlyOnDemandSpend) {
        this.currentMinimumHourlyOnDemandSpend = currentMinimumHourlyOnDemandSpend;
        return this;
    }

    /**
     * <p>
     * The highest value of hourly On-Demand spend over the lookback period of
     * the applicable usage type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         The highest value of hourly On-Demand spend over the lookback
     *         period of the applicable usage type.
     *         </p>
     */
    public String getCurrentMaximumHourlyOnDemandSpend() {
        return currentMaximumHourlyOnDemandSpend;
    }

    /**
     * <p>
     * The highest value of hourly On-Demand spend over the lookback period of
     * the applicable usage type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param currentMaximumHourlyOnDemandSpend <p>
     *            The highest value of hourly On-Demand spend over the lookback
     *            period of the applicable usage type.
     *            </p>
     */
    public void setCurrentMaximumHourlyOnDemandSpend(String currentMaximumHourlyOnDemandSpend) {
        this.currentMaximumHourlyOnDemandSpend = currentMaximumHourlyOnDemandSpend;
    }

    /**
     * <p>
     * The highest value of hourly On-Demand spend over the lookback period of
     * the applicable usage type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param currentMaximumHourlyOnDemandSpend <p>
     *            The highest value of hourly On-Demand spend over the lookback
     *            period of the applicable usage type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SavingsPlansPurchaseRecommendationDetail withCurrentMaximumHourlyOnDemandSpend(
            String currentMaximumHourlyOnDemandSpend) {
        this.currentMaximumHourlyOnDemandSpend = currentMaximumHourlyOnDemandSpend;
        return this;
    }

    /**
     * <p>
     * The average value of hourly On-Demand spend over the lookback period of
     * the applicable usage type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         The average value of hourly On-Demand spend over the lookback
     *         period of the applicable usage type.
     *         </p>
     */
    public String getCurrentAverageHourlyOnDemandSpend() {
        return currentAverageHourlyOnDemandSpend;
    }

    /**
     * <p>
     * The average value of hourly On-Demand spend over the lookback period of
     * the applicable usage type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param currentAverageHourlyOnDemandSpend <p>
     *            The average value of hourly On-Demand spend over the lookback
     *            period of the applicable usage type.
     *            </p>
     */
    public void setCurrentAverageHourlyOnDemandSpend(String currentAverageHourlyOnDemandSpend) {
        this.currentAverageHourlyOnDemandSpend = currentAverageHourlyOnDemandSpend;
    }

    /**
     * <p>
     * The average value of hourly On-Demand spend over the lookback period of
     * the applicable usage type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param currentAverageHourlyOnDemandSpend <p>
     *            The average value of hourly On-Demand spend over the lookback
     *            period of the applicable usage type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SavingsPlansPurchaseRecommendationDetail withCurrentAverageHourlyOnDemandSpend(
            String currentAverageHourlyOnDemandSpend) {
        this.currentAverageHourlyOnDemandSpend = currentAverageHourlyOnDemandSpend;
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
        if (getSavingsPlansDetails() != null)
            sb.append("SavingsPlansDetails: " + getSavingsPlansDetails() + ",");
        if (getAccountId() != null)
            sb.append("AccountId: " + getAccountId() + ",");
        if (getUpfrontCost() != null)
            sb.append("UpfrontCost: " + getUpfrontCost() + ",");
        if (getEstimatedROI() != null)
            sb.append("EstimatedROI: " + getEstimatedROI() + ",");
        if (getCurrencyCode() != null)
            sb.append("CurrencyCode: " + getCurrencyCode() + ",");
        if (getEstimatedSPCost() != null)
            sb.append("EstimatedSPCost: " + getEstimatedSPCost() + ",");
        if (getEstimatedOnDemandCost() != null)
            sb.append("EstimatedOnDemandCost: " + getEstimatedOnDemandCost() + ",");
        if (getEstimatedOnDemandCostWithCurrentCommitment() != null)
            sb.append("EstimatedOnDemandCostWithCurrentCommitment: "
                    + getEstimatedOnDemandCostWithCurrentCommitment() + ",");
        if (getEstimatedSavingsAmount() != null)
            sb.append("EstimatedSavingsAmount: " + getEstimatedSavingsAmount() + ",");
        if (getEstimatedSavingsPercentage() != null)
            sb.append("EstimatedSavingsPercentage: " + getEstimatedSavingsPercentage() + ",");
        if (getHourlyCommitmentToPurchase() != null)
            sb.append("HourlyCommitmentToPurchase: " + getHourlyCommitmentToPurchase() + ",");
        if (getEstimatedAverageUtilization() != null)
            sb.append("EstimatedAverageUtilization: " + getEstimatedAverageUtilization() + ",");
        if (getEstimatedMonthlySavingsAmount() != null)
            sb.append("EstimatedMonthlySavingsAmount: " + getEstimatedMonthlySavingsAmount() + ",");
        if (getCurrentMinimumHourlyOnDemandSpend() != null)
            sb.append("CurrentMinimumHourlyOnDemandSpend: "
                    + getCurrentMinimumHourlyOnDemandSpend() + ",");
        if (getCurrentMaximumHourlyOnDemandSpend() != null)
            sb.append("CurrentMaximumHourlyOnDemandSpend: "
                    + getCurrentMaximumHourlyOnDemandSpend() + ",");
        if (getCurrentAverageHourlyOnDemandSpend() != null)
            sb.append("CurrentAverageHourlyOnDemandSpend: "
                    + getCurrentAverageHourlyOnDemandSpend());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSavingsPlansDetails() == null) ? 0 : getSavingsPlansDetails().hashCode());
        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode
                + ((getUpfrontCost() == null) ? 0 : getUpfrontCost().hashCode());
        hashCode = prime * hashCode
                + ((getEstimatedROI() == null) ? 0 : getEstimatedROI().hashCode());
        hashCode = prime * hashCode
                + ((getCurrencyCode() == null) ? 0 : getCurrencyCode().hashCode());
        hashCode = prime * hashCode
                + ((getEstimatedSPCost() == null) ? 0 : getEstimatedSPCost().hashCode());
        hashCode = prime
                * hashCode
                + ((getEstimatedOnDemandCost() == null) ? 0 : getEstimatedOnDemandCost().hashCode());
        hashCode = prime
                * hashCode
                + ((getEstimatedOnDemandCostWithCurrentCommitment() == null) ? 0
                        : getEstimatedOnDemandCostWithCurrentCommitment().hashCode());
        hashCode = prime
                * hashCode
                + ((getEstimatedSavingsAmount() == null) ? 0 : getEstimatedSavingsAmount()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getEstimatedSavingsPercentage() == null) ? 0 : getEstimatedSavingsPercentage()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getHourlyCommitmentToPurchase() == null) ? 0 : getHourlyCommitmentToPurchase()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getEstimatedAverageUtilization() == null) ? 0
                        : getEstimatedAverageUtilization().hashCode());
        hashCode = prime
                * hashCode
                + ((getEstimatedMonthlySavingsAmount() == null) ? 0
                        : getEstimatedMonthlySavingsAmount().hashCode());
        hashCode = prime
                * hashCode
                + ((getCurrentMinimumHourlyOnDemandSpend() == null) ? 0
                        : getCurrentMinimumHourlyOnDemandSpend().hashCode());
        hashCode = prime
                * hashCode
                + ((getCurrentMaximumHourlyOnDemandSpend() == null) ? 0
                        : getCurrentMaximumHourlyOnDemandSpend().hashCode());
        hashCode = prime
                * hashCode
                + ((getCurrentAverageHourlyOnDemandSpend() == null) ? 0
                        : getCurrentAverageHourlyOnDemandSpend().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SavingsPlansPurchaseRecommendationDetail == false)
            return false;
        SavingsPlansPurchaseRecommendationDetail other = (SavingsPlansPurchaseRecommendationDetail) obj;

        if (other.getSavingsPlansDetails() == null ^ this.getSavingsPlansDetails() == null)
            return false;
        if (other.getSavingsPlansDetails() != null
                && other.getSavingsPlansDetails().equals(this.getSavingsPlansDetails()) == false)
            return false;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null
                && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getUpfrontCost() == null ^ this.getUpfrontCost() == null)
            return false;
        if (other.getUpfrontCost() != null
                && other.getUpfrontCost().equals(this.getUpfrontCost()) == false)
            return false;
        if (other.getEstimatedROI() == null ^ this.getEstimatedROI() == null)
            return false;
        if (other.getEstimatedROI() != null
                && other.getEstimatedROI().equals(this.getEstimatedROI()) == false)
            return false;
        if (other.getCurrencyCode() == null ^ this.getCurrencyCode() == null)
            return false;
        if (other.getCurrencyCode() != null
                && other.getCurrencyCode().equals(this.getCurrencyCode()) == false)
            return false;
        if (other.getEstimatedSPCost() == null ^ this.getEstimatedSPCost() == null)
            return false;
        if (other.getEstimatedSPCost() != null
                && other.getEstimatedSPCost().equals(this.getEstimatedSPCost()) == false)
            return false;
        if (other.getEstimatedOnDemandCost() == null ^ this.getEstimatedOnDemandCost() == null)
            return false;
        if (other.getEstimatedOnDemandCost() != null
                && other.getEstimatedOnDemandCost().equals(this.getEstimatedOnDemandCost()) == false)
            return false;
        if (other.getEstimatedOnDemandCostWithCurrentCommitment() == null
                ^ this.getEstimatedOnDemandCostWithCurrentCommitment() == null)
            return false;
        if (other.getEstimatedOnDemandCostWithCurrentCommitment() != null
                && other.getEstimatedOnDemandCostWithCurrentCommitment().equals(
                        this.getEstimatedOnDemandCostWithCurrentCommitment()) == false)
            return false;
        if (other.getEstimatedSavingsAmount() == null ^ this.getEstimatedSavingsAmount() == null)
            return false;
        if (other.getEstimatedSavingsAmount() != null
                && other.getEstimatedSavingsAmount().equals(this.getEstimatedSavingsAmount()) == false)
            return false;
        if (other.getEstimatedSavingsPercentage() == null
                ^ this.getEstimatedSavingsPercentage() == null)
            return false;
        if (other.getEstimatedSavingsPercentage() != null
                && other.getEstimatedSavingsPercentage().equals(
                        this.getEstimatedSavingsPercentage()) == false)
            return false;
        if (other.getHourlyCommitmentToPurchase() == null
                ^ this.getHourlyCommitmentToPurchase() == null)
            return false;
        if (other.getHourlyCommitmentToPurchase() != null
                && other.getHourlyCommitmentToPurchase().equals(
                        this.getHourlyCommitmentToPurchase()) == false)
            return false;
        if (other.getEstimatedAverageUtilization() == null
                ^ this.getEstimatedAverageUtilization() == null)
            return false;
        if (other.getEstimatedAverageUtilization() != null
                && other.getEstimatedAverageUtilization().equals(
                        this.getEstimatedAverageUtilization()) == false)
            return false;
        if (other.getEstimatedMonthlySavingsAmount() == null
                ^ this.getEstimatedMonthlySavingsAmount() == null)
            return false;
        if (other.getEstimatedMonthlySavingsAmount() != null
                && other.getEstimatedMonthlySavingsAmount().equals(
                        this.getEstimatedMonthlySavingsAmount()) == false)
            return false;
        if (other.getCurrentMinimumHourlyOnDemandSpend() == null
                ^ this.getCurrentMinimumHourlyOnDemandSpend() == null)
            return false;
        if (other.getCurrentMinimumHourlyOnDemandSpend() != null
                && other.getCurrentMinimumHourlyOnDemandSpend().equals(
                        this.getCurrentMinimumHourlyOnDemandSpend()) == false)
            return false;
        if (other.getCurrentMaximumHourlyOnDemandSpend() == null
                ^ this.getCurrentMaximumHourlyOnDemandSpend() == null)
            return false;
        if (other.getCurrentMaximumHourlyOnDemandSpend() != null
                && other.getCurrentMaximumHourlyOnDemandSpend().equals(
                        this.getCurrentMaximumHourlyOnDemandSpend()) == false)
            return false;
        if (other.getCurrentAverageHourlyOnDemandSpend() == null
                ^ this.getCurrentAverageHourlyOnDemandSpend() == null)
            return false;
        if (other.getCurrentAverageHourlyOnDemandSpend() != null
                && other.getCurrentAverageHourlyOnDemandSpend().equals(
                        this.getCurrentAverageHourlyOnDemandSpend()) == false)
            return false;
        return true;
    }
}
