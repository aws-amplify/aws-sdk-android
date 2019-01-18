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

package com.amazonaws.services.pinpoint.model.transform;

import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO MetricDimension
 */
class MetricDimensionJsonMarshaller {

    public void marshall(MetricDimension metricDimension, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (metricDimension.getComparisonOperator() != null) {
            String comparisonOperator = metricDimension.getComparisonOperator();
            jsonWriter.name("ComparisonOperator");
            jsonWriter.value(comparisonOperator);
        }
        if (metricDimension.getValue() != null) {
            Double value = metricDimension.getValue();
            jsonWriter.name("Value");
            jsonWriter.value(value);
        }
        jsonWriter.endObject();
    }

    private static MetricDimensionJsonMarshaller instance;

    public static MetricDimensionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MetricDimensionJsonMarshaller();
        return instance;
    }
}
