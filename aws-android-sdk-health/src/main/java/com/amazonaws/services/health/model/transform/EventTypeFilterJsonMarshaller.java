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
 * JSON marshaller for POJO EventTypeFilter
 */
class EventTypeFilterJsonMarshaller {

    public void marshall(EventTypeFilter eventTypeFilter, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (eventTypeFilter.getEventTypeCodes() != null) {
            java.util.List<String> eventTypeCodes = eventTypeFilter.getEventTypeCodes();
            jsonWriter.name("eventTypeCodes");
            jsonWriter.beginArray();
            for (String eventTypeCodesItem : eventTypeCodes) {
                if (eventTypeCodesItem != null) {
                    jsonWriter.value(eventTypeCodesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (eventTypeFilter.getServices() != null) {
            java.util.List<String> services = eventTypeFilter.getServices();
            jsonWriter.name("services");
            jsonWriter.beginArray();
            for (String servicesItem : services) {
                if (servicesItem != null) {
                    jsonWriter.value(servicesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (eventTypeFilter.getEventTypeCategories() != null) {
            java.util.List<String> eventTypeCategories = eventTypeFilter.getEventTypeCategories();
            jsonWriter.name("eventTypeCategories");
            jsonWriter.beginArray();
            for (String eventTypeCategoriesItem : eventTypeCategories) {
                if (eventTypeCategoriesItem != null) {
                    jsonWriter.value(eventTypeCategoriesItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static EventTypeFilterJsonMarshaller instance;

    public static EventTypeFilterJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EventTypeFilterJsonMarshaller();
        return instance;
    }
}
