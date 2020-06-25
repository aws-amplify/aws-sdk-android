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

package com.amazonaws.services.glue.model.transform;

import com.amazonaws.services.glue.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO UpdateJsonClassifierRequest
 */
class UpdateJsonClassifierRequestJsonMarshaller {

    public void marshall(UpdateJsonClassifierRequest updateJsonClassifierRequest,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (updateJsonClassifierRequest.getName() != null) {
            String name = updateJsonClassifierRequest.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (updateJsonClassifierRequest.getJsonPath() != null) {
            String jsonPath = updateJsonClassifierRequest.getJsonPath();
            jsonWriter.name("JsonPath");
            jsonWriter.value(jsonPath);
        }
        jsonWriter.endObject();
    }

    private static UpdateJsonClassifierRequestJsonMarshaller instance;

    public static UpdateJsonClassifierRequestJsonMarshaller getInstance() {
        if (instance == null)
            instance = new UpdateJsonClassifierRequestJsonMarshaller();
        return instance;
    }
}
