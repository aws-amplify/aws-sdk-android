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
 * JSON marshaller for POJO Resource
 */
class ResourceJsonMarshaller {

    public void marshall(Resource resource, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (resource.getId() != null) {
            String id = resource.getId();
            jsonWriter.name("id");
            jsonWriter.value(id);
        }
        if (resource.getParentId() != null) {
            String parentId = resource.getParentId();
            jsonWriter.name("parentId");
            jsonWriter.value(parentId);
        }
        if (resource.getPathPart() != null) {
            String pathPart = resource.getPathPart();
            jsonWriter.name("pathPart");
            jsonWriter.value(pathPart);
        }
        if (resource.getPath() != null) {
            String path = resource.getPath();
            jsonWriter.name("path");
            jsonWriter.value(path);
        }
        if (resource.getResourceMethods() != null) {
            java.util.Map<String, Method> resourceMethods = resource.getResourceMethods();
            jsonWriter.name("resourceMethods");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, Method> resourceMethodsEntry : resourceMethods
                    .entrySet()) {
                Method resourceMethodsValue = resourceMethodsEntry.getValue();
                if (resourceMethodsValue != null) {
                    jsonWriter.name(resourceMethodsEntry.getKey());
                    MethodJsonMarshaller.getInstance().marshall(resourceMethodsValue, jsonWriter);
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static ResourceJsonMarshaller instance;

    public static ResourceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ResourceJsonMarshaller();
        return instance;
    }
}
