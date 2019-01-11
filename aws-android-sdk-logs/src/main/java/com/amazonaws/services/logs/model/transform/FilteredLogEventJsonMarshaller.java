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

package com.amazonaws.services.logs.model.transform;

import com.amazonaws.services.logs.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO FilteredLogEvent
 */
class FilteredLogEventJsonMarshaller {

    public void marshall(FilteredLogEvent filteredLogEvent, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (filteredLogEvent.getLogStreamName() != null) {
            String logStreamName = filteredLogEvent.getLogStreamName();
            jsonWriter.name("logStreamName");
            jsonWriter.value(logStreamName);
        }
        if (filteredLogEvent.getTimestamp() != null) {
            Long timestamp = filteredLogEvent.getTimestamp();
            jsonWriter.name("timestamp");
            jsonWriter.value(timestamp);
        }
        if (filteredLogEvent.getMessage() != null) {
            String message = filteredLogEvent.getMessage();
            jsonWriter.name("message");
            jsonWriter.value(message);
        }
        if (filteredLogEvent.getIngestionTime() != null) {
            Long ingestionTime = filteredLogEvent.getIngestionTime();
            jsonWriter.name("ingestionTime");
            jsonWriter.value(ingestionTime);
        }
        if (filteredLogEvent.getEventId() != null) {
            String eventId = filteredLogEvent.getEventId();
            jsonWriter.name("eventId");
            jsonWriter.value(eventId);
        }
        jsonWriter.endObject();
    }

    private static FilteredLogEventJsonMarshaller instance;

    public static FilteredLogEventJsonMarshaller getInstance() {
        if (instance == null)
            instance = new FilteredLogEventJsonMarshaller();
        return instance;
    }
}
