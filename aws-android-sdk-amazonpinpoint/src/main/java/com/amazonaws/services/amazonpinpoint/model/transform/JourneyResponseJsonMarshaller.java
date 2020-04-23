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
 * JSON marshaller for POJO JourneyResponse
 */
class JourneyResponseJsonMarshaller {

    public void marshall(JourneyResponse journeyResponse, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (journeyResponse.getActivities() != null) {
            java.util.Map<String, Activity> activities = journeyResponse.getActivities();
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
        if (journeyResponse.getApplicationId() != null) {
            String applicationId = journeyResponse.getApplicationId();
            jsonWriter.name("ApplicationId");
            jsonWriter.value(applicationId);
        }
        if (journeyResponse.getCreationDate() != null) {
            String creationDate = journeyResponse.getCreationDate();
            jsonWriter.name("CreationDate");
            jsonWriter.value(creationDate);
        }
        if (journeyResponse.getId() != null) {
            String id = journeyResponse.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (journeyResponse.getLastModifiedDate() != null) {
            String lastModifiedDate = journeyResponse.getLastModifiedDate();
            jsonWriter.name("LastModifiedDate");
            jsonWriter.value(lastModifiedDate);
        }
        if (journeyResponse.getLimits() != null) {
            JourneyLimits limits = journeyResponse.getLimits();
            jsonWriter.name("Limits");
            JourneyLimitsJsonMarshaller.getInstance().marshall(limits, jsonWriter);
        }
        if (journeyResponse.getLocalTime() != null) {
            Boolean localTime = journeyResponse.getLocalTime();
            jsonWriter.name("LocalTime");
            jsonWriter.value(localTime);
        }
        if (journeyResponse.getName() != null) {
            String name = journeyResponse.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (journeyResponse.getQuietTime() != null) {
            QuietTime quietTime = journeyResponse.getQuietTime();
            jsonWriter.name("QuietTime");
            QuietTimeJsonMarshaller.getInstance().marshall(quietTime, jsonWriter);
        }
        if (journeyResponse.getRefreshFrequency() != null) {
            String refreshFrequency = journeyResponse.getRefreshFrequency();
            jsonWriter.name("RefreshFrequency");
            jsonWriter.value(refreshFrequency);
        }
        if (journeyResponse.getSchedule() != null) {
            JourneySchedule schedule = journeyResponse.getSchedule();
            jsonWriter.name("Schedule");
            JourneyScheduleJsonMarshaller.getInstance().marshall(schedule, jsonWriter);
        }
        if (journeyResponse.getStartActivity() != null) {
            String startActivity = journeyResponse.getStartActivity();
            jsonWriter.name("StartActivity");
            jsonWriter.value(startActivity);
        }
        if (journeyResponse.getStartCondition() != null) {
            StartCondition startCondition = journeyResponse.getStartCondition();
            jsonWriter.name("StartCondition");
            StartConditionJsonMarshaller.getInstance().marshall(startCondition, jsonWriter);
        }
        if (journeyResponse.getState() != null) {
            String state = journeyResponse.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (journeyResponse.getTags() != null) {
            java.util.Map<String, String> tags = journeyResponse.getTags();
            jsonWriter.name("tags");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> tagsEntry : tags.entrySet()) {
                String tagsValue = tagsEntry.getValue();
                if (tagsValue != null) {
                    jsonWriter.name(tagsEntry.getKey());
                    jsonWriter.value(tagsValue);
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static JourneyResponseJsonMarshaller instance;

    public static JourneyResponseJsonMarshaller getInstance() {
        if (instance == null)
            instance = new JourneyResponseJsonMarshaller();
        return instance;
    }
}
