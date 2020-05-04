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

package com.amazonaws.services.apigateway.model.transform;

import com.amazonaws.services.apigateway.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ApiStage
 */
class ApiStageJsonMarshaller {

    public void marshall(ApiStage apiStage, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (apiStage.getApiId() != null) {
            String apiId = apiStage.getApiId();
            jsonWriter.name("apiId");
            jsonWriter.value(apiId);
        }
        if (apiStage.getStage() != null) {
            String stage = apiStage.getStage();
            jsonWriter.name("stage");
            jsonWriter.value(stage);
        }
        if (apiStage.getThrottle() != null) {
            java.util.Map<String, ThrottleSettings> throttle = apiStage.getThrottle();
            jsonWriter.name("throttle");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, ThrottleSettings> throttleEntry : throttle.entrySet()) {
                ThrottleSettings throttleValue = throttleEntry.getValue();
                if (throttleValue != null) {
                    jsonWriter.name(throttleEntry.getKey());
                    ThrottleSettingsJsonMarshaller.getInstance()
                            .marshall(throttleValue, jsonWriter);
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static ApiStageJsonMarshaller instance;

    public static ApiStageJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ApiStageJsonMarshaller();
        return instance;
    }
}
