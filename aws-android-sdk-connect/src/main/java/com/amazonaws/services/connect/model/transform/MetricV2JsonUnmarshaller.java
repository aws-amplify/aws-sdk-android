/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * JSON unmarshaller for POJO MetricV2
 */
class MetricV2JsonUnmarshaller implements Unmarshaller<MetricV2, JsonUnmarshallerContext> {

    public MetricV2 unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        MetricV2 metricV2 = new MetricV2();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Name")) {
                metricV2.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Threshold")) {
                metricV2.setThreshold(new ListUnmarshaller<ThresholdV2>(ThresholdV2JsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("MetricFilters")) {
                metricV2.setMetricFilters(new ListUnmarshaller<MetricFilterV2>(
                        MetricFilterV2JsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return metricV2;
    }

    private static MetricV2JsonUnmarshaller instance;

    public static MetricV2JsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MetricV2JsonUnmarshaller();
        return instance;
    }
}
