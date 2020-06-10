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
package com.amazonaws.services.compute-optimizer.model.transform;

import com.amazonaws.services.compute-optimizer.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO RecommendationSummary
 */
class RecommendationSummaryJsonMarshaller {

    public void marshall(RecommendationSummary recommendationSummary, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (recommendationSummary.getSummaries() != null) {
            java.util.List<Summary> summaries = recommendationSummary.getSummaries();
            jsonWriter.name("summaries");
            jsonWriter.beginArray();
            for (Summary summariesItem : summaries) {
                if (summariesItem != null) {
            SummaryJsonMarshaller.getInstance().marshall(summariesItem, jsonWriter);
                    }
            }
            jsonWriter.endArray();
        }
        if (recommendationSummary.getRecommendationResourceType() != null) {
            String recommendationResourceType = recommendationSummary.getRecommendationResourceType();
            jsonWriter.name("recommendationResourceType");
            jsonWriter.value(recommendationResourceType);
        }
        if (recommendationSummary.getAccountId() != null) {
            String accountId = recommendationSummary.getAccountId();
            jsonWriter.name("accountId");
            jsonWriter.value(accountId);
        }
        jsonWriter.endObject();
    }

    private static RecommendationSummaryJsonMarshaller instance;
    public static RecommendationSummaryJsonMarshaller getInstance() {
        if (instance == null) instance = new RecommendationSummaryJsonMarshaller();
        return instance;
    }
}
