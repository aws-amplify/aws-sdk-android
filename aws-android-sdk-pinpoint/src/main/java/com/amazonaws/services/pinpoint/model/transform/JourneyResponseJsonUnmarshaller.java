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

package com.amazonaws.services.pinpoint.model.transform;

import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO JourneyResponse
 */
class JourneyResponseJsonUnmarshaller implements
        Unmarshaller<JourneyResponse, JsonUnmarshallerContext> {

    public JourneyResponse unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        JourneyResponse journeyResponse = new JourneyResponse();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Activities")) {
                journeyResponse.setActivities(new MapUnmarshaller<Activity>(
                        ActivityJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ApplicationId")) {
                journeyResponse.setApplicationId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationDate")) {
                journeyResponse.setCreationDate(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Id")) {
                journeyResponse.setId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastModifiedDate")) {
                journeyResponse.setLastModifiedDate(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Limits")) {
                journeyResponse.setLimits(JourneyLimitsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LocalTime")) {
                journeyResponse.setLocalTime(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Name")) {
                journeyResponse.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("QuietTime")) {
                journeyResponse.setQuietTime(QuietTimeJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RefreshFrequency")) {
                journeyResponse.setRefreshFrequency(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Schedule")) {
                journeyResponse.setSchedule(JourneyScheduleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StartActivity")) {
                journeyResponse.setStartActivity(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StartCondition")) {
                journeyResponse.setStartCondition(StartConditionJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("State")) {
                journeyResponse.setState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("tags")) {
                journeyResponse.setTags(new MapUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return journeyResponse;
    }

    private static JourneyResponseJsonUnmarshaller instance;

    public static JourneyResponseJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new JourneyResponseJsonUnmarshaller();
        return instance;
    }
}
