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
 * JSON unmarshaller for POJO ActivityResponse
 */
class ActivityResponseJsonUnmarshaller implements
        Unmarshaller<ActivityResponse, JsonUnmarshallerContext> {

    public ActivityResponse unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ActivityResponse activityResponse = new ActivityResponse();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ApplicationId")) {
                activityResponse.setApplicationId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CampaignId")) {
                activityResponse.setCampaignId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("End")) {
                activityResponse.setEnd(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Id")) {
                activityResponse.setId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Result")) {
                activityResponse.setResult(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ScheduledStart")) {
                activityResponse.setScheduledStart(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Start")) {
                activityResponse.setStart(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("State")) {
                activityResponse.setState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SuccessfulEndpointCount")) {
                activityResponse.setSuccessfulEndpointCount(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TimezonesCompletedCount")) {
                activityResponse.setTimezonesCompletedCount(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TimezonesTotalCount")) {
                activityResponse.setTimezonesTotalCount(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TotalEndpointCount")) {
                activityResponse.setTotalEndpointCount(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TreatmentId")) {
                activityResponse.setTreatmentId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return activityResponse;
    }

    private static ActivityResponseJsonUnmarshaller instance;

    public static ActivityResponseJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ActivityResponseJsonUnmarshaller();
        return instance;
    }
}
