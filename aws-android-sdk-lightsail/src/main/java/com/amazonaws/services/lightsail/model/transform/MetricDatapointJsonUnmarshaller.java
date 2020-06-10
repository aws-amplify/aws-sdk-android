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

package com.amazonaws.services.lightsail.model.transform;

import com.amazonaws.services.lightsail.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO MetricDatapoint
 */
class MetricDatapointJsonUnmarshaller implements
        Unmarshaller<MetricDatapoint, JsonUnmarshallerContext> {

    public MetricDatapoint unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        MetricDatapoint metricDatapoint = new MetricDatapoint();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("average")) {
                metricDatapoint.setAverage(DoubleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("maximum")) {
                metricDatapoint.setMaximum(DoubleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("minimum")) {
                metricDatapoint.setMinimum(DoubleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("sampleCount")) {
                metricDatapoint.setSampleCount(DoubleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("sum")) {
                metricDatapoint.setSum(DoubleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("timestamp")) {
                metricDatapoint.setTimestamp(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("unit")) {
                metricDatapoint.setUnit(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return metricDatapoint;
    }

    private static MetricDatapointJsonUnmarshaller instance;

    public static MetricDatapointJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MetricDatapointJsonUnmarshaller();
        return instance;
    }
}
