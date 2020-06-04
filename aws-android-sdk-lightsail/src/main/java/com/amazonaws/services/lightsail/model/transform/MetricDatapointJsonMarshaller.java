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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO MetricDatapoint
 */
class MetricDatapointJsonMarshaller {

    public void marshall(MetricDatapoint metricDatapoint, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (metricDatapoint.getAverage() != null) {
            Double average = metricDatapoint.getAverage();
            jsonWriter.name("average");
            jsonWriter.value(average);
        }
        if (metricDatapoint.getMaximum() != null) {
            Double maximum = metricDatapoint.getMaximum();
            jsonWriter.name("maximum");
            jsonWriter.value(maximum);
        }
        if (metricDatapoint.getMinimum() != null) {
            Double minimum = metricDatapoint.getMinimum();
            jsonWriter.name("minimum");
            jsonWriter.value(minimum);
        }
        if (metricDatapoint.getSampleCount() != null) {
            Double sampleCount = metricDatapoint.getSampleCount();
            jsonWriter.name("sampleCount");
            jsonWriter.value(sampleCount);
        }
        if (metricDatapoint.getSum() != null) {
            Double sum = metricDatapoint.getSum();
            jsonWriter.name("sum");
            jsonWriter.value(sum);
        }
        if (metricDatapoint.getTimestamp() != null) {
            java.util.Date timestamp = metricDatapoint.getTimestamp();
            jsonWriter.name("timestamp");
            jsonWriter.value(timestamp);
        }
        if (metricDatapoint.getUnit() != null) {
            String unit = metricDatapoint.getUnit();
            jsonWriter.name("unit");
            jsonWriter.value(unit);
        }
        jsonWriter.endObject();
    }

    private static MetricDatapointJsonMarshaller instance;

    public static MetricDatapointJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MetricDatapointJsonMarshaller();
        return instance;
    }
}
