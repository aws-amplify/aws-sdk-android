/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON marshaller for POJO ItemResponse
 */
class ItemResponseJsonMarshaller {

    public void marshall(ItemResponse itemResponse, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (itemResponse.getEndpointItemResponse() != null) {
            EndpointItemResponse endpointItemResponse = itemResponse.getEndpointItemResponse();
            jsonWriter.name("EndpointItemResponse");
            EndpointItemResponseJsonMarshaller.getInstance().marshall(endpointItemResponse,
                    jsonWriter);
        }
        if (itemResponse.getEventsItemResponse() != null) {
            java.util.Map<String, EventItemResponse> eventsItemResponse = itemResponse
                    .getEventsItemResponse();
            jsonWriter.name("EventsItemResponse");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, EventItemResponse> eventsItemResponseEntry : eventsItemResponse
                    .entrySet()) {
                EventItemResponse eventsItemResponseValue = eventsItemResponseEntry.getValue();
                if (eventsItemResponseValue != null) {
                    jsonWriter.name(eventsItemResponseEntry.getKey());
                    EventItemResponseJsonMarshaller.getInstance().marshall(eventsItemResponseValue,
                            jsonWriter);
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static ItemResponseJsonMarshaller instance;

    public static ItemResponseJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ItemResponseJsonMarshaller();
        return instance;
    }
}
