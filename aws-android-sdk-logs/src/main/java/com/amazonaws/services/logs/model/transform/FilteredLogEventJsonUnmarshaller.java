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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO FilteredLogEvent
 */
class FilteredLogEventJsonUnmarshaller implements
        Unmarshaller<FilteredLogEvent, JsonUnmarshallerContext> {

    public FilteredLogEvent unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        FilteredLogEvent filteredLogEvent = new FilteredLogEvent();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("logStreamName")) {
                filteredLogEvent.setLogStreamName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("timestamp")) {
                filteredLogEvent.setTimestamp(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("message")) {
                filteredLogEvent.setMessage(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ingestionTime")) {
                filteredLogEvent.setIngestionTime(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("eventId")) {
                filteredLogEvent.setEventId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return filteredLogEvent;
    }

    private static FilteredLogEventJsonUnmarshaller instance;

    public static FilteredLogEventJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new FilteredLogEventJsonUnmarshaller();
        return instance;
    }
}
