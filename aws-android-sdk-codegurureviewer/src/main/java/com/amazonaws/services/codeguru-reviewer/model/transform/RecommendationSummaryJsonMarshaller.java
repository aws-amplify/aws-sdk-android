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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO RecommendationSummary
 */
class RecommendationSummaryJsonMarshaller {

    public void marshall(RecommendationSummary recommendationSummary, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (recommendationSummary.getFilePath() != null) {
            String filePath = recommendationSummary.getFilePath();
            jsonWriter.name("FilePath");
            jsonWriter.value(filePath);
        }
        if (recommendationSummary.getRecommendationId() != null) {
            String recommendationId = recommendationSummary.getRecommendationId();
            jsonWriter.name("RecommendationId");
            jsonWriter.value(recommendationId);
        }
        if (recommendationSummary.getStartLine() != null) {
            Integer startLine = recommendationSummary.getStartLine();
            jsonWriter.name("StartLine");
            jsonWriter.value(startLine);
        }
        if (recommendationSummary.getEndLine() != null) {
            Integer endLine = recommendationSummary.getEndLine();
            jsonWriter.name("EndLine");
            jsonWriter.value(endLine);
        }
        if (recommendationSummary.getDescription() != null) {
            String description = recommendationSummary.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        jsonWriter.endObject();
    }

    private static RecommendationSummaryJsonMarshaller instance;
    public static RecommendationSummaryJsonMarshaller getInstance() {
        if (instance == null) instance = new RecommendationSummaryJsonMarshaller();
        return instance;
    }
}
