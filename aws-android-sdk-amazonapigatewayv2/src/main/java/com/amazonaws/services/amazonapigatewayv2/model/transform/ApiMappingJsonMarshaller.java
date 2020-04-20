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

package com.amazonaws.services.amazonapigatewayv2.model.transform;

import com.amazonaws.services.amazonapigatewayv2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ApiMapping
 */
class ApiMappingJsonMarshaller {

    public void marshall(ApiMapping apiMapping, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (apiMapping.getApiId() != null) {
            String apiId = apiMapping.getApiId();
            jsonWriter.name("ApiId");
            jsonWriter.value(apiId);
        }
        if (apiMapping.getApiMappingId() != null) {
            String apiMappingId = apiMapping.getApiMappingId();
            jsonWriter.name("ApiMappingId");
            jsonWriter.value(apiMappingId);
        }
        if (apiMapping.getApiMappingKey() != null) {
            String apiMappingKey = apiMapping.getApiMappingKey();
            jsonWriter.name("ApiMappingKey");
            jsonWriter.value(apiMappingKey);
        }
        if (apiMapping.getStage() != null) {
            String stage = apiMapping.getStage();
            jsonWriter.name("Stage");
            jsonWriter.value(stage);
        }
        jsonWriter.endObject();
    }

    private static ApiMappingJsonMarshaller instance;

    public static ApiMappingJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ApiMappingJsonMarshaller();
        return instance;
    }
}
