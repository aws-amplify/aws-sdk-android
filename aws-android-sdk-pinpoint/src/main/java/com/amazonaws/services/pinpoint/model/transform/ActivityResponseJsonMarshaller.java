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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ActivityResponse
 */
class ActivityResponseJsonMarshaller {

    public void marshall(ActivityResponse activityResponse, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (activityResponse.getApplicationId() != null) {
            String applicationId = activityResponse.getApplicationId();
            jsonWriter.name("ApplicationId");
            jsonWriter.value(applicationId);
        }
        if (activityResponse.getCampaignId() != null) {
            String campaignId = activityResponse.getCampaignId();
            jsonWriter.name("CampaignId");
            jsonWriter.value(campaignId);
        }
        if (activityResponse.getEnd() != null) {
            String end = activityResponse.getEnd();
            jsonWriter.name("End");
            jsonWriter.value(end);
        }
        if (activityResponse.getId() != null) {
            String id = activityResponse.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (activityResponse.getResult() != null) {
            String result = activityResponse.getResult();
            jsonWriter.name("Result");
            jsonWriter.value(result);
        }
        if (activityResponse.getScheduledStart() != null) {
            String scheduledStart = activityResponse.getScheduledStart();
            jsonWriter.name("ScheduledStart");
            jsonWriter.value(scheduledStart);
        }
        if (activityResponse.getStart() != null) {
            String start = activityResponse.getStart();
            jsonWriter.name("Start");
            jsonWriter.value(start);
        }
        if (activityResponse.getState() != null) {
            String state = activityResponse.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (activityResponse.getSuccessfulEndpointCount() != null) {
            Integer successfulEndpointCount = activityResponse.getSuccessfulEndpointCount();
            jsonWriter.name("SuccessfulEndpointCount");
            jsonWriter.value(successfulEndpointCount);
        }
        if (activityResponse.getTimezonesCompletedCount() != null) {
            Integer timezonesCompletedCount = activityResponse.getTimezonesCompletedCount();
            jsonWriter.name("TimezonesCompletedCount");
            jsonWriter.value(timezonesCompletedCount);
        }
        if (activityResponse.getTimezonesTotalCount() != null) {
            Integer timezonesTotalCount = activityResponse.getTimezonesTotalCount();
            jsonWriter.name("TimezonesTotalCount");
            jsonWriter.value(timezonesTotalCount);
        }
        if (activityResponse.getTotalEndpointCount() != null) {
            Integer totalEndpointCount = activityResponse.getTotalEndpointCount();
            jsonWriter.name("TotalEndpointCount");
            jsonWriter.value(totalEndpointCount);
        }
        if (activityResponse.getTreatmentId() != null) {
            String treatmentId = activityResponse.getTreatmentId();
            jsonWriter.name("TreatmentId");
            jsonWriter.value(treatmentId);
        }
        jsonWriter.endObject();
    }

    private static ActivityResponseJsonMarshaller instance;

    public static ActivityResponseJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ActivityResponseJsonMarshaller();
        return instance;
    }
}
