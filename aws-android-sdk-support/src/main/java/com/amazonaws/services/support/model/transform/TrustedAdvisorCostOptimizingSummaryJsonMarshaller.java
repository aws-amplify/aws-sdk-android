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

package com.amazonaws.services.support.model.transform;

import com.amazonaws.services.support.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO TrustedAdvisorCostOptimizingSummary
 */
class TrustedAdvisorCostOptimizingSummaryJsonMarshaller {

    public void marshall(TrustedAdvisorCostOptimizingSummary trustedAdvisorCostOptimizingSummary,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (trustedAdvisorCostOptimizingSummary.getEstimatedMonthlySavings() != null) {
            Double estimatedMonthlySavings = trustedAdvisorCostOptimizingSummary
                    .getEstimatedMonthlySavings();
            jsonWriter.name("estimatedMonthlySavings");
            jsonWriter.value(estimatedMonthlySavings);
        }
        if (trustedAdvisorCostOptimizingSummary.getEstimatedPercentMonthlySavings() != null) {
            Double estimatedPercentMonthlySavings = trustedAdvisorCostOptimizingSummary
                    .getEstimatedPercentMonthlySavings();
            jsonWriter.name("estimatedPercentMonthlySavings");
            jsonWriter.value(estimatedPercentMonthlySavings);
        }
        jsonWriter.endObject();
    }

    private static TrustedAdvisorCostOptimizingSummaryJsonMarshaller instance;

    public static TrustedAdvisorCostOptimizingSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TrustedAdvisorCostOptimizingSummaryJsonMarshaller();
        return instance;
    }
}
