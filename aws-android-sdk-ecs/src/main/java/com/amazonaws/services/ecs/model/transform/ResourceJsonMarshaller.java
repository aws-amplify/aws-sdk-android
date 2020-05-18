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

package com.amazonaws.services.ecs.model.transform;

import com.amazonaws.services.ecs.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Resource
 */
class ResourceJsonMarshaller {

    public void marshall(Resource resource, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (resource.getName() != null) {
            String name = resource.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (resource.getType() != null) {
            String type = resource.getType();
            jsonWriter.name("type");
            jsonWriter.value(type);
        }
        if (resource.getDoubleValue() != null) {
            Double doubleValue = resource.getDoubleValue();
            jsonWriter.name("doubleValue");
            jsonWriter.value(doubleValue);
        }
        if (resource.getLongValue() != null) {
            Long longValue = resource.getLongValue();
            jsonWriter.name("longValue");
            jsonWriter.value(longValue);
        }
        if (resource.getIntegerValue() != null) {
            Integer integerValue = resource.getIntegerValue();
            jsonWriter.name("integerValue");
            jsonWriter.value(integerValue);
        }
        if (resource.getStringSetValue() != null) {
            java.util.List<String> stringSetValue = resource.getStringSetValue();
            jsonWriter.name("stringSetValue");
            jsonWriter.beginArray();
            for (String stringSetValueItem : stringSetValue) {
                if (stringSetValueItem != null) {
                    jsonWriter.value(stringSetValueItem);
                }
            }
            jsonWriter.endArray();
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
