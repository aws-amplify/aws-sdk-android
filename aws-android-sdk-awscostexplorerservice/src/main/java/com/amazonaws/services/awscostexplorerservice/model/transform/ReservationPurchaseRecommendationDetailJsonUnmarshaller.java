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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO ReservationPurchaseRecommendationDetail
 */
class ReservationPurchaseRecommendationDetailJsonUnmarshaller implements
        Unmarshaller<ReservationPurchaseRecommendationDetail, JsonUnmarshallerContext> {

    public ReservationPurchaseRecommendationDetail unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ReservationPurchaseRecommendationDetail reservationPurchaseRecommendationDetail = new ReservationPurchaseRecommendationDetail();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AccountId")) {
                reservationPurchaseRecommendationDetail.setAccountId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("InstanceDetails")) {
                reservationPurchaseRecommendationDetail
                        .setInstanceDetails(InstanceDetailsJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("RecommendedNumberOfInstancesToPurchase")) {
                reservationPurchaseRecommendationDetail
                        .setRecommendedNumberOfInstancesToPurchase(StringJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("RecommendedNormalizedUnitsToPurchase")) {
                reservationPurchaseRecommendationDetail
                        .setRecommendedNormalizedUnitsToPurchase(StringJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("MinimumNumberOfInstancesUsedPerHour")) {
                reservationPurchaseRecommendationDetail
                        .setMinimumNumberOfInstancesUsedPerHour(StringJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("MinimumNormalizedUnitsUsedPerHour")) {
                reservationPurchaseRecommendationDetail
                        .setMinimumNormalizedUnitsUsedPerHour(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("MaximumNumberOfInstancesUsedPerHour")) {
                reservationPurchaseRecommendationDetail
                        .setMaximumNumberOfInstancesUsedPerHour(StringJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("MaximumNormalizedUnitsUsedPerHour")) {
                reservationPurchaseRecommendationDetail
                        .setMaximumNormalizedUnitsUsedPerHour(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("AverageNumberOfInstancesUsedPerHour")) {
                reservationPurchaseRecommendationDetail
                        .setAverageNumberOfInstancesUsedPerHour(StringJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("AverageNormalizedUnitsUsedPerHour")) {
                reservationPurchaseRecommendationDetail
                        .setAverageNormalizedUnitsUsedPerHour(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("AverageUtilization")) {
                reservationPurchaseRecommendationDetail
                        .setAverageUtilization(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("EstimatedBreakEvenInMonths")) {
                reservationPurchaseRecommendationDetail
                        .setEstimatedBreakEvenInMonths(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("CurrencyCode")) {
                reservationPurchaseRecommendationDetail.setCurrencyCode(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("EstimatedMonthlySavingsAmount")) {
                reservationPurchaseRecommendationDetail
                        .setEstimatedMonthlySavingsAmount(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("EstimatedMonthlySavingsPercentage")) {
                reservationPurchaseRecommendationDetail
                        .setEstimatedMonthlySavingsPercentage(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("EstimatedMonthlyOnDemandCost")) {
                reservationPurchaseRecommendationDetail
                        .setEstimatedMonthlyOnDemandCost(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("EstimatedReservationCostForLookbackPeriod")) {
                reservationPurchaseRecommendationDetail
                        .setEstimatedReservationCostForLookbackPeriod(StringJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("UpfrontCost")) {
                reservationPurchaseRecommendationDetail.setUpfrontCost(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("RecurringStandardMonthlyCost")) {
                reservationPurchaseRecommendationDetail
                        .setRecurringStandardMonthlyCost(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return reservationPurchaseRecommendationDetail;
    }

    private static ReservationPurchaseRecommendationDetailJsonUnmarshaller instance;

    public static ReservationPurchaseRecommendationDetailJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ReservationPurchaseRecommendationDetailJsonUnmarshaller();
        return instance;
    }
}
