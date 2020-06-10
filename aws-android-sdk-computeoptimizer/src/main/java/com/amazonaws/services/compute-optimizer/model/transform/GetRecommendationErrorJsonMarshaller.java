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
 * JSON marshaller for POJO GetRecommendationError
 */
class GetRecommendationErrorJsonMarshaller {

    public void marshall(GetRecommendationError getRecommendationError, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (getRecommendationError.getIdentifier() != null) {
            String identifier = getRecommendationError.getIdentifier();
            jsonWriter.name("identifier");
            jsonWriter.value(identifier);
        }
        if (getRecommendationError.getCode() != null) {
            String code = getRecommendationError.getCode();
            jsonWriter.name("code");
            jsonWriter.value(code);
        }
        if (getRecommendationError.getMessage() != null) {
            String message = getRecommendationError.getMessage();
            jsonWriter.name("message");
            jsonWriter.value(message);
        }
        jsonWriter.endObject();
    }

    private static GetRecommendationErrorJsonMarshaller instance;
    public static GetRecommendationErrorJsonMarshaller getInstance() {
        if (instance == null) instance = new GetRecommendationErrorJsonMarshaller();
        return instance;
    }
}
