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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO Schedule
 */
class ScheduleJsonUnmarshaller implements Unmarshaller<Schedule, JsonUnmarshallerContext> {

    public Schedule unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Schedule schedule = new Schedule();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("EndTime")) {
                schedule.setEndTime(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EventFilter")) {
                schedule.setEventFilter(CampaignEventFilterJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Frequency")) {
                schedule.setFrequency(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("IsLocalTime")) {
                schedule.setIsLocalTime(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("QuietTime")) {
                schedule.setQuietTime(QuietTimeJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StartTime")) {
                schedule.setStartTime(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Timezone")) {
                schedule.setTimezone(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return schedule;
    }

    private static ScheduleJsonUnmarshaller instance;

    public static ScheduleJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ScheduleJsonUnmarshaller();
        return instance;
    }
}
