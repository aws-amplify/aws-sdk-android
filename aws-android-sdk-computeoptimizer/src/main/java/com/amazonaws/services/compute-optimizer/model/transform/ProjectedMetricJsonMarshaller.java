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
package com.amazonaws.services.compute-optimizer.model.transform;

import com.amazonaws.services.compute-optimizer.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ProjectedMetric
 */
class ProjectedMetricJsonMarshaller {

    public void marshall(ProjectedMetric projectedMetric, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (projectedMetric.getName() != null) {
            String name = projectedMetric.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (projectedMetric.getTimestamps() != null) {
            java.util.List<java.util.Date> timestamps = projectedMetric.getTimestamps();
            jsonWriter.name("timestamps");
            jsonWriter.beginArray();
            for (java.util.Date timestampsItem : timestamps) {
                if (timestampsItem != null) {
            jsonWriter.value(timestampsItem);
                    }
            }
            jsonWriter.endArray();
        }
        if (projectedMetric.getValues() != null) {
            java.util.List<Double> values = projectedMetric.getValues();
            jsonWriter.name("values");
            jsonWriter.beginArray();
            for (Double valuesItem : values) {
                if (valuesItem != null) {
            jsonWriter.value(valuesItem);
                    }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static ProjectedMetricJsonMarshaller instance;
    public static ProjectedMetricJsonMarshaller getInstance() {
        if (instance == null) instance = new ProjectedMetricJsonMarshaller();
        return instance;
    }
}
