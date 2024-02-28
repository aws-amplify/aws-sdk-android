/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response ListFleetMetricsResult
 */
public class ListFleetMetricsResultJsonUnmarshaller implements
        Unmarshaller<ListFleetMetricsResult, JsonUnmarshallerContext> {

    public ListFleetMetricsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        ListFleetMetricsResult listFleetMetricsResult = new ListFleetMetricsResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("fleetMetrics")) {
                listFleetMetricsResult.setFleetMetrics(new ListUnmarshaller<FleetMetricNameAndArn>(
                        FleetMetricNameAndArnJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("nextToken")) {
                listFleetMetricsResult.setNextToken(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return listFleetMetricsResult;
    }

    private static ListFleetMetricsResultJsonUnmarshaller instance;

    public static ListFleetMetricsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListFleetMetricsResultJsonUnmarshaller();
        return instance;
    }
}
