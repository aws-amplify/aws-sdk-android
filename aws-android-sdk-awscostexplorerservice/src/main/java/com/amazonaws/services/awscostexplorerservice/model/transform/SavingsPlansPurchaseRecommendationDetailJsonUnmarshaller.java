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
 * JSON unmarshaller for POJO SavingsPlansPurchaseRecommendationDetail
 */
class SavingsPlansPurchaseRecommendationDetailJsonUnmarshaller implements
        Unmarshaller<SavingsPlansPurchaseRecommendationDetail, JsonUnmarshallerContext> {

    public SavingsPlansPurchaseRecommendationDetail unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        SavingsPlansPurchaseRecommendationDetail savingsPlansPurchaseRecommendationDetail = new SavingsPlansPurchaseRecommendationDetail();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("SavingsPlansDetails")) {
                savingsPlansPurchaseRecommendationDetail
                        .setSavingsPlansDetails(SavingsPlansDetailsJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("AccountId")) {
                savingsPlansPurchaseRecommendationDetail.setAccountId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("UpfrontCost")) {
                savingsPlansPurchaseRecommendationDetail.setUpfrontCost(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("EstimatedROI")) {
                savingsPlansPurchaseRecommendationDetail.setEstimatedROI(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("CurrencyCode")) {
                savingsPlansPurchaseRecommendationDetail.setCurrencyCode(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("EstimatedSPCost")) {
                savingsPlansPurchaseRecommendationDetail.setEstimatedSPCost(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("EstimatedOnDemandCost")) {
                savingsPlansPurchaseRecommendationDetail
                        .setEstimatedOnDemandCost(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("EstimatedOnDemandCostWithCurrentCommitment")) {
                savingsPlansPurchaseRecommendationDetail
                        .setEstimatedOnDemandCostWithCurrentCommitment(StringJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("EstimatedSavingsAmount")) {
                savingsPlansPurchaseRecommendationDetail
                        .setEstimatedSavingsAmount(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("EstimatedSavingsPercentage")) {
                savingsPlansPurchaseRecommendationDetail
                        .setEstimatedSavingsPercentage(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("HourlyCommitmentToPurchase")) {
                savingsPlansPurchaseRecommendationDetail
                        .setHourlyCommitmentToPurchase(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("EstimatedAverageUtilization")) {
                savingsPlansPurchaseRecommendationDetail
                        .setEstimatedAverageUtilization(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("EstimatedMonthlySavingsAmount")) {
                savingsPlansPurchaseRecommendationDetail
                        .setEstimatedMonthlySavingsAmount(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("CurrentMinimumHourlyOnDemandSpend")) {
                savingsPlansPurchaseRecommendationDetail
                        .setCurrentMinimumHourlyOnDemandSpend(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("CurrentMaximumHourlyOnDemandSpend")) {
                savingsPlansPurchaseRecommendationDetail
                        .setCurrentMaximumHourlyOnDemandSpend(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("CurrentAverageHourlyOnDemandSpend")) {
                savingsPlansPurchaseRecommendationDetail
                        .setCurrentAverageHourlyOnDemandSpend(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return savingsPlansPurchaseRecommendationDetail;
    }

    private static SavingsPlansPurchaseRecommendationDetailJsonUnmarshaller instance;

    public static SavingsPlansPurchaseRecommendationDetailJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SavingsPlansPurchaseRecommendationDetailJsonUnmarshaller();
        return instance;
    }
}
