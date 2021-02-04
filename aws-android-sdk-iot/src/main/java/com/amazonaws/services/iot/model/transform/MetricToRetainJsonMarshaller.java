/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO MetricToRetain
 */
class MetricToRetainJsonMarshaller {

    public void marshall(MetricToRetain metricToRetain, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (metricToRetain.getMetric() != null) {
            String metric = metricToRetain.getMetric();
            jsonWriter.name("metric");
            jsonWriter.value(metric);
        }
        if (metricToRetain.getMetricDimension() != null) {
            MetricDimension metricDimension = metricToRetain.getMetricDimension();
            jsonWriter.name("metricDimension");
            MetricDimensionJsonMarshaller.getInstance().marshall(metricDimension, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static MetricToRetainJsonMarshaller instance;

    public static MetricToRetainJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MetricToRetainJsonMarshaller();
        return instance;
    }
}
