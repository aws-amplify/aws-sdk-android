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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO Event
 */
class EventJsonUnmarshaller implements Unmarshaller<Event, JsonUnmarshallerContext> {

    public Event unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Event event = new Event();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("arn")) {
                event.setArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("service")) {
                event.setService(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("eventTypeCode")) {
                event.setEventTypeCode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("eventTypeCategory")) {
                event.setEventTypeCategory(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("region")) {
                event.setRegion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("availabilityZone")) {
                event.setAvailabilityZone(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("startTime")) {
                event.setStartTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("endTime")) {
                event.setEndTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("lastUpdatedTime")) {
                event.setLastUpdatedTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("statusCode")) {
                event.setStatusCode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("eventScopeCode")) {
                event.setEventScopeCode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return event;
    }

    private static EventJsonUnmarshaller instance;

    public static EventJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EventJsonUnmarshaller();
        return instance;
    }
}
