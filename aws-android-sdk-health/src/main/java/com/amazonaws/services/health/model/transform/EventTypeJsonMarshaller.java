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

package com.amazonaws.services.health.model.transform;

import com.amazonaws.services.health.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO EventType
 */
class EventTypeJsonMarshaller {

    public void marshall(EventType eventType, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (eventType.getService() != null) {
            String service = eventType.getService();
            jsonWriter.name("service");
            jsonWriter.value(service);
        }
        if (eventType.getCode() != null) {
            String code = eventType.getCode();
            jsonWriter.name("code");
            jsonWriter.value(code);
        }
        if (eventType.getCategory() != null) {
            String category = eventType.getCategory();
            jsonWriter.name("category");
            jsonWriter.value(category);
        }
        jsonWriter.endObject();
    }

    private static EventTypeJsonMarshaller instance;

    public static EventTypeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EventTypeJsonMarshaller();
        return instance;
    }
}
