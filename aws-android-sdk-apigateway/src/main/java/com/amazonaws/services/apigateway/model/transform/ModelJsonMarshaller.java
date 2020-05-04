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
 * JSON marshaller for POJO Model
 */
class ModelJsonMarshaller {

    public void marshall(Model model, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (model.getId() != null) {
            String id = model.getId();
            jsonWriter.name("id");
            jsonWriter.value(id);
        }
        if (model.getName() != null) {
            String name = model.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (model.getDescription() != null) {
            String description = model.getDescription();
            jsonWriter.name("description");
            jsonWriter.value(description);
        }
        if (model.getSchema() != null) {
            String schema = model.getSchema();
            jsonWriter.name("schema");
            jsonWriter.value(schema);
        }
        if (model.getContentType() != null) {
            String contentType = model.getContentType();
            jsonWriter.name("contentType");
            jsonWriter.value(contentType);
        }
        jsonWriter.endObject();
    }

    private static ModelJsonMarshaller instance;

    public static ModelJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ModelJsonMarshaller();
        return instance;
    }
}
