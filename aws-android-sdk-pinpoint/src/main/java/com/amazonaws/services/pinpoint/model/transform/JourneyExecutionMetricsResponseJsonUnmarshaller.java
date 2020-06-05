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
 * JSON unmarshaller for POJO JourneyExecutionMetricsResponse
 */
class JourneyExecutionMetricsResponseJsonUnmarshaller implements
        Unmarshaller<JourneyExecutionMetricsResponse, JsonUnmarshallerContext> {

    public JourneyExecutionMetricsResponse unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        JourneyExecutionMetricsResponse journeyExecutionMetricsResponse = new JourneyExecutionMetricsResponse();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ApplicationId")) {
                journeyExecutionMetricsResponse.setApplicationId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("JourneyId")) {
                journeyExecutionMetricsResponse.setJourneyId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastEvaluatedTime")) {
                journeyExecutionMetricsResponse.setLastEvaluatedTime(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Metrics")) {
                journeyExecutionMetricsResponse.setMetrics(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return journeyExecutionMetricsResponse;
    }

    private static JourneyExecutionMetricsResponseJsonUnmarshaller instance;

    public static JourneyExecutionMetricsResponseJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new JourneyExecutionMetricsResponseJsonUnmarshaller();
        return instance;
    }
}
