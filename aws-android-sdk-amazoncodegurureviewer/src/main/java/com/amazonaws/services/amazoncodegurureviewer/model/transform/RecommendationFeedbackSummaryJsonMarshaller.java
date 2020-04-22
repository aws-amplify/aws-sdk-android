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

package com.amazonaws.services.amazoncodegurureviewer.model.transform;

import com.amazonaws.services.amazoncodegurureviewer.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO RecommendationFeedbackSummary
 */
class RecommendationFeedbackSummaryJsonMarshaller {

    public void marshall(RecommendationFeedbackSummary recommendationFeedbackSummary,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (recommendationFeedbackSummary.getRecommendationId() != null) {
            String recommendationId = recommendationFeedbackSummary.getRecommendationId();
            jsonWriter.name("RecommendationId");
            jsonWriter.value(recommendationId);
        }
        if (recommendationFeedbackSummary.getReactions() != null) {
            java.util.List<String> reactions = recommendationFeedbackSummary.getReactions();
            jsonWriter.name("Reactions");
            jsonWriter.beginArray();
            for (String reactionsItem : reactions) {
                if (reactionsItem != null) {
                    jsonWriter.value(reactionsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (recommendationFeedbackSummary.getUserId() != null) {
            String userId = recommendationFeedbackSummary.getUserId();
            jsonWriter.name("UserId");
            jsonWriter.value(userId);
        }
        jsonWriter.endObject();
    }

    private static RecommendationFeedbackSummaryJsonMarshaller instance;

    public static RecommendationFeedbackSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RecommendationFeedbackSummaryJsonMarshaller();
        return instance;
    }
}
