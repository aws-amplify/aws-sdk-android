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
 * JSON unmarshaller for POJO JourneyExecutionActivityMetricsResponse
 */
class JourneyExecutionActivityMetricsResponseJsonUnmarshaller implements
        Unmarshaller<JourneyExecutionActivityMetricsResponse, JsonUnmarshallerContext> {

    public JourneyExecutionActivityMetricsResponse unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        JourneyExecutionActivityMetricsResponse journeyExecutionActivityMetricsResponse = new JourneyExecutionActivityMetricsResponse();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ActivityType")) {
                journeyExecutionActivityMetricsResponse.setActivityType(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ApplicationId")) {
                journeyExecutionActivityMetricsResponse.setApplicationId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("JourneyActivityId")) {
                journeyExecutionActivityMetricsResponse.setJourneyActivityId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("JourneyId")) {
                journeyExecutionActivityMetricsResponse.setJourneyId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastEvaluatedTime")) {
                journeyExecutionActivityMetricsResponse.setLastEvaluatedTime(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Metrics")) {
                journeyExecutionActivityMetricsResponse.setMetrics(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return journeyExecutionActivityMetricsResponse;
    }

    private static JourneyExecutionActivityMetricsResponseJsonUnmarshaller instance;

    public static JourneyExecutionActivityMetricsResponseJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new JourneyExecutionActivityMetricsResponseJsonUnmarshaller();
        return instance;
    }
}
