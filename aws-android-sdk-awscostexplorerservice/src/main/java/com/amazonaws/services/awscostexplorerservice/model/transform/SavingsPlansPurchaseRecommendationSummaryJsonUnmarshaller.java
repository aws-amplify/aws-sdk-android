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
 * JSON unmarshaller for POJO SavingsPlansPurchaseRecommendationSummary
 */
class SavingsPlansPurchaseRecommendationSummaryJsonUnmarshaller implements
        Unmarshaller<SavingsPlansPurchaseRecommendationSummary, JsonUnmarshallerContext> {

    public SavingsPlansPurchaseRecommendationSummary unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        SavingsPlansPurchaseRecommendationSummary savingsPlansPurchaseRecommendationSummary = new SavingsPlansPurchaseRecommendationSummary();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("EstimatedROI")) {
                savingsPlansPurchaseRecommendationSummary.setEstimatedROI(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("CurrencyCode")) {
                savingsPlansPurchaseRecommendationSummary.setCurrencyCode(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("EstimatedTotalCost")) {
                savingsPlansPurchaseRecommendationSummary
                        .setEstimatedTotalCost(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("CurrentOnDemandSpend")) {
                savingsPlansPurchaseRecommendationSummary
                        .setCurrentOnDemandSpend(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("EstimatedSavingsAmount")) {
                savingsPlansPurchaseRecommendationSummary
                        .setEstimatedSavingsAmount(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("TotalRecommendationCount")) {
                savingsPlansPurchaseRecommendationSummary
                        .setTotalRecommendationCount(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("DailyCommitmentToPurchase")) {
                savingsPlansPurchaseRecommendationSummary
                        .setDailyCommitmentToPurchase(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("HourlyCommitmentToPurchase")) {
                savingsPlansPurchaseRecommendationSummary
                        .setHourlyCommitmentToPurchase(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("EstimatedSavingsPercentage")) {
                savingsPlansPurchaseRecommendationSummary
                        .setEstimatedSavingsPercentage(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("EstimatedMonthlySavingsAmount")) {
                savingsPlansPurchaseRecommendationSummary
                        .setEstimatedMonthlySavingsAmount(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("EstimatedOnDemandCostWithCurrentCommitment")) {
                savingsPlansPurchaseRecommendationSummary
                        .setEstimatedOnDemandCostWithCurrentCommitment(StringJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return savingsPlansPurchaseRecommendationSummary;
    }

    private static SavingsPlansPurchaseRecommendationSummaryJsonUnmarshaller instance;

    public static SavingsPlansPurchaseRecommendationSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SavingsPlansPurchaseRecommendationSummaryJsonUnmarshaller();
        return instance;
    }
}
