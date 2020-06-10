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
 * JSON marshaller for POJO UtilizationMetric
 */
class UtilizationMetricJsonMarshaller {

    public void marshall(UtilizationMetric utilizationMetric, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (utilizationMetric.getName() != null) {
            String name = utilizationMetric.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (utilizationMetric.getStatistic() != null) {
            String statistic = utilizationMetric.getStatistic();
            jsonWriter.name("statistic");
            jsonWriter.value(statistic);
        }
        if (utilizationMetric.getValue() != null) {
            Double value = utilizationMetric.getValue();
            jsonWriter.name("value");
            jsonWriter.value(value);
        }
        jsonWriter.endObject();
    }

    private static UtilizationMetricJsonMarshaller instance;
    public static UtilizationMetricJsonMarshaller getInstance() {
        if (instance == null) instance = new UtilizationMetricJsonMarshaller();
        return instance;
    }
}
