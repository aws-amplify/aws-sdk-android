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
 * JSON marshaller for POJO StageKey
 */
class StageKeyJsonMarshaller {

    public void marshall(StageKey stageKey, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (stageKey.getRestApiId() != null) {
            String restApiId = stageKey.getRestApiId();
            jsonWriter.name("restApiId");
            jsonWriter.value(restApiId);
        }
        if (stageKey.getStageName() != null) {
            String stageName = stageKey.getStageName();
            jsonWriter.name("stageName");
            jsonWriter.value(stageName);
        }
        jsonWriter.endObject();
    }

    private static StageKeyJsonMarshaller instance;

    public static StageKeyJsonMarshaller getInstance() {
        if (instance == null)
            instance = new StageKeyJsonMarshaller();
        return instance;
    }
}
