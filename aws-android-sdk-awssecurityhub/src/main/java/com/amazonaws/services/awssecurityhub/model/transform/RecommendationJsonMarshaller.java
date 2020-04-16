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

package com.amazonaws.services.awssecurityhub.model.transform;

import com.amazonaws.services.awssecurityhub.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Recommendation
 */
class RecommendationJsonMarshaller {

    public void marshall(Recommendation recommendation, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (recommendation.getText() != null) {
            String text = recommendation.getText();
            jsonWriter.name("Text");
            jsonWriter.value(text);
        }
        if (recommendation.getUrl() != null) {
            String url = recommendation.getUrl();
            jsonWriter.name("Url");
            jsonWriter.value(url);
        }
        jsonWriter.endObject();
    }

    private static RecommendationJsonMarshaller instance;

    public static RecommendationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RecommendationJsonMarshaller();
        return instance;
    }
}
