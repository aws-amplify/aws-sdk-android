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
 * JSON marshaller for POJO ReservationPurchaseRecommendationDetail
 */
class ReservationPurchaseRecommendationDetailJsonMarshaller {

    public void marshall(
            ReservationPurchaseRecommendationDetail reservationPurchaseRecommendationDetail,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (reservationPurchaseRecommendationDetail.getAccountId() != null) {
            String accountId = reservationPurchaseRecommendationDetail.getAccountId();
            jsonWriter.name("AccountId");
            jsonWriter.value(accountId);
        }
        if (reservationPurchaseRecommendationDetail.getInstanceDetails() != null) {
            InstanceDetails instanceDetails = reservationPurchaseRecommendationDetail
                    .getInstanceDetails();
            jsonWriter.name("InstanceDetails");
            InstanceDetailsJsonMarshaller.getInstance().marshall(instanceDetails, jsonWriter);
        }
        if (reservationPurchaseRecommendationDetail.getRecommendedNumberOfInstancesToPurchase() != null) {
            String recommendedNumberOfInstancesToPurchase = reservationPurchaseRecommendationDetail
                    .getRecommendedNumberOfInstancesToPurchase();
            jsonWriter.name("RecommendedNumberOfInstancesToPurchase");
            jsonWriter.value(recommendedNumberOfInstancesToPurchase);
        }
        if (reservationPurchaseRecommendationDetail.getRecommendedNormalizedUnitsToPurchase() != null) {
            String recommendedNormalizedUnitsToPurchase = reservationPurchaseRecommendationDetail
                    .getRecommendedNormalizedUnitsToPurchase();
            jsonWriter.name("RecommendedNormalizedUnitsToPurchase");
            jsonWriter.value(recommendedNormalizedUnitsToPurchase);
        }
        if (reservationPurchaseRecommendationDetail.getMinimumNumberOfInstancesUsedPerHour() != null) {
            String minimumNumberOfInstancesUsedPerHour = reservationPurchaseRecommendationDetail
                    .getMinimumNumberOfInstancesUsedPerHour();
            jsonWriter.name("MinimumNumberOfInstancesUsedPerHour");
            jsonWriter.value(minimumNumberOfInstancesUsedPerHour);
        }
        if (reservationPurchaseRecommendationDetail.getMinimumNormalizedUnitsUsedPerHour() != null) {
            String minimumNormalizedUnitsUsedPerHour = reservationPurchaseRecommendationDetail
                    .getMinimumNormalizedUnitsUsedPerHour();
            jsonWriter.name("MinimumNormalizedUnitsUsedPerHour");
            jsonWriter.value(minimumNormalizedUnitsUsedPerHour);
        }
        if (reservationPurchaseRecommendationDetail.getMaximumNumberOfInstancesUsedPerHour() != null) {
            String maximumNumberOfInstancesUsedPerHour = reservationPurchaseRecommendationDetail
                    .getMaximumNumberOfInstancesUsedPerHour();
            jsonWriter.name("MaximumNumberOfInstancesUsedPerHour");
            jsonWriter.value(maximumNumberOfInstancesUsedPerHour);
        }
        if (reservationPurchaseRecommendationDetail.getMaximumNormalizedUnitsUsedPerHour() != null) {
            String maximumNormalizedUnitsUsedPerHour = reservationPurchaseRecommendationDetail
                    .getMaximumNormalizedUnitsUsedPerHour();
            jsonWriter.name("MaximumNormalizedUnitsUsedPerHour");
            jsonWriter.value(maximumNormalizedUnitsUsedPerHour);
        }
        if (reservationPurchaseRecommendationDetail.getAverageNumberOfInstancesUsedPerHour() != null) {
            String averageNumberOfInstancesUsedPerHour = reservationPurchaseRecommendationDetail
                    .getAverageNumberOfInstancesUsedPerHour();
            jsonWriter.name("AverageNumberOfInstancesUsedPerHour");
            jsonWriter.value(averageNumberOfInstancesUsedPerHour);
        }
        if (reservationPurchaseRecommendationDetail.getAverageNormalizedUnitsUsedPerHour() != null) {
            String averageNormalizedUnitsUsedPerHour = reservationPurchaseRecommendationDetail
                    .getAverageNormalizedUnitsUsedPerHour();
            jsonWriter.name("AverageNormalizedUnitsUsedPerHour");
            jsonWriter.value(averageNormalizedUnitsUsedPerHour);
        }
        if (reservationPurchaseRecommendationDetail.getAverageUtilization() != null) {
            String averageUtilization = reservationPurchaseRecommendationDetail
                    .getAverageUtilization();
            jsonWriter.name("AverageUtilization");
            jsonWriter.value(averageUtilization);
        }
        if (reservationPurchaseRecommendationDetail.getEstimatedBreakEvenInMonths() != null) {
            String estimatedBreakEvenInMonths = reservationPurchaseRecommendationDetail
                    .getEstimatedBreakEvenInMonths();
            jsonWriter.name("EstimatedBreakEvenInMonths");
            jsonWriter.value(estimatedBreakEvenInMonths);
        }
        if (reservationPurchaseRecommendationDetail.getCurrencyCode() != null) {
            String currencyCode = reservationPurchaseRecommendationDetail.getCurrencyCode();
            jsonWriter.name("CurrencyCode");
            jsonWriter.value(currencyCode);
        }
        if (reservationPurchaseRecommendationDetail.getEstimatedMonthlySavingsAmount() != null) {
            String estimatedMonthlySavingsAmount = reservationPurchaseRecommendationDetail
                    .getEstimatedMonthlySavingsAmount();
            jsonWriter.name("EstimatedMonthlySavingsAmount");
            jsonWriter.value(estimatedMonthlySavingsAmount);
        }
        if (reservationPurchaseRecommendationDetail.getEstimatedMonthlySavingsPercentage() != null) {
            String estimatedMonthlySavingsPercentage = reservationPurchaseRecommendationDetail
                    .getEstimatedMonthlySavingsPercentage();
            jsonWriter.name("EstimatedMonthlySavingsPercentage");
            jsonWriter.value(estimatedMonthlySavingsPercentage);
        }
        if (reservationPurchaseRecommendationDetail.getEstimatedMonthlyOnDemandCost() != null) {
            String estimatedMonthlyOnDemandCost = reservationPurchaseRecommendationDetail
                    .getEstimatedMonthlyOnDemandCost();
            jsonWriter.name("EstimatedMonthlyOnDemandCost");
            jsonWriter.value(estimatedMonthlyOnDemandCost);
        }
        if (reservationPurchaseRecommendationDetail.getEstimatedReservationCostForLookbackPeriod() != null) {
            String estimatedReservationCostForLookbackPeriod = reservationPurchaseRecommendationDetail
                    .getEstimatedReservationCostForLookbackPeriod();
            jsonWriter.name("EstimatedReservationCostForLookbackPeriod");
            jsonWriter.value(estimatedReservationCostForLookbackPeriod);
        }
        if (reservationPurchaseRecommendationDetail.getUpfrontCost() != null) {
            String upfrontCost = reservationPurchaseRecommendationDetail.getUpfrontCost();
            jsonWriter.name("UpfrontCost");
            jsonWriter.value(upfrontCost);
        }
        if (reservationPurchaseRecommendationDetail.getRecurringStandardMonthlyCost() != null) {
            String recurringStandardMonthlyCost = reservationPurchaseRecommendationDetail
                    .getRecurringStandardMonthlyCost();
            jsonWriter.name("RecurringStandardMonthlyCost");
            jsonWriter.value(recurringStandardMonthlyCost);
        }
        jsonWriter.endObject();
    }

    private static ReservationPurchaseRecommendationDetailJsonMarshaller instance;

    public static ReservationPurchaseRecommendationDetailJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ReservationPurchaseRecommendationDetailJsonMarshaller();
        return instance;
    }
}
