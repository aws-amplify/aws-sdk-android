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
 * Summary metrics for your Savings Plans Purchase Recommendations.
 * </p>
 */
public class SavingsPlansPurchaseRecommendationSummary implements Serializable {
    /**
     * <p>
     * The estimated return on investment based on the recommended Savings Plans
     * and estimated savings.
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
     * The estimated total cost of the usage after purchasing the recommended
     * Savings Plans. This is a sum of the cost of Savings Plans during this
     * term, and the remaining On-Demand usage.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String estimatedTotalCost;

    /**
     * <p>
     * The current total on demand spend of the applicable usage types over the
     * lookback period.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String currentOnDemandSpend;

    /**
     * <p>
     * The estimated total savings over the lookback period, based on the
     * purchase of the recommended Savings Plans.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String estimatedSavingsAmount;

    /**
     * <p>
     * The aggregate number of Savings Plans recommendations that exist for your
     * account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String totalRecommendationCount;

    /**
     * <p>
     * The recommended Savings Plans cost on a daily (24 hourly) basis.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String dailyCommitmentToPurchase;

    /**
     * <p>
     * The recommended hourly commitment based on the recommendation parameters.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String hourlyCommitmentToPurchase;

    /**
     * <p>
     * The estimated savings relative to the total cost of On-Demand usage, over
     * the lookback period. This is calculated as
     * <code>estimatedSavingsAmount</code>/ <code>CurrentOnDemandSpend</code>
     * *100.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String estimatedSavingsPercentage;

    /**
     * <p>
     * The estimated monthly savings amount, based on the recommended Savings
     * Plans purchase.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String estimatedMonthlySavingsAmount;

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
     * The estimated return on investment based on the recommended Savings Plans
     * and estimated savings.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         The estimated return on investment based on the recommended
     *         Savings Plans and estimated savings.
     *         </p>
     */
    public String getEstimatedROI() {
        return estimatedROI;
    }

    /**
     * <p>
     * The estimated return on investment based on the recommended Savings Plans
     * and estimated savings.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param estimatedROI <p>
     *            The estimated return on investment based on the recommended
     *            Savings Plans and estimated savings.
     *            </p>
     */
    public void setEstimatedROI(String estimatedROI) {
        this.estimatedROI = estimatedROI;
    }

    /**
     * <p>
     * The estimated return on investment based on the recommended Savings Plans
     * and estimated savings.
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
     *            Savings Plans and estimated savings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SavingsPlansPurchaseRecommendationSummary withEstimatedROI(String estimatedROI) {
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
    public SavingsPlansPurchaseRecommendationSummary withCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    /**
     * <p>
     * The estimated total cost of the usage after purchasing the recommended
     * Savings Plans. This is a sum of the cost of Savings Plans during this
     * term, and the remaining On-Demand usage.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         The estimated total cost of the usage after purchasing the
     *         recommended Savings Plans. This is a sum of the cost of Savings
     *         Plans during this term, and the remaining On-Demand usage.
     *         </p>
     */
    public String getEstimatedTotalCost() {
        return estimatedTotalCost;
    }

    /**
     * <p>
     * The estimated total cost of the usage after purchasing the recommended
     * Savings Plans. This is a sum of the cost of Savings Plans during this
     * term, and the remaining On-Demand usage.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param estimatedTotalCost <p>
     *            The estimated total cost of the usage after purchasing the
     *            recommended Savings Plans. This is a sum of the cost of
     *            Savings Plans during this term, and the remaining On-Demand
     *            usage.
     *            </p>
     */
    public void setEstimatedTotalCost(String estimatedTotalCost) {
        this.estimatedTotalCost = estimatedTotalCost;
    }

    /**
     * <p>
     * The estimated total cost of the usage after purchasing the recommended
     * Savings Plans. This is a sum of the cost of Savings Plans during this
     * term, and the remaining On-Demand usage.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param estimatedTotalCost <p>
     *            The estimated total cost of the usage after purchasing the
     *            recommended Savings Plans. This is a sum of the cost of
     *            Savings Plans during this term, and the remaining On-Demand
     *            usage.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SavingsPlansPurchaseRecommendationSummary withEstimatedTotalCost(
            String estimatedTotalCost) {
        this.estimatedTotalCost = estimatedTotalCost;
        return this;
    }

    /**
     * <p>
     * The current total on demand spend of the applicable usage types over the
     * lookback period.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         The current total on demand spend of the applicable usage types
     *         over the lookback period.
     *         </p>
     */
    public String getCurrentOnDemandSpend() {
        return currentOnDemandSpend;
    }

    /**
     * <p>
     * The current total on demand spend of the applicable usage types over the
     * lookback period.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param currentOnDemandSpend <p>
     *            The current total on demand spend of the applicable usage
     *            types over the lookback period.
     *            </p>
     */
    public void setCurrentOnDemandSpend(String currentOnDemandSpend) {
        this.currentOnDemandSpend = currentOnDemandSpend;
    }

    /**
     * <p>
     * The current total on demand spend of the applicable usage types over the
     * lookback period.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param currentOnDemandSpend <p>
     *            The current total on demand spend of the applicable usage
     *            types over the lookback period.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SavingsPlansPurchaseRecommendationSummary withCurrentOnDemandSpend(
            String currentOnDemandSpend) {
        this.currentOnDemandSpend = currentOnDemandSpend;
        return this;
    }

    /**
     * <p>
     * The estimated total savings over the lookback period, based on the
     * purchase of the recommended Savings Plans.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         The estimated total savings over the lookback period, based on
     *         the purchase of the recommended Savings Plans.
     *         </p>
     */
    public String getEstimatedSavingsAmount() {
        return estimatedSavingsAmount;
    }

    /**
     * <p>
     * The estimated total savings over the lookback period, based on the
     * purchase of the recommended Savings Plans.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param estimatedSavingsAmount <p>
     *            The estimated total savings over the lookback period, based on
     *            the purchase of the recommended Savings Plans.
     *            </p>
     */
    public void setEstimatedSavingsAmount(String estimatedSavingsAmount) {
        this.estimatedSavingsAmount = estimatedSavingsAmount;
    }

    /**
     * <p>
     * The estimated total savings over the lookback period, based on the
     * purchase of the recommended Savings Plans.
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
     *            The estimated total savings over the lookback period, based on
     *            the purchase of the recommended Savings Plans.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SavingsPlansPurchaseRecommendationSummary withEstimatedSavingsAmount(
            String estimatedSavingsAmount) {
        this.estimatedSavingsAmount = estimatedSavingsAmount;
        return this;
    }

    /**
     * <p>
     * The aggregate number of Savings Plans recommendations that exist for your
     * account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         The aggregate number of Savings Plans recommendations that exist
     *         for your account.
     *         </p>
     */
    public String getTotalRecommendationCount() {
        return totalRecommendationCount;
    }

    /**
     * <p>
     * The aggregate number of Savings Plans recommendations that exist for your
     * account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param totalRecommendationCount <p>
     *            The aggregate number of Savings Plans recommendations that
     *            exist for your account.
     *            </p>
     */
    public void setTotalRecommendationCount(String totalRecommendationCount) {
        this.totalRecommendationCount = totalRecommendationCount;
    }

    /**
     * <p>
     * The aggregate number of Savings Plans recommendations that exist for your
     * account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param totalRecommendationCount <p>
     *            The aggregate number of Savings Plans recommendations that
     *            exist for your account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SavingsPlansPurchaseRecommendationSummary withTotalRecommendationCount(
            String totalRecommendationCount) {
        this.totalRecommendationCount = totalRecommendationCount;
        return this;
    }

    /**
     * <p>
     * The recommended Savings Plans cost on a daily (24 hourly) basis.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         The recommended Savings Plans cost on a daily (24 hourly) basis.
     *         </p>
     */
    public String getDailyCommitmentToPurchase() {
        return dailyCommitmentToPurchase;
    }

    /**
     * <p>
     * The recommended Savings Plans cost on a daily (24 hourly) basis.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param dailyCommitmentToPurchase <p>
     *            The recommended Savings Plans cost on a daily (24 hourly)
     *            basis.
     *            </p>
     */
    public void setDailyCommitmentToPurchase(String dailyCommitmentToPurchase) {
        this.dailyCommitmentToPurchase = dailyCommitmentToPurchase;
    }

    /**
     * <p>
     * The recommended Savings Plans cost on a daily (24 hourly) basis.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param dailyCommitmentToPurchase <p>
     *            The recommended Savings Plans cost on a daily (24 hourly)
     *            basis.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SavingsPlansPurchaseRecommendationSummary withDailyCommitmentToPurchase(
            String dailyCommitmentToPurchase) {
        this.dailyCommitmentToPurchase = dailyCommitmentToPurchase;
        return this;
    }

    /**
     * <p>
     * The recommended hourly commitment based on the recommendation parameters.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         The recommended hourly commitment based on the recommendation
     *         parameters.
     *         </p>
     */
    public String getHourlyCommitmentToPurchase() {
        return hourlyCommitmentToPurchase;
    }

    /**
     * <p>
     * The recommended hourly commitment based on the recommendation parameters.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param hourlyCommitmentToPurchase <p>
     *            The recommended hourly commitment based on the recommendation
     *            parameters.
     *            </p>
     */
    public void setHourlyCommitmentToPurchase(String hourlyCommitmentToPurchase) {
        this.hourlyCommitmentToPurchase = hourlyCommitmentToPurchase;
    }

    /**
     * <p>
     * The recommended hourly commitment based on the recommendation parameters.
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
     *            The recommended hourly commitment based on the recommendation
     *            parameters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SavingsPlansPurchaseRecommendationSummary withHourlyCommitmentToPurchase(
            String hourlyCommitmentToPurchase) {
        this.hourlyCommitmentToPurchase = hourlyCommitmentToPurchase;
        return this;
    }

    /**
     * <p>
     * The estimated savings relative to the total cost of On-Demand usage, over
     * the lookback period. This is calculated as
     * <code>estimatedSavingsAmount</code>/ <code>CurrentOnDemandSpend</code>
     * *100.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         The estimated savings relative to the total cost of On-Demand
     *         usage, over the lookback period. This is calculated as
     *         <code>estimatedSavingsAmount</code>/
     *         <code>CurrentOnDemandSpend</code>*100.
     *         </p>
     */
    public String getEstimatedSavingsPercentage() {
        return estimatedSavingsPercentage;
    }

    /**
     * <p>
     * The estimated savings relative to the total cost of On-Demand usage, over
     * the lookback period. This is calculated as
     * <code>estimatedSavingsAmount</code>/ <code>CurrentOnDemandSpend</code>
     * *100.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param estimatedSavingsPercentage <p>
     *            The estimated savings relative to the total cost of On-Demand
     *            usage, over the lookback period. This is calculated as
     *            <code>estimatedSavingsAmount</code>/
     *            <code>CurrentOnDemandSpend</code>*100.
     *            </p>
     */
    public void setEstimatedSavingsPercentage(String estimatedSavingsPercentage) {
        this.estimatedSavingsPercentage = estimatedSavingsPercentage;
    }

    /**
     * <p>
     * The estimated savings relative to the total cost of On-Demand usage, over
     * the lookback period. This is calculated as
     * <code>estimatedSavingsAmount</code>/ <code>CurrentOnDemandSpend</code>
     * *100.
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
     *            The estimated savings relative to the total cost of On-Demand
     *            usage, over the lookback period. This is calculated as
     *            <code>estimatedSavingsAmount</code>/
     *            <code>CurrentOnDemandSpend</code>*100.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SavingsPlansPurchaseRecommendationSummary withEstimatedSavingsPercentage(
            String estimatedSavingsPercentage) {
        this.estimatedSavingsPercentage = estimatedSavingsPercentage;
        return this;
    }

    /**
     * <p>
     * The estimated monthly savings amount, based on the recommended Savings
     * Plans purchase.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         The estimated monthly savings amount, based on the recommended
     *         Savings Plans purchase.
     *         </p>
     */
    public String getEstimatedMonthlySavingsAmount() {
        return estimatedMonthlySavingsAmount;
    }

    /**
     * <p>
     * The estimated monthly savings amount, based on the recommended Savings
     * Plans purchase.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param estimatedMonthlySavingsAmount <p>
     *            The estimated monthly savings amount, based on the recommended
     *            Savings Plans purchase.
     *            </p>
     */
    public void setEstimatedMonthlySavingsAmount(String estimatedMonthlySavingsAmount) {
        this.estimatedMonthlySavingsAmount = estimatedMonthlySavingsAmount;
    }

    /**
     * <p>
     * The estimated monthly savings amount, based on the recommended Savings
     * Plans purchase.
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
     *            Savings Plans purchase.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SavingsPlansPurchaseRecommendationSummary withEstimatedMonthlySavingsAmount(
            String estimatedMonthlySavingsAmount) {
        this.estimatedMonthlySavingsAmount = estimatedMonthlySavingsAmount;
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
    public SavingsPlansPurchaseRecommendationSummary withEstimatedOnDemandCostWithCurrentCommitment(
            String estimatedOnDemandCostWithCurrentCommitment) {
        this.estimatedOnDemandCostWithCurrentCommitment = estimatedOnDemandCostWithCurrentCommitment;
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
        if (getEstimatedROI() != null)
            sb.append("EstimatedROI: " + getEstimatedROI() + ",");
        if (getCurrencyCode() != null)
            sb.append("CurrencyCode: " + getCurrencyCode() + ",");
        if (getEstimatedTotalCost() != null)
            sb.append("EstimatedTotalCost: " + getEstimatedTotalCost() + ",");
        if (getCurrentOnDemandSpend() != null)
            sb.append("CurrentOnDemandSpend: " + getCurrentOnDemandSpend() + ",");
        if (getEstimatedSavingsAmount() != null)
            sb.append("EstimatedSavingsAmount: " + getEstimatedSavingsAmount() + ",");
        if (getTotalRecommendationCount() != null)
            sb.append("TotalRecommendationCount: " + getTotalRecommendationCount() + ",");
        if (getDailyCommitmentToPurchase() != null)
            sb.append("DailyCommitmentToPurchase: " + getDailyCommitmentToPurchase() + ",");
        if (getHourlyCommitmentToPurchase() != null)
            sb.append("HourlyCommitmentToPurchase: " + getHourlyCommitmentToPurchase() + ",");
        if (getEstimatedSavingsPercentage() != null)
            sb.append("EstimatedSavingsPercentage: " + getEstimatedSavingsPercentage() + ",");
        if (getEstimatedMonthlySavingsAmount() != null)
            sb.append("EstimatedMonthlySavingsAmount: " + getEstimatedMonthlySavingsAmount() + ",");
        if (getEstimatedOnDemandCostWithCurrentCommitment() != null)
            sb.append("EstimatedOnDemandCostWithCurrentCommitment: "
                    + getEstimatedOnDemandCostWithCurrentCommitment());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEstimatedROI() == null) ? 0 : getEstimatedROI().hashCode());
        hashCode = prime * hashCode
                + ((getCurrencyCode() == null) ? 0 : getCurrencyCode().hashCode());
        hashCode = prime * hashCode
                + ((getEstimatedTotalCost() == null) ? 0 : getEstimatedTotalCost().hashCode());
        hashCode = prime * hashCode
                + ((getCurrentOnDemandSpend() == null) ? 0 : getCurrentOnDemandSpend().hashCode());
        hashCode = prime
                * hashCode
                + ((getEstimatedSavingsAmount() == null) ? 0 : getEstimatedSavingsAmount()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getTotalRecommendationCount() == null) ? 0 : getTotalRecommendationCount()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getDailyCommitmentToPurchase() == null) ? 0 : getDailyCommitmentToPurchase()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getHourlyCommitmentToPurchase() == null) ? 0 : getHourlyCommitmentToPurchase()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getEstimatedSavingsPercentage() == null) ? 0 : getEstimatedSavingsPercentage()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getEstimatedMonthlySavingsAmount() == null) ? 0
                        : getEstimatedMonthlySavingsAmount().hashCode());
        hashCode = prime
                * hashCode
                + ((getEstimatedOnDemandCostWithCurrentCommitment() == null) ? 0
                        : getEstimatedOnDemandCostWithCurrentCommitment().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SavingsPlansPurchaseRecommendationSummary == false)
            return false;
        SavingsPlansPurchaseRecommendationSummary other = (SavingsPlansPurchaseRecommendationSummary) obj;

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
        if (other.getEstimatedTotalCost() == null ^ this.getEstimatedTotalCost() == null)
            return false;
        if (other.getEstimatedTotalCost() != null
                && other.getEstimatedTotalCost().equals(this.getEstimatedTotalCost()) == false)
            return false;
        if (other.getCurrentOnDemandSpend() == null ^ this.getCurrentOnDemandSpend() == null)
            return false;
        if (other.getCurrentOnDemandSpend() != null
                && other.getCurrentOnDemandSpend().equals(this.getCurrentOnDemandSpend()) == false)
            return false;
        if (other.getEstimatedSavingsAmount() == null ^ this.getEstimatedSavingsAmount() == null)
            return false;
        if (other.getEstimatedSavingsAmount() != null
                && other.getEstimatedSavingsAmount().equals(this.getEstimatedSavingsAmount()) == false)
            return false;
        if (other.getTotalRecommendationCount() == null
                ^ this.getTotalRecommendationCount() == null)
            return false;
        if (other.getTotalRecommendationCount() != null
                && other.getTotalRecommendationCount().equals(this.getTotalRecommendationCount()) == false)
            return false;
        if (other.getDailyCommitmentToPurchase() == null
                ^ this.getDailyCommitmentToPurchase() == null)
            return false;
        if (other.getDailyCommitmentToPurchase() != null
                && other.getDailyCommitmentToPurchase().equals(this.getDailyCommitmentToPurchase()) == false)
            return false;
        if (other.getHourlyCommitmentToPurchase() == null
                ^ this.getHourlyCommitmentToPurchase() == null)
            return false;
        if (other.getHourlyCommitmentToPurchase() != null
                && other.getHourlyCommitmentToPurchase().equals(
                        this.getHourlyCommitmentToPurchase()) == false)
            return false;
        if (other.getEstimatedSavingsPercentage() == null
                ^ this.getEstimatedSavingsPercentage() == null)
            return false;
        if (other.getEstimatedSavingsPercentage() != null
                && other.getEstimatedSavingsPercentage().equals(
                        this.getEstimatedSavingsPercentage()) == false)
            return false;
        if (other.getEstimatedMonthlySavingsAmount() == null
                ^ this.getEstimatedMonthlySavingsAmount() == null)
            return false;
        if (other.getEstimatedMonthlySavingsAmount() != null
                && other.getEstimatedMonthlySavingsAmount().equals(
                        this.getEstimatedMonthlySavingsAmount()) == false)
            return false;
        if (other.getEstimatedOnDemandCostWithCurrentCommitment() == null
                ^ this.getEstimatedOnDemandCostWithCurrentCommitment() == null)
            return false;
        if (other.getEstimatedOnDemandCostWithCurrentCommitment() != null
                && other.getEstimatedOnDemandCostWithCurrentCommitment().equals(
                        this.getEstimatedOnDemandCostWithCurrentCommitment()) == false)
            return false;
        return true;
    }
}
