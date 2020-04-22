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
 * JSON marshaller for POJO RecommendationFeedback
 */
class RecommendationFeedbackJsonMarshaller {

    public void marshall(RecommendationFeedback recommendationFeedback, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (recommendationFeedback.getCodeReviewArn() != null) {
            String codeReviewArn = recommendationFeedback.getCodeReviewArn();
            jsonWriter.name("CodeReviewArn");
            jsonWriter.value(codeReviewArn);
        }
        if (recommendationFeedback.getRecommendationId() != null) {
            String recommendationId = recommendationFeedback.getRecommendationId();
            jsonWriter.name("RecommendationId");
            jsonWriter.value(recommendationId);
        }
        if (recommendationFeedback.getReactions() != null) {
            java.util.List<String> reactions = recommendationFeedback.getReactions();
            jsonWriter.name("Reactions");
            jsonWriter.beginArray();
            for (String reactionsItem : reactions) {
                if (reactionsItem != null) {
                    jsonWriter.value(reactionsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (recommendationFeedback.getUserId() != null) {
            String userId = recommendationFeedback.getUserId();
            jsonWriter.name("UserId");
            jsonWriter.value(userId);
        }
        if (recommendationFeedback.getCreatedTimeStamp() != null) {
            java.util.Date createdTimeStamp = recommendationFeedback.getCreatedTimeStamp();
            jsonWriter.name("CreatedTimeStamp");
            jsonWriter.value(createdTimeStamp);
        }
        if (recommendationFeedback.getLastUpdatedTimeStamp() != null) {
            java.util.Date lastUpdatedTimeStamp = recommendationFeedback.getLastUpdatedTimeStamp();
            jsonWriter.name("LastUpdatedTimeStamp");
            jsonWriter.value(lastUpdatedTimeStamp);
        }
        jsonWriter.endObject();
    }

    private static RecommendationFeedbackJsonMarshaller instance;

    public static RecommendationFeedbackJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RecommendationFeedbackJsonMarshaller();
        return instance;
    }
}
