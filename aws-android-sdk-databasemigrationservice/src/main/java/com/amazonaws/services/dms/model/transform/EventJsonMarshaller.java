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

package com.amazonaws.services.dms.model.transform;

import com.amazonaws.services.dms.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Event
 */
class EventJsonMarshaller {

    public void marshall(Event event, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (event.getSourceIdentifier() != null) {
            String sourceIdentifier = event.getSourceIdentifier();
            jsonWriter.name("SourceIdentifier");
            jsonWriter.value(sourceIdentifier);
        }
        if (event.getSourceType() != null) {
            String sourceType = event.getSourceType();
            jsonWriter.name("SourceType");
            jsonWriter.value(sourceType);
        }
        if (event.getMessage() != null) {
            String message = event.getMessage();
            jsonWriter.name("Message");
            jsonWriter.value(message);
        }
        if (event.getEventCategories() != null) {
            java.util.List<String> eventCategories = event.getEventCategories();
            jsonWriter.name("EventCategories");
            jsonWriter.beginArray();
            for (String eventCategoriesItem : eventCategories) {
                if (eventCategoriesItem != null) {
                    jsonWriter.value(eventCategoriesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (event.getDate() != null) {
            java.util.Date dateValue = event.getDate();
            jsonWriter.name("Date");
            jsonWriter.value(dateValue);
        }
        jsonWriter.endObject();
    }

    private static EventJsonMarshaller instance;

    public static EventJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EventJsonMarshaller();
        return instance;
    }
}
