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
 * JSON marshaller for POJO DocumentationPartLocation
 */
class DocumentationPartLocationJsonMarshaller {

    public void marshall(DocumentationPartLocation documentationPartLocation,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (documentationPartLocation.getType() != null) {
            String type = documentationPartLocation.getType();
            jsonWriter.name("type");
            jsonWriter.value(type);
        }
        if (documentationPartLocation.getPath() != null) {
            String path = documentationPartLocation.getPath();
            jsonWriter.name("path");
            jsonWriter.value(path);
        }
        if (documentationPartLocation.getMethod() != null) {
            String method = documentationPartLocation.getMethod();
            jsonWriter.name("method");
            jsonWriter.value(method);
        }
        if (documentationPartLocation.getStatusCode() != null) {
            String statusCode = documentationPartLocation.getStatusCode();
            jsonWriter.name("statusCode");
            jsonWriter.value(statusCode);
        }
        if (documentationPartLocation.getName() != null) {
            String name = documentationPartLocation.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        jsonWriter.endObject();
    }

    private static DocumentationPartLocationJsonMarshaller instance;

    public static DocumentationPartLocationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DocumentationPartLocationJsonMarshaller();
        return instance;
    }
}
