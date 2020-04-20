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
 * JSON marshaller for POJO SavingsPlansPurchaseRecommendationDetail
 */
class SavingsPlansPurchaseRecommendationDetailJsonMarshaller {

    public void marshall(
            SavingsPlansPurchaseRecommendationDetail savingsPlansPurchaseRecommendationDetail,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (savingsPlansPurchaseRecommendationDetail.getSavingsPlansDetails() != null) {
            SavingsPlansDetails savingsPlansDetails = savingsPlansPurchaseRecommendationDetail
                    .getSavingsPlansDetails();
            jsonWriter.name("SavingsPlansDetails");
            SavingsPlansDetailsJsonMarshaller.getInstance().marshall(savingsPlansDetails,
                    jsonWriter);
        }
        if (savingsPlansPurchaseRecommendationDetail.getAccountId() != null) {
            String accountId = savingsPlansPurchaseRecommendationDetail.getAccountId();
            jsonWriter.name("AccountId");
            jsonWriter.value(accountId);
        }
        if (savingsPlansPurchaseRecommendationDetail.getUpfrontCost() != null) {
            String upfrontCost = savingsPlansPurchaseRecommendationDetail.getUpfrontCost();
            jsonWriter.name("UpfrontCost");
            jsonWriter.value(upfrontCost);
        }
        if (savingsPlansPurchaseRecommendationDetail.getEstimatedROI() != null) {
            String estimatedROI = savingsPlansPurchaseRecommendationDetail.getEstimatedROI();
            jsonWriter.name("EstimatedROI");
            jsonWriter.value(estimatedROI);
        }
        if (savingsPlansPurchaseRecommendationDetail.getCurrencyCode() != null) {
            String currencyCode = savingsPlansPurchaseRecommendationDetail.getCurrencyCode();
            jsonWriter.name("CurrencyCode");
            jsonWriter.value(currencyCode);
        }
        if (savingsPlansPurchaseRecommendationDetail.getEstimatedSPCost() != null) {
            String estimatedSPCost = savingsPlansPurchaseRecommendationDetail.getEstimatedSPCost();
            jsonWriter.name("EstimatedSPCost");
            jsonWriter.value(estimatedSPCost);
        }
        if (savingsPlansPurchaseRecommendationDetail.getEstimatedOnDemandCost() != null) {
            String estimatedOnDemandCost = savingsPlansPurchaseRecommendationDetail
                    .getEstimatedOnDemandCost();
            jsonWriter.name("EstimatedOnDemandCost");
            jsonWriter.value(estimatedOnDemandCost);
        }
        if (savingsPlansPurchaseRecommendationDetail
                .getEstimatedOnDemandCostWithCurrentCommitment() != null) {
            String estimatedOnDemandCostWithCurrentCommitment = savingsPlansPurchaseRecommendationDetail
                    .getEstimatedOnDemandCostWithCurrentCommitment();
            jsonWriter.name("EstimatedOnDemandCostWithCurrentCommitment");
            jsonWriter.value(estimatedOnDemandCostWithCurrentCommitment);
        }
        if (savingsPlansPurchaseRecommendationDetail.getEstimatedSavingsAmount() != null) {
            String estimatedSavingsAmount = savingsPlansPurchaseRecommendationDetail
                    .getEstimatedSavingsAmount();
            jsonWriter.name("EstimatedSavingsAmount");
            jsonWriter.value(estimatedSavingsAmount);
        }
        if (savingsPlansPurchaseRecommendationDetail.getEstimatedSavingsPercentage() != null) {
            String estimatedSavingsPercentage = savingsPlansPurchaseRecommendationDetail
                    .getEstimatedSavingsPercentage();
            jsonWriter.name("EstimatedSavingsPercentage");
            jsonWriter.value(estimatedSavingsPercentage);
        }
        if (savingsPlansPurchaseRecommendationDetail.getHourlyCommitmentToPurchase() != null) {
            String hourlyCommitmentToPurchase = savingsPlansPurchaseRecommendationDetail
                    .getHourlyCommitmentToPurchase();
            jsonWriter.name("HourlyCommitmentToPurchase");
            jsonWriter.value(hourlyCommitmentToPurchase);
        }
        if (savingsPlansPurchaseRecommendationDetail.getEstimatedAverageUtilization() != null) {
            String estimatedAverageUtilization = savingsPlansPurchaseRecommendationDetail
                    .getEstimatedAverageUtilization();
            jsonWriter.name("EstimatedAverageUtilization");
            jsonWriter.value(estimatedAverageUtilization);
        }
        if (savingsPlansPurchaseRecommendationDetail.getEstimatedMonthlySavingsAmount() != null) {
            String estimatedMonthlySavingsAmount = savingsPlansPurchaseRecommendationDetail
                    .getEstimatedMonthlySavingsAmount();
            jsonWriter.name("EstimatedMonthlySavingsAmount");
            jsonWriter.value(estimatedMonthlySavingsAmount);
        }
        if (savingsPlansPurchaseRecommendationDetail.getCurrentMinimumHourlyOnDemandSpend() != null) {
            String currentMinimumHourlyOnDemandSpend = savingsPlansPurchaseRecommendationDetail
                    .getCurrentMinimumHourlyOnDemandSpend();
            jsonWriter.name("CurrentMinimumHourlyOnDemandSpend");
            jsonWriter.value(currentMinimumHourlyOnDemandSpend);
        }
        if (savingsPlansPurchaseRecommendationDetail.getCurrentMaximumHourlyOnDemandSpend() != null) {
            String currentMaximumHourlyOnDemandSpend = savingsPlansPurchaseRecommendationDetail
                    .getCurrentMaximumHourlyOnDemandSpend();
            jsonWriter.name("CurrentMaximumHourlyOnDemandSpend");
            jsonWriter.value(currentMaximumHourlyOnDemandSpend);
        }
        if (savingsPlansPurchaseRecommendationDetail.getCurrentAverageHourlyOnDemandSpend() != null) {
            String currentAverageHourlyOnDemandSpend = savingsPlansPurchaseRecommendationDetail
                    .getCurrentAverageHourlyOnDemandSpend();
            jsonWriter.name("CurrentAverageHourlyOnDemandSpend");
            jsonWriter.value(currentAverageHourlyOnDemandSpend);
        }
        jsonWriter.endObject();
    }

    private static SavingsPlansPurchaseRecommendationDetailJsonMarshaller instance;

    public static SavingsPlansPurchaseRecommendationDetailJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SavingsPlansPurchaseRecommendationDetailJsonMarshaller();
        return instance;
    }
}
