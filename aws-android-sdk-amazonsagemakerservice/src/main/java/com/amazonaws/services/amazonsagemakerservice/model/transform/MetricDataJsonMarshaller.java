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

package com.amazonaws.services.amazonsagemakerservice.model.transform;

import com.amazonaws.services.amazonsagemakerservice.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO MetricData
 */
class MetricDataJsonMarshaller {

    public void marshall(MetricData metricData, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (metricData.getMetricName() != null) {
            String metricName = metricData.getMetricName();
            jsonWriter.name("MetricName");
            jsonWriter.value(metricName);
        }
        if (metricData.getValue() != null) {
            Float value = metricData.getValue();
            jsonWriter.name("Value");
            jsonWriter.value(value);
        }
        if (metricData.getTimestamp() != null) {
            java.util.Date timestamp = metricData.getTimestamp();
            jsonWriter.name("Timestamp");
            jsonWriter.value(timestamp);
        }
        jsonWriter.endObject();
    }

    private static MetricDataJsonMarshaller instance;

    public static MetricDataJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MetricDataJsonMarshaller();
        return instance;
    }
}
