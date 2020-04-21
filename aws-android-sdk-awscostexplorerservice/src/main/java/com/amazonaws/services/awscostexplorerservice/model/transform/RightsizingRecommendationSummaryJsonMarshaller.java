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
 * JSON marshaller for POJO RightsizingRecommendationSummary
 */
class RightsizingRecommendationSummaryJsonMarshaller {

    public void marshall(RightsizingRecommendationSummary rightsizingRecommendationSummary,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (rightsizingRecommendationSummary.getTotalRecommendationCount() != null) {
            String totalRecommendationCount = rightsizingRecommendationSummary
                    .getTotalRecommendationCount();
            jsonWriter.name("TotalRecommendationCount");
            jsonWriter.value(totalRecommendationCount);
        }
        if (rightsizingRecommendationSummary.getEstimatedTotalMonthlySavingsAmount() != null) {
            String estimatedTotalMonthlySavingsAmount = rightsizingRecommendationSummary
                    .getEstimatedTotalMonthlySavingsAmount();
            jsonWriter.name("EstimatedTotalMonthlySavingsAmount");
            jsonWriter.value(estimatedTotalMonthlySavingsAmount);
        }
        if (rightsizingRecommendationSummary.getSavingsCurrencyCode() != null) {
            String savingsCurrencyCode = rightsizingRecommendationSummary.getSavingsCurrencyCode();
            jsonWriter.name("SavingsCurrencyCode");
            jsonWriter.value(savingsCurrencyCode);
        }
        if (rightsizingRecommendationSummary.getSavingsPercentage() != null) {
            String savingsPercentage = rightsizingRecommendationSummary.getSavingsPercentage();
            jsonWriter.name("SavingsPercentage");
            jsonWriter.value(savingsPercentage);
        }
        jsonWriter.endObject();
    }

    private static RightsizingRecommendationSummaryJsonMarshaller instance;

    public static RightsizingRecommendationSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RightsizingRecommendationSummaryJsonMarshaller();
        return instance;
    }
}
