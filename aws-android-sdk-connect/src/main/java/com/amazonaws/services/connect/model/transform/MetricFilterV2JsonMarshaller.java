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
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO MetricFilterV2
 */
class MetricFilterV2JsonMarshaller {

    public void marshall(MetricFilterV2 metricFilterV2, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (metricFilterV2.getMetricFilterKey() != null) {
            String metricFilterKey = metricFilterV2.getMetricFilterKey();
            jsonWriter.name("MetricFilterKey");
            jsonWriter.value(metricFilterKey);
        }
        if (metricFilterV2.getMetricFilterValues() != null) {
            java.util.List<String> metricFilterValues = metricFilterV2.getMetricFilterValues();
            jsonWriter.name("MetricFilterValues");
            jsonWriter.beginArray();
            for (String metricFilterValuesItem : metricFilterValues) {
                if (metricFilterValuesItem != null) {
                    jsonWriter.value(metricFilterValuesItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static MetricFilterV2JsonMarshaller instance;

    public static MetricFilterV2JsonMarshaller getInstance() {
        if (instance == null)
            instance = new MetricFilterV2JsonMarshaller();
        return instance;
    }
}
