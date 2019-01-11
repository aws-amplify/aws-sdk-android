/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.logs.model.transform;

import com.amazonaws.services.logs.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO MetricTransformation
 */
class MetricTransformationJsonMarshaller {

    public void marshall(MetricTransformation metricTransformation, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (metricTransformation.getMetricName() != null) {
            String metricName = metricTransformation.getMetricName();
            jsonWriter.name("metricName");
            jsonWriter.value(metricName);
        }
        if (metricTransformation.getMetricNamespace() != null) {
            String metricNamespace = metricTransformation.getMetricNamespace();
            jsonWriter.name("metricNamespace");
            jsonWriter.value(metricNamespace);
        }
        if (metricTransformation.getMetricValue() != null) {
            String metricValue = metricTransformation.getMetricValue();
            jsonWriter.name("metricValue");
            jsonWriter.value(metricValue);
        }
        if (metricTransformation.getDefaultValue() != null) {
            Double defaultValue = metricTransformation.getDefaultValue();
            jsonWriter.name("defaultValue");
            jsonWriter.value(defaultValue);
        }
        jsonWriter.endObject();
    }

    private static MetricTransformationJsonMarshaller instance;

    public static MetricTransformationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MetricTransformationJsonMarshaller();
        return instance;
    }
}
