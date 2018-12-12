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
 * JSON marshaller for POJO Schedule
 */
class ScheduleJsonMarshaller {

    public void marshall(Schedule schedule, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (schedule.getEndTime() != null) {
            String endTime = schedule.getEndTime();
            jsonWriter.name("EndTime");
            jsonWriter.value(endTime);
        }
        if (schedule.getEventFilter() != null) {
            CampaignEventFilter eventFilter = schedule.getEventFilter();
            jsonWriter.name("EventFilter");
            CampaignEventFilterJsonMarshaller.getInstance().marshall(eventFilter, jsonWriter);
        }
        if (schedule.getFrequency() != null) {
            String frequency = schedule.getFrequency();
            jsonWriter.name("Frequency");
            jsonWriter.value(frequency);
        }
        if (schedule.getIsLocalTime() != null) {
            Boolean isLocalTime = schedule.getIsLocalTime();
            jsonWriter.name("IsLocalTime");
            jsonWriter.value(isLocalTime);
        }
        if (schedule.getQuietTime() != null) {
            QuietTime quietTime = schedule.getQuietTime();
            jsonWriter.name("QuietTime");
            QuietTimeJsonMarshaller.getInstance().marshall(quietTime, jsonWriter);
        }
        if (schedule.getStartTime() != null) {
            String startTime = schedule.getStartTime();
            jsonWriter.name("StartTime");
            jsonWriter.value(startTime);
        }
        if (schedule.getTimezone() != null) {
            String timezone = schedule.getTimezone();
            jsonWriter.name("Timezone");
            jsonWriter.value(timezone);
        }
        jsonWriter.endObject();
    }

    private static ScheduleJsonMarshaller instance;

    public static ScheduleJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ScheduleJsonMarshaller();
        return instance;
    }
}
