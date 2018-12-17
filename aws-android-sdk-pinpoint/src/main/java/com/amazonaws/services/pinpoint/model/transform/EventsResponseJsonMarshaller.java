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
 * JSON marshaller for POJO EventsResponse
 */
class EventsResponseJsonMarshaller {

    public void marshall(EventsResponse eventsResponse, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (eventsResponse.getResults() != null) {
            java.util.Map<String, ItemResponse> results = eventsResponse.getResults();
            jsonWriter.name("Results");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, ItemResponse> resultsEntry : results.entrySet()) {
                ItemResponse resultsValue = resultsEntry.getValue();
                if (resultsValue != null) {
                    jsonWriter.name(resultsEntry.getKey());
                    ItemResponseJsonMarshaller.getInstance().marshall(resultsValue, jsonWriter);
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static EventsResponseJsonMarshaller instance;

    public static EventsResponseJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EventsResponseJsonMarshaller();
        return instance;
    }
}
