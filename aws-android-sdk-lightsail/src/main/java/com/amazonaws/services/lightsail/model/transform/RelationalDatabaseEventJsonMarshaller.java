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

package com.amazonaws.services.lightsail.model.transform;

import com.amazonaws.services.lightsail.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO RelationalDatabaseEvent
 */
class RelationalDatabaseEventJsonMarshaller {

    public void marshall(RelationalDatabaseEvent relationalDatabaseEvent, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (relationalDatabaseEvent.getResource() != null) {
            String resource = relationalDatabaseEvent.getResource();
            jsonWriter.name("resource");
            jsonWriter.value(resource);
        }
        if (relationalDatabaseEvent.getCreatedAt() != null) {
            java.util.Date createdAt = relationalDatabaseEvent.getCreatedAt();
            jsonWriter.name("createdAt");
            jsonWriter.value(createdAt);
        }
        if (relationalDatabaseEvent.getMessage() != null) {
            String message = relationalDatabaseEvent.getMessage();
            jsonWriter.name("message");
            jsonWriter.value(message);
        }
        if (relationalDatabaseEvent.getEventCategories() != null) {
            java.util.List<String> eventCategories = relationalDatabaseEvent.getEventCategories();
            jsonWriter.name("eventCategories");
            jsonWriter.beginArray();
            for (String eventCategoriesItem : eventCategories) {
                if (eventCategoriesItem != null) {
                    jsonWriter.value(eventCategoriesItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static RelationalDatabaseEventJsonMarshaller instance;

    public static RelationalDatabaseEventJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RelationalDatabaseEventJsonMarshaller();
        return instance;
    }
}
