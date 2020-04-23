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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO WriteJourneyRequest
 */
class WriteJourneyRequestJsonUnmarshaller implements
        Unmarshaller<WriteJourneyRequest, JsonUnmarshallerContext> {

    public WriteJourneyRequest unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        WriteJourneyRequest writeJourneyRequest = new WriteJourneyRequest();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Activities")) {
                writeJourneyRequest.setActivities(new MapUnmarshaller<Activity>(
                        ActivityJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("CreationDate")) {
                writeJourneyRequest.setCreationDate(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastModifiedDate")) {
                writeJourneyRequest.setLastModifiedDate(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Limits")) {
                writeJourneyRequest.setLimits(JourneyLimitsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LocalTime")) {
                writeJourneyRequest.setLocalTime(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Name")) {
                writeJourneyRequest.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("QuietTime")) {
                writeJourneyRequest.setQuietTime(QuietTimeJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RefreshFrequency")) {
                writeJourneyRequest.setRefreshFrequency(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Schedule")) {
                writeJourneyRequest.setSchedule(JourneyScheduleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StartActivity")) {
                writeJourneyRequest.setStartActivity(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StartCondition")) {
                writeJourneyRequest.setStartCondition(StartConditionJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("State")) {
                writeJourneyRequest.setState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return writeJourneyRequest;
    }

    private static WriteJourneyRequestJsonUnmarshaller instance;

    public static WriteJourneyRequestJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new WriteJourneyRequestJsonUnmarshaller();
        return instance;
    }
}
