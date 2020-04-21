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

package com.amazonaws.services.awscostexplorerservice.model.transform;

import com.amazonaws.services.awscostexplorerservice.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO SavingsPlansPurchaseRecommendationSummary
 */
class SavingsPlansPurchaseRecommendationSummaryJsonMarshaller {

    public void marshall(
            SavingsPlansPurchaseRecommendationSummary savingsPlansPurchaseRecommendationSummary,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (savingsPlansPurchaseRecommendationSummary.getEstimatedROI() != null) {
            String estimatedROI = savingsPlansPurchaseRecommendationSummary.getEstimatedROI();
            jsonWriter.name("EstimatedROI");
            jsonWriter.value(estimatedROI);
        }
        if (savingsPlansPurchaseRecommendationSummary.getCurrencyCode() != null) {
            String currencyCode = savingsPlansPurchaseRecommendationSummary.getCurrencyCode();
            jsonWriter.name("CurrencyCode");
            jsonWriter.value(currencyCode);
        }
        if (savingsPlansPurchaseRecommendationSummary.getEstimatedTotalCost() != null) {
            String estimatedTotalCost = savingsPlansPurchaseRecommendationSummary
                    .getEstimatedTotalCost();
            jsonWriter.name("EstimatedTotalCost");
            jsonWriter.value(estimatedTotalCost);
        }
        if (savingsPlansPurchaseRecommendationSummary.getCurrentOnDemandSpend() != null) {
            String currentOnDemandSpend = savingsPlansPurchaseRecommendationSummary
                    .getCurrentOnDemandSpend();
            jsonWriter.name("CurrentOnDemandSpend");
            jsonWriter.value(currentOnDemandSpend);
        }
        if (savingsPlansPurchaseRecommendationSummary.getEstimatedSavingsAmount() != null) {
            String estimatedSavingsAmount = savingsPlansPurchaseRecommendationSummary
                    .getEstimatedSavingsAmount();
            jsonWriter.name("EstimatedSavingsAmount");
            jsonWriter.value(estimatedSavingsAmount);
        }
        if (savingsPlansPurchaseRecommendationSummary.getTotalRecommendationCount() != null) {
            String totalRecommendationCount = savingsPlansPurchaseRecommendationSummary
                    .getTotalRecommendationCount();
            jsonWriter.name("TotalRecommendationCount");
            jsonWriter.value(totalRecommendationCount);
        }
        if (savingsPlansPurchaseRecommendationSummary.getDailyCommitmentToPurchase() != null) {
            String dailyCommitmentToPurchase = savingsPlansPurchaseRecommendationSummary
                    .getDailyCommitmentToPurchase();
            jsonWriter.name("DailyCommitmentToPurchase");
            jsonWriter.value(dailyCommitmentToPurchase);
        }
        if (savingsPlansPurchaseRecommendationSummary.getHourlyCommitmentToPurchase() != null) {
            String hourlyCommitmentToPurchase = savingsPlansPurchaseRecommendationSummary
                    .getHourlyCommitmentToPurchase();
            jsonWriter.name("HourlyCommitmentToPurchase");
            jsonWriter.value(hourlyCommitmentToPurchase);
        }
        if (savingsPlansPurchaseRecommendationSummary.getEstimatedSavingsPercentage() != null) {
            String estimatedSavingsPercentage = savingsPlansPurchaseRecommendationSummary
                    .getEstimatedSavingsPercentage();
            jsonWriter.name("EstimatedSavingsPercentage");
            jsonWriter.value(estimatedSavingsPercentage);
        }
        if (savingsPlansPurchaseRecommendationSummary.getEstimatedMonthlySavingsAmount() != null) {
            String estimatedMonthlySavingsAmount = savingsPlansPurchaseRecommendationSummary
                    .getEstimatedMonthlySavingsAmount();
            jsonWriter.name("EstimatedMonthlySavingsAmount");
            jsonWriter.value(estimatedMonthlySavingsAmount);
        }
        if (savingsPlansPurchaseRecommendationSummary
                .getEstimatedOnDemandCostWithCurrentCommitment() != null) {
            String estimatedOnDemandCostWithCurrentCommitment = savingsPlansPurchaseRecommendationSummary
                    .getEstimatedOnDemandCostWithCurrentCommitment();
            jsonWriter.name("EstimatedOnDemandCostWithCurrentCommitment");
            jsonWriter.value(estimatedOnDemandCostWithCurrentCommitment);
        }
        jsonWriter.endObject();
    }

    private static SavingsPlansPurchaseRecommendationSummaryJsonMarshaller instance;

    public static SavingsPlansPurchaseRecommendationSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SavingsPlansPurchaseRecommendationSummaryJsonMarshaller();
        return instance;
    }
}
