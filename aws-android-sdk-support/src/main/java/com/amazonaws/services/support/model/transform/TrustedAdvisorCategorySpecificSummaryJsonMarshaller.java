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
 * JSON marshaller for POJO TrustedAdvisorCategorySpecificSummary
 */
class TrustedAdvisorCategorySpecificSummaryJsonMarshaller {

    public void marshall(
            TrustedAdvisorCategorySpecificSummary trustedAdvisorCategorySpecificSummary,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (trustedAdvisorCategorySpecificSummary.getCostOptimizing() != null) {
            TrustedAdvisorCostOptimizingSummary costOptimizing = trustedAdvisorCategorySpecificSummary
                    .getCostOptimizing();
            jsonWriter.name("costOptimizing");
            TrustedAdvisorCostOptimizingSummaryJsonMarshaller.getInstance().marshall(
                    costOptimizing, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static TrustedAdvisorCategorySpecificSummaryJsonMarshaller instance;

    public static TrustedAdvisorCategorySpecificSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TrustedAdvisorCategorySpecificSummaryJsonMarshaller();
        return instance;
    }
}
