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
 * JSON marshaller for POJO EventsRequest
 */
class EventsRequestJsonMarshaller {

    public void marshall(EventsRequest eventsRequest, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (eventsRequest.getBatchItem() != null) {
            java.util.Map<String, EventsBatch> batchItem = eventsRequest.getBatchItem();
            jsonWriter.name("BatchItem");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, EventsBatch> batchItemEntry : batchItem.entrySet()) {
                EventsBatch batchItemValue = batchItemEntry.getValue();
                if (batchItemValue != null) {
                    jsonWriter.name(batchItemEntry.getKey());
                    EventsBatchJsonMarshaller.getInstance().marshall(batchItemValue, jsonWriter);
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static EventsRequestJsonMarshaller instance;

    public static EventsRequestJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EventsRequestJsonMarshaller();
        return instance;
    }
}
