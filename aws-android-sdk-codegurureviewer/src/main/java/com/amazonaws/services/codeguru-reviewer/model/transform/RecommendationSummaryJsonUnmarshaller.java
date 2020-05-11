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
package com.amazonaws.services.codeguru-reviewer.model.transform;

import com.amazonaws.services.codeguru-reviewer.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;


/**
 * JSON unmarshaller for POJO RecommendationSummary
 */
class RecommendationSummaryJsonUnmarshaller implements Unmarshaller<RecommendationSummary, JsonUnmarshallerContext> {

    public RecommendationSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        RecommendationSummary recommendationSummary = new RecommendationSummary();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("FilePath")) {
                recommendationSummary.setFilePath(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("RecommendationId")) {
                recommendationSummary.setRecommendationId(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("StartLine")) {
                recommendationSummary.setStartLine(IntegerJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("EndLine")) {
                recommendationSummary.setEndLine(IntegerJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("Description")) {
                recommendationSummary.setDescription(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return recommendationSummary;
    }

    private static RecommendationSummaryJsonUnmarshaller instance;
    public static RecommendationSummaryJsonUnmarshaller getInstance() {
        if (instance == null) instance = new RecommendationSummaryJsonUnmarshaller();
        return instance;
    }
}
