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
 * JSON unmarshaller for POJO EventFilter
 */
class EventFilterJsonUnmarshaller implements Unmarshaller<EventFilter, JsonUnmarshallerContext> {

    public EventFilter unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        EventFilter eventFilter = new EventFilter();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("eventArns")) {
                eventFilter.setEventArns(new ListUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("eventTypeCodes")) {
                eventFilter.setEventTypeCodes(new ListUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("services")) {
                eventFilter.setServices(new ListUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("regions")) {
                eventFilter.setRegions(new ListUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("availabilityZones")) {
                eventFilter.setAvailabilityZones(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("startTimes")) {
                eventFilter.setStartTimes(new ListUnmarshaller<DateTimeRange>(
                        DateTimeRangeJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("endTimes")) {
                eventFilter.setEndTimes(new ListUnmarshaller<DateTimeRange>(
                        DateTimeRangeJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("lastUpdatedTimes")) {
                eventFilter.setLastUpdatedTimes(new ListUnmarshaller<DateTimeRange>(
                        DateTimeRangeJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("entityArns")) {
                eventFilter.setEntityArns(new ListUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("entityValues")) {
                eventFilter.setEntityValues(new ListUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("eventTypeCategories")) {
                eventFilter.setEventTypeCategories(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("tags")) {
                eventFilter.setTags(new ListUnmarshaller<java.util.Map<String, String>>(
                        new MapUnmarshaller<String>(StringJsonUnmarshaller.getInstance()
                        )
                        )
                                .unmarshall(context));
            } else if (name.equals("eventStatusCodes")) {
                eventFilter.setEventStatusCodes(new ListUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return eventFilter;
    }

    private static EventFilterJsonUnmarshaller instance;

    public static EventFilterJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EventFilterJsonUnmarshaller();
        return instance;
    }
}
