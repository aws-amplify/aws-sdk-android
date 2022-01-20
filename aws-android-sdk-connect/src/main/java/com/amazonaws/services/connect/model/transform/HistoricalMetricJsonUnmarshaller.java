/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model.transform;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO HistoricalMetric
 */
class HistoricalMetricJsonUnmarshaller implements
        Unmarshaller<HistoricalMetric, JsonUnmarshallerContext> {

    public HistoricalMetric unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        HistoricalMetric historicalMetric = new HistoricalMetric();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Name")) {
                historicalMetric.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Threshold")) {
                historicalMetric.setThreshold(ThresholdJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Statistic")) {
                historicalMetric.setStatistic(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Unit")) {
                historicalMetric.setUnit(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return historicalMetric;
    }

    private static HistoricalMetricJsonUnmarshaller instance;

    public static HistoricalMetricJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new HistoricalMetricJsonUnmarshaller();
        return instance;
    }
}
