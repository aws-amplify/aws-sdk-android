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
 * JSON marshaller for POJO MetricDataV2
 */
class MetricDataV2JsonMarshaller {

    public void marshall(MetricDataV2 metricDataV2, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (metricDataV2.getMetric() != null) {
            MetricV2 metric = metricDataV2.getMetric();
            jsonWriter.name("Metric");
            MetricV2JsonMarshaller.getInstance().marshall(metric, jsonWriter);
        }
        if (metricDataV2.getValue() != null) {
            Double value = metricDataV2.getValue();
            jsonWriter.name("Value");
            jsonWriter.value(value);
        }
        jsonWriter.endObject();
    }

    private static MetricDataV2JsonMarshaller instance;

    public static MetricDataV2JsonMarshaller getInstance() {
        if (instance == null)
            instance = new MetricDataV2JsonMarshaller();
        return instance;
    }
}
