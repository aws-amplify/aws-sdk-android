/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.pinpoint.model.transform;

import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO EventsBatch
 */
class EventsBatchJsonMarshaller {

    public void marshall(EventsBatch eventsBatch, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (eventsBatch.getEndpoint() != null) {
            PublicEndpoint endpoint = eventsBatch.getEndpoint();
            jsonWriter.name("Endpoint");
            PublicEndpointJsonMarshaller.getInstance().marshall(endpoint, jsonWriter);
        }
        if (eventsBatch.getEvents() != null) {
            java.util.Map<String, Event> events = eventsBatch.getEvents();
            jsonWriter.name("Events");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, Event> eventsEntry : events.entrySet()) {
                Event eventsValue = eventsEntry.getValue();
                if (eventsValue != null) {
                    jsonWriter.name(eventsEntry.getKey());
                    EventJsonMarshaller.getInstance().marshall(eventsValue, jsonWriter);
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static EventsBatchJsonMarshaller instance;

    public static EventsBatchJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EventsBatchJsonMarshaller();
        return instance;
    }
}
