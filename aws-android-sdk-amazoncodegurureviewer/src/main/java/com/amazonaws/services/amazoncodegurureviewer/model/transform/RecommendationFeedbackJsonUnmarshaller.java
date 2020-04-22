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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO RecommendationFeedback
 */
class RecommendationFeedbackJsonUnmarshaller implements
        Unmarshaller<RecommendationFeedback, JsonUnmarshallerContext> {

    public RecommendationFeedback unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        RecommendationFeedback recommendationFeedback = new RecommendationFeedback();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("CodeReviewArn")) {
                recommendationFeedback.setCodeReviewArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RecommendationId")) {
                recommendationFeedback.setRecommendationId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Reactions")) {
                recommendationFeedback.setReactions(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("UserId")) {
                recommendationFeedback.setUserId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreatedTimeStamp")) {
                recommendationFeedback.setCreatedTimeStamp(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastUpdatedTimeStamp")) {
                recommendationFeedback.setLastUpdatedTimeStamp(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return recommendationFeedback;
    }

    private static RecommendationFeedbackJsonUnmarshaller instance;

    public static RecommendationFeedbackJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RecommendationFeedbackJsonUnmarshaller();
        return instance;
    }
}
