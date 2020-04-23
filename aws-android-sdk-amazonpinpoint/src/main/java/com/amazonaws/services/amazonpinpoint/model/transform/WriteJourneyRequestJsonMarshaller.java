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

package com.amazonaws.services.amazonpinpoint.model.transform;

import com.amazonaws.services.amazonpinpoint.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO WriteJourneyRequest
 */
class WriteJourneyRequestJsonMarshaller {

    public void marshall(WriteJourneyRequest writeJourneyRequest, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (writeJourneyRequest.getActivities() != null) {
            java.util.Map<String, Activity> activities = writeJourneyRequest.getActivities();
            jsonWriter.name("Activities");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, Activity> activitiesEntry : activities.entrySet()) {
                Activity activitiesValue = activitiesEntry.getValue();
                if (activitiesValue != null) {
                    jsonWriter.name(activitiesEntry.getKey());
                    ActivityJsonMarshaller.getInstance().marshall(activitiesValue, jsonWriter);
                }
            }
            jsonWriter.endObject();
        }
        if (writeJourneyRequest.getCreationDate() != null) {
            String creationDate = writeJourneyRequest.getCreationDate();
            jsonWriter.name("CreationDate");
            jsonWriter.value(creationDate);
        }
        if (writeJourneyRequest.getLastModifiedDate() != null) {
            String lastModifiedDate = writeJourneyRequest.getLastModifiedDate();
            jsonWriter.name("LastModifiedDate");
            jsonWriter.value(lastModifiedDate);
        }
        if (writeJourneyRequest.getLimits() != null) {
            JourneyLimits limits = writeJourneyRequest.getLimits();
            jsonWriter.name("Limits");
            JourneyLimitsJsonMarshaller.getInstance().marshall(limits, jsonWriter);
        }
        if (writeJourneyRequest.getLocalTime() != null) {
            Boolean localTime = writeJourneyRequest.getLocalTime();
            jsonWriter.name("LocalTime");
            jsonWriter.value(localTime);
        }
        if (writeJourneyRequest.getName() != null) {
            String name = writeJourneyRequest.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (writeJourneyRequest.getQuietTime() != null) {
            QuietTime quietTime = writeJourneyRequest.getQuietTime();
            jsonWriter.name("QuietTime");
            QuietTimeJsonMarshaller.getInstance().marshall(quietTime, jsonWriter);
        }
        if (writeJourneyRequest.getRefreshFrequency() != null) {
            String refreshFrequency = writeJourneyRequest.getRefreshFrequency();
            jsonWriter.name("RefreshFrequency");
            jsonWriter.value(refreshFrequency);
        }
        if (writeJourneyRequest.getSchedule() != null) {
            JourneySchedule schedule = writeJourneyRequest.getSchedule();
            jsonWriter.name("Schedule");
            JourneyScheduleJsonMarshaller.getInstance().marshall(schedule, jsonWriter);
        }
        if (writeJourneyRequest.getStartActivity() != null) {
            String startActivity = writeJourneyRequest.getStartActivity();
            jsonWriter.name("StartActivity");
            jsonWriter.value(startActivity);
        }
        if (writeJourneyRequest.getStartCondition() != null) {
            StartCondition startCondition = writeJourneyRequest.getStartCondition();
            jsonWriter.name("StartCondition");
            StartConditionJsonMarshaller.getInstance().marshall(startCondition, jsonWriter);
        }
        if (writeJourneyRequest.getState() != null) {
            String state = writeJourneyRequest.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        jsonWriter.endObject();
    }

    private static WriteJourneyRequestJsonMarshaller instance;

    public static WriteJourneyRequestJsonMarshaller getInstance() {
        if (instance == null)
            instance = new WriteJourneyRequestJsonMarshaller();
        return instance;
    }
}
