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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO EventDimensions
 */
class EventDimensionsJsonUnmarshaller implements
        Unmarshaller<EventDimensions, JsonUnmarshallerContext> {

    public EventDimensions unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        EventDimensions eventDimensions = new EventDimensions();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Attributes")) {
                eventDimensions.setAttributes(new MapUnmarshaller<AttributeDimension>(
                        AttributeDimensionJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("EventType")) {
                eventDimensions.setEventType(SetDimensionJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Metrics")) {
                eventDimensions.setMetrics(new MapUnmarshaller<MetricDimension>(
                        MetricDimensionJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return eventDimensions;
    }

    private static EventDimensionsJsonUnmarshaller instance;

    public static EventDimensionsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EventDimensionsJsonUnmarshaller();
        return instance;
    }
}
