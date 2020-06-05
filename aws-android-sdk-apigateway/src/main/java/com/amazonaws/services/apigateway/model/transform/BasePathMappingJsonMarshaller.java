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
 * JSON marshaller for POJO BasePathMapping
 */
class BasePathMappingJsonMarshaller {

    public void marshall(BasePathMapping basePathMapping, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (basePathMapping.getBasePath() != null) {
            String basePath = basePathMapping.getBasePath();
            jsonWriter.name("basePath");
            jsonWriter.value(basePath);
        }
        if (basePathMapping.getRestApiId() != null) {
            String restApiId = basePathMapping.getRestApiId();
            jsonWriter.name("restApiId");
            jsonWriter.value(restApiId);
        }
        if (basePathMapping.getStage() != null) {
            String stage = basePathMapping.getStage();
            jsonWriter.name("stage");
            jsonWriter.value(stage);
        }
        jsonWriter.endObject();
    }

    private static BasePathMappingJsonMarshaller instance;

    public static BasePathMappingJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BasePathMappingJsonMarshaller();
        return instance;
    }
}
